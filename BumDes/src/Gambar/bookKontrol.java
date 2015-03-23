/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gambar;

import Koneksi.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laurens_Widi
 */
public class bookKontrol {
    private Connection conn;

    public bookKontrol(Connection koneksi) {
        this.conn = koneksi;
    }

    public static bookKontrol getKoneksiBook() {
        bookKontrol kb = new bookKontrol(new Koneksi().getConnection());
        return kb;
    }

     public void tambahBook(book book) throws SQLException {
        String title = book.getTitle();
        String image = book.getImage();
        String sql = "insert into " + "gambar(title,gambar)" + "values('" + title + "','" + image + "')";
        Statement stat = conn.createStatement();
        stat.executeUpdate(sql);
    }
     
      public List<book> getAllGambar() throws SQLException {
        PreparedStatement psmt = null;
        ResultSet rset = null;
        conn.setAutoCommit(false);
        String sql = "select * from gambar order by id";
        psmt = conn.prepareStatement(sql);
        rset = psmt.executeQuery();
        List<book> kategori = new ArrayList<book>();
        while (rset.next()) {
            book ka = new book();
            ka.setId(rset.getInt(1));
            ka.setTitle(rset.getString(2));
            ka.setImage(rset.getString(3));
            kategori.add(ka);
        }
        conn.commit();
        return kategori;
    }

}
