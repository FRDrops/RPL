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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author ASUS
 */
public class hrd_pelamar extends javax.swing.JFrame {
    
    /**
     * Creates new form hrd_pelamar
     */
    public hrd_pelamar() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        pelamarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pelamarWhite.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokersayaBlack.png")));
        pegawaiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pegawaiBlack.png")));
        saranIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/saranBlack.png")));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/hrdAccept.png")));
        decline.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/hrdDelete.png")));
        
        readToTable();
    }
    
    private void centerAlignTableCells() {
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);

    for (int i = 0; i < tablePelamar.getColumnCount(); i++) {
        tablePelamar.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    public DefaultTableModel readPelamar() throws SQLException {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nama");
        tableModel.addColumn("Jenis Kelamin");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Posisi Lamaran");
        tableModel.addColumn("Tanggal Diajukan");

        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        PreparedStatement statementJM = null;
        PreparedStatement statementK = null;
        PreparedStatement statementP = null;
        ResultSet resultSet = null;

        try {
            tableModel.setRowCount(0);

            String queryJM = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, 'Juru Masak' AS posisi_lamaran, ljm.tanggal_diajukan " +
                             "FROM lowongan_jm ljm " +
                             "INNER JOIN data_user du ON ljm.username_user = du.username_user";

            String queryK = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, 'Kasir' AS posisi_lamaran, lk.tanggal_diajukan " +
                            "FROM lowongan_k lk " +
                            "INNER JOIN data_user du ON lk.username_user = du.username_user";

            String queryP = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, 'Pelayan' AS posisi_lamaran, lp.tanggal_diajukan " +
                            "FROM lowongan_p lp " +
                            "INNER JOIN data_user du ON lp.username_user = du.username_user";

            statementJM = koneksi.prepareStatement(queryJM);
            resultSet = statementJM.executeQuery();
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("nama"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getDate("tanggal_lahir"),
                    resultSet.getString("alamat"),
                    "Juru Masak",
                    resultSet.getDate("tanggal_diajukan")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();

            statementK = koneksi.prepareStatement(queryK);
            resultSet = statementK.executeQuery();
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("nama"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getDate("tanggal_lahir"),
                    resultSet.getString("alamat"),
                    "Kasir",
                    resultSet.getDate("tanggal_diajukan")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();

            statementP = koneksi.prepareStatement(queryP);
            resultSet = statementP.executeQuery();
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("nama"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getDate("tanggal_lahir"),
                    resultSet.getString("alamat"),
                    "Pelayan",
                    resultSet.getDate("tanggal_diajukan")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();
        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();
        } catch (Exception e) {
            System.out.println("Kesalahan lain terjadi: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statementJM != null) {
                    statementJM.close();
                }
                if (statementK != null) {
                    statementK.close();
                }
                if (statementP != null) {
                    statementP.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return tableModel;
    }

    
    public void readToTable() throws SQLException {
        tablePelamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"Nama", "jenis Kelamin", "Tanggal Lahir", "Alamat", "Posisi Lamaran", "Tanggal Diajukan"}
        ));
        DefaultTableModel model = readPelamar();
        tablePelamar.setModel(model);
        
        centerAlignTableCells();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rincianPelamar = new javax.swing.JDialog();
        judul1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        backButton = new javax.swing.JLabel();
        userProfil = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(50, new Color(215, 204, 185));
        judul2 = new javax.swing.JLabel();
        keterangan2 = new javax.swing.JLabel();
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
        lihatBerkas = new javax.swing.JButton();
        pendInput = new javax.swing.JComboBox<>();
        posisiUser = new javax.swing.JLabel();
        decline = new javax.swing.JLabel();
        accept = new javax.swing.JLabel();
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
        copyright = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        support = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePelamar = new javax.swing.JTable();

        rincianPelamar.setBackground(new java.awt.Color(255, 255, 255));
        rincianPelamar.setMinimumSize(new java.awt.Dimension(1100, 650));
        rincianPelamar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        judul1.setForeground(new java.awt.Color(112, 104, 94));
        judul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul1.setText("Daftar Pelamar di Gendhu Roso");
        rincianPelamar.getContentPane().add(judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 610, -1));

        jSeparator3.setForeground(new java.awt.Color(215, 204, 185));
        rincianPelamar.getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 960, 20));

        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        rincianPelamar.getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 20, 160, 60));

        userProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfilMouseClicked(evt);
            }
        });
        rincianPelamar.getContentPane().add(userProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 230, 240));

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

        rincianPelamar.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 1030, 130));

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

        rincianPelamar.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 290, 40));

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

        rincianPelamar.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 790, -1));

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

        rincianPelamar.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, -1, 40));

        jPanel8.setBackground(new java.awt.Color(249, 248, 242));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 45, 34));
        jLabel9.setText("Pendidikan:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 110, 40));

        rincianPelamar.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, 40));

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

        rincianPelamar.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 390, 40));

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

        rincianPelamar.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, 40));

        jenisInput.setBackground(new java.awt.Color(249, 248, 242));
        jenisInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jenisInput.setForeground(new java.awt.Color(49, 45, 34));
        jenisInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jenisInput.setBorder(null);
        jenisInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenisInput.setFocusable(false);
        rincianPelamar.getContentPane().add(jenisInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 140, 40));

        lihatBerkas.setBackground(new java.awt.Color(112, 104, 94));
        lihatBerkas.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lihatBerkas.setForeground(new java.awt.Color(255, 255, 255));
        lihatBerkas.setText("Lihat Berkas");
        lihatBerkas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lihatBerkas.setBorderPainted(false);
        lihatBerkas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lihatBerkas.setFocusable(false);
        lihatBerkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatBerkasActionPerformed(evt);
            }
        });
        rincianPelamar.getContentPane().add(lihatBerkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 190, 40));

        pendInput.setBackground(new java.awt.Color(249, 248, 242));
        pendInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pendInput.setForeground(new java.awt.Color(112, 104, 94));
        pendInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMP", "SMA", "Diploma", "Sarjana", "Magister" }));
        pendInput.setSelectedIndex(-1);
        pendInput.setBorder(null);
        pendInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pendInput.setFocusable(false);
        rincianPelamar.getContentPane().add(pendInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 170, 40));

        posisiUser.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        posisiUser.setForeground(new java.awt.Color(0, 74, 173));
        posisiUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posisiUser.setText("[Posisi]");
        rincianPelamar.getContentPane().add(posisiUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 130, -1));

        decline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                declineMouseClicked(evt);
            }
        });
        rincianPelamar.getContentPane().add(decline, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 160, 60));

        accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptMouseClicked(evt);
            }
        });
        rincianPelamar.getContentPane().add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 450, 160, 60));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pegawaiLabel.setForeground(new java.awt.Color(49, 45, 34));
        pegawaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegawaiLabel.setText("Daftar Pegawai");
        nav.add(pegawaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 20));

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

        pelamarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelamarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelamarIconMouseClicked(evt);
            }
        });
        nav.add(pelamarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 170, 160, 70));

        lokerIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lokerIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lokerIconMouseClicked(evt);
            }
        });
        nav.add(lokerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 280, 160, 60));

        pelamarLabel.setForeground(new java.awt.Color(255, 255, 255));
        pelamarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pelamarLabel.setText("Daftar Pelamar");
        nav.add(pelamarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));

        pegawaiIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pegawaiIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pegawaiIconMouseClicked(evt);
            }
        });
        nav.add(pegawaiIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 390, 160, 60));

        lokerLabel.setForeground(new java.awt.Color(49, 45, 34));
        lokerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokerLabel.setText("Loker Saya");
        nav.add(lokerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 90, 20));

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

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, 110));

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

        judul.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        judul.setForeground(new java.awt.Color(112, 104, 94));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        judul.setText("Daftar Pelamar di Gendhu Roso");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 610, -1));

        jSeparator2.setForeground(new java.awt.Color(215, 204, 185));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 960, 20));

        tablePelamar.setBackground(new java.awt.Color(249, 248, 242));
        tablePelamar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePelamar.setForeground(new java.awt.Color(49, 45, 34));
        tablePelamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ruth", "perempuan", "20", "mojo9", "juru masak", "12-10-2024"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis Kelamin", "Usia", "Alamat", "Posisi Melamar", "Tanggal Melamar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePelamar.setGridColor(new java.awt.Color(215, 204, 185));
        tablePelamar.setRowHeight(30);
        tablePelamar.setSelectionBackground(new java.awt.Color(215, 204, 185));
        tablePelamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePelamarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePelamar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pelamarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelamarIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pelamarIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_loker().setVisible(true);
    }//GEN-LAST:event_lokerIconMouseClicked

    private void pegawaiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_pegawai().setVisible(true);
    }//GEN-LAST:event_pegawaiIconMouseClicked

    private void saranIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saranIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new hrd_saran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saranIconMouseClicked

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
        try {
            new hrd_home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeIconMouseClicked

    private void userProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_userProfilMouseClicked

    private void tempatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempatInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempatInputActionPerformed

    private void alamatInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatInputActionPerformed

    private void tanggalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalInputActionPerformed

    private void nikInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nikInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nikInputActionPerformed

    private void nomorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorInputActionPerformed

    private void lihatBerkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatBerkasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lihatBerkasActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        rincianPelamar.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void tablePelamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePelamarMouseClicked
        // TODO add your handling code here:
        DefaultTableModel sourceModel = (DefaultTableModel) tablePelamar.getModel();
        int MyIndex = tablePelamar.getSelectedRow();
        String nama = sourceModel.getValueAt(MyIndex, 0).toString();
        String posisi = sourceModel.getValueAt(MyIndex, 1).toString();
    }//GEN-LAST:event_tablePelamarMouseClicked

    private void declineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_declineMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_declineMouseClicked

    private void acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptMouseClicked

    //table bisa di select per-kotak, terus nanti diarahin ke rincianPelamar dan data pelamar (user) muncul di sana
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(hrd_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrd_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrd_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrd_pelamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new hrd_pelamar().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        hrd_pelamar hlamar = new hrd_pelamar();
        hlamar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hlamar.setResizable(false);   //No resize is possible
        hlamar.setSize(1280, 720);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel accept;
    private javax.swing.JTextField alamatInput;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel decline;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> jenisInput;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JButton lihatBerkas;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JPanel nav;
    private javax.swing.JTextField nikInput;
    private javax.swing.JTextField nomorInput;
    private javax.swing.JLabel pegawaiIcon;
    private javax.swing.JLabel pegawaiLabel;
    private javax.swing.JLabel pelamarIcon;
    private javax.swing.JLabel pelamarLabel;
    private javax.swing.JComboBox<String> pendInput;
    private javax.swing.JLabel posisiUser;
    private javax.swing.JDialog rincianPelamar;
    private javax.swing.JLabel saranIcon;
    private javax.swing.JLabel saranLabel;
    private javax.swing.JLabel support;
    private javax.swing.JTable tablePelamar;
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
