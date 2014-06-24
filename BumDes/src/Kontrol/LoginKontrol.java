/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Koneksi.Koneksi;
import java.sql.SQLException;

/**
 *
 * @author Mich
 */
public class LoginKontrol {

    private Connection conn;

    public LoginKontrol(Connection conn) {
        this.conn = conn;
    }

    public static LoginKontrol getKoneksi() {
        Koneksi koneksi = new Koneksi();
        LoginKontrol login = new LoginKontrol(koneksi.getConnection());
        return login;
    }

    public boolean login(String user, String passw) throws SQLException {
        PreparedStatement stmt = null;
        ResultSet result = null;
        conn.setAutoCommit(false);
        String query = "SELECT USERname,password FROM Login where no = 1";
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
