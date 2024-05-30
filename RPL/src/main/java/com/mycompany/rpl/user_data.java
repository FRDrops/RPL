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
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
    private JLabel imageLabel;
    private JButton selectButton;
    private JButton uploadButton;
    private File selectedFile;
    loginpage login = new loginpage();
    private user_home userHome;
    private JFrame frame;
    
    public user_data() throws IOException {
        initComponents();
        setLocationRelativeTo(null);
        uploadSection.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeBlack.png")));
        datasayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/datasayaWhite.png")));
        lamsayaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lamsayaBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokerkerjaBlack.png")));
        infoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/infoBlue.png")));
        userProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilUser.png")));

        String username = Session.getInstance().getUsername();
        readUser(username);
        displayImageFromDatabase(username);
        userHome = new user_home();
    }
    
    private void readUser(String username) throws IOException {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String sql = "SELECT * FROM data_user WHERE username_user = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "No data found for username: " + username);
                clearFields(); // Clear fields if no data found
                return;
            }

            // Retrieve data, set default if null
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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uploadSection = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(10, new Color(249, 248, 242));
        label = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        nav1 = new RoundedPanel(10, new Color(249, 248, 242));
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
        ketKK = new javax.swing.JLabel();
        ketCV = new javax.swing.JLabel();
        ketKTP = new javax.swing.JLabel();
        ketIJAZAH = new javax.swing.JLabel();
        ketSKCK = new javax.swing.JLabel();
        userProfil = new javax.swing.JLabel();
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
        jPanel3 = new RoundedPanel(50, new Color(215, 204, 185));
        judul2 = new javax.swing.JLabel();
        keterangan2 = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        profilButton = new javax.swing.JButton();
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
        uploadBerkas = new javax.swing.JButton();
        pendInput = new javax.swing.JComboBox<>();
        infoLabel = new javax.swing.JLabel();
        infoIcon = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();
        infoLabel3 = new javax.swing.JLabel();

        uploadSection.setMinimumSize(new java.awt.Dimension(475, 325));
        uploadSection.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(467, 272));
        jPanel10.setMinimumSize(new java.awt.Dimension(467, 272));
        jPanel10.setPreferredSize(new java.awt.Dimension(467, 272));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(215, 204, 185));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Pastikan semua berkas dalam bentuk file JPG/PNG");
        jPanel2.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 320, -1));

        judul.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        judul.setForeground(new java.awt.Color(49, 45, 34));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Upload Section");
        jPanel2.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 210, 50));

        jButton1.setBackground(new java.awt.Color(112, 104, 94));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        label2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(215, 204, 185));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Jangan lupa klik save");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 190, -1));

        jPanel10.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 130));

        nav1.setBackground(new java.awt.Color(255, 255, 255));
        nav1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        nav1.add(nav6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

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

        nav1.add(nav5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 60));

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

        nav1.add(nav4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 70, 60));

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

        nav1.add(nav3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 70, 60));

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

        nav1.add(nav2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 70, 60));

        ketKK.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketKK.setForeground(new java.awt.Color(49, 45, 34));
        ketKK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketKK.setText("Tidak Ada");
        nav1.add(ketKK, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 70, 20));

        ketCV.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketCV.setForeground(new java.awt.Color(49, 45, 34));
        ketCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketCV.setText("Tidak Ada");
        nav1.add(ketCV, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        ketKTP.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketKTP.setForeground(new java.awt.Color(49, 45, 34));
        ketKTP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketKTP.setText("Tidak Ada");
        nav1.add(ketKTP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 20));

        ketIJAZAH.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketIJAZAH.setForeground(new java.awt.Color(49, 45, 34));
        ketIJAZAH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketIJAZAH.setText("Tidak Ada");
        nav1.add(ketIJAZAH, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 70, 20));

        ketSKCK.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ketSKCK.setForeground(new java.awt.Color(49, 45, 34));
        ketSKCK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ketSKCK.setText("Tidak Ada");
        nav1.add(ketSKCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 70, 20));

        jPanel10.add(nav1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 440, 100));

        uploadSection.getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 310));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userProfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userProfilMouseClicked(evt);
            }
        });
        getContentPane().add(userProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 220, 210));

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lokerLabel.setForeground(new java.awt.Color(49, 45, 34));
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

        datasayaLabel.setForeground(new java.awt.Color(255, 255, 255));
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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 1030, 130));

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
        getContentPane().add(simpanButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 190, 40));

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
        getContentPane().add(profilButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 190, 40));

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

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 290, 40));

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

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 790, -1));

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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 270, -1, 40));

        jPanel8.setBackground(new java.awt.Color(249, 248, 242));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 45, 34));
        jLabel9.setText("Pendidikan:");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 110, 40));

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, 40));

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

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 390, 40));

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

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, 40));

        jenisInput.setBackground(new java.awt.Color(249, 248, 242));
        jenisInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jenisInput.setForeground(new java.awt.Color(49, 45, 34));
        jenisInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        jenisInput.setBorder(null);
        jenisInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jenisInput.setFocusable(false);
        getContentPane().add(jenisInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 140, 40));

        uploadBerkas.setBackground(new java.awt.Color(249, 248, 242));
        uploadBerkas.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        uploadBerkas.setForeground(new java.awt.Color(112, 104, 94));
        uploadBerkas.setText("Upload Berkas");
        uploadBerkas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uploadBerkas.setBorderPainted(false);
        uploadBerkas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uploadBerkas.setFocusable(false);
        uploadBerkas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBerkasActionPerformed(evt);
            }
        });
        getContentPane().add(uploadBerkas, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 190, 40));

        pendInput.setBackground(new java.awt.Color(249, 248, 242));
        pendInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pendInput.setForeground(new java.awt.Color(112, 104, 94));
        pendInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMP", "SMA", "Diploma", "Sarjana", "Magister" }));
        pendInput.setSelectedIndex(-1);
        pendInput.setBorder(null);
        pendInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pendInput.setFocusable(false);
        getContentPane().add(pendInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 170, 40));

        infoLabel.setBackground(new java.awt.Color(0, 0, 0));
        infoLabel.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(49, 45, 34));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoLabel.setText("*Upload berkas seperti CV, KTP, Ijazah, dan SKCK");
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 260, 20));
        getContentPane().add(infoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 140, 40));

        infoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        infoLabel1.setForeground(new java.awt.Color(169, 42, 13));
        infoLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoLabel1.setText("*Format yy//mm/dd. Contoh, 1 Februari 2024, jadi 2024-02-01");
        getContentPane().add(infoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 280, 20));

        infoLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        infoLabel3.setForeground(new java.awt.Color(0, 74, 173));
        infoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        infoLabel3.setText("Klik untuk mengganti data kamu. Dan selalu klik simpan setelah mengubah data kamu.");
        getContentPane().add(infoLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 540, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void datasayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datasayaIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_datasayaIconMouseClicked

    private void lamsayaIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lamsayaIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new user_lamaran().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(user_data.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void homeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeIconMouseClicked
        // TODO add your handling code here:
        dispose();
        new user_home().setVisible(true);
    }//GEN-LAST:event_homeIconMouseClicked

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        String username = Session.getInstance().getUsername();
        String tempat = tempatInput.getText();
        String alamat = alamatInput.getText();
        String nikText = nikInput.getText();
        int nik = Integer.parseInt(nikText);
        String nomorText = nomorInput.getText();
        int nomor = Integer.parseInt(nomorText);
        String jenis = (String) jenisInput.getSelectedItem();
        String pend = (String) pendInput.getSelectedItem();
        
        updateData(username, jenis, tempat, pend, alamat, nik, nomor);
    }//GEN-LAST:event_simpanButtonActionPerformed

    public void updateData(String username, String jenis, String tempat, String pend, String alamat, int nik, int nomor) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            
            String updateQuery = "UPDATE data_user SET jenis_kelamin = ?, tempat_lahir = ?, pendidikan = ?, telepon = ?, alamat = ?, nik = ? WHERE username_user = ?";
            PreparedStatement updateStatement = koneksi.prepareStatement(updateQuery);
            updateStatement.setString(1, jenis);
            updateStatement.setString(2, tempat);
            updateStatement.setString(3, pend);
            updateStatement.setInt(4, nomor);
            updateStatement.setString(5, alamat);
            updateStatement.setInt(6, nik);
            updateStatement.setString(7, username);

            int rowsAffected = updateStatement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(rootPane, "Perubahan berhasil disimpan.");
            } else {
            }

            updateStatement.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }
    
    private void profilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilButtonActionPerformed
        // TODO add your handling code here:
        this.inputImage();
    }//GEN-LAST:event_profilButtonActionPerformed

    public void inputImage() {
        JFrame frame = new JFrame("Image Uploader");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel imageLabel = new JLabel("No image selected", SwingConstants.CENTER);
        JButton selectButton = new JButton("Select Image");
        JButton uploadButton = new JButton("Upload Image");
        uploadButton.setEnabled(false);

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    selectedFile = fileChooser.getSelectedFile();
                    ImageIcon icon = new ImageIcon(new ImageIcon(selectedFile.getAbsolutePath()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    imageLabel.setIcon(icon);
                    userProfil.setIcon(icon);
                    imageLabel.setText(null);
                    uploadButton.setEnabled(true);
                }
            }
        });

        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (selectedFile != null) {
                    uploadImageToDatabase(selectedFile);
                } else {
                    JOptionPane.showMessageDialog(user_data.this, "Please select an image to upload.");
                }
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(selectButton);
        buttonPanel.add(uploadButton);

        frame.setLocationRelativeTo(null);
        frame.add(imageLabel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Menampilkan JFrame baru
        frame.setVisible(true);
    }
    
    private void uploadImageToDatabase(File file) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String sql = "UPDATE data_user SET foto = ? WHERE username_user = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);

            FileInputStream inputStream = new FileInputStream(file);
            statement.setBlob(1, inputStream);

            
            String username = Session.getInstance().getUsername();
            statement.setString(2, username);

            int row = statement.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(this, "File has been saved.");
                this.displayImageFromDatabase(username);
            }
            inputStream.close();
        } catch (SQLException | FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void displayImageFromDatabase(String username) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String sql = "SELECT foto FROM data_user WHERE username_user = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                byte[] imgBytes = resultSet.getBytes("foto");
                if (imgBytes != null) {
                    /*ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                    ImageIcon icon = new ImageIcon(new ImageIcon(bis.readAllBytes()).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
                    userProfil.setIcon(icon);*/
                    ByteArrayInputStream bis = new ByteArrayInputStream(imgBytes);
                    BufferedImage image = ImageIO.read(bis);
                    int diameter = 200; // Atur diameter sesuai keinginan
                    BufferedImage roundedImage = makeRoundedCorner(image, diameter);
                    ImageIcon icon = new ImageIcon(roundedImage);
                    userProfil.setIcon(icon);
                    userProfil.setText(null);
                } else {
                }
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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

    private void uploadBerkasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBerkasActionPerformed
        // TODO add your handling code here:
        dispose();
        uploadSection.setLocationRelativeTo(null);
        uploadSection.setSize(467, 272);
        uploadSection.getContentPane().setBackground(Color.decode("0xFFFFFF"));
        uploadSection.setVisible(true);
    }//GEN-LAST:event_uploadBerkasActionPerformed

    private void nomorInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomorInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomorInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        uploadSection.dispose();
        this.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userProfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userProfilMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userProfilMouseClicked

    public void selectFile(JLabel label) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("JPG & PNG Images", "jpg", "png"));

        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            try {
                // Simpan sementara di folder temp
                Path tempDir = Files.createTempDirectory("uploaded_images");
                Path tempFile = Paths.get(tempDir.toString(), selectedFile.getName());
                Files.copy(selectedFile.toPath(), tempFile);
                selectedFile = tempFile.toFile();

                // Konfirmasi sukses upload
                label.setText("Ada");
            } catch (IOException e) {
                e.printStackTrace();
                label.setText("Tidak ada");
            }
        } else {
            label.setText("Tidak ada dokumen dipilih");
        }
    }

    public File getSelectedFile() {
        return selectedFile;
    }
    
    public void uploadFileToDatabase(String username, String kolom) {
        if (selectedFile == null) {
            System.out.println("Tidak ada file yang dipilih.");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(selectedFile);
            byte[] fileBytes = fis.readAllBytes();
            fis.close();

            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();

            String sql = "UPDATE data_user SET " + kolom + " = ? WHERE username_user = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setBytes(1, fileBytes);
            statement.setString(2, username);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("File berhasil diunggah ke database.");
            } else {
                System.out.println("Gagal mengunggah file ke database.");
            }

            statement.close();
            koneksi.close();
        } catch (SQLException ex) {
            System.out.println("Kesalahan SQL terjadi: " + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException e) {
            System.out.println("Kesalahan saat membaca file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void cvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvMouseClicked
        // TODO add your handling code here:
        selectFile(ketCV);
    }//GEN-LAST:event_cvMouseClicked

    private void ktpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ktpMouseClicked
        // TODO add your handling code here:
        selectFile(ketKTP);
    }//GEN-LAST:event_ktpMouseClicked

    private void ijazahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ijazahMouseClicked
        // TODO add your handling code here:
        selectFile(ketIJAZAH);
    }//GEN-LAST:event_ijazahMouseClicked

    private void skckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skckMouseClicked
        // TODO add your handling code here:
        selectFile(ketSKCK);
    }//GEN-LAST:event_skckMouseClicked

    private void kkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kkMouseClicked
        // TODO add your handling code here:
        selectFile(ketKK);
    }//GEN-LAST:event_kkMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
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
                try {
                    new user_data().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(user_data.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JLabel cv;
    private javax.swing.JLabel datasayaIcon;
    private javax.swing.JLabel datasayaLabel;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel ijazah;
    private javax.swing.JLabel infoIcon;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel infoLabel3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox<String> jenisInput;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel ketCV;
    private javax.swing.JLabel ketIJAZAH;
    private javax.swing.JLabel ketKK;
    private javax.swing.JLabel ketKTP;
    private javax.swing.JLabel ketSKCK;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JLabel kk;
    private javax.swing.JLabel ktp;
    private javax.swing.JLabel label;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel lamsayaIcon;
    private javax.swing.JLabel lamsayaLabel;
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
    private javax.swing.JComboBox<String> pendInput;
    private javax.swing.JButton profilButton;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel skck;
    private javax.swing.JLabel support;
    private javax.swing.JTextField tanggalInput;
    private javax.swing.JTextField tempatInput;
    private javax.swing.JButton uploadBerkas;
    private javax.swing.JDialog uploadSection;
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
