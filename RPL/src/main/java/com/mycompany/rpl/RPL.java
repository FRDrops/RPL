/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rpl;

import java.sql.SQLException;

/**
 *
 * @author Arif
 */
public class RPL {

    public static void main(String[] args) throws SQLException {
        System.out.println("Erwin");
        
        LoginClass login = new LoginClass();
        login.input();
        
        user_lamaran home = new user_lamaran();
        home.setVisible(true);
    }
}
