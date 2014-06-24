/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kontrol;

import Koneksi.Koneksi;
import Tabel_Model.Bunga;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rafael Aweng
 */
public class Kontrol_Bunga {

    Connection connection = null;

    public Kontrol_Bunga(Connection koneksi) {
        this.connection = koneksi;
    }

    public static Kontrol_Bunga getKoneksi() throws SQLException {
        Koneksi koneksi = new Koneksi();
        Kontrol_Bunga kontrol = new Kontrol_Bunga(koneksi.getConnection());
        return kontrol;
    }

    public void updateBungaPendek(Bunga bunga) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "update bunga set 30x=?,4x=?,2x=?,1x=? where id=1";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setDouble(1, bunga.getX30());
        statement.setDouble(2, bunga.getX4());
        statement.setDouble(3, bunga.getX2());
        statement.setDouble(4, bunga.getX1());

        statement.executeUpdate();
        connection.commit();

    }

    public void updateBungaPanjang(Bunga bunga) throws SQLException {
        PreparedStatement statement = null;
        connection.setAutoCommit(false);
        String sql = "update bunga set 3b=?,6b=?,9b=?,12b=?,18b=?,24b=?,36b=?,48b=? where id=1";
        statement = (PreparedStatement) connection.prepareStatement(sql);
        statement.setDouble(1, bunga.getB3());
        statement.setDouble(2, bunga.getB3());
        statement.setDouble(3, bunga.getB9());
        statement.setDouble(4, bunga.getB12());
        statement.setDouble(5, bunga.getB18());
        statement.setDouble(6, bunga.getB24());
        statement.setDouble(7, bunga.getB36());
        statement.setDouble(8, bunga.getB48());
        statement.executeUpdate();
        connection.commit();

    }

    public Bunga getBunga() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        connection.setAutoCommit(false);
        String sql = "select * from bunga where id=1";
        psmt = (PreparedStatement) connection.prepareStatement(sql);
//        psmt.setString(1, nik);
        rset = psmt.executeQuery();
        Bunga bunga = new Bunga();
        while (rset.next()) {
            bunga.setX30(rset.getDouble(2));
            bunga.setX4(rset.getDouble(3));
            bunga.setX2(rset.getDouble(4));
            bunga.setX1(rset.getDouble(5));
            bunga.setB3(rset.getDouble(6));
            bunga.setB6(rset.getDouble(7));
            bunga.setB9(rset.getDouble(8));
            bunga.setB12(rset.getDouble(9));
            bunga.setB18(rset.getDouble(10));
            bunga.setB24(rset.getDouble(11));
            bunga.setB36(rset.getDouble(12));
            bunga.setB48(rset.getDouble(13));
        }
        connection.commit();
        return bunga;
    }
}
