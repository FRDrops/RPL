/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author refah
 */
public class LoginClass {
    public void input() throws SQLException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (loginHrd(inputUsername, inputPassword)) {
            System.out.println("Login sebagai HRD berhasil. Selamat datang!");
        }
        else if (loginUser(inputUsername, inputPassword)) {
            System.out.println("Login sebagai USER berhasil. Selamat datang!");
        } else {
            System.out.println("Username atau password salah.");
        }
    }
    
    public boolean loginHrd(String username, String password) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM data_hrd WHERE username_hrd = ? AND password = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean loginUser(String username, String password) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM data_user WHERE username_user = ? AND password = ?";
            preparedStatement = koneksi.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            resultSet = preparedStatement.executeQuery();

            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void logWrite(String username){
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "INSERT INTO logged (username) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, username);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
            } else {
            }

        } catch (SQLException ex) {
            //do ntohing wakakak
        }
    }
    
    public String logRead() {
        StringBuilder usernames = new StringBuilder();
        
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "SELECT username FROM logged";
            PreparedStatement ps = koneksi.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String username = rs.getString("username");
                usernames.append(username).append("\n");
            }
            
            rs.close();
            ps.close();
            koneksi.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return usernames.toString();
    }
    
    public void logDelete() {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String query = "DELETE FROM logged";
            PreparedStatement ps = koneksi.prepareStatement(query);
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("udah");
            } else {
                // No data to delete
            }
            
            ps.close();
            koneksi.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
