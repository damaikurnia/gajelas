/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author damaikurnia
 */
public class Koneksi {

    Connection connection = null;
    String url = "jdbc:mysql://localhost:3306/airbersih";
    String user = "root";
    String password = "root";
//    String password = "";

    public Connection getConnection() {
        if (connection == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl(url);
            dataSource.setUser(user);
            dataSource.setPassword(password);
            try {
                connection = dataSource.getConnection();
//                System.out.println("Koneksi Tersambung");

            } catch (SQLException e) {
                System.out.println("Koneksi Tidak Tersambung...!\n Kesalahan: " + e.getMessage());
            }
        }
        return connection;
    }

    public static void main(String args[]) {
        Koneksi conn = new Koneksi();
        conn.getConnection();//untuk uji koneksi.
    }
}
