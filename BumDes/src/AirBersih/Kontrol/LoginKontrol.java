/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirBersih.Kontrol;

import Koneksi.Koneksi_Air;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author damaikurnia
 */
public class LoginKontrol {

    private Connection conn;

    public LoginKontrol(Connection conn) {
        this.conn = conn;
    }

    public static LoginKontrol getKoneksi() {
        Koneksi.Koneksi_Air koneksi = new Koneksi_Air();
        LoginKontrol login = new LoginKontrol(koneksi.getConnection());
        return login;
    }

    public boolean login(String user, String passw) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT username,password FROM login";
        stmt = conn.prepareStatement(query);
        result = stmt.executeQuery();
        String username = null;
        String password = null;

        while (result.next()) {
            username = result.getString(1);
            password = result.getString(2);
        }

        if (user.equals(username) && passw.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
