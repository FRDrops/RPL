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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.border.*;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class hrd_home extends javax.swing.JFrame {

    /**
     * Creates new form hrd_home
     */
    public hrd_home() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("0xFFFFFF"));
        
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/homeWhite.png")));
        pelamarIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pelamarBlack.png")));
        lokerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/lokersayaBlack.png")));
        pegawaiIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/pegawaiBlack.png")));
        saranIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/saranBlack.png")));
        hrdProfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilHRD.png")));
        /*userProfil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilEmpty.png")));
        userProfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("resources/profilEmpty.png")));*/
        
        String username = Session.getInstance().getUsername();
        readHrd(username);
        readToTable();
                
    }

    private void readHrd(String username) {
        try {
            Koneksi konek = new Koneksi();
            Connection koneksi = konek.open();
            String sql = "SELECT * FROM data_hrd WHERE username_hrd = ?";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();
            if (!resultSet.next()) {
                JOptionPane.showMessageDialog(this, "No data found for username: " + username);
                clearFields(); // Clear fields if no data found
                return;
            }
            
            String nama = resultSet.getString("nama") != null ? resultSet.getString("nama") : "";
            hrdLabel.setText(nama);
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }
    
    private void clearFields() {
        hrdLabel.setText("");
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
                             "INNER JOIN data_user du ON ljm.username_user = du.username_user " +
                             "ORDER BY ljm.tanggal_diajukan DESC";

            String queryK = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, 'Kasir' AS posisi_lamaran, lk.tanggal_diajukan " +
                            "FROM lowongan_k lk " +
                            "INNER JOIN data_user du ON lk.username_user = du.username_user " +
                            "ORDER BY lk.tanggal_diajukan DESC";

            String queryP = "SELECT du.nama, du.jenis_kelamin, du.tanggal_lahir, du.alamat, 'Pelayan' AS posisi_lamaran, lp.tanggal_diajukan " +
                            "FROM lowongan_p lp " +
                            "INNER JOIN data_user du ON lp.username_user = du.username_user " +
                            "ORDER BY lp.tanggal_diajukan DESC";

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
        final int MAX_ROWS = 3;  // Misalnya kita membatasi hingga 100 baris
        pelamarBaru.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"Nama", "Jenis Kelamin", "Tanggal Lahir", "Alamat", "Posisi Lamaran", "Tanggal Diajukan"}
        ));

        DefaultTableModel model = readPelamar();
        DefaultTableModel limitedModel = new DefaultTableModel(
            new String[]{"Nama", "Jenis Kelamin", "Tanggal Lahir", "Alamat", "Posisi Lamaran", "Tanggal Diajukan"},
            0
        );

        int rowCount = Math.min(model.getRowCount(), MAX_ROWS);
        for (int i = 0; i < rowCount; i++) {
            Object[] rowData = new Object[model.getColumnCount()];
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData[j] = model.getValueAt(i, j);
            }
            limitedModel.addRow(rowData);
        }

        pelamarBaru.setModel(limitedModel);
        centerAlignTableCells();
    }
    
    private void centerAlignTableCells() {
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);

    for (int i = 0; i < pelamarBaru.getColumnCount(); i++) {
        pelamarBaru.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
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
        jPanel3 = new RoundedPanel(50, new Color(215, 204, 185));
        hrdLabel = new javax.swing.JLabel();
        keterangan1 = new javax.swing.JLabel();
        judul3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pelamarBaru = new javax.swing.JTable();
        judul2 = new javax.swing.JLabel();

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
        getContentPane().add(hrdProfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 70, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hrdLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        hrdLabel.setForeground(new java.awt.Color(49, 45, 34));
        hrdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hrdLabel.setText("[HRD_Name]");
        jPanel3.add(hrdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        keterangan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        keterangan1.setForeground(new java.awt.Color(49, 45, 34));
        keterangan1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keterangan1.setText("Human Resources Development");
        jPanel3.add(keterangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 30));

        judul3.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        judul3.setForeground(new java.awt.Color(49, 45, 34));
        judul3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul3.setText("Selamat Datang");
        jPanel3.add(judul3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 890, 160));

        pelamarBaru.setBackground(new java.awt.Color(249, 248, 242));
        pelamarBaru.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pelamarBaru.setForeground(new java.awt.Color(112, 104, 94));
        pelamarBaru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Erwin", "Juru masak", "25-05-2024", "10:35:52"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama Pelamar", "Posisis yang Dilamar", "Tanggal Melamar", "Waktu Melamar"
            }
        ));
        pelamarBaru.setFocusable(false);
        pelamarBaru.setGridColor(new java.awt.Color(249, 248, 242));
        pelamarBaru.setRowHeight(50);
        jScrollPane1.setViewportView(pelamarBaru);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 980, 170));

        judul2.setFont(new java.awt.Font("Segoe UI Black", 1, 40)); // NOI18N
        judul2.setForeground(new java.awt.Color(112, 104, 94));
        judul2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul2.setText("Pelamar Baru");
        getContentPane().add(judul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pelamarIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pelamarIconMouseClicked
        // TODO add your handling code here:
        dispose();
        try {
            new hrd_pelamar().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(hrd_home.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        dispose();
        new hrd_saran().setVisible(true);
    }//GEN-LAST:event_saranIconMouseClicked

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
                try {
                    new hrd_home().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(hrd_home.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul2;
    private javax.swing.JLabel judul3;
    private javax.swing.JLabel keterangan1;
    private javax.swing.JLabel logoutButton;
    private javax.swing.JLabel lokerIcon;
    private javax.swing.JLabel lokerLabel;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel pegawaiIcon;
    private javax.swing.JLabel pegawaiLabel;
    private javax.swing.JTable pelamarBaru;
    private javax.swing.JLabel pelamarIcon;
    private javax.swing.JLabel pelamarLabel;
    private javax.swing.JLabel saranIcon;
    private javax.swing.JLabel saranLabel;
    private javax.swing.JLabel support;
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
