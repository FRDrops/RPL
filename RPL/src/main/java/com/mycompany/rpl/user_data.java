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
import java.awt.CardLayout;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JComboBox;

/**
 *
 * @author ASUS
 */
public class user_data extends javax.swing.JFrame {

    /**
     * Creates new form user_data
     */
    public user_data() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        datasayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/datasayaWhite.png")));
        lamsayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lamsayaBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokerkerjaBlack.png")));
        infoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/infoBlue.png")));
        userProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilUser.png")));

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
        lokerLabel = new javax.swing.JLabel();
        homeIcon = new javax.swing.JLabel();
        homeLabel = new javax.swing.JLabel();
        datasayaIcon = new javax.swing.JLabel();
        lamsayaIcon = new javax.swing.JLabel();
        datasayaLabel = new javax.swing.JLabel();
        lokerIcon = new javax.swing.JLabel();
        lamsayaLabel = new javax.swing.JLabel();
        jPanel1 = new RoundedPanel(70, new Color(49, 45, 34));
        copyright = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        support = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        userProfil = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(50, new Color(215, 204, 185));
        judul2 = new javax.swing.JLabel();
        keterangan2 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        profilButton = new javax.swing.JButton();
        skckButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tempatInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        alamatInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tanggalInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        nikInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        nomorInput = new javax.swing.JTextField();
        jenisInput = new javax.swing.JComboBox<>();
        cvButton = new javax.swing.JButton();
        ijazahButton = new javax.swing.JButton();
        ktpButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jurusanInput = new javax.swing.JTextField();
        pendInput = new javax.swing.JComboBox<>();
        infoLabel = new javax.swing.JLabel();
        infoIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lokerLabel.setForeground(new java.awt.Color(49, 45, 34));
        lokerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokerLabel.setText("Loker Kerja");
        nav.add(lokerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 20));

        homeIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\homeBlack.png")); // NOI18N
        homeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeIconMouseClicked(evt);
            }
        });
        nav.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 100, 150, 50));

        homeLabel.setForeground(new java.awt.Color(49, 45, 34));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        nav.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 50, 30));

        datasayaIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\datasayaWhite.png")); // NOI18N
        datasayaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datasayaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datasayaIconMouseClicked(evt);
            }
        });
        nav.add(datasayaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 210, 150, 70));

        lamsayaIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\lamsayaBlack.png")); // NOI18N
        lamsayaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lamsayaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lamsayaIconMouseClicked(evt);
            }
        });
        nav.add(lamsayaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 330, 150, 60));

        datasayaLabel.setForeground(new java.awt.Color(255, 255, 255));
        datasayaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datasayaLabel.setText("Data Saya");
        nav.add(datasayaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

        lokerIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\lokerkerjaBlack.png")); // NOI18N
        lokerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lokerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lokerIconMouseClicked(evt);
            }
        });
        nav.add(lokerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 450, 160, 60));

        lamsayaLabel.setForeground(new java.awt.Color(49, 45, 34));
        lamsayaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lamsayaLabel.setText("Lamaran Saya");
        nav.add(lamsayaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 90, 20));

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

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 90, 110));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 620));

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

        userProfil.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\profilUser.png")); // NOI18N
        getContentPane().add(userProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        judul2.setForeground(new java.awt.Color(49, 45, 34));
        judul2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        judul2.setText("[User_Name]");
        jPanel3.add(judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 770, -1));

        keterangan2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan2.setForeground(new java.awt.Color(49, 45, 34));
        keterangan2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan2.setText("[User_Email] *non-editable");
        jPanel3.add(keterangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 770, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 1030, 130));

        simpanButton.setBackground(new java.awt.Color(112, 104, 94));
        simpanButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        simpanButton.setForeground(new java.awt.Color(255, 255, 255));
        simpanButton.setText("Simpan");
        simpanButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        simpanButton.setBorderPainted(false);
        simpanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        simpanButton.setFocusable(false);
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });
        getContentPane().add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 190, 40));

        profilButton.setBackground(new java.awt.Color(112, 104, 94));
        profilButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        profilButton.setForeground(new java.awt.Color(255, 255, 255));
        profilButton.setText("Ganti Profil");
        profilButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        profilButton.setBorderPainted(false);
        profilButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilButton.setFocusable(false);
        profilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilButtonActionPerformed(evt);
            }
        });
        getContentPane().add(profilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 190, 40));

        skckButton.setBackground(new java.awt.Color(249, 248, 242));
        skckButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        skckButton.setForeground(new java.awt.Color(112, 104, 94));
        skckButton.setText("Upload SKCK");
        skckButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        skckButton.setBorderPainted(false);
        skckButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        skckButton.setFocusable(false);
        skckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skckButtonActionPerformed(evt);
            }
        });
        getContentPane().add(skckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, 190, 40));

        jPanel4.setBackground(new java.awt.Color(249, 248, 242));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tempatInput.setBackground(new java.awt.Color(249, 248, 242));
        tempatInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tempatInput.setForeground(new java.awt.Color(112, 104, 94));
        tempatInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tempatInput.setBorder(null);
        tempatInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempatInputActionPerformed(evt);
            }
        });
        jPanel4.add(tempatInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 45, 34));
        jLabel5.setText("Tempat Lahir:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 120, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 290, 40));

        jPanel6.setBackground(new java.awt.Color(249, 248, 242));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alamatInput.setBackground(new java.awt.Color(249, 248, 242));
        alamatInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alamatInput.setForeground(new java.awt.Color(112, 104, 94));
        alamatInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        alamatInput.setBorder(null);
        alamatInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatInputActionPerformed(evt);
            }
        });
        jPanel6.add(alamatInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 710, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 45, 34));
        jLabel7.setText("Alamat:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 70, 40));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 790, -1));

        jPanel5.setBackground(new java.awt.Color(249, 248, 242));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggalInput.setBackground(new java.awt.Color(249, 248, 242));
        tanggalInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tanggalInput.setForeground(new java.awt.Color(112, 104, 94));
        tanggalInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tanggalInput.setBorder(null);
        tanggalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalInputActionPerformed(evt);
            }
        });
        jPanel5.add(tanggalInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 200, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(49, 45, 34));
        jLabel6.setText("Tanggal Lahir:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 130, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, -1, 40));

        jPanel8.setBackground(new java.awt.Color(249, 248, 242));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 45, 34));
        jLabel9.setText("Pendidikan:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 110, 40));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, 40));

        jPanel7.setBackground(new java.awt.Color(249, 248, 242));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nikInput.setBackground(new java.awt.Color(249, 248, 242));
        nikInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nikInput.setForeground(new java.awt.Color(112, 104, 94));
        nikInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nikInput.setBorder(null);
        nikInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nikInputActionPerformed(evt);
            }
        });
        jPanel7.add(nikInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 230, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 45, 34));
        jLabel8.setText("NIK (sesuai KTP):");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 150, 40));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 390, 40));

        jPanel11.setBackground(new java.awt.Color(249, 248, 242));
        jPanel11.setToolTipText("");
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(49, 45, 34));
        jLabel12.setText("Nomor Telepon:");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 140, 40));

        nomorInput.setBackground(new java.awt.Color(249, 248, 242));
        nomorInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nomorInput.setForeground(new java.awt.Color(112, 104, 94));
        nomorInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nomorInput.setBorder(null);
        nomorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorInputActionPerformed(evt);
            }
        });
        jPanel11.add(nomorInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 230, 40));

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 380, -1, 40));

        jenisInput.setBackground(new java.awt.Color(249, 248, 242));
        jenisInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jenisInput.setForeground(new java.awt.Color(49, 45, 34));
        jenisInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jenisInput.setBorder(null);
        jenisInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenisInput.setFocusable(false);
        getContentPane().add(jenisInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 140, 40));

        cvButton.setBackground(new java.awt.Color(249, 248, 242));
        cvButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        cvButton.setForeground(new java.awt.Color(112, 104, 94));
        cvButton.setText("Upload CV");
        cvButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cvButton.setBorderPainted(false);
        cvButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cvButton.setFocusable(false);
        cvButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cvButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 190, 40));

        ijazahButton.setBackground(new java.awt.Color(249, 248, 242));
        ijazahButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ijazahButton.setForeground(new java.awt.Color(112, 104, 94));
        ijazahButton.setText("Upload Ijazah");
        ijazahButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ijazahButton.setBorderPainted(false);
        ijazahButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ijazahButton.setFocusable(false);
        ijazahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ijazahButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ijazahButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 190, 40));

        ktpButton.setBackground(new java.awt.Color(249, 248, 242));
        ktpButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ktpButton.setForeground(new java.awt.Color(112, 104, 94));
        ktpButton.setText("Upload KTP");
        ktpButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ktpButton.setBorderPainted(false);
        ktpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ktpButton.setFocusable(false);
        ktpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ktpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 190, 40));

        jPanel9.setBackground(new java.awt.Color(249, 248, 242));
        jPanel9.setToolTipText("");
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(49, 45, 34));
        jLabel10.setText("Jurusan/background:");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, -1, 40));

        jurusanInput.setBackground(new java.awt.Color(249, 248, 242));
        jurusanInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jurusanInput.setForeground(new java.awt.Color(112, 104, 94));
        jurusanInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jurusanInput.setBorder(null);
        jurusanInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanInputActionPerformed(evt);
            }
        });
        jPanel9.add(jurusanInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 290, 40));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 490, 40));

        pendInput.setBackground(new java.awt.Color(249, 248, 242));
        pendInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pendInput.setForeground(new java.awt.Color(112, 104, 94));
        pendInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMP", "SMA", "Diploma", "Sarjana", "Magister" }));
        pendInput.setSelectedIndex(-1);
        pendInput.setBorder(null);
        pendInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pendInput.setFocusable(false);
        getContentPane().add(pendInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 170, 40));

        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(0, 74, 173));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoLabel.setText("Klik untuk mengganti data kamu");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 210, 40));

        infoIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\infoBlue.png")); // NOI18N
        getContentPane().add(infoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datasayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasayaIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datasayaIconMouseClicked

    private void lamsayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lamsayaIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new user_lamaran().setVisible(true);
    }//GEN-LAST:event_lamsayaIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new user_loker().setVisible(true);
    }//GEN-LAST:event_lokerIconMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void supportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_supportMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new user_home().setVisible(true);
    }//GEN-LAST:event_homeIconMouseClicked

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void profilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profilButtonActionPerformed

    private void skckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skckButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skckButtonActionPerformed

    private void tempatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempatInputActionPerformed

    private void tanggalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalInputActionPerformed

    private void alamatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatInputActionPerformed

    private void nikInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikInputActionPerformed

    private void jurusanInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jurusanInputActionPerformed

    private void cvButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvButtonActionPerformed

    private void ijazahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ijazahButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ijazahButtonActionPerformed

    private void ktpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ktpButtonActionPerformed

    private void nomorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorInputActionPerformed

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
            java.util.logging.Logger.getLogger(user_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_data().setVisible(true);
            }
        });
        
        user_data udata = new user_data();
        udata.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        udata.setResizable(false);   //No resize is possible
        udata.setSize(1280, 720);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JTextField alamatInput;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton cvButton;
    private javax.swing.JLabel datasayaIcon;
    private javax.swing.JLabel datasayaLabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JButton ijazahButton;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JComboBox<String> jenisInput;
    private javax.swing.JLabel judul2;
    private javax.swing.JTextField jurusanInput;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JButton ktpButton;
    private javax.swing.JLabel lamsayaIcon;
    private javax.swing.JLabel lamsayaLabel;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JPanel nav;
    private javax.swing.JTextField nikInput;
    private javax.swing.JTextField nomorInput;
    private javax.swing.JComboBox<String> pendInput;
    private javax.swing.JButton profilButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton skckButton;
    private javax.swing.JLabel support;
    private javax.swing.JTextField tanggalInput;
    private javax.swing.JTextField tempatInput;
    private javax.swing.JLabel userProfil;
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
