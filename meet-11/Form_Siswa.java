package crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Form_Siswa extends javax.swing.JFrame {
    private DefaultTableModel tabmode;
    private ResultSet hasil;
    
    CRUD aa = new CRUD();
    
    public Form_Siswa() throws SQLException {
        initComponents();
        tampil_database();
    }
    
    public void tampil_database(){
        Object [] baris = {"ID","Nama","Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while(hasil.next()){
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
        } catch (Exception e){
            
        }
    }
    
    public void reset_text(){
        txt_id.setText("");
        txt_nama.setText("");
        txt_alamat.setText("");
    }
    
    public void reset_cari(){
        txt_cari.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_siswa = new javax.swing.JTable();
        txt_nama = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_ubah = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        btn_semua = new javax.swing.JButton();
        txt_data = new javax.swing.JTextField();
        btn_data = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        tabel_siswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_siswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_siswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_siswa);

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_ubah.setText("Ubah");
        btn_ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubahActionPerformed(evt);
            }
        });

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel1.setText("DATA SISWA");

        jLabel2.setText("ID");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        jLabel5.setText("Pencarian");

        btn_cari.setText("Cari Data");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_semua.setText("Semua Data");
        btn_semua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_semuaActionPerformed(evt);
            }
        });

        btn_data.setText("Jumlah Data Siswa");
        btn_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(54, 54, 54)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(21, 21, 21)
                                .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(btn_semua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_data))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_data))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_simpan)
                                .addComponent(btn_reset)
                                .addComponent(btn_ubah))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_hapus)
                                .addComponent(btn_keluar))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cari)
                    .addComponent(btn_semua))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else {
            try {
                aa.setID(txt_id.getText());
                aa.setNama(txt_nama.getText());
                aa.setAlamat(txt_alamat.getText());
                aa.simpanData(aa.getID(), aa.getNama(), aa.getAlamat());
                
                JOptionPane.showMessageDialog(null, "Data berhasil tersimpan" , "Informasi", JOptionPane.INFORMATION_MESSAGE);
                tampil_database();
                reset_text();
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Data gagal tersimpan" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        reset_text();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubahActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else if (txt_nama.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Nama belum diisi !");
            txt_nama.requestFocus();
        } else if (txt_alamat.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, Alamat belum diisi !");
            txt_alamat.requestFocus();
        } else {
            try{
                 aa.setID(txt_id.getText());
                 aa.setNama(txt_nama.getText());
                 aa.setAlamat(txt_alamat.getText());
                 aa.ubahData(aa.getID(), aa.getNama(), aa.getAlamat());
                 
                 JOptionPane.showMessageDialog(null, "Data berhasil diubah" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
                 tampil_database();
                 reset_text();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data gagal diubah" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_ubahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        if (txt_id.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null,"Maaf, ID belum diisi !");
            txt_id.requestFocus();
        } else {
            if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan menghapus dataini ?","Warning",2) == JOptionPane.YES_OPTION){
                String id = "";
                try {
                     aa.setID(txt_id.getText());
                     aa.hapusData(aa.getID());
                     JOptionPane.showMessageDialog(null, "Data berhasil dihapus" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
                     tampil_database();
                     reset_text();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda yakin akan keluar ?","Warning",2)== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void tabel_siswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_siswaMouseClicked
        try{
             int row = tabel_siswa.rowAtPoint(evt.getPoint());
             
             String id = tabel_siswa.getValueAt(row, 0).toString();
             String nama = tabel_siswa.getValueAt(row, 1).toString();
             String alamat = tabel_siswa.getValueAt(row, 2).toString();
             
             txt_id.setText(String.valueOf(id));
             txt_nama.setText(String.valueOf(nama));
             txt_alamat.setText(String.valueOf(alamat));
        }catch(Exception e){
        }
    }//GEN-LAST:event_tabel_siswaMouseClicked

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
//        Connection connect = null;
//        Statement s = null;
//        String url = "jdbc:mysql://localhost:3306/crud19650079";
//        String user = "root";
//        String password = "";
//        try{
//            ResultSet rs;
//            Class.forName("com.mysql.jdbc.Driver");
//            connect = DriverManager.getConnection(url,user,password);
//            s = connect.createStatement();
//            String sql = "SELECT*FROM siswa WHERE id LIKE '%"+txt_cari.getText()+"%' OR nama LIKE '%"+txt_cari.getText()+"%'";
////            String sql = "SELECT*FROM siswa WHERE id='"+txt_cari.getText()+"'";
//            rs = s.executeQuery(sql);
//            if(rs.next()){
//                String id = rs.getString("id");
//                String nama = rs.getString("nama");
//                String alamat = rs.getString("alamat");
//                
//                txt_id.setText(id);
//                txt_nama.setText(nama);
//                txt_alamat.setText(alamat);
//            }
//            JOptionPane.showMessageDialog(null,"Data berhasil ditemukan!");
//            
//        }catch(Exception e){
//            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
//        }
//        try{
//            if(connect != null){
//                s.close();
//                connect.close();
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//        tampil_database();
        
        // TODO add your handling code here:
//        if (txt_cari.getText().trim().equals("")){
//            JOptionPane.showMessageDialog(null,"Maaf, kolom pencarian belum diisi!");
//            txt_cari.requestFocus();
//        }else{
//            aa.setID(txt_cari.getText());
////            aa.setNama(txt_cari.getText());
////            aa.setAlamat(txt_alamat.getText());
//            aa.cariData(aa.getID());
//            
////            JOptionPane.showMessageDialog(null, "Data berhasil diubah" , "Informasi",JOptionPane.INFORMATION_MESSAGE);
//            tampil_database();
//        }
        
        
        //sukses
        Object [] baris = {"ID","Nama","Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode);
        try {
            hasil = aa.cariData(txt_cari.getText());
//            hasil = aa.cariDatax(txt_cari.getText());

            while(hasil.next()){
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
            JOptionPane.showMessageDialog(null,"Data berhasil ditemukan!");
        } catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_semuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_semuaActionPerformed
        // TODO add your handling code here:
        Object [] baris = {"ID","Nama","Alamat"};
        tabmode = new DefaultTableModel(null, baris);
        tabel_siswa.setModel(tabmode);
        try {
            hasil = aa.tampilData();
            while(hasil.next()){
                aa.setID(hasil.getString("id"));
                aa.setNama(hasil.getString("nama"));
                aa.setAlamat(hasil.getString("alamat"));
                String[] data = {aa.getID(), aa.getNama(), aa.getAlamat()};
                tabmode.addRow(data);
            }
            reset_cari();
        } catch (Exception e){
            
        }
    }//GEN-LAST:event_btn_semuaActionPerformed

    private void btn_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dataActionPerformed
        // TODO add your handling code here:
        try {
            hasil = aa.hitungData();
            if(hasil.next()){
                String count = hasil.getString("count(*)");
                txt_data.setText(count);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_dataActionPerformed

//    public static void main(String args[]) {
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Form_Siswa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_data;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_semua;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_ubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_siswa;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_data;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}
