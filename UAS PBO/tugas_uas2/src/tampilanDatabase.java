
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
public class tampilanDatabase extends javax.swing.JFrame {

    Connection conn = null;
    private void hapus(){
        txtNamaSepatu.setText(null);
        txtHargaSepatu.setText(null);
        txtKeterangan.setText(null);
        CBJenisSepatu.setSelectedItem(this);
        CBUkuranSepatu.setSelectedItem(this);   
    }
    
    private void tampilkanData(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Keterangan");
        model.addColumn("Jenis");
        model.addColumn("Ukuran");
        model.addColumn("Warna");
        
        
        String cari = txtCari.getText();
        try{
            String sql = "SELECT * FROM tbsepatu WHERE NamaSepatu LIKE '%"+cari+"%' ";
            conn = Config.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                model.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7)});
            }
            TabelSepatu.setModel(model);
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    /**
     * Creates new form tampilanDatabase
     */
    public tampilanDatabase() {
        initComponents();
        tampilkanData();
        hapus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSepatu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CBJenisSepatu = new javax.swing.JComboBox<>();
        txtNamaSepatu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblidSepatu = new javax.swing.JLabel();
        RBWarna1 = new javax.swing.JRadioButton();
        RBWarna2 = new javax.swing.JRadioButton();
        RBWarna3 = new javax.swing.JRadioButton();
        RBWarna4 = new javax.swing.JRadioButton();
        txtHargaSepatu = new javax.swing.JTextField();
        txtKeterangan = new javax.swing.JTextField();
        CBUkuranSepatu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(78, 37, 63));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N

        btnLogout.setBackground(new java.awt.Color(255, 0, 51));
        btnLogout.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnLogout.setText("Keluar");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        TabelSepatu.setBackground(new java.awt.Color(255, 204, 204));
        TabelSepatu.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 13)); // NOI18N
        TabelSepatu.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelSepatu.setEnabled(false);
        TabelSepatu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelSepatuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelSepatu);

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 14)); // NOI18N
        jLabel9.setText("Cari Sepatu");

        txtCari.setBackground(new java.awt.Color(255, 204, 204));
        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCariKeyReleased(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(255, 204, 204));
        btnTambah.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 204, 204));
        btnEdit.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnEdit.setText("Edit Data");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 204, 204));
        btnHapus.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        btnHapus.setText("Hapus Data");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel1.setText("Harga");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setText("Keterangan");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setText("Jenis ");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel6.setText("Ukuran Sepatu");

        CBJenisSepatu.setBackground(new java.awt.Color(255, 204, 204));
        CBJenisSepatu.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        CBJenisSepatu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sepak Bola", "Basket", "Futsal", "Lari", "Bulu Tangkis", "Skate", "Lainnya" }));

        txtNamaSepatu.setBackground(new java.awt.Color(255, 204, 204));
        txtNamaSepatu.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel7.setText("Warna ");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        jLabel10.setText("ID  :");

        lblidSepatu.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        lblidSepatu.setText("-");

        RBWarna1.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(RBWarna1);
        RBWarna1.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        RBWarna1.setText("Putih");
        RBWarna1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBWarna1ActionPerformed(evt);
            }
        });

        RBWarna2.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(RBWarna2);
        RBWarna2.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        RBWarna2.setText("Hitam");

        RBWarna3.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(RBWarna3);
        RBWarna3.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        RBWarna3.setText("Biru");

        RBWarna4.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(RBWarna4);
        RBWarna4.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        RBWarna4.setText("Lainnya");
        RBWarna4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBWarna4ActionPerformed(evt);
            }
        });

        txtHargaSepatu.setBackground(new java.awt.Color(255, 204, 204));
        txtHargaSepatu.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        txtKeterangan.setBackground(new java.awt.Color(255, 204, 204));
        txtKeterangan.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N

        CBUkuranSepatu.setBackground(new java.awt.Color(255, 204, 204));
        CBUkuranSepatu.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 14)); // NOI18N
        CBUkuranSepatu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45" }));

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabel8.setText("Pendataan Sepatu Sport");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblidSepatu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RBWarna2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RBWarna1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(214, 214, 214))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNamaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHargaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBUkuranSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CBJenisSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RBWarna3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RBWarna4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblidSepatu))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBJenisSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHargaSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBUkuranSepatu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(10, 10, 10)
                .addComponent(RBWarna1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RBWarna2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBWarna3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBWarna4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(477, 477, 477))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed

        String rbWarna = "";
        if 
                (RBWarna1.isSelected()) {
            rbWarna = RBWarna1.getText();
        } else if (
                RBWarna2.isSelected()) {
            rbWarna = RBWarna2.getText();
        } else if 
                (RBWarna3.isSelected()) {
            rbWarna = RBWarna3.getText();
        } else if 
                (RBWarna4.isSelected()) {
            rbWarna = RBWarna4.getText();
        }
        try{
            conn = Config.getConnection();
            String sql = "INSERT INTO tbsepatu (NamaSepatu,HargaSepatu,Keterangan,JenisSepatu,UkuranSepatu,WarnaSepatu) VALUES ('"+txtNamaSepatu.getText()+"','"+txtHargaSepatu.getText()+"','"+txtKeterangan.getText()+"','"+CBJenisSepatu.getSelectedItem()+"','"+CBUkuranSepatu.getSelectedItem()+"','"+ rbWarna +"')";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
            tampilkanData();
            hapus();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        String rbWarna = "";
        if (RBWarna1.isSelected()) {
            rbWarna = RBWarna1.getText();
        } else if 
                (RBWarna2.isSelected()) {
            rbWarna = RBWarna2.getText();
        } else if 
                (RBWarna3.isSelected()) {
            rbWarna = RBWarna3.getText();
        } else if 
                (RBWarna4.isSelected()) {
            rbWarna = RBWarna4.getText();
        }
        try{
            String sql = "UPDATE tbsepatu SET NamaSepatu='"+txtNamaSepatu.getText()+
                    "',HargaSepatu='"+txtHargaSepatu.getText()+
                    "',Keterangan='"+txtKeterangan.getText()+
                    "',JenisSepatu='"+CBJenisSepatu.getSelectedItem()+
                    "',UkuranSepatu='"+CBUkuranSepatu.getSelectedItem()+
                    "',WarnaSepatu='"+rbWarna+
                    "' WHERE idsepatu='"+lblidSepatu.getText()+"' ";
            
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
            tampilkanData();
            hapus();
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void TabelSepatuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelSepatuMouseClicked
        int row = TabelSepatu.rowAtPoint(evt.getPoint());
        String idSepatu  = TabelSepatu.getValueAt(row, 0).toString();
        lblidSepatu.setText(idSepatu);
        
        String NamaSepatu  = TabelSepatu.
                getValueAt(row, 1).toString();
        txtNamaSepatu.setText(NamaSepatu);
        
        String HargaSepatu  = TabelSepatu.
                getValueAt(row, 2).toString();
        txtHargaSepatu.setText(HargaSepatu);
        
        String Keterangan  = TabelSepatu.
                getValueAt(row, 3).toString();
        txtKeterangan.setText(Keterangan);
        
        String JenisSepatu  = TabelSepatu.
                getValueAt(row, 4).toString();
        CBJenisSepatu.setSelectedItem(JenisSepatu);
        
        String UkuranSepatu = TabelSepatu.
                getValueAt(row, 5).toString();
        CBUkuranSepatu.setSelectedItem(UkuranSepatu);
        
        String WarnaSepatu = TabelSepatu.
                getValueAt(row, 6).toString();
        switch (WarnaSepatu) {
            case "Hitam":
                RBWarna1.setSelected(true);
                break;
            case "Putih":
                RBWarna2.setSelected(true);
                break;
            case "Coklat":
                RBWarna3.setSelected(true);
                break;
            case "Biru":
                RBWarna4.setSelected(true);
                break;
            default:
                break;
        }
            
    }//GEN-LAST:event_TabelSepatuMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            String sql = "DELETE FROM tbsepatu WHERE NamaSepatu='"+txtNamaSepatu.getText()+"'";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            tampilkanData(); hapus();
            
        }catch (HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtCariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyReleased
        tampilkanData();
    }//GEN-LAST:event_txtCariKeyReleased

    private void RBWarna1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBWarna1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBWarna1ActionPerformed

    private void RBWarna4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBWarna4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBWarna4ActionPerformed

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
            java.util.logging.Logger.getLogger(tampilanDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilanDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilanDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilanDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilanDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBJenisSepatu;
    private javax.swing.JComboBox<String> CBUkuranSepatu;
    private javax.swing.JRadioButton RBWarna1;
    private javax.swing.JRadioButton RBWarna2;
    private javax.swing.JRadioButton RBWarna3;
    private javax.swing.JRadioButton RBWarna4;
    private javax.swing.JTable TabelSepatu;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblidSepatu;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHargaSepatu;
    private javax.swing.JTextField txtKeterangan;
    private javax.swing.JTextField txtNamaSepatu;
    // End of variables declaration//GEN-END:variables
}
