/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author refah
 */
public class Koneksi {
    private String url = "jdbc:mysql://localhost:3306/gendhu_roso";
    private String username = "root";
    private String password = "";
    java.sql.Connection koneksi = null;
    
    public java.sql.Connection open() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());  
        }
        return koneksi;
    }

    public void close() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection koneksi = DriverManager.getConnection(url, username, password);
            koneksi.close();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());  
        }
    }
}
