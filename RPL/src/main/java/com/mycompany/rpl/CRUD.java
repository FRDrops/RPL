/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author refah
 */
public class CRUD {
    public DefaultTableModel readUser(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID Member");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("No Telepon");
        tableModel.addColumn("Email");
        tableModel.addColumn("Poin");
        tableModel.addColumn("Created at");
        tableModel.addColumn("Updated at");

        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String query = "SELECT * FROM member";

            Statement statement = koneksi.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Object[] rowData = {
                        resultSet.getString("id_member"),
                        resultSet.getString("nama_member"),
                        resultSet.getString("tanggal_lahir"),
                        resultSet.getInt("no_telp"),
                        resultSet.getString("email"),
                        resultSet.getInt("poin"),
                        resultSet.getString("created_at"),
                        resultSet.getString("updated_at")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return tableModel;
    }
}
