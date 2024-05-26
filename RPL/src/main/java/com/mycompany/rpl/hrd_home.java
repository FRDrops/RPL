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

/**
 *
 * @author ASUS
 */
public class hrd_home extends javax.swing.JFrame {

    /**
     * Creates new form hrd_home
     */
    public hrd_home() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeWhite.png")));
        pelamarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pelamarBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokersayaBlack.png")));
        pegawaiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pegawaiBlack.png")));
        saranIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/saranBlack.png")));
        hrdProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilHRD.png")));
        userProfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilEmpty.png")));
        userProfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilEmpty.png")));
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
        jPanel1 = new RoundedPanel(70, new Color(49, 45, 34));
        pelamarIcon = new javax.swing.JLabel();
        lokerIcon = new javax.swing.JLabel();
        pelamarLabel = new javax.swing.JLabel();
        pegawaiIcon = new javax.swing.JLabel();
        lokerLabel = new javax.swing.JLabel();
        saranIcon = new javax.swing.JLabel();
        saranLabel = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        support = new javax.swing.JLabel();
        logoutButton = new javax.swing.JLabel();
        hrdProfil = new javax.swing.JLabel();
        jPanel2 = new RoundedPanel(50, new Color(249, 248, 242));
        judul = new javax.swing.JLabel();
        userNama2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        userNama1 = new javax.swing.JLabel();
        userPos1 = new javax.swing.JLabel();
        userPos2 = new javax.swing.JLabel();
        tgl1 = new javax.swing.JLabel();
        tgl2 = new javax.swing.JLabel();
        waktu1 = new javax.swing.JLabel();
        waktu2 = new javax.swing.JLabel();
        userProfil2 = new javax.swing.JLabel();
        userProfil1 = new javax.swing.JLabel();
        jPanel3 = new RoundedPanel(50, new Color(215, 204, 185));
        judul2 = new javax.swing.JLabel();
        hrdLabel = new javax.swing.JLabel();
        keterangan1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nav.setBackground(new java.awt.Color(255, 255, 255));
        nav.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pegawaiLabel.setForeground(new java.awt.Color(49, 45, 34));
        pegawaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegawaiLabel.setText("Daftar Pegawai");
        nav.add(pegawaiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 90, 20));

        homeIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\homeWhite.png")); // NOI18N
        nav.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 60, 150, 50));

        homeLabel.setForeground(new java.awt.Color(255, 255, 255));
        homeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeLabel.setText("Home");
        nav.add(homeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 30));

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

        nav.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, 110));

        pelamarIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\pelamarBlack.png")); // NOI18N
        pelamarIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pelamarIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pelamarIconMouseClicked(evt);
            }
        });
        nav.add(pelamarIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 170, 160, 70));

        lokerIcon.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\lokersayaBlack.png")); // NOI18N
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

        lokerLabel.setForeground(new java.awt.Color(49, 45, 34));
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

        hrdProfil.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\profilHRD.png")); // NOI18N
        getContentPane().add(hrdProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        judul.setForeground(new java.awt.Color(112, 104, 94));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Pelamar Baru");
        jPanel2.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        userNama2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        userNama2.setForeground(new java.awt.Color(112, 104, 94));
        userNama2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNama2.setText("Dita Nofiana");
        jPanel2.add(userNama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 180, 30));

        jSeparator1.setForeground(new java.awt.Color(215, 204, 185));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 980, 20));

        userNama1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        userNama1.setForeground(new java.awt.Color(112, 104, 94));
        userNama1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userNama1.setText("Ruth Radekta");
        jPanel2.add(userNama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 180, 30));

        userPos1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        userPos1.setForeground(new java.awt.Color(112, 104, 94));
        userPos1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userPos1.setText("Juru Masak");
        jPanel2.add(userPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 180, 30));

        userPos2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        userPos2.setForeground(new java.awt.Color(112, 104, 94));
        userPos2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userPos2.setText("Juru Masak");
        jPanel2.add(userPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 180, 30));

        tgl1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tgl1.setForeground(new java.awt.Color(112, 104, 94));
        tgl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tgl1.setText("24-05-2024");
        jPanel2.add(tgl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 180, 30));

        tgl2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        tgl2.setForeground(new java.awt.Color(112, 104, 94));
        tgl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tgl2.setText("22-05-2024");
        jPanel2.add(tgl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 180, 30));

        waktu1.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        waktu1.setForeground(new java.awt.Color(112, 104, 94));
        waktu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waktu1.setText("10:23:34");
        jPanel2.add(waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 180, 30));

        waktu2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        waktu2.setForeground(new java.awt.Color(112, 104, 94));
        waktu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        waktu2.setText("19:01:30");
        jPanel2.add(waktu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 180, 30));

        userProfil2.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\profilEmpty.png")); // NOI18N
        jPanel2.add(userProfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, 160, 70));

        userProfil1.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\profilEmpty.png")); // NOI18N
        jPanel2.add(userProfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 70, 160, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 980, 230));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        judul2.setForeground(new java.awt.Color(49, 45, 34));
        judul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul2.setText("Selamat Datang");
        jPanel3.add(judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        hrdLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        hrdLabel.setForeground(new java.awt.Color(49, 45, 34));
        hrdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hrdLabel.setText("[HRD_Name]");
        jPanel3.add(hrdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        keterangan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan1.setForeground(new java.awt.Color(49, 45, 34));
        keterangan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keterangan1.setText("Human Resources Development");
        jPanel3.add(keterangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 890, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pelamarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelamarIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pelamarIconMouseClicked

    private void lokerIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lokerIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lokerIconMouseClicked

    private void pegawaiIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pegawaiIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pegawaiIconMouseClicked

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

    private void saranIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saranIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_saranIconMouseClicked

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
            java.util.logging.Logger.getLogger(hrd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hrd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hrd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hrd_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hrd_home().setVisible(true);
            }
        });
        
        hrd_home hhome = new hrd_home();
        hhome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hhome.setResizable(false);   //No resize is possible
        hhome.setSize(1280, 720);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel homeLabel;
    private javax.swing.JLabel hrdLabel;
    private javax.swing.JLabel hrdProfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel keterangan1;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel pegawaiIcon;
    private javax.swing.JLabel pegawaiLabel;
    private javax.swing.JLabel pelamarIcon;
    private javax.swing.JLabel pelamarLabel;
    private javax.swing.JLabel saranIcon;
    private javax.swing.JLabel saranLabel;
    private javax.swing.JLabel support;
    private javax.swing.JLabel tgl1;
    private javax.swing.JLabel tgl2;
    private javax.swing.JLabel userNama1;
    private javax.swing.JLabel userNama2;
    private javax.swing.JLabel userPos1;
    private javax.swing.JLabel userPos2;
    private javax.swing.JLabel userProfil1;
    private javax.swing.JLabel userProfil2;
    private javax.swing.JLabel waktu1;
    private javax.swing.JLabel waktu2;
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
