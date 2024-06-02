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
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class user_loker extends javax.swing.JFrame {

    /**
     * Creates new form user_loker
     */
    
    private user_home userHome;
    
    public user_loker() {
        initComponents();
        setLocationRelativeTo(null);
        
        hasilJM.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        hasilP.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        hasilK.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        faqUser.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        datasayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/datasayaBlack.png")));
        lamsayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lamsayaBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokerkerjaWhite.png")));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        backButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        backButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back2.png")));
        satu.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/satu.png")));
        dua.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/dua.png")));
        tiga.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/tiga.png")));
        empat.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/empat.png")));
        panah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/panah.png")));
        panah2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/panah.png")));
        panah3.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/panah.png")));
        burung.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/burung.png")));
        logoKecil.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/logoGRKecil.png")));
        ig.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/instagram.png")));
        blog.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/blog.png")));
        wa.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/whatsapp.png")));
        
        userHome = new user_home();
        
        // remove border ngayeli di text area
        jScrollPane1.setBorder(null);
        jScrollPane2.setBorder(null);
        jScrollPane3.setBorder(null);
        jScrollPane4.setBorder(null);
        jScrollPane5.setBorder(null);
        jScrollPane6.setBorder(null);
        jScrollPane7.setBorder(null);
        jScrollPane8.setBorder(null);
        jScrollPane9.setBorder(null);

    }

    public boolean cekDataUser(String username) throws SQLException {
        boolean allFilled = false;
        Koneksi konek = new Koneksi();
        Connection koneksi = konek.open();
        String[] columns = {"nama", "jenis_kelamin", "tempat_lahir", "tanggal_lahir", "pendidikan", "telepon", "email", "alamat", "nik", "ijazah", "cv", "kk", "ktp", "skck", "foto"};

        try {
            Statement statement = koneksi.createStatement();
            String query = "SELECT * FROM data_user WHERE username_user = '" + username + "'";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                allFilled = true;
                for (String column : columns) {
                    if (resultSet.getString(column) == null || resultSet.getString(column).isEmpty()) {
                        allFilled = false;
                        break;
                    }
                }
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return allFilled;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasilJM = new javax.swing.JDialog();
        judul1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel7 = new RoundedPanel(50, new Color(249, 248, 242));
        kualifikasiJM = new javax.swing.JLabel();
        tanggungJawabJM = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ketkualJM = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ketjJM = new javax.swing.JTextArea();
        jPanel8 = new RoundedPanel(50, new Color(249, 248, 242));
        desJM = new javax.swing.JLabel();
        tenggat4 = new javax.swing.JLabel();
        keterangan21 = new javax.swing.JLabel();
        lamarButtonJM = new javax.swing.JButton();
        posisi1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ketdesJM = new javax.swing.JTextArea();
        backButton = new javax.swing.JLabel();
        bingung1 = new javax.swing.JButton();
        lihatHasilJM = new javax.swing.JButton();
        hasilP = new javax.swing.JDialog();
        judul2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel9 = new RoundedPanel(50, new Color(249, 248, 242));
        kualifikasiP = new javax.swing.JLabel();
        tanggungJawabP = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ketjP = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        ketkualP = new javax.swing.JTextArea();
        jPanel10 = new RoundedPanel(50, new Color(249, 248, 242));
        desP = new javax.swing.JLabel();
        tenggat5 = new javax.swing.JLabel();
        keterangan46 = new javax.swing.JLabel();
        lamarButtonP = new javax.swing.JButton();
        posisi2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ketdesP = new javax.swing.JTextArea();
        backButton1 = new javax.swing.JLabel();
        bingung2 = new javax.swing.JButton();
        lihatHasilP = new javax.swing.JButton();
        hasilK = new javax.swing.JDialog();
        judul3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel11 = new RoundedPanel(50, new Color(249, 248, 242));
        kualifikasiK = new javax.swing.JLabel();
        tanggungJawabK = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ketjK = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ketkualK = new javax.swing.JTextArea();
        jPanel12 = new RoundedPanel(50, new Color(249, 248, 242));
        desK = new javax.swing.JLabel();
        tenggat6 = new javax.swing.JLabel();
        keterangan68 = new javax.swing.JLabel();
        lamarButtonK = new javax.swing.JButton();
        posisi3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ketdesK = new javax.swing.JTextArea();
        backButton2 = new javax.swing.JLabel();
        bingung3 = new javax.swing.JButton();
        lihatHasilK = new javax.swing.JButton();
        faqUser = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        logoKecil = new javax.swing.JLabel();
        ig = new javax.swing.JLabel();
        blog = new javax.swing.JLabel();
        wa = new javax.swing.JLabel();
        noWA = new javax.swing.JLabel();
        contactUS = new javax.swing.JLabel();
        usnIG = new javax.swing.JLabel();
        blogURL = new javax.swing.JLabel();
        penjelasan43 = new javax.swing.JLabel();
        instruksi4 = new javax.swing.JLabel();
        empat = new javax.swing.JLabel();
        satu = new javax.swing.JLabel();
        dua = new javax.swing.JLabel();
        tiga = new javax.swing.JLabel();
        judul4 = new javax.swing.JLabel();
        judul5 = new javax.swing.JLabel();
        instruksi2 = new javax.swing.JLabel();
        instruksi3 = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        penjelasan12 = new javax.swing.JLabel();
        penjelasan13 = new javax.swing.JLabel();
        penjelasan21 = new javax.swing.JLabel();
        penjelasan22 = new javax.swing.JLabel();
        penjelasan23 = new javax.swing.JLabel();
        penjelasan31 = new javax.swing.JLabel();
        penjelasan32 = new javax.swing.JLabel();
        penjelasan33 = new javax.swing.JLabel();
        penjelasan41 = new javax.swing.JLabel();
        penjelasan42 = new javax.swing.JLabel();
        instruksi1 = new javax.swing.JLabel();
        penjelasan11 = new javax.swing.JLabel();
        tanya3 = new javax.swing.JLabel();
        tanya1 = new javax.swing.JLabel();
        jawab1 = new javax.swing.JLabel();
        tanya2 = new javax.swing.JLabel();
        jawab2 = new javax.swing.JLabel();
        panah3 = new javax.swing.JLabel();
        panah1 = new javax.swing.JLabel();
        panah2 = new javax.swing.JLabel();
        burung = new javax.swing.JLabel();
        jawab3 = new javax.swing.JLabel();
        backButton3 = new javax.swing.JLabel();
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
        judul = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        support = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggatDISABLE = new javax.swing.JLabel();
        low4 = new javax.swing.JLabel();
        keterangan3 = new javax.swing.JLabel();
        rincianDISABLE = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat1 = new javax.swing.JLabel();
        low1 = new javax.swing.JLabel();
        keterangan6 = new javax.swing.JLabel();
        rincianJM = new javax.swing.JButton();
        jPanel4 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat2 = new javax.swing.JLabel();
        low2 = new javax.swing.JLabel();
        keterangan9 = new javax.swing.JLabel();
        rincianP = new javax.swing.JButton();
        jPanel5 = new RoundedPanel(50, new Color(249, 248, 242));
        tenggat3 = new javax.swing.JLabel();
        low3 = new javax.swing.JLabel();
        keterangan12 = new javax.swing.JLabel();
        rincianK = new javax.swing.JButton();

        hasilJM.setMinimumSize(new java.awt.Dimension(1100, 650));
        hasilJM.setResizable(false);
        hasilJM.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        judul1.setForeground(new java.awt.Color(112, 104, 94));
        judul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul1.setText("Lowongan di Gendhu Roso");
        hasilJM.getContentPane().add(judul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 530, -1));

        jSeparator3.setForeground(new java.awt.Color(215, 204, 185));
        hasilJM.getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 960, 20));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kualifikasiJM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kualifikasiJM.setForeground(new java.awt.Color(49, 45, 34));
        kualifikasiJM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kualifikasiJM.setText("Kualifikasi Pekerjaan");
        jPanel7.add(kualifikasiJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, -1));

        tanggungJawabJM.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tanggungJawabJM.setForeground(new java.awt.Color(49, 45, 34));
        tanggungJawabJM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tanggungJawabJM.setText("Tanggung Jawab Utama");
        jPanel7.add(tanggungJawabJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 370, -1));

        ketkualJM.setBackground(new java.awt.Color(249, 248, 242));
        ketkualJM.setColumns(20);
        ketkualJM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketkualJM.setForeground(new java.awt.Color(49, 45, 34));
        ketkualJM.setLineWrap(true);
        ketkualJM.setRows(5);
        ketkualJM.setText("1. Laki-laki/ Perempuan\n2. Minimal usia 22 tahun\n3. Memiliki pengalaman di bidang memasak, minimal 2 tahun\n4. Menguasai dasar-dasar memasak (bahan, bumbu, dan proses memasak)\n5. Jujur, disiplin, dan bertanggung jawab\n6. Mempunyai skill leadership, teamwork, dan komunikasi yang baik");
        ketkualJM.setAutoscrolls(false);
        ketkualJM.setBorder(null);
        ketkualJM.setCaretColor(new java.awt.Color(249, 248, 242));
        ketkualJM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketkualJM.setFocusable(false);
        ketkualJM.setMaximumSize(new java.awt.Dimension(232, 84));
        ketkualJM.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane1.setViewportView(ketkualJM);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 570, 150));

        ketjJM.setBackground(new java.awt.Color(249, 248, 242));
        ketjJM.setColumns(20);
        ketjJM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketjJM.setForeground(new java.awt.Color(49, 45, 34));
        ketjJM.setLineWrap(true);
        ketjJM.setRows(5);
        ketjJM.setText("1. Merencanakan dan menyiapkan item menu masakan\n2. Menyiapkan, memasak makanan sesuai pesanan dan mengikuti resep masakan\n3. Mengawasi operasional dapur, termasuk menjaga peralatan dapur tetap bersih\n4. Memantau kualitas dan presentasi makanan\n5. Mengelola persediaan dan bahan-bahan sesuai kebutuhan \n6. Mengawasi pengendalian porsi dan limbah untuk meminimalkan pemborosan\n7. Berkomunikasi dengan manajer untuk memperbaiki menu dan operasi dapur\n8. Mengembangkan resep baru sesuai permintaan pelanggan");
        ketjJM.setAutoscrolls(false);
        ketjJM.setBorder(null);
        ketjJM.setCaretColor(new java.awt.Color(249, 248, 242));
        ketjJM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketjJM.setFocusable(false);
        ketjJM.setMaximumSize(new java.awt.Dimension(232, 84));
        ketjJM.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane3.setViewportView(ketjJM);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 570, 190));

        hasilJM.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 640, 470));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desJM.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        desJM.setForeground(new java.awt.Color(49, 45, 34));
        desJM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        desJM.setText("Deskripsi Pekerjaan");
        jPanel8.add(desJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 200, 30));

        tenggat4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenggat4.setForeground(new java.awt.Color(0, 74, 173));
        tenggat4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat4.setText("12 Agustus 2024");
        jPanel8.add(tenggat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 20));

        keterangan21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keterangan21.setForeground(new java.awt.Color(49, 45, 34));
        keterangan21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan21.setText("Berakhir pada:");
        jPanel8.add(keterangan21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        lamarButtonJM.setBackground(new java.awt.Color(112, 104, 94));
        lamarButtonJM.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lamarButtonJM.setForeground(new java.awt.Color(249, 248, 242));
        lamarButtonJM.setText("Lamar");
        lamarButtonJM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lamarButtonJM.setBorderPainted(false);
        lamarButtonJM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lamarButtonJM.setFocusable(false);
        lamarButtonJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamarButtonJMActionPerformed(evt);
            }
        });
        jPanel8.add(lamarButtonJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 40));

        posisi1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posisi1.setForeground(new java.awt.Color(49, 45, 34));
        posisi1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        posisi1.setText("Juru Masak");
        jPanel8.add(posisi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        ketdesJM.setBackground(new java.awt.Color(249, 248, 242));
        ketdesJM.setColumns(20);
        ketdesJM.setForeground(new java.awt.Color(49, 45, 34));
        ketdesJM.setLineWrap(true);
        ketdesJM.setRows(5);
        ketdesJM.setText("Sebagai juru masak, Anda akan bertanggung \njawab untuk menyiapkan dan memasak\nhidangan sesuai dengan standar rumah \nmakan kami. Anda akan bekerja sama dengan \ntim dapur untuk memastikan semua makanan \ndisajikan dengan rasa dan presentasi \nkonsisten");
        ketdesJM.setAutoscrolls(false);
        ketdesJM.setBorder(null);
        ketdesJM.setCaretColor(new java.awt.Color(249, 248, 242));
        ketdesJM.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketdesJM.setFocusable(false);
        ketdesJM.setMaximumSize(new java.awt.Dimension(232, 84));
        ketdesJM.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane2.setViewportView(ketdesJM);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 130));

        hasilJM.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 290, 370));

        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        hasilJM.getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 20, 160, 70));

        bingung1.setBackground(new java.awt.Color(249, 248, 242));
        bingung1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        bingung1.setForeground(new java.awt.Color(49, 45, 34));
        bingung1.setText("Masih Bingung?");
        bingung1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bingung1.setBorderPainted(false);
        bingung1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bingung1.setFocusable(false);
        bingung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingung1ActionPerformed(evt);
            }
        });
        hasilJM.getContentPane().add(bingung1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 190, 40));

        lihatHasilJM.setBackground(new java.awt.Color(112, 104, 94));
        lihatHasilJM.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lihatHasilJM.setForeground(new java.awt.Color(249, 248, 242));
        lihatHasilJM.setText("Lihat Hasil Saya");
        lihatHasilJM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lihatHasilJM.setBorderPainted(false);
        lihatHasilJM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lihatHasilJM.setFocusable(false);
        lihatHasilJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatHasilJMActionPerformed(evt);
            }
        });
        hasilJM.getContentPane().add(lihatHasilJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 190, 40));

        hasilP.setMinimumSize(new java.awt.Dimension(1100, 650));
        hasilP.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        judul2.setForeground(new java.awt.Color(112, 104, 94));
        judul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul2.setText("Lowongan di Gendhu Roso");
        hasilP.getContentPane().add(judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 530, -1));

        jSeparator4.setForeground(new java.awt.Color(215, 204, 185));
        hasilP.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 960, 20));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kualifikasiP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kualifikasiP.setForeground(new java.awt.Color(49, 45, 34));
        kualifikasiP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kualifikasiP.setText("Kualifikasi Pekerjaan");
        jPanel9.add(kualifikasiP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, -1));

        tanggungJawabP.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tanggungJawabP.setForeground(new java.awt.Color(49, 45, 34));
        tanggungJawabP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tanggungJawabP.setText("Tanggung Jawab Utama");
        jPanel9.add(tanggungJawabP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 370, -1));

        ketjP.setBackground(new java.awt.Color(249, 248, 242));
        ketjP.setColumns(20);
        ketjP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketjP.setForeground(new java.awt.Color(49, 45, 34));
        ketjP.setLineWrap(true);
        ketjP.setRows(5);
        ketjP.setText("1. Mengambil pesanan secara akurat dan sampaikan ke staf dapur \n2. Menyajikan makanan dan minuman ke pelanggan secara tepat waktu dan efisien\n3. Menyapa dan melayani pelanggan dengan cara yang ramah dan profesional\n4. Mengelola dan menata meja agar tetap rapi dan bersih\n5. Memastikan kebutuhan tamu terpenuhi sepanjang waktu makan\n6. Menangani keluhan tamu dengan profesional dan segera mencari solusi\n7. Menjelaskan menu dan menjawab pertanyaan tentang hidangan dan minuman.\n8. Mengantar tamu ke meja yang tersedia dan memberikan menu");
        ketjP.setAutoscrolls(false);
        ketjP.setBorder(null);
        ketjP.setCaretColor(new java.awt.Color(249, 248, 242));
        ketjP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketjP.setFocusable(false);
        ketjP.setMaximumSize(new java.awt.Dimension(232, 84));
        ketjP.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane5.setViewportView(ketjP);

        jPanel9.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 570, 190));

        ketkualP.setBackground(new java.awt.Color(249, 248, 242));
        ketkualP.setColumns(20);
        ketkualP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketkualP.setForeground(new java.awt.Color(49, 45, 34));
        ketkualP.setLineWrap(true);
        ketkualP.setRows(5);
        ketkualP.setText("1. Laki-laki/ Perempuan\n2. Minimal usia 18 tahun\n3. Memiliki pengalaman sebagai pramusaji, minimal 1 tahun/tanpa pengalaman\n4. Memiliki kemampuan untuk beradaptasi dan bekerja secara efektif\n5. Jujur, disiplin, bertanggung jawab, dan berpenampilan yang rapi dan sopan\n6. Mempunyai skill leadership, teamwork, dan komunikasi yang baik");
        ketkualP.setAutoscrolls(false);
        ketkualP.setBorder(null);
        ketkualP.setCaretColor(new java.awt.Color(249, 248, 242));
        ketkualP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketkualP.setFocusable(false);
        ketkualP.setMaximumSize(new java.awt.Dimension(232, 84));
        ketkualP.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane6.setViewportView(ketkualP);

        jPanel9.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 570, 150));

        hasilP.getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 640, 470));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        desP.setForeground(new java.awt.Color(49, 45, 34));
        desP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        desP.setText("Deskripsi Pekerjaan");
        jPanel10.add(desP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 200, 30));

        tenggat5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenggat5.setForeground(new java.awt.Color(0, 74, 173));
        tenggat5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat5.setText("12 Agustus 2024");
        jPanel10.add(tenggat5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 20));

        keterangan46.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keterangan46.setForeground(new java.awt.Color(49, 45, 34));
        keterangan46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan46.setText("Berakhir pada:");
        jPanel10.add(keterangan46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        lamarButtonP.setBackground(new java.awt.Color(112, 104, 94));
        lamarButtonP.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lamarButtonP.setForeground(new java.awt.Color(249, 248, 242));
        lamarButtonP.setText("Lamar");
        lamarButtonP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lamarButtonP.setBorderPainted(false);
        lamarButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lamarButtonP.setFocusable(false);
        lamarButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamarButtonPActionPerformed(evt);
            }
        });
        jPanel10.add(lamarButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 40));

        posisi2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posisi2.setForeground(new java.awt.Color(49, 45, 34));
        posisi2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        posisi2.setText("Pelayan");
        jPanel10.add(posisi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        ketdesP.setBackground(new java.awt.Color(249, 248, 242));
        ketdesP.setColumns(20);
        ketdesP.setForeground(new java.awt.Color(49, 45, 34));
        ketdesP.setLineWrap(true);
        ketdesP.setRows(5);
        ketdesP.setText("Sebagai pelayan/pramusaji, Anda akan \nbertanggung jawab untuk memberikan layanan \npelanggan dan memastikan setiap tamu untuk \nmemiliki pengalaman makan yang \nmenyenangkan");
        ketdesP.setAutoscrolls(false);
        ketdesP.setBorder(null);
        ketdesP.setCaretColor(new java.awt.Color(249, 248, 242));
        ketdesP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketdesP.setFocusable(false);
        ketdesP.setMaximumSize(new java.awt.Dimension(232, 84));
        ketdesP.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane4.setViewportView(ketdesP);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 130));

        hasilP.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 290, 370));

        backButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton1MouseClicked(evt);
            }
        });
        hasilP.getContentPane().add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 20, 160, 70));

        bingung2.setBackground(new java.awt.Color(249, 248, 242));
        bingung2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        bingung2.setForeground(new java.awt.Color(49, 45, 34));
        bingung2.setText("Masih Bingung?");
        bingung2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bingung2.setBorderPainted(false);
        bingung2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bingung2.setFocusable(false);
        bingung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingung2ActionPerformed(evt);
            }
        });
        hasilP.getContentPane().add(bingung2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 190, 40));

        lihatHasilP.setBackground(new java.awt.Color(112, 104, 94));
        lihatHasilP.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lihatHasilP.setForeground(new java.awt.Color(249, 248, 242));
        lihatHasilP.setText("Lihat Hasil Saya");
        lihatHasilP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lihatHasilP.setBorderPainted(false);
        lihatHasilP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lihatHasilP.setFocusable(false);
        lihatHasilP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatHasilPActionPerformed(evt);
            }
        });
        hasilP.getContentPane().add(lihatHasilP, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 190, 40));

        hasilK.setMinimumSize(new java.awt.Dimension(1100, 650));
        hasilK.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        judul3.setForeground(new java.awt.Color(112, 104, 94));
        judul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul3.setText("Lowongan di Gendhu Roso");
        hasilK.getContentPane().add(judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 530, -1));

        jSeparator5.setForeground(new java.awt.Color(215, 204, 185));
        hasilK.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 960, 20));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kualifikasiK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        kualifikasiK.setForeground(new java.awt.Color(49, 45, 34));
        kualifikasiK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kualifikasiK.setText("Kualifikasi Pekerjaan");
        jPanel11.add(kualifikasiK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, -1));

        tanggungJawabK.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tanggungJawabK.setForeground(new java.awt.Color(49, 45, 34));
        tanggungJawabK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tanggungJawabK.setText("Tanggung Jawab Utama");
        jPanel11.add(tanggungJawabK, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 370, -1));

        ketjK.setBackground(new java.awt.Color(249, 248, 242));
        ketjK.setColumns(20);
        ketjK.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketjK.setForeground(new java.awt.Color(49, 45, 34));
        ketjK.setLineWrap(true);
        ketjK.setRows(5);
        ketjK.setText("1. Mengambil pesanan secara akurat dan sampaikan ke staf dapur \n2. Menyajikan makanan minuman ke pelanggan secara tepat waktu dan efisien\n3. Menyapa dan melayani pelanggan dengan cara yang ramah dan profesional\n4. Mengelola dan menata meja agar tetap rapi dan bersih\n5. Memastikan kebutuhan tamu terpenuhi sepanjang waktu makan\n6. Menangani keluhan tamu dengan profesional dan segera mencari solusi\n7. Menjelaskan menu dan menjawab pertanyaan tentang hidangan dan minuman.\n8. Mengantar tamu ke meja yang tersedia dan memberikan menu");
        ketjK.setAutoscrolls(false);
        ketjK.setBorder(null);
        ketjK.setCaretColor(new java.awt.Color(249, 248, 242));
        ketjK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketjK.setFocusable(false);
        ketjK.setMaximumSize(new java.awt.Dimension(232, 84));
        ketjK.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane7.setViewportView(ketjK);

        jPanel11.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 570, 190));

        ketkualK.setBackground(new java.awt.Color(249, 248, 242));
        ketkualK.setColumns(20);
        ketkualK.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ketkualK.setForeground(new java.awt.Color(49, 45, 34));
        ketkualK.setLineWrap(true);
        ketkualK.setRows(5);
        ketkualK.setText("1. Laki-laki/ Perempuan\n2. Minimal usia 18 tahun\n3. Memiliki pengalaman sebagai pramusaji, minimal 1 tahun/tanpa pengalaman\n4. Memiliki kemampuan untuk beradaptasi dan bekerja secara efektif\n5. Jujur, disiplin, bertanggung jawab, dan berpenampilan yang rapi dan sopan\n6. Mempunyai skill leadership, teamwork, dan komunikasi yang baik");
        ketkualK.setAutoscrolls(false);
        ketkualK.setBorder(null);
        ketkualK.setCaretColor(new java.awt.Color(249, 248, 242));
        ketkualK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketkualK.setFocusable(false);
        ketkualK.setMaximumSize(new java.awt.Dimension(232, 84));
        ketkualK.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane8.setViewportView(ketkualK);

        jPanel11.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 570, 150));

        hasilK.getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 640, 470));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        desK.setForeground(new java.awt.Color(49, 45, 34));
        desK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        desK.setText("Deskripsi Pekerjaan");
        jPanel12.add(desK, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 30));

        tenggat6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tenggat6.setForeground(new java.awt.Color(0, 74, 173));
        tenggat6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tenggat6.setText("12 Agustus 2024");
        jPanel12.add(tenggat6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 20));

        keterangan68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keterangan68.setForeground(new java.awt.Color(49, 45, 34));
        keterangan68.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        keterangan68.setText("Berakhir pada:");
        jPanel12.add(keterangan68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        lamarButtonK.setBackground(new java.awt.Color(112, 104, 94));
        lamarButtonK.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lamarButtonK.setForeground(new java.awt.Color(249, 248, 242));
        lamarButtonK.setText("Lamar");
        lamarButtonK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lamarButtonK.setBorderPainted(false);
        lamarButtonK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lamarButtonK.setFocusable(false);
        lamarButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamarButtonKActionPerformed(evt);
            }
        });
        jPanel12.add(lamarButtonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 40));

        posisi3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        posisi3.setForeground(new java.awt.Color(49, 45, 34));
        posisi3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        posisi3.setText("Kasir");
        jPanel12.add(posisi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, -1));

        ketdesK.setBackground(new java.awt.Color(249, 248, 242));
        ketdesK.setColumns(20);
        ketdesK.setForeground(new java.awt.Color(49, 45, 34));
        ketdesK.setLineWrap(true);
        ketdesK.setRows(5);
        ketdesK.setText("Sebagai kasir, Anda akan bertanggung jawab \nuntuk menangani transaksi pembayaran \ndengan akurat dan efisien, serta memberikan \nlayanan kepada pelanggan dengan \nramah dan profesional");
        ketdesK.setAutoscrolls(false);
        ketdesK.setBorder(null);
        ketdesK.setCaretColor(new java.awt.Color(249, 248, 242));
        ketdesK.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ketdesK.setFocusable(false);
        ketdesK.setMaximumSize(new java.awt.Dimension(232, 84));
        ketdesK.setMinimumSize(new java.awt.Dimension(232, 84));
        jScrollPane9.setViewportView(ketdesK);

        jPanel12.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 260, 130));

        hasilK.getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 290, 370));

        backButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton2MouseClicked(evt);
            }
        });
        hasilK.getContentPane().add(backButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 20, 160, 70));

        bingung3.setBackground(new java.awt.Color(249, 248, 242));
        bingung3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        bingung3.setForeground(new java.awt.Color(49, 45, 34));
        bingung3.setText("Masih Bingung?");
        bingung3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bingung3.setBorderPainted(false);
        bingung3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bingung3.setFocusable(false);
        bingung3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bingung3ActionPerformed(evt);
            }
        });
        hasilK.getContentPane().add(bingung3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 540, 190, 40));

        lihatHasilK.setBackground(new java.awt.Color(112, 104, 94));
        lihatHasilK.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        lihatHasilK.setForeground(new java.awt.Color(249, 248, 242));
        lihatHasilK.setText("Lihat Hasil Saya");
        lihatHasilK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lihatHasilK.setBorderPainted(false);
        lihatHasilK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lihatHasilK.setFocusable(false);
        lihatHasilK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatHasilKActionPerformed(evt);
            }
        });
        hasilK.getContentPane().add(lihatHasilK, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 190, 40));

        faqUser.setMinimumSize(new java.awt.Dimension(1100, 650));
        faqUser.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(112, 104, 94));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(logoKecil, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 10, 140, 30));
        jPanel6.add(ig, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 140, 30));
        jPanel6.add(blog, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 140, 30));
        jPanel6.add(wa, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 140, 30));

        noWA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noWA.setForeground(new java.awt.Color(255, 255, 255));
        noWA.setText("wa.me/+628895411736");
        jPanel6.add(noWA, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 160, 30));

        contactUS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contactUS.setForeground(new java.awt.Color(255, 255, 255));
        contactUS.setText("Contact Us :");
        jPanel6.add(contactUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 80, 30));

        usnIG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usnIG.setForeground(new java.awt.Color(255, 255, 255));
        usnIG.setText("rm.gendhu_roso");
        jPanel6.add(usnIG, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 120, 30));

        blogURL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        blogURL.setForeground(new java.awt.Color(255, 255, 255));
        blogURL.setText("rm-gendhu-roso.blogspot.com");
        jPanel6.add(blogURL, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 200, 30));

        faqUser.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1270, 52));

        penjelasan43.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan43.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan43.setText("di aplikasi ini");
        faqUser.getContentPane().add(penjelasan43, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 240, 100, -1));

        instruksi4.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        instruksi4.setForeground(new java.awt.Color(49, 45, 34));
        instruksi4.setText("Pantau");
        faqUser.getContentPane().add(instruksi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 150, -1, -1));
        faqUser.getContentPane().add(empat, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 140, 160, 60));
        faqUser.getContentPane().add(satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 140, 160, 60));
        faqUser.getContentPane().add(dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 160, 60));
        faqUser.getContentPane().add(tiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 160, 60));

        judul4.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        judul4.setForeground(new java.awt.Color(49, 45, 34));
        judul4.setText("Cara Melamar");
        faqUser.getContentPane().add(judul4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        judul5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        judul5.setForeground(new java.awt.Color(49, 45, 34));
        judul5.setText("Pertanyaan Lain:");
        faqUser.getContentPane().add(judul5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        instruksi2.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        instruksi2.setForeground(new java.awt.Color(49, 45, 34));
        instruksi2.setText("Lengkapi Data");
        faqUser.getContentPane().add(instruksi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        instruksi3.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        instruksi3.setForeground(new java.awt.Color(49, 45, 34));
        instruksi3.setText("Lamar Pekerjaan");
        faqUser.getContentPane().add(instruksi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, -1, -1));

        keterangan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        keterangan.setForeground(new java.awt.Color(49, 45, 34));
        keterangan.setText("Ayo ikuti cara berikut ini supaya kamu bisa melamar pekerjaan yang sedang tersedia");
        faqUser.getContentPane().add(keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 530, -1));

        penjelasan12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan12.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan12.setText("menggunakan akun gmail");
        faqUser.getContentPane().add(penjelasan12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, -1));

        penjelasan13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan13.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan13.setText("yang biasa kamu gunakan");
        faqUser.getContentPane().add(penjelasan13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, -1));

        penjelasan21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan21.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan21.setText("Isi data-data yang dibutuhkan");
        faqUser.getContentPane().add(penjelasan21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, -1));

        penjelasan22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan22.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan22.setText("siapin dokumen-dokumen,");
        faqUser.getContentPane().add(penjelasan22, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 200, -1));

        penjelasan23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan23.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan23.setText("lalu simpan data kamu");
        faqUser.getContentPane().add(penjelasan23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 180, -1));

        penjelasan31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan31.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan31.setText("Cari lowongan yang sedang");
        faqUser.getContentPane().add(penjelasan31, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 210, -1));

        penjelasan32.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan32.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan32.setText("dibuka, pilih lowongan yang sesuai,");
        faqUser.getContentPane().add(penjelasan32, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 270, -1));

        penjelasan33.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan33.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan33.setText("lalu klik lamar");
        faqUser.getContentPane().add(penjelasan33, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 110, -1));

        penjelasan41.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan41.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan41.setText("Pantau terus perkembangan");
        faqUser.getContentPane().add(penjelasan41, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 200, 210, -1));

        penjelasan42.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan42.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan42.setText("dari status lamaran kamu");
        faqUser.getContentPane().add(penjelasan42, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 190, -1));

        instruksi1.setFont(new java.awt.Font("Segoe UI Black", 1, 25)); // NOI18N
        instruksi1.setForeground(new java.awt.Color(49, 45, 34));
        instruksi1.setText("Masuk");
        faqUser.getContentPane().add(instruksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        penjelasan11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        penjelasan11.setForeground(new java.awt.Color(49, 45, 34));
        penjelasan11.setText("Simpel banget masuk");
        faqUser.getContentPane().add(penjelasan11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, -1));

        tanya3.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        tanya3.setForeground(new java.awt.Color(49, 45, 34));
        tanya3.setText("Saya lulusan SMA/SMK, apakah bisa saya mendaftar?");
        faqUser.getContentPane().add(tanya3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 480, -1));

        tanya1.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        tanya1.setForeground(new java.awt.Color(49, 45, 34));
        tanya1.setText("Apakah boleh mendaftar tanpa menggunakan email pribadi?");
        faqUser.getContentPane().add(tanya1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 550, -1));

        jawab1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jawab1.setForeground(new java.awt.Color(49, 45, 34));
        jawab1.setText("Boleh, tetapi kamu tidak akan mendapatkan info apapun dari kami :(");
        faqUser.getContentPane().add(jawab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 560, 30));

        tanya2.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        tanya2.setForeground(new java.awt.Color(49, 45, 34));
        tanya2.setText("Apakah bisa jika melamar tanpa login atau mendaftar terlebih dahulu?");
        faqUser.getContentPane().add(tanya2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 630, -1));

        jawab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jawab2.setForeground(new java.awt.Color(49, 45, 34));
        jawab2.setText("Tidak bisa ya :) karena kami memerlukan data kamu untuk proses kualifikasi");
        faqUser.getContentPane().add(jawab2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 610, 30));
        faqUser.getContentPane().add(panah3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 480, 150, 30));
        faqUser.getContentPane().add(panah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 380, 150, 30));
        faqUser.getContentPane().add(panah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 430, 150, 30));
        faqUser.getContentPane().add(burung, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, 250));

        jawab3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jawab3.setForeground(new java.awt.Color(49, 45, 34));
        jawab3.setText("Bisa, untuk lebih jelasnya, silakan lihat pada kualifikasi pekerjaan yang kamu pilih ya");
        faqUser.getContentPane().add(jawab3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 670, 30));

        backButton3.setText("jLabel2");
        backButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton3MouseClicked(evt);
            }
        });
        faqUser.getContentPane().add(backButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 160, 60));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lokerLabel.setForeground(new java.awt.Color(255, 255, 255));
        lokerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lokerLabel.setText("Loker Kerja");
        nav.add(lokerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 20));

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

        datasayaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        datasayaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datasayaIconMouseClicked(evt);
            }
        });
        nav.add(datasayaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 210, 150, 70));

        lamsayaIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lamsayaIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lamsayaIconMouseClicked(evt);
            }
        });
        nav.add(lamsayaIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 330, 150, 60));

        datasayaLabel.setForeground(new java.awt.Color(49, 45, 34));
        datasayaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datasayaLabel.setText("Data Saya");
        nav.add(datasayaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 20));

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

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 90, 110));

        getContentPane().add(nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 620));

        judul.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        judul.setForeground(new java.awt.Color(112, 104, 94));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Lowongan di Gendhu Roso");
        getContentPane().add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 530, -1));

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
        rincianDISABLE.setText("Rincian");
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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 430, 180));

        jSeparator2.setForeground(new java.awt.Color(215, 204, 185));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 960, 20));

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

        rincianJM.setBackground(new java.awt.Color(112, 104, 94));
        rincianJM.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rincianJM.setForeground(new java.awt.Color(249, 248, 242));
        rincianJM.setText("Rincian");
        rincianJM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rincianJM.setBorderPainted(false);
        rincianJM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rincianJM.setFocusable(false);
        rincianJM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianJMActionPerformed(evt);
            }
        });
        jPanel3.add(rincianJM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 430, 180));

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

        rincianP.setBackground(new java.awt.Color(112, 104, 94));
        rincianP.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rincianP.setForeground(new java.awt.Color(249, 248, 242));
        rincianP.setText("Rincian");
        rincianP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rincianP.setBorderPainted(false);
        rincianP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rincianP.setFocusable(false);
        rincianP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianPActionPerformed(evt);
            }
        });
        jPanel4.add(rincianP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 430, 180));

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

        rincianK.setBackground(new java.awt.Color(112, 104, 94));
        rincianK.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rincianK.setForeground(new java.awt.Color(249, 248, 242));
        rincianK.setText("Rincian");
        rincianK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rincianK.setBorderPainted(false);
        rincianK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rincianK.setFocusable(false);
        rincianK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rincianKActionPerformed(evt);
            }
        });
        jPanel5.add(rincianK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 430, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new user_home().setVisible(true);
    }//GEN-LAST:event_homeIconMouseClicked

    private void datasayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasayaIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new user_data().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datasayaIconMouseClicked

    private void lamsayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lamsayaIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new user_lamaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lamsayaIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lokerIconMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMouseClicked

    private void supportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_supportMouseClicked
        // TODO add your handling code here:
        dispose();
        // Assuming supportButton is the button to trigger the action
        if (userHome == null) {
            userHome = new user_home(); // Initialize FormB if not already done
            //userHome.setVisible(true); // Show FormB
        }

        // Call FormB's method to show kotakSaran dialog
        userHome.showKotakSaran();
    }//GEN-LAST:event_supportMouseClicked

    private void logoutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_logoutButtonMouseClicked

    private void rincianDISABLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianDISABLEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rincianDISABLEActionPerformed

    private void rincianJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianJMActionPerformed
        // TODO add your handling code here:
        dispose();
        String username = Session.getInstance().getUsername();
        cekDataLowonganJM(username);
        hasilJM.setLocationRelativeTo(null);
        hasilJM.setSize(1100, 650);
        hasilJM.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        hasilJM.setVisible(true);
    }//GEN-LAST:event_rincianJMActionPerformed

    public void cekDataLowonganJM(String username) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            koneksi = konek.open();

            String query = "SELECT COUNT(*) FROM lowongan_jm WHERE username_user = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, username);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    lamarButtonJM.setEnabled(false);
                    lihatHasilJM.setEnabled(true);     
                    JOptionPane.showMessageDialog(null, "Berhasil melamar pekerjaan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    lamarButtonJM.setEnabled(true);
                    lihatHasilJM.setEnabled(false);
                }
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
    }
    
    private void rincianPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianPActionPerformed
        // TODO add your handling code here:
        dispose();
        String username = Session.getInstance().getUsername();
        cekDataLowonganP(username);
        hasilP.setLocationRelativeTo(null);
        hasilP.setSize(1100, 650);
        hasilP.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        hasilP.setVisible(true);
    }//GEN-LAST:event_rincianPActionPerformed

    public void cekDataLowonganP(String username) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            koneksi = konek.open();

            String query = "SELECT COUNT(*) FROM lowongan_p WHERE username_user = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, username);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    lamarButtonP.setEnabled(false);
                    lihatHasilP.setEnabled(true);
                } else {
                    lamarButtonP.setEnabled(true);
                    lihatHasilP.setEnabled(false);
                }
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
    }
    
    private void rincianKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rincianKActionPerformed
        // TODO add your handling code here:
        dispose();
        String username = Session.getInstance().getUsername();
        cekDataLowonganK(username);
        hasilK.setLocationRelativeTo(null);
        hasilK.setSize(1100, 650);
        hasilK.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        hasilK.setVisible(true);
    }//GEN-LAST:event_rincianKActionPerformed

    public void cekDataLowonganK(String username) {
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            koneksi = konek.open();

            String query = "SELECT COUNT(*) FROM lowongan_k WHERE username_user = ?";
            statement = koneksi.prepareStatement(query);
            statement.setString(1, username);

            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count > 0) {
                    lamarButtonK.setEnabled(false);
                    lihatHasilK.setEnabled(true);
                } else {
                    lamarButtonK.setEnabled(true);
                    lihatHasilK.setEnabled(false);
                }
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
    }
    
    private void bingung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingung1ActionPerformed
        // TODO add your handling code here:
        hasilJM.dispose();
        faqUser.setLocationRelativeTo(null);
        faqUser.setSize(1100, 650);
        faqUser.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        faqUser.setVisible(true);
    }//GEN-LAST:event_bingung1ActionPerformed

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        hasilJM.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void lamarButtonJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamarButtonJMActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        String username = Session.getInstance().getUsername();
        if (response == JOptionPane.YES_OPTION) {
            System.out.println(username);
            try {
                if (cekDataUser(username)) {
                    System.out.println(username);
                    createLamaranJM(username);
                    cekDataLowonganJM(username);
                    JOptionPane.showMessageDialog(null, "Berhasil melamar pekerjaan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("gagal ges");
                    JOptionPane.showMessageDialog(user_loker.this, "Lengkapi dulu data kamu dan pastikan tidak ada yang kosong.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
    }//GEN-LAST:event_lamarButtonJMActionPerformed

    public void createLamaranJM(String username_user){
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement ps = null;

        try {
            koneksi = konek.open();
            String query = "INSERT INTO lowongan_jm (username_user, "
                    + "tanggal_diajukan) VALUES (?, CURRENT_TIMESTAMP)";
            ps = koneksi.prepareStatement(query);
            ps.setString(1, username_user);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Lamaran berhasil dibuat untuk user: " + username_user);
            } else {
                System.out.println("Lamaran gagal dibuat untuk user: " + username_user);                
            }

        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();

            if (ex.getSQLState().equals("23505")) {
                System.out.println("Kesalahan: Data duplikat ditemukan untuk user: " + username_user);
            } else {
                System.out.println("Kesalahan SQLState: " + ex.getSQLState());
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    private void lihatHasilJMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatHasilJMActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new user_lamaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lihatHasilJMActionPerformed

    private void lamarButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamarButtonPActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        String username = Session.getInstance().getUsername();
        if (response == JOptionPane.YES_OPTION) {
            System.out.println(username);
            try {
                if (cekDataUser(username)) {
                    System.out.println(username);
                    createLamaranP(username);
                    cekDataLowonganP(username);
                    JOptionPane.showMessageDialog(null, "Berhasil melamar pekerjaan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("gagal ges");
                    JOptionPane.showMessageDialog(user_loker.this, "Lengkapi dulu data kamu dan pastikan tidak ada yang kosong.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
    }//GEN-LAST:event_lamarButtonPActionPerformed

    public void createLamaranP(String username_user){
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement ps = null;

        try {
            koneksi = konek.open();
            String query = "INSERT INTO lowongan_p (username_user, "
                    + "tanggal_diajukan) VALUES (?, CURRENT_TIMESTAMP)";
            ps = koneksi.prepareStatement(query);
            ps.setString(1, username_user);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Lamaran berhasil dibuat untuk user: " + username_user);
            } else {
                System.out.println("Lamaran gagal dibuat untuk user: " + username_user);
            }

        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();

            if (ex.getSQLState().equals("23505")) {
                System.out.println("Kesalahan: Data duplikat ditemukan untuk user: " + username_user);
            } else {
                System.out.println("Kesalahan SQLState: " + ex.getSQLState());
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    private void backButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton1MouseClicked
        // TODO add your handling code here:
        hasilP.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_backButton1MouseClicked

    private void bingung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingung2ActionPerformed
        // TODO add your handling code here:
        hasilJM.dispose();
        faqUser.setLocationRelativeTo(null);
        faqUser.setSize(1100, 650);
        faqUser.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        faqUser.setVisible(true);
    }//GEN-LAST:event_bingung2ActionPerformed

    private void lihatHasilPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatHasilPActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new user_lamaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lihatHasilPActionPerformed

    private void lamarButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamarButtonKActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin melanjutkan?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        String username = Session.getInstance().getUsername();
        if (response == JOptionPane.YES_OPTION) {
            System.out.println(username);
            try {
                if (cekDataUser(username)) {
                    System.out.println(username);
                    createLamaranK(username);
                    cekDataLowonganK(username);
                    JOptionPane.showMessageDialog(null, "Berhasil melamar pekerjaan.", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("gagal ges");
                    JOptionPane.showMessageDialog(user_loker.this, "Lengkapi dulu data kamu dan pastikan tidak ada yang kosong.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        }
    }//GEN-LAST:event_lamarButtonKActionPerformed

    public void createLamaranK(String username_user){
        Koneksi konek = new Koneksi();
        Connection koneksi = null;
        PreparedStatement ps = null;

        try {
            koneksi = konek.open();
            String query = "INSERT INTO lowongan_k (username_user, "
                    + "tanggal_diajukan) VALUES (?, CURRENT_TIMESTAMP)";
            ps = koneksi.prepareStatement(query);
            ps.setString(1, username_user);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Lamaran berhasil dibuat untuk user: " + username_user);
            } else {
                System.out.println("Lamaran gagal dibuat untuk user: " + username_user);
            }

        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();

            if (ex.getSQLState().equals("23505")) {
                System.out.println("Kesalahan: Data duplikat ditemukan untuk user: " + username_user);
            } else {
                System.out.println("Kesalahan SQLState: " + ex.getSQLState());
            }
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (koneksi != null && !koneksi.isClosed()) {
                    koneksi.close();
                }
            } catch (SQLException e) {
                System.out.println("Kesalahan saat menutup koneksi atau statement: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    
    private void backButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseClicked
        // TODO add your handling code here:
        hasilK.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_backButton2MouseClicked

    private void bingung3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bingung3ActionPerformed
        // TODO add your handling code here:
        hasilJM.dispose();
        faqUser.setLocationRelativeTo(null);
        faqUser.setSize(1100, 650);
        faqUser.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        faqUser.setVisible(true);
    }//GEN-LAST:event_bingung3ActionPerformed

    private void lihatHasilKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatHasilKActionPerformed
        // TODO add your handling code here:
        dispose();
        try {
            new user_lamaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(user_loker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lihatHasilKActionPerformed

    private void backButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton3MouseClicked
        // TODO add your handling code here:
        faqUser.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_backButton3MouseClicked

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
            java.util.logging.Logger.getLogger(user_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_loker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_loker().setVisible(true);
            }
        });
        
        user_loker uloker = new user_loker();
        uloker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        uloker.setResizable(false);   //No resize is possible
        uloker.setSize(1280, 720);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel backButton1;
    private javax.swing.JLabel backButton2;
    private javax.swing.JLabel backButton3;
    private javax.swing.JButton bingung1;
    private javax.swing.JButton bingung2;
    private javax.swing.JButton bingung3;
    private javax.swing.JLabel blog;
    private javax.swing.JLabel blogURL;
    private javax.swing.JLabel burung;
    private javax.swing.JLabel contactUS;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel datasayaIcon;
    private javax.swing.JLabel datasayaLabel;
    private javax.swing.JLabel desJM;
    private javax.swing.JLabel desK;
    private javax.swing.JLabel desP;
    private javax.swing.JLabel dua;
    private javax.swing.JLabel empat;
    private javax.swing.JDialog faqUser;
    private javax.swing.JDialog hasilJM;
    private javax.swing.JDialog hasilK;
    private javax.swing.JDialog hasilP;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel ig;
    private javax.swing.JLabel instruksi1;
    private javax.swing.JLabel instruksi2;
    private javax.swing.JLabel instruksi3;
    private javax.swing.JLabel instruksi4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel jawab1;
    private javax.swing.JLabel jawab2;
    private javax.swing.JLabel jawab3;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel judul4;
    private javax.swing.JLabel judul5;
    private javax.swing.JTextArea ketdesJM;
    private javax.swing.JTextArea ketdesK;
    private javax.swing.JTextArea ketdesP;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel keterangan12;
    private javax.swing.JLabel keterangan21;
    private javax.swing.JLabel keterangan3;
    private javax.swing.JLabel keterangan46;
    private javax.swing.JLabel keterangan6;
    private javax.swing.JLabel keterangan68;
    private javax.swing.JLabel keterangan9;
    private javax.swing.JTextArea ketjJM;
    private javax.swing.JTextArea ketjK;
    private javax.swing.JTextArea ketjP;
    private javax.swing.JTextArea ketkualJM;
    private javax.swing.JTextArea ketkualK;
    private javax.swing.JTextArea ketkualP;
    private javax.swing.JLabel kualifikasiJM;
    private javax.swing.JLabel kualifikasiK;
    private javax.swing.JLabel kualifikasiP;
    private javax.swing.JButton lamarButtonJM;
    private javax.swing.JButton lamarButtonK;
    private javax.swing.JButton lamarButtonP;
    private javax.swing.JLabel lamsayaIcon;
    private javax.swing.JLabel lamsayaLabel;
    private javax.swing.JButton lihatHasilJM;
    private javax.swing.JButton lihatHasilK;
    private javax.swing.JButton lihatHasilP;
    private javax.swing.JLabel logoKecil;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JLabel low1;
    private javax.swing.JLabel low2;
    private javax.swing.JLabel low3;
    private javax.swing.JLabel low4;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel noWA;
    private javax.swing.JLabel panah1;
    private javax.swing.JLabel panah2;
    private javax.swing.JLabel panah3;
    private javax.swing.JLabel penjelasan11;
    private javax.swing.JLabel penjelasan12;
    private javax.swing.JLabel penjelasan13;
    private javax.swing.JLabel penjelasan21;
    private javax.swing.JLabel penjelasan22;
    private javax.swing.JLabel penjelasan23;
    private javax.swing.JLabel penjelasan31;
    private javax.swing.JLabel penjelasan32;
    private javax.swing.JLabel penjelasan33;
    private javax.swing.JLabel penjelasan41;
    private javax.swing.JLabel penjelasan42;
    private javax.swing.JLabel penjelasan43;
    private javax.swing.JLabel posisi1;
    private javax.swing.JLabel posisi2;
    private javax.swing.JLabel posisi3;
    private javax.swing.JButton rincianDISABLE;
    private javax.swing.JButton rincianJM;
    private javax.swing.JButton rincianK;
    private javax.swing.JButton rincianP;
    private javax.swing.JLabel satu;
    private javax.swing.JLabel support;
    private javax.swing.JLabel tanggungJawabJM;
    private javax.swing.JLabel tanggungJawabK;
    private javax.swing.JLabel tanggungJawabP;
    private javax.swing.JLabel tanya1;
    private javax.swing.JLabel tanya2;
    private javax.swing.JLabel tanya3;
    private javax.swing.JLabel tenggat1;
    private javax.swing.JLabel tenggat2;
    private javax.swing.JLabel tenggat3;
    private javax.swing.JLabel tenggat4;
    private javax.swing.JLabel tenggat5;
    private javax.swing.JLabel tenggat6;
    private javax.swing.JLabel tenggatDISABLE;
    private javax.swing.JLabel tiga;
    private javax.swing.JLabel usnIG;
    private javax.swing.JLabel wa;
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
