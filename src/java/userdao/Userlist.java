/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userdao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import userdao.User;
/**
 *
 * @author ASUS
 */
public class Userlist {
     public List<User> getirTumListe() throws SQLException {
       List<User> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select * from user";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           User reh = new User(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("email"), rs.getString("phone"), rs.getDate("date"));
           r.add(reh);
          }

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return r;
    }
    
    public List<Admin> getirTumAdminListe() {
       List<Admin> r = new ArrayList<>();
       try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select * from admin";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();

          while (rs.next()) {
           Admin reh = new Admin(rs.getInt("id"), rs.getString("name"), rs.getString("surname"), rs.getString("email"), rs.getString("phone"));
           r.add(reh);
          }

          } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          }
           return r;
    }
    
    public int getirTumKullanici(){
        int num = 0;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select count(*) as toplam from user";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();
           
            while(rs.next()){
              num = (rs.getInt("toplam"));
            }

          } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
          }
        return num;
    }
    
    public int getirTumAdmin(){
        int num = 0;
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_cars", "root", "root");
           String query = "Select count(*) as toplamAdmin from admin";
           PreparedStatement psmt = conn.prepareStatement(query);
           ResultSet rs = psmt.executeQuery();
           
            while(rs.next()){
              num = (rs.getInt("toplamAdmin"));
            }

          } catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
          }
        return num;
    }
    
}
