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
public class loginpage extends javax.swing.JFrame {

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
        getContentPane().setBackground(Color.decode("0xF9F8F2"));
        
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/logoGR.png")));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/back.png")));
        infoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/infoBlack.png")));
        aksara1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/aksaraWhite.png")));
        aksara2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/aksaraBlack.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        backButton = new javax.swing.JLabel();
        penjelasan2 = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        penjelasan1 = new javax.swing.JLabel();
        aksara1 = new javax.swing.JLabel();
        pwLabel = new javax.swing.JLabel();
        masukLabel = new javax.swing.JLabel();
        usnLabel = new javax.swing.JLabel();
        pwInput = new javax.swing.JTextField();
        usnInput = new javax.swing.JTextField();
        masukButton = new javax.swing.JButton();
        daftar = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        tanya = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        aksara2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(49, 45, 34));
        jPanel2.setMaximumSize(new java.awt.Dimension(640, 720));
        jPanel2.setMinimumSize(new java.awt.Dimension(640, 720));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 720));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\logoGR.png")); // NOI18N
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        backButton.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\back.png")); // NOI18N
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 20, 150, 50));

        penjelasan2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        penjelasan2.setForeground(new java.awt.Color(249, 248, 242));
        penjelasan2.setText("yang khas dengan nuansa dan masakan Jawanya.");
        jPanel2.add(penjelasan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        judul.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        judul.setForeground(new java.awt.Color(249, 248, 242));
        judul.setText("Gendhu Roso");
        jPanel2.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        penjelasan1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        penjelasan1.setForeground(new java.awt.Color(249, 248, 242));
        penjelasan1.setText("RM Gendhu Roso, warung makan prasmanan di Wonosobo Jawa Tengah");
        jPanel2.add(penjelasan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        aksara1.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\aksaraWhite.png")); // NOI18N
        jPanel2.add(aksara1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 683));

        pwLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        pwLabel.setForeground(new java.awt.Color(49, 45, 34));
        pwLabel.setText("Kata Sandi");
        getContentPane().add(pwLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, 40));

        masukLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        masukLabel.setForeground(new java.awt.Color(49, 45, 34));
        masukLabel.setText("Masuk");
        getContentPane().add(masukLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, -1, -1));

        usnLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        usnLabel.setForeground(new java.awt.Color(49, 45, 34));
        usnLabel.setText("Username");
        getContentPane().add(usnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, 40));

        pwInput.setBackground(new java.awt.Color(215, 204, 185));
        pwInput.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        pwInput.setForeground(new java.awt.Color(255, 255, 255));
        pwInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pwInput.setBorder(null);
        getContentPane().add(pwInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 290, 40));

        usnInput.setBackground(new java.awt.Color(215, 204, 185));
        usnInput.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        usnInput.setForeground(new java.awt.Color(255, 255, 255));
        usnInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usnInput.setBorder(null);
        usnInput.setOpaque(true);
        getContentPane().add(usnInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 290, 40));

        masukButton.setBackground(new java.awt.Color(215, 204, 185));
        masukButton.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        masukButton.setForeground(new java.awt.Color(49, 45, 34));
        masukButton.setText("Masuk");
        masukButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        masukButton.setBorderPainted(false);
        masukButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masukButton.setFocusable(false);
        masukButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukButtonActionPerformed(evt);
            }
        });
        getContentPane().add(masukButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 170, 40));

        daftar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        daftar.setForeground(new java.awt.Color(49, 45, 34));
        daftar.setText("Daftar");
        daftar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarMouseClicked(evt);
            }
        });
        getContentPane().add(daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 360, 60, -1));

        info.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        info.setForeground(new java.awt.Color(49, 45, 34));
        info.setText("Masuk diperlukan untuk melamar pekerjaan dan melihat hasil lamaran kerja");
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, -1, -1));

        tanya.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tanya.setForeground(new java.awt.Color(49, 45, 34));
        tanya.setText("Belum punya akun?");
        getContentPane().add(tanya, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, -1, -1));

        infoLabel.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\infoBlack.png")); // NOI18N
        getContentPane().add(infoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 150, 40));

        aksara2.setIcon(new javax.swing.ImageIcon("D:\\Semua Java Project\\RPL\\RPL\\RPL\\target\\classes\\com\\mycompany\\rpl\\resources\\aksaraBlack.png")); // NOI18N
        getContentPane().add(aksara2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        dispose();
        new homepage().setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void masukButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masukButtonActionPerformed

    private void daftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarMouseClicked
        // TODO add your handling code here:
        dispose();
        new signuppage().setVisible(true);
    }//GEN-LAST:event_daftarMouseClicked

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
        
        //custom codes for jform
        loginpage login = new loginpage();
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setResizable(false);   //No resize is possible
        login.setSize(1280, 720);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aksara1;
    private javax.swing.JLabel aksara2;
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel daftar;
    private javax.swing.JLabel info;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel logo;
    private javax.swing.JButton masukButton;
    private javax.swing.JLabel masukLabel;
    private javax.swing.JLabel penjelasan1;
    private javax.swing.JLabel penjelasan2;
    private javax.swing.JTextField pwInput;
    private javax.swing.JLabel pwLabel;
    private javax.swing.JLabel tanya;
    private javax.swing.JTextField usnInput;
    private javax.swing.JLabel usnLabel;
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

class RoundJTextField extends JTextField {
    private Shape shape;
    public RoundJTextField(int size) {
        super(size);
        setOpaque(false); // As suggested by @AVD in comment.
    }
    @Override
    protected void paintComponent(Graphics g) {
         g.setColor(getBackground());
         g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g) {
         g.setColor(getForeground());
         g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
    }
    @Override
    public boolean contains(int x, int y) {
         if (shape == null || !shape.getBounds().equals(getBounds())) {
             shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
         }
         return shape.contains(x, y);
    }
}

}
