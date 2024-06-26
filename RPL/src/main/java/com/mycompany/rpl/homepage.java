/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.rpl;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.awt.geom.*;
import javax.swing.border.*;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class homepage extends javax.swing.JFrame {

    /**
     * Creates new form homepage
     */
    public homepage() {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("0x312D22"));
        
        logoGr.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/logoGR.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hover = new RoundedPanel(50, new Color(249, 248, 242));
        homeButton = new javax.swing.JLabel();
        namaGr = new javax.swing.JLabel();
        masukButton = new javax.swing.JLabel();
        logoGr = new javax.swing.JLabel();
        keterangan = new javax.swing.JLabel();
        keterangan2 = new javax.swing.JLabel();
        namaGr2 = new javax.swing.JLabel();
        lowonganButton = new javax.swing.JLabel();
        faqButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hover.setBackground(new java.awt.Color(49, 45, 34));
        hover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        homeButton.setForeground(new java.awt.Color(49, 45, 34));
        homeButton.setText("Home");
        homeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        hover.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, -1, 60));

        getContentPane().add(hover, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 130, 50));

        namaGr.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        namaGr.setForeground(new java.awt.Color(249, 248, 242));
        namaGr.setText("Gendhu Roso");
        getContentPane().add(namaGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 50));

        masukButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        masukButton.setForeground(new java.awt.Color(249, 248, 242));
        masukButton.setText("Masuk");
        masukButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masukButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukButtonMouseClicked(evt);
            }
        });
        getContentPane().add(masukButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, 60));

        logoGr.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\logoGR.png")); // NOI18N
        getContentPane().add(logoGr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));

        keterangan.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        keterangan.setForeground(new java.awt.Color(249, 248, 242));
        keterangan.setText("RM Gendhu Roso merupakan warung makan prasmanan yang berlokasi di Kabupaten Wonosobo, Jawa Tengah. Dengan tema masakan Jawa,");
        getContentPane().add(keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, -1, 24));

        keterangan2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        keterangan2.setForeground(new java.awt.Color(249, 248, 242));
        keterangan2.setText("Di sini menyediakan berbagai macam masakan rumahan, seperti sayuran dan lauk pauk serta minuman khas Jawa.");
        getContentPane().add(keterangan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, 24));

        namaGr2.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        namaGr2.setForeground(new java.awt.Color(249, 248, 242));
        namaGr2.setText("Gendhu Roso");
        getContentPane().add(namaGr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        lowonganButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lowonganButton.setForeground(new java.awt.Color(249, 248, 242));
        lowonganButton.setText("Lowongan");
        lowonganButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lowonganButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowonganButtonMouseClicked(evt);
            }
        });
        getContentPane().add(lowonganButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 50));

        faqButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        faqButton.setForeground(new java.awt.Color(249, 248, 242));
        faqButton.setText("FAQ");
        faqButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        faqButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqButtonMouseClicked(evt);
            }
        });
        getContentPane().add(faqButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonMouseClicked

    private void lowonganButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowonganButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new lowonganpage().setVisible(true);
    }//GEN-LAST:event_lowonganButtonMouseClicked

    private void faqButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_faqButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new faqpage().setVisible(true);
    }//GEN-LAST:event_faqButtonMouseClicked

    private void masukButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new loginpage().setVisible(true);
    }//GEN-LAST:event_masukButtonMouseClicked

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
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homepage().setVisible(true);
                
            }
        });
        
        //custom codes for jform
        homepage home = new homepage();
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setResizable(false);   //No resize is possible
        home.setSize(1280, 720);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel faqButton;
    private javax.swing.JLabel homeButton;
    private javax.swing.JPanel hover;
    private javax.swing.JLabel keterangan;
    private javax.swing.JLabel keterangan2;
    private javax.swing.JLabel logoGr;
    private javax.swing.JLabel lowonganButton;
    private javax.swing.JLabel masukButton;
    private javax.swing.JLabel namaGr;
    private javax.swing.JLabel namaGr2;
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
