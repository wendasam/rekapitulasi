/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */
    public mainForm() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        miTutup = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miDt_Pegawai = new javax.swing.JMenuItem();
        miJumlah = new javax.swing.JMenuItem();
        miLihatData = new javax.swing.JMenuItem();
        miRekapData = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));
        setLocationByPlatform(true);

        jDesktopPane1.setName("Desktop Pane"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM INFORMASI PEREKAPAN DATA ABSENSI PEGAWAI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BADAN PUSAT STATISTIK KABUPATEN KEEROM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROVINSI PAPUA");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/papua.png"))); // NOI18N

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1049, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Calculator_20px.png"))); // NOI18N
        jMenuItem1.setText("Kalkulator");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        miTutup.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        miTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Close_Window_20px.png"))); // NOI18N
        miTutup.setText("Tutup");
        miTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTutupActionPerformed(evt);
            }
        });
        jMenu1.add(miTutup);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Proses");

        miDt_Pegawai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        miDt_Pegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Admin_20px.png"))); // NOI18N
        miDt_Pegawai.setText("Data Pegawai");
        miDt_Pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDt_PegawaiActionPerformed(evt);
            }
        });
        jMenu2.add(miDt_Pegawai);

        miJumlah.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        miJumlah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Add_User_Male_20px.png"))); // NOI18N
        miJumlah.setText("Data Jumlah Absensi");
        miJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miJumlahActionPerformed(evt);
            }
        });
        jMenu2.add(miJumlah);

        miLihatData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        miLihatData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Show_Property_20px.png"))); // NOI18N
        miLihatData.setText("Lihat Data Absensi");
        miLihatData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miLihatDataActionPerformed(evt);
            }
        });
        jMenu2.add(miLihatData);

        miRekapData.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        miRekapData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_Report_Card_20px.png"))); // NOI18N
        miRekapData.setText("Rekapitulasi Data Absensi");
        miRekapData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRekapDataActionPerformed(evt);
            }
        });
        jMenu2.add(miRekapData);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTutupActionPerformed
        int ttp = JOptionPane.showConfirmDialog(null, "Apakah anda benar ingin menutup aplikasi ini?", "Tutup", JOptionPane.INFORMATION_MESSAGE);
        if (ttp == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_miTutupActionPerformed

    private void miDt_PegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDt_PegawaiActionPerformed
        inFrame_Pegawai pgw = new inFrame_Pegawai();
        jDesktopPane1.add(pgw);
        pgw.show();
    }//GEN-LAST:event_miDt_PegawaiActionPerformed

    private void miJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miJumlahActionPerformed
        inFrame_Jumlah jml = new inFrame_Jumlah();
        jDesktopPane1.add(jml);
        jml.show();
    }//GEN-LAST:event_miJumlahActionPerformed

    private void miLihatDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miLihatDataActionPerformed
        inFrame_Lihat Lihat = new inFrame_Lihat();
        jDesktopPane1.add(Lihat);
        Lihat.show();
    }//GEN-LAST:event_miLihatDataActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        inFrame_Kalkulator kalkulator = new inFrame_Kalkulator();
        jDesktopPane1.add(kalkulator);
        kalkulator.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void miRekapDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRekapDataActionPerformed
        inFrame_Rekap cetak = new inFrame_Rekap();
        jDesktopPane1.add(cetak);
        cetak.show();
    }//GEN-LAST:event_miRekapDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem miDt_Pegawai;
    private javax.swing.JMenuItem miJumlah;
    private javax.swing.JMenuItem miLihatData;
    private javax.swing.JMenuItem miRekapData;
    private javax.swing.JMenuItem miTutup;
    // End of variables declaration//GEN-END:variables
}
