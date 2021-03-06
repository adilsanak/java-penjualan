/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetakLaporan;
import database.Koneksidb;
import java.awt.Color;
import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import view.FormMenu1810005;
/**
 *
 * @author Mr Sanak
 */
public class FormCetakBarang1810005 extends javax.swing.JFrame {

    private Connection conn;
    private Statement stt;
    
    void isiComboIdBarang(){
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String sql = "select * from barang1810005 order by barangid1810005 asc";
            ResultSet rs = stt.executeQuery(sql);
            while(rs.next()){
                jComboBox1.addItem(rs.getString("barangid1810005") + " - " + rs.getString("barangnama1810005"));
                jComboBox2.addItem(rs.getString("barangid1810005") + " - " + rs.getString("barangnama1810005"));
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan"+ e);
        }
       
    }
    void isiComboIdMerk(){
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String sql = "select * from merk1810005 order by merkid1810005 asc";
            ResultSet rs = stt.executeQuery(sql);
            while(rs.next()){
                jComboBox3.addItem(rs.getString("merkid1810005") + " - " + rs.getString("merknama1810005"));
                jComboBox4.addItem(rs.getString("merkid1810005") + " - " + rs.getString("merknama1810005"));
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan"+ e);
        }
       
    }
    void isiComboIdJenis(){
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String sql = "select * from jenis1810005 order by jenisid1810005 asc";
            ResultSet rs = stt.executeQuery(sql);
            while(rs.next()){
                jComboBox5.addItem(rs.getString("jenisid1810005") + " - " + rs.getString("jenisnama1810005"));
                jComboBox6.addItem(rs.getString("jenisid1810005") + " - " + rs.getString("jenisnama1810005"));
            }
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan"+ e);
        }
       
    }
    /**
     * Creates new form FormCetakBarang1810005
     */
    public FormCetakBarang1810005() {
        initComponents();
        isiComboIdBarang();
        isiComboIdMerk();
        isiComboIdJenis();
        lblKode.setBackground(Color.white);
        lblMerk.setBackground(new Color (0,102,0));     
        lblJenis.setBackground(new Color (0,102,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblJenis = new javax.swing.JLabel();
        lblKode = new javax.swing.JLabel();
        lblMerk = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        IdBarang = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MerkBarang = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JenisBarang = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 66, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("KODE JENIS");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 200, 40));

        jButton2.setBackground(new java.awt.Color(0, 102, 0));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("KODE BARANG");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 200, 40));

        jButton3.setBackground(new java.awt.Color(0, 102, 0));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("KODE MERK");
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 200, 40));

        lblJenis.setBackground(new java.awt.Color(255, 255, 255));
        lblJenis.setOpaque(true);
        jPanel2.add(lblJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 200, 10));

        lblKode.setBackground(new java.awt.Color(255, 255, 255));
        lblKode.setOpaque(true);
        jPanel2.add(lblKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 200, 10));

        lblMerk.setBackground(new java.awt.Color(255, 255, 255));
        lblMerk.setOpaque(true);
        jPanel2.add(lblMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 200, 10));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("LAPORAN BARANG");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Berdasarkan :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Close_Window_40px.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 210));

        jPanel3.setBackground(new java.awt.Color(252, 252, 252));
        jPanel3.setLayout(new java.awt.CardLayout());

        IdBarang.setBackground(new java.awt.Color(252, 252, 252));
        IdBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jComboBox1.setOpaque(false);
        IdBarang.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 30));

        jComboBox2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        IdBarang.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 240, 30));

        jPanel4.setBackground(new java.awt.Color(0, 81, 0));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Print_50px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 252, 252));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Preview");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        IdBarang.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 110));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel3.setText("Kode Barang");
        IdBarang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel4.setText("Kode Barang");
        IdBarang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("S/D");
        IdBarang.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jPanel3.add(IdBarang, "card4");

        MerkBarang.setBackground(new java.awt.Color(252, 252, 252));
        MerkBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 81, 0));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Print_50px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Preview");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MerkBarang.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 110));

        jComboBox3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MerkBarang.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 30));

        jComboBox4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        MerkBarang.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 240, 30));

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("Kode Merk");
        MerkBarang.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("Kode Merk");
        MerkBarang.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("S/D");
        MerkBarang.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jPanel3.add(MerkBarang, "card2");

        JenisBarang.setBackground(new java.awt.Color(252, 252, 252));
        JenisBarang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 81, 0));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Print_50px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Preview");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JenisBarang.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 110, 110));

        jComboBox5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        JenisBarang.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 30));

        jComboBox6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        JenisBarang.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 240, 30));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("Kode Jenis");
        JenisBarang.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setText("Kode Jenis");
        JenisBarang.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("S/D");
        JenisBarang.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jPanel3.add(JenisBarang, "card3");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 209, 670, 230));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        lblKode.setBackground(Color.white);
        lblMerk.setBackground(new Color (0,102,0));     
        lblJenis.setBackground(new Color (0,102,0));
        
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        jPanel3.add(IdBarang);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        lblMerk.setBackground(Color.white);
        lblJenis.setBackground(new Color (0,102,0));     
        lblKode.setBackground(new Color (0,102,0));
        
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        jPanel3.add(MerkBarang);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lblJenis.setBackground(Color.white);
        lblMerk.setBackground(new Color (0,102,0));     
        lblKode.setBackground(new Color (0,102,0));
        
        jPanel3.removeAll();
        jPanel3.repaint();
        jPanel3.revalidate();
        jPanel3.add(JenisBarang);
        jPanel3.repaint();
        jPanel3.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarang1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awal", jComboBox1.getSelectedItem().toString().substring(0,7));
            parameter.put("akhir", jComboBox2.getSelectedItem().toString().substring(0,7));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);   
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangMerk1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awalmerk", jComboBox3.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirmerk", jComboBox4.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangJenis1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awaljenis", jComboBox5.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirjenis", jComboBox6.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangJenis1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awaljenis", jComboBox1.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirjenis", jComboBox2.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarang1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awal", jComboBox1.getSelectedItem().toString().substring(0,7));
            parameter.put("akhir", jComboBox2.getSelectedItem().toString().substring(0,7));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);   
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangMerk1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awalmerk", jComboBox3.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirmerk", jComboBox4.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangMerk1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awalmerk", jComboBox3.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirmerk", jComboBox4.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangJenis1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awaljenis", jComboBox5.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirjenis", jComboBox6.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        try {
            conn = Koneksidb.getKoneksi();
            stt = conn.createStatement();
            String nmFile = "./laporan/LapBarangJenis1810005.jasper";
            HashMap parameter = new HashMap();
            parameter.put("awaljenis", jComboBox5.getSelectedItem().toString().substring(0,5));
            parameter.put("akhirjenis", jComboBox6.getSelectedItem().toString().substring(0,5));
            JasperPrint jPrint = JasperFillManager.fillReport(nmFile, parameter, conn);
            JasperViewer jr = new JasperViewer(jPrint, false);
            jr.viewReport(jPrint, false);
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Laporan Tidak Dapat Dicetak"+ e);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        new FormMenu1810005().show();
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(FormCetakBarang1810005.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCetakBarang1810005.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCetakBarang1810005.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCetakBarang1810005.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCetakBarang1810005().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IdBarang;
    private javax.swing.JPanel JenisBarang;
    private javax.swing.JPanel MerkBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblJenis;
    private javax.swing.JLabel lblKode;
    private javax.swing.JLabel lblMerk;
    // End of variables declaration//GEN-END:variables
}
