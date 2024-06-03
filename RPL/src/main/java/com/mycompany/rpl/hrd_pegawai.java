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
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author ASUS
 */
public class hrd_pegawai extends javax.swing.JFrame {

    /**
     * Creates new form hrd_pegawai
     */
    public hrd_pegawai() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        rincianPegawai.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        readBerkas.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        pelamarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pelamarBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokersayaBlack.png")));
        pegawaiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pegawaiWhite.png")));
        saranIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/saranBlack.png")));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/hrdDelete.png")));
        change.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/hrdUpdate.png")));
        readToTable();
    }

    public DefaultTableModel readPegawai() throws SQLException {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nama");
        tableModel.addColumn("Jenis Kelamin");
        tableModel.addColumn("Tanggal Lahir");
        tableModel.addColumn("Alamat");
        tableModel.addColumn("Posisi");

        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            tableModel.setRowCount(0);

            String query = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, p.posisi " +
                           "FROM data_user du " +
                           "INNER JOIN pegawai p ON du.username_user = p.username_user ";
            
            statement = koneksi.prepareStatement(query);
            resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Object[] rowData = {
                    resultSet.getString("nama"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getDate("tanggal_lahir"),
                    resultSet.getString("alamat"),
                    resultSet.getString("posisi")
                };
                tableModel.addRow(rowData);
            }
            resultSet.close();

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
                if (statement != null) {
                    statement.close();
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
        tablePegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"Nama", "jenis Kelamin", "Tanggal Lahir", "Alamat", "Posisi"}
        ));
        DefaultTableModel model = readPegawai();
        tablePegawai.setModel(model);
        
        centerAlignTableCells();
    }
    
    private void centerAlignTableCells() {
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);

    for (int i = 0; i < tablePegawai.getColumnCount(); i++) {
        tablePegawai.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rincianPegawai = new javax.swing.JDialog();
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
        delete = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        readBerkas = new javax.swing.JDialog();
        kembali = new javax.swing.JButton();
        judul3 = new javax.swing.JLabel();
        nav1 = new RoundedPanel(10, new Color(249, 248, 242));
        view = new javax.swing.JLabel();
        nav6 = new RoundedPanel(10, new Color(112, 104, 94));
        cv = new javax.swing.JLabel();
        nav5 = new RoundedPanel(10, new Color(112, 104, 94));
        ktp = new javax.swing.JLabel();
        nav4 = new RoundedPanel(10, new Color(112, 104, 94));
        kk = new javax.swing.JLabel();
        nav3 = new RoundedPanel(10, new Color(112, 104, 94));
        skck = new javax.swing.JLabel();
        nav2 = new RoundedPanel(10, new Color(112, 104, 94));
        ijazah = new javax.swing.JLabel();
        ketCV = new javax.swing.JLabel();
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
        tablePegawai = new javax.swing.JTable();

        rincianPegawai.setBackground(new java.awt.Color(255, 255, 255));
        rincianPegawai.setMinimumSize(new java.awt.Dimension(1100, 650));
        rincianPegawai.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        judul1.setForeground(new java.awt.Color(112, 104, 94));
        judul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul1.setText("Daftar Pegawai di Gendhu Roso");
        rincianPegawai.getContentPane().add(judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 610, -1));

        jSeparator3.setForeground(new java.awt.Color(215, 204, 185));
        rincianPegawai.getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 960, 20));

        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        rincianPegawai.getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 20, 160, 60));

        userProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfilMouseClicked(evt);
            }
        });
        rincianPegawai.getContentPane().add(userProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 230, 240));

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

        rincianPegawai.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 1030, 130));

        jPanel4.setBackground(new java.awt.Color(249, 248, 242));
        jPanel4.setToolTipText("");
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tempatInput.setBackground(new java.awt.Color(249, 248, 242));
        tempatInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tempatInput.setForeground(new java.awt.Color(112, 104, 94));
        tempatInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tempatInput.setBorder(null);
        tempatInput.setFocusable(false);
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

        rincianPegawai.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 290, 40));

        jPanel6.setBackground(new java.awt.Color(249, 248, 242));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alamatInput.setBackground(new java.awt.Color(249, 248, 242));
        alamatInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alamatInput.setForeground(new java.awt.Color(112, 104, 94));
        alamatInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        alamatInput.setBorder(null);
        alamatInput.setFocusable(false);
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

        rincianPegawai.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 790, -1));

        jPanel5.setBackground(new java.awt.Color(249, 248, 242));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tanggalInput.setBackground(new java.awt.Color(249, 248, 242));
        tanggalInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tanggalInput.setForeground(new java.awt.Color(112, 104, 94));
        tanggalInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tanggalInput.setBorder(null);
        tanggalInput.setFocusable(false);
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

        rincianPegawai.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, 40));

        jPanel8.setBackground(new java.awt.Color(249, 248, 242));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 45, 34));
        jLabel9.setText("Pendidikan:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 110, 40));

        rincianPegawai.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, 40));

        jPanel7.setBackground(new java.awt.Color(249, 248, 242));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nikInput.setBackground(new java.awt.Color(249, 248, 242));
        nikInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nikInput.setForeground(new java.awt.Color(112, 104, 94));
        nikInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nikInput.setBorder(null);
        nikInput.setFocusable(false);
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

        rincianPegawai.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 390, 40));

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
        nomorInput.setFocusable(false);
        nomorInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomorInputActionPerformed(evt);
            }
        });
        jPanel11.add(nomorInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 230, 40));

        rincianPegawai.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, -1, 40));

        jenisInput.setBackground(new java.awt.Color(249, 248, 242));
        jenisInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jenisInput.setForeground(new java.awt.Color(49, 45, 34));
        jenisInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jenisInput.setBorder(null);
        jenisInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenisInput.setFocusable(false);
        rincianPegawai.getContentPane().add(jenisInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 140, 40));

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
        rincianPegawai.getContentPane().add(lihatBerkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 190, 40));

        pendInput.setBackground(new java.awt.Color(249, 248, 242));
        pendInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pendInput.setForeground(new java.awt.Color(112, 104, 94));
        pendInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMP", "SMA", "Diploma", "Sarjana", "Magister" }));
        pendInput.setSelectedIndex(-1);
        pendInput.setBorder(null);
        pendInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pendInput.setFocusable(false);
        rincianPegawai.getContentPane().add(pendInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 170, 40));

        posisiUser.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        posisiUser.setForeground(new java.awt.Color(0, 74, 173));
        posisiUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posisiUser.setText("[Posisi]");
        rincianPegawai.getContentPane().add(posisiUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 230, -1));

        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        rincianPegawai.getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 70, 60));

        change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeMouseClicked(evt);
            }
        });
        rincianPegawai.getContentPane().add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 430, 160, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setText("Ubah");
        rincianPegawai.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 490, 30, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Hapus");
        rincianPegawai.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        readBerkas.setMinimumSize(new java.awt.Dimension(625, 600));
        readBerkas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kembali.setBackground(new java.awt.Color(112, 104, 94));
        kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kembali.setForeground(new java.awt.Color(255, 255, 255));
        kembali.setText("Kembali");
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.setFocusable(false);
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kembaliMouseClicked(evt);
            }
        });
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        readBerkas.getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        judul3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judul3.setForeground(new java.awt.Color(49, 45, 34));
        judul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul3.setText("Berkas Pegawai");
        readBerkas.getContentPane().add(judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 210, 40));

        nav1.setBackground(new java.awt.Color(255, 255, 255));
        nav1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view.setForeground(new java.awt.Color(215, 204, 185));
        view.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        view.setText("Berkas");
        nav1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 420, -1));

        readBerkas.getContentPane().add(nav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 590, 370));

        nav6.setBackground(new java.awt.Color(249, 248, 242));
        nav6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nav6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cv.setForeground(new java.awt.Color(255, 255, 255));
        cv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cv.setText("CV");
        cv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cvMouseClicked(evt);
            }
        });
        nav6.add(cv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        readBerkas.getContentPane().add(nav6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 70, 60));

        nav5.setBackground(new java.awt.Color(249, 248, 242));
        nav5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ktp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ktp.setForeground(new java.awt.Color(255, 255, 255));
        ktp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ktp.setText("KTP");
        ktp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ktp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ktpMouseClicked(evt);
            }
        });
        nav5.add(ktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        readBerkas.getContentPane().add(nav5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 70, 60));

        nav4.setBackground(new java.awt.Color(249, 248, 242));
        nav4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        kk.setForeground(new java.awt.Color(255, 255, 255));
        kk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kk.setText("KK");
        kk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kkMouseClicked(evt);
            }
        });
        nav4.add(kk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        readBerkas.getContentPane().add(nav4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 70, 60));

        nav3.setBackground(new java.awt.Color(249, 248, 242));
        nav3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skck.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        skck.setForeground(new java.awt.Color(255, 255, 255));
        skck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skck.setText("SKCK");
        skck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        skck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skckMouseClicked(evt);
            }
        });
        nav3.add(skck, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        readBerkas.getContentPane().add(nav3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 70, 60));

        nav2.setBackground(new java.awt.Color(249, 248, 242));
        nav2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ijazah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ijazah.setForeground(new java.awt.Color(255, 255, 255));
        ijazah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ijazah.setText("IJAZAH");
        ijazah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ijazah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ijazahMouseClicked(evt);
            }
        });
        nav2.add(ijazah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 40));

        readBerkas.getContentPane().add(nav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 70, 60));

        ketCV.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketCV.setForeground(new java.awt.Color(169, 42, 13));
        ketCV.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ketCV.setText("*Klik untuk melihat berkas");
        readBerkas.getContentPane().add(ketCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, 280, 20));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pegawaiLabel.setForeground(new java.awt.Color(255, 255, 255));
        pegawaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegawaiLabel.setText("Daftar Pegawai");
        nav.add(pegawaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 20));

        homeIcon.setForeground(new java.awt.Color(49, 45, 34));
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

        pelamarLabel.setForeground(new java.awt.Color(49, 45, 34));
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

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, 110));

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
        judul.setText("Daftar Pegawai di Gendhu Roso");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 610, -1));

        jSeparator2.setForeground(new java.awt.Color(215, 204, 185));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 960, 20));

        tablePegawai.setBackground(new java.awt.Color(249, 248, 242));
        tablePegawai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePegawai.setForeground(new java.awt.Color(49, 45, 34));
        tablePegawai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ruth", "perempuan", "20", "mojo9", "juru masak", "12-12-2024"},
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
                "Nama", "Jenis Kelamin", "Usia", "Alamat", "Posisi", "Mulai Bekerja"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablePegawai.setGridColor(new java.awt.Color(215, 204, 185));
        tablePegawai.setRowHeight(30);
        tablePegawai.setSelectionBackground(new java.awt.Color(215, 204, 185));
        tablePegawai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePegawaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePegawai);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 970, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new hrd_home().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_homeIconMouseClicked

    private void pelamarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelamarIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new hrd_pelamar().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pelamarIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new hrd_loker().setVisible(true);
    }//GEN-LAST:event_lokerIconMouseClicked

    private void pegawaiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawaiIconMouseClicked

    private void saranIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saranIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new hrd_saran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pegawai.class.getName()).log(Level.SEVERE, null, ex);
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

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        rincianPegawai.dispose();
        try {
            readToTable();
        } catch (SQLException ex) {
            Logger.getLogger(hrd_pegawai.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

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
        rincianPegawai.dispose();
        readBerkas.setLocationRelativeTo(null);
        readBerkas.setSize(625, 600);
        readBerkas.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        readBerkas.setVisible(true);
        readBerkas.setVisible(true);
        view.setIcon(null);
    }//GEN-LAST:event_lihatBerkasActionPerformed

    private void lihatBerkasDetail(String username, String berkas) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            koneksi = konek.open();
            String query = "SELECT " + berkas + " FROM data_user WHERE username_user = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, username);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                byte[] imgBytes = resultSet.getBytes(berkas);
                if (imgBytes != null) {
                    ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                    ImageIcon icon = new ImageIcon(new ImageIcon(bis.readAllBytes()).getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT));
                    view.setIcon(icon);
                    view.setText(null);
                } else {
                    view.setIcon(null);
                    view.setText("No image found for this ID.");
                }
            } else {
                view.setIcon(null);
                view.setText("No image found for this ID.");
            }
        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Kesalahan lain terjadi: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kesalahan tidak terduga", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
                Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String posisi = posisiUser.getText();
        String username = this.readUsn(nama);
        deletePegawai(username, posisi);
        
    }//GEN-LAST:event_deleteMouseClicked

    public void deletePegawai(String username, String posisi) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;

        try {
            koneksi = konek.open();

            String query = "DELETE FROM pegawai WHERE username_user = ? AND posisi = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, posisi);

            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Pegawai berhasil dihapus.");
                JOptionPane.showMessageDialog(null, "Berhasil menghapus pegawai.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Pegawai dengan username dan posisi tersebut tidak ditemukan.");
            }

        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println("Kesalahan lain terjadi: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kesalahan tidak terduga", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
                Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        rincianPegawai.dispose();
    }
    
    private void changeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_changeMouseClicked

    public void updatePosisi(String username, String posisiBaru) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;

        try {
            koneksi = konek.open();

            // Memeriksa apakah posisi baru valid
            if (!posisiBaru.equals("Juru Masak") && !posisiBaru.equals("Pelayan") && !posisiBaru.equals("Kasir")) {
                throw new IllegalArgumentException("Posisi tidak valid: " + posisiBaru);
            }

            String query = "UPDATE pegawai SET posisi = ? WHERE username_user = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, posisiBaru);
            statement.setString(2, username);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Posisi berhasil diperbarui.");
            } else {
                System.out.println("Username tidak ditemukan.");
            }

        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan input: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Kesalahan lain terjadi: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kesalahan tidak terduga", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
                Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
    private void kembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseClicked
        // TODO add your handling code here:
        readBerkas.dispose();
        rincianPegawai.setLocationRelativeTo(null);
        rincianPegawai.setSize(1100, 650);
        rincianPegawai.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        rincianPegawai.setVisible(true);
        rincianPegawai.setVisible(true);
    }//GEN-LAST:event_kembaliMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        readBerkas.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void cvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String username = readUsn(nama);
        String berkas = "cv";
        this.lihatBerkasDetail(username, berkas);
    }//GEN-LAST:event_cvMouseClicked

    private void ktpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktpMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String username = readUsn(nama);
        String berkas = "ktp";
        this.lihatBerkasDetail(username, berkas);
    }//GEN-LAST:event_ktpMouseClicked

    private void kkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kkMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String username = readUsn(nama);
        String berkas = "kk";
        this.lihatBerkasDetail(username, berkas);
    }//GEN-LAST:event_kkMouseClicked

    private void skckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skckMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String username = readUsn(nama);
        String berkas = "skck";
        this.lihatBerkasDetail(username, berkas);
    }//GEN-LAST:event_skckMouseClicked

    private void ijazahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ijazahMouseClicked
        // TODO add your handling code here:
        String nama = judul2.getText();
        String username = readUsn(nama);
        String berkas = "ijazah";
        this.lihatBerkasDetail(username, berkas);
    }//GEN-LAST:event_ijazahMouseClicked

    public String readUsn(String nama) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String username = null;

        try {
            koneksi = konek.open();
            String query = "SELECT username_user FROM data_user WHERE nama = ?";

            statement = koneksi.prepareStatement(query);
            statement.setString(1, nama);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                username = resultSet.getString("username_user");
            } else {
                System.out.println("Nama tidak ditemukan dalam database.");
            }

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
                if (statement != null) {
                    statement.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
            }
        }

        return username;
    }
    
    private BufferedImage makeRoundedCorner(BufferedImage image, int diameter) {
        int size = Math.min(image.getWidth(), image.getHeight());
        BufferedImage squareImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = squareImage.createGraphics();
        applyQualityRenderingHints(g2);
        g2.drawImage(image, 0, 0, size, size, null);
        g2.dispose();

        BufferedImage roundedImage = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = roundedImage.createGraphics();
        applyQualityRenderingHints(g2d);

        g2d.setClip(new Ellipse2D.Double(0, 0, diameter, diameter));
        g2d.drawImage(squareImage, 0, 0, diameter, diameter, null);
        g2d.dispose();

        return roundedImage;
    }
    
    private void applyQualityRenderingHints(Graphics2D g2d) {
        g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
    }
    
    private void readUser(String namaPelamar) throws IOException {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String sql = "SELECT * FROM data_user WHERE nama = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, namaPelamar);

            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "No data found for username: " + namaPelamar);
                clearFields();
                return;
            }
            String nama = resultSet.getString("nama") != null ? resultSet.getString("nama") : "";
            String jenisKelamin = resultSet.getString("jenis_kelamin") != null ? resultSet.getString("jenis_kelamin") : "";
            String tempatLahir = resultSet.getString("tempat_lahir") != null ? resultSet.getString("tempat_lahir") : "";
            String tanggalLahir = resultSet.getDate("tanggal_lahir") != null ? resultSet.getDate("tanggal_lahir").toString() : "";
            String pendidikan = resultSet.getString("pendidikan") != null ? resultSet.getString("pendidikan") : "";
            String telepon = resultSet.getString("telepon") != null ? resultSet.getString("telepon") : "";
            String email = resultSet.getString("email") != null ? resultSet.getString("email") : "";
            String alamat = resultSet.getString("alamat") != null ? resultSet.getString("alamat") : "";
            String nik = resultSet.getString("nik") != null ? resultSet.getString("nik") : "";
            Blob fotoBlob = resultSet.getBlob("foto");
            
            judul2.setText(nama);
            jenisInput.setSelectedItem(jenisKelamin);
            tempatInput.setText(tempatLahir);
            tanggalInput.setText(tanggalLahir);
            pendInput.setSelectedItem(pendidikan);
            nomorInput.setText(telepon);
            keterangan2.setText(email);
            alamatInput.setText(alamat);
            nikInput.setText(nik);
            
            if (fotoBlob != null) {
               /* byte[] fotoBytes = fotoBlob.getBytes(1, (int) fotoBlob.length());
                Image image = ImageIO.read(new ByteArrayInputStream(fotoBytes));
                ImageIcon fotoIcon = new ImageIcon();
                userProfil.setIcon(fotoIcon);*/
                byte[] fotoBytes = fotoBlob.getBytes(1, (int) fotoBlob.length());
                BufferedImage image = ImageIO.read(new ByteArrayInputStream(fotoBytes));
                int diameter = 200; // Atur diameter sesuai keinginan
                BufferedImage roundedImage = makeRoundedCorner(image, diameter);
                ImageIcon fotoIcon = new ImageIcon(roundedImage);
                userProfil.setIcon(fotoIcon);
                
            } else {
                //apa hayo
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private void clearFields() {
        judul2.setText("");
        jenisInput.setSelectedItem("");
        tanggalInput.setText("");
        pendInput.setSelectedItem("");
        nomorInput.setText("");
        keterangan2.setText("");
        alamatInput.setText("");
        nikInput.setText("");
    }
    
    private void tablePegawaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePegawaiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel sourceModel = (DefaultTableModel) tablePegawai.getModel();
        int MyIndex = tablePegawai.getSelectedRow();
        String nama = sourceModel.getValueAt(MyIndex, 0).toString();
        String posisi = sourceModel.getValueAt(MyIndex, 4).toString();
        posisiUser.setText(posisi);
        try {
            readUser(nama);
        } catch (IOException ex) {
            Logger.getLogger(hrd_pelamar.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        rincianPegawai.setLocationRelativeTo(null);
        rincianPegawai.setSize(1100, 650);
        rincianPegawai.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        rincianPegawai.setVisible(true);
    }//GEN-LAST:event_tablePegawaiMouseClicked

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
            java.util.logging.Logger.getLogger(hrd_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrd_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrd_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrd_pegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new hrd_pegawai().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(hrd_pegawai.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        hrd_pegawai hpegawai = new hrd_pegawai();
        hpegawai.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hpegawai.setResizable(false);   //No resize is possible
        hpegawai.setSize(1280, 720);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JTextField alamatInput;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel change;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel cv;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel ijazah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel judul3;
    private javax.swing.JButton kembali;
    private javax.swing.JLabel ketCV;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JLabel kk;
    private javax.swing.JLabel ktp;
    private javax.swing.JButton lihatBerkas;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JPanel nav;
    private javax.swing.JPanel nav1;
    private javax.swing.JPanel nav2;
    private javax.swing.JPanel nav3;
    private javax.swing.JPanel nav4;
    private javax.swing.JPanel nav5;
    private javax.swing.JPanel nav6;
    private javax.swing.JTextField nikInput;
    private javax.swing.JTextField nomorInput;
    private javax.swing.JLabel pegawaiIcon;
    private javax.swing.JLabel pegawaiLabel;
    private javax.swing.JLabel pelamarIcon;
    private javax.swing.JLabel pelamarLabel;
    private javax.swing.JComboBox<String> pendInput;
    private javax.swing.JLabel posisiUser;
    private javax.swing.JDialog readBerkas;
    private javax.swing.JDialog rincianPegawai;
    private javax.swing.JLabel saranIcon;
    private javax.swing.JLabel saranLabel;
    private javax.swing.JLabel skck;
    private javax.swing.JLabel support;
    private javax.swing.JTable tablePegawai;
    private javax.swing.JTextField tanggalInput;
    private javax.swing.JTextField tempatInput;
    private javax.swing.JLabel userProfil;
    private javax.swing.JLabel view;
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
