/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rpl;

import java.awt.Color;
import java.awt.*;
import java.sql.SQLException;
import java.awt.geom.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.LocalDate;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public class hrd_loker extends javax.swing.JFrame {

    /**
     * Creates new form hrd_loker
     */
    public hrd_loker() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        pelamarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pelamarBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokersayaWhite.png")));
        pegawaiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pegawaiBlack.png")));
        saranIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/saranBlack.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new RoundedPanel(100, new Color(215, 204, 185));
        pegawaiLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        pelamarIcon = new javax.swing.JLabel();
        lokerIcon = new javax.swing.JLabel();
        pelamarLabel = new javax.swing.JLabel();
        pegawaiIcon = new javax.swing.JLabel();
        lokerLabel = new javax.swing.JLabel();
        saranIcon = new javax.swing.JLabel();
        saranLabel = new javax.swing.JLabel();
        jPanel1 = new RoundedPanel(70, new Color(49, 45, 34));
        logoutButton = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        copyright = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        support = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggatDISABLE = new javax.swing.JLabel();
        low4 = new javax.swing.JLabel();
        keterangan3 = new javax.swing.JLabel();
        rincianDISABLE = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat1 = new javax.swing.JLabel();
        low1 = new javax.swing.JLabel();
        keterangan6 = new javax.swing.JLabel();
        editJM = new javax.swing.JButton();
        jPanel4 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat2 = new javax.swing.JLabel();
        low2 = new javax.swing.JLabel();
        keterangan9 = new javax.swing.JLabel();
        EditP = new javax.swing.JButton();
        jPanel5 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat3 = new javax.swing.JLabel();
        low3 = new javax.swing.JLabel();
        keterangan12 = new javax.swing.JLabel();
        EditK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pegawaiLabel.setForeground(new java.awt.Color(49, 45, 34));
        pegawaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegawaiLabel.setText("Daftar Pegawai");
        nav.add(pegawaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 20));

        homeIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\homeBlack.png")); // NOI18N
        homeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });
        nav.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 60, 150, 50));

        homeLabel.setForeground(new java.awt.Color(49, 45, 34));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        nav.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 30));

        pelamarIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\pelamarBlack.png")); // NOI18N
        pelamarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelamarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelamarIconMouseClicked(evt);
            }
        });
        nav.add(pelamarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 170, 160, 70));

        lokerIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\lokersayaWhite.png")); // NOI18N
        lokerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lokerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lokerIconMouseClicked(evt);
            }
        });
        nav.add(lokerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 280, 160, 60));

        pelamarLabel.setForeground(new java.awt.Color(49, 45, 34));
        pelamarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelamarLabel.setText("Daftar Pelamar");
        nav.add(pelamarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));

        pegawaiIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\pegawaiBlack.png")); // NOI18N
        pegawaiIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pegawaiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pegawaiIconMouseClicked(evt);
            }
        });
        nav.add(pegawaiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 390, 160, 60));

        lokerLabel.setForeground(new java.awt.Color(255, 255, 255));
        lokerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokerLabel.setText("Loker Saya");
        nav.add(lokerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 20));

        saranIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\saranBlack.png")); // NOI18N
        saranIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saranIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saranIconMouseClicked(evt);
            }
        });
        nav.add(saranIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 490, 160, 60));

        saranLabel.setForeground(new java.awt.Color(49, 45, 34));
        saranLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saranLabel.setText("Kotak Saran");
        nav.add(saranLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 90, 20));

        jPanel1.setBackground(new java.awt.Color(215, 204, 185));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 90, 110));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 620));

        logoutButton.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(49, 45, 34));
        logoutButton.setText("Logout");
        logoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutButtonMouseClicked(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, -1, -1));

        judul.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        judul.setForeground(new java.awt.Color(112, 104, 94));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        judul.setText("Daftar Lowongan Saya");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 610, -1));

        jSeparator2.setForeground(new java.awt.Color(215, 204, 185));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 960, 20));

        copyright.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        copyright.setForeground(new java.awt.Color(49, 45, 34));
        copyright.setText("2024© Gendhu Roso");
        getContentPane().add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, -1, -1));

        about.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        about.setForeground(new java.awt.Color(49, 45, 34));
        about.setText("About     |");
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 600, -1, -1));

        support.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        support.setForeground(new java.awt.Color(49, 45, 34));
        support.setText("Support");
        support.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        support.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                supportMouseClicked(evt);
            }
        });
        getContentPane().add(support, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 600, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenggatDISABLE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenggatDISABLE.setForeground(new java.awt.Color(0, 74, 173));
        tenggatDISABLE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggatDISABLE.setText("-");
        jPanel2.add(tenggatDISABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        low4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        low4.setForeground(new java.awt.Color(49, 45, 34));
        low4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        low4.setText("Coming Soon");
        jPanel2.add(low4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 50));

        keterangan3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan3.setForeground(new java.awt.Color(49, 45, 34));
        keterangan3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan3.setText("Berakhir pada:");
        jPanel2.add(keterangan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        rincianDISABLE.setBackground(new java.awt.Color(169, 161, 147));
        rincianDISABLE.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rincianDISABLE.setForeground(new java.awt.Color(215, 204, 185));
        rincianDISABLE.setText("Edit");
        rincianDISABLE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rincianDISABLE.setBorderPainted(false);
        rincianDISABLE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rincianDISABLE.setFocusable(false);
        rincianDISABLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianDISABLEActionPerformed(evt);
            }
        });
        jPanel2.add(rincianDISABLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 430, 180));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenggat1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenggat1.setForeground(new java.awt.Color(0, 74, 173));
        tenggat1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat1.setText("12 Agustus 2024");
        jPanel3.add(tenggat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        low1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        low1.setForeground(new java.awt.Color(49, 45, 34));
        low1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        low1.setText("Juru Masak");
        jPanel3.add(low1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, -1));

        keterangan6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan6.setForeground(new java.awt.Color(49, 45, 34));
        keterangan6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan6.setText("Berakhir pada:");
        jPanel3.add(keterangan6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        editJM.setBackground(new java.awt.Color(112, 104, 94));
        editJM.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        editJM.setForeground(new java.awt.Color(249, 248, 242));
        editJM.setText("Edit");
        editJM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editJM.setBorderPainted(false);
        editJM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editJM.setFocusable(false);
        editJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editJMActionPerformed(evt);
            }
        });
        jPanel3.add(editJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 430, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenggat2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenggat2.setForeground(new java.awt.Color(0, 74, 173));
        tenggat2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat2.setText("12 Agustus 2024");
        jPanel4.add(tenggat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        low2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        low2.setForeground(new java.awt.Color(49, 45, 34));
        low2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        low2.setText("Pelayan");
        jPanel4.add(low2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 50));

        keterangan9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan9.setForeground(new java.awt.Color(49, 45, 34));
        keterangan9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan9.setText("Berakhir pada:");
        jPanel4.add(keterangan9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        EditP.setBackground(new java.awt.Color(112, 104, 94));
        EditP.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EditP.setForeground(new java.awt.Color(249, 248, 242));
        EditP.setText("Edit");
        EditP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditP.setBorderPainted(false);
        EditP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditP.setFocusable(false);
        EditP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPActionPerformed(evt);
            }
        });
        jPanel4.add(EditP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 430, 180));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tenggat3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenggat3.setForeground(new java.awt.Color(0, 74, 173));
        tenggat3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat3.setText("12 Agustus 2024");
        jPanel5.add(tenggat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 150, 30));

        low3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        low3.setForeground(new java.awt.Color(49, 45, 34));
        low3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        low3.setText("Kasir");
        jPanel5.add(low3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 200, 50));

        keterangan12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan12.setForeground(new java.awt.Color(49, 45, 34));
        keterangan12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan12.setText("Berakhir pada:");
        jPanel5.add(keterangan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, 30));

        EditK.setBackground(new java.awt.Color(112, 104, 94));
        EditK.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        EditK.setForeground(new java.awt.Color(249, 248, 242));
        EditK.setText("Edit");
        EditK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EditK.setBorderPainted(false);
        EditK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EditK.setFocusable(false);
        EditK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditKActionPerformed(evt);
            }
        });
        jPanel5.add(EditK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 430, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_home().setVisible(true);
    }//GEN-LAST:event_homeIconMouseClicked

    private void pelamarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelamarIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_pelamar().setVisible(true);
    }//GEN-LAST:event_pelamarIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lokerIconMouseClicked

    private void pegawaiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_pegawai().setVisible(true);
    }//GEN-LAST:event_pegawaiIconMouseClicked

    private void saranIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saranIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_saran().setVisible(true);
    }//GEN-LAST:event_saranIconMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void supportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supportMouseClicked

    private void rincianDISABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianDISABLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rincianDISABLEActionPerformed

    private void editJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editJMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editJMActionPerformed

    private void EditPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditPActionPerformed

    private void EditKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(hrd_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrd_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrd_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrd_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrd_loker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditK;
    private javax.swing.JButton EditP;
    private javax.swing.JLabel about;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton editJM;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel keterangan12;
    private javax.swing.JLabel keterangan3;
    private javax.swing.JLabel keterangan6;
    private javax.swing.JLabel keterangan9;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JLabel low1;
    private javax.swing.JLabel low2;
    private javax.swing.JLabel low3;
    private javax.swing.JLabel low4;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel pegawaiIcon;
    private javax.swing.JLabel pegawaiLabel;
    private javax.swing.JLabel pelamarIcon;
    private javax.swing.JLabel pelamarLabel;
    private javax.swing.JButton rincianDISABLE;
    private javax.swing.JLabel saranIcon;
    private javax.swing.JLabel saranLabel;
    private javax.swing.JLabel support;
    private javax.swing.JLabel tenggat1;
    private javax.swing.JLabel tenggat2;
    private javax.swing.JLabel tenggat3;
    private javax.swing.JLabel tenggatDISABLE;
    // End of variables declaration//GEN-END:variables

class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;
        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }
        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            
        }
        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
}

}
