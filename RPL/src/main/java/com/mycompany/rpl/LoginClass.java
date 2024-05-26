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

        if (login(inputUsername, inputPassword)) {
            System.out.println("Login berhasil. Selamat datang!");
        } else {
            System.out.println("Username atau password salah.");
        }
    }

    public boolean login(String username, String password) throws SQLException {
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            String query = "SELECT * FROM maintanence WHERE username = ? AND password = ?";
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

}