package studentresultsystem;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentservice extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    char c1;

    public studentservice() throws ClassNotFoundException, SQLException {
        initComponents();
        con = ConnDb.conLink();
        search_tf.requestFocus();
        upregno_tf.requestFocus();
        delregno_tf.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchall = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        search_cmb = new javax.swing.JComboBox<>();
        search_bt = new javax.swing.JButton();
        search_tf = new org.jdesktop.swingx.JXSearchField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        upsname_tf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        upfname_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        update_bt = new javax.swing.JButton();
        upregno_tf = new org.jdesktop.swingx.JXSearchField();
        jScrollPane1 = new javax.swing.JScrollPane();
        upcadd = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        upcontact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        upemail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        load = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        delregno_tf = new org.jdesktop.swingx.JXSearchField();
        delete_bt = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);

        searchall.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        search_cmb.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        search_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student Reg No.", "Student Name" }));
        search_cmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                search_cmbItemStateChanged(evt);
            }
        });

        search_bt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        search_bt.setText("Search");
        search_bt.setEnabled(false);
        search_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btActionPerformed(evt);
            }
        });

        search_tf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                search_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                search_tfFocusLost(evt);
            }
        });
        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_tfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(425, 425, 425)
                        .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(187, 187, 187)
                .addComponent(search_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        searchall.addTab("Search", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Student Registration No.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Student Name");

        upsname_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upsname_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upsname_tfKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Father Name");

        upfname_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Corresponding Address");

        update_bt.setBackground(new java.awt.Color(204, 0, 0));
        update_bt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        update_bt.setForeground(new java.awt.Color(255, 255, 255));
        update_bt.setText("UPDATE");
        update_bt.setEnabled(false);
        update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btActionPerformed(evt);
            }
        });

        upregno_tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        upregno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                upregno_tfFocusLost(evt);
            }
        });
        upregno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upregno_tfKeyTyped(evt);
            }
        });

        upcadd.setColumns(20);
        upcadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upcadd.setRows(5);
        jScrollPane1.setViewportView(upcadd);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Contact");

        upcontact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Email");

        upemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upfname_tf)
                    .addComponent(upsname_tf)
                    .addComponent(upregno_tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                    .addComponent(upcontact)
                    .addComponent(upemail))
                .addGap(207, 207, 207))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upregno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upsname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upfname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upemail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        searchall.addTab("Update", jPanel2);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reg No.", "Name", "Father Name", "Session", "Blood Group", "Contact", "Gender", "Email", "DOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setGridColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setMinWidth(130);
            tab.getColumnModel().getColumn(0).setMaxWidth(130);
            tab.getColumnModel().getColumn(1).setMinWidth(150);
            tab.getColumnModel().getColumn(1).setMaxWidth(150);
            tab.getColumnModel().getColumn(2).setMinWidth(150);
            tab.getColumnModel().getColumn(2).setMaxWidth(150);
            tab.getColumnModel().getColumn(3).setMinWidth(70);
            tab.getColumnModel().getColumn(3).setMaxWidth(70);
            tab.getColumnModel().getColumn(4).setMinWidth(60);
            tab.getColumnModel().getColumn(4).setMaxWidth(60);
            tab.getColumnModel().getColumn(5).setMinWidth(75);
            tab.getColumnModel().getColumn(5).setMaxWidth(75);
            tab.getColumnModel().getColumn(6).setMinWidth(55);
            tab.getColumnModel().getColumn(6).setMaxWidth(55);
            tab.getColumnModel().getColumn(8).setMinWidth(70);
            tab.getColumnModel().getColumn(8).setMaxWidth(70);
        }

        load.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        load.setText("Load");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(load)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(load, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        searchall.addTab("Search All", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 0, 102));

        delregno_tf.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delregno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                delregno_tfKeyTyped(evt);
            }
        });

        delete_bt.setBackground(new java.awt.Color(255, 255, 0));
        delete_bt.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        delete_bt.setForeground(new java.awt.Color(255, 255, 255));
        delete_bt.setText("Delete");
        delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Registration No.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46)
                        .addComponent(delregno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(delregno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(159, 159, 159)
                .addComponent(delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(354, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        searchall.addTab("Delete", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchall)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchall)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btActionPerformed
        String url = "select * from student where ";
        if (search_cmb.getSelectedItem().toString().equalsIgnoreCase("Student Reg No.")) {
            url = url + "upper(regno)=?";
        } else {
            url = url + "upper(name)=?";
        }
        try {
            stmt = con.prepareStatement(url, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            stmt.setString(1, search_tf.getText().toUpperCase());
            rs = stmt.executeQuery();
            if (rs.next()) {
                new StdShow(rs).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Records not available!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_search_btActionPerformed

    private void delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btActionPerformed
        try {
            stmt = con.prepareStatement("delete from student where upper(regno)=?");
            stmt.setString(1, delregno_tf.getText().toUpperCase());
            int r = stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Total row deleted:" + r);
        } catch (SQLException ex) {
            Logger.getLogger(StdShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_btActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        try {
            stmt = con.prepareStatement("select * from student");
            rs = stmt.executeQuery();
            DefaultTableModel model;
            model = (DefaultTableModel) tab.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadActionPerformed

    private void update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btActionPerformed
        try {
            stmt = con.prepareStatement("update student set name=?,father_name=?,cadd=?,contact=?,email=? where upper(regno)=?");
            stmt.setString(1, upsname_tf.getText());
            stmt.setString(2, upfname_tf.getText());
            stmt.setString(3, upcadd.getText());
            stmt.setString(4, upcontact.getText());
            stmt.setString(5, upemail.getText());
            stmt.setString(6, upregno_tf.getText().toUpperCase());
            int r = stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Total row updated:" + r);
        } catch (SQLException ex) {
            Logger.getLogger(StdShow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_btActionPerformed

    private void upregno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_upregno_tfFocusLost
        try {
            stmt = con.prepareStatement("select name,father_name,cadd,contact,email from student where upper(regno)=?");
            stmt.setString(1, upregno_tf.getText().toUpperCase());
            rs = stmt.executeQuery();
            if (rs.next()) {
                upsname_tf.setText(rs.getString(1));
                upfname_tf.setText(rs.getString(2));
                upcadd.setText(rs.getString(3));
                upcontact.setText(rs.getString(4));
                upemail.setText(rs.getString(5));
            } else {
                JOptionPane.showMessageDialog(this, "Record not found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentservice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_upregno_tfFocusLost

    private void search_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_tfFocusGained
        search_tf.setBorder(null);
        search_tf.setToolTipText(null);
    }//GEN-LAST:event_search_tfFocusGained

    private void search_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_search_tfFocusLost
        if (search_tf.getText().length() == 0) {
            search_tf.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.blue));
            search_tf.setToolTipText("Registraion no,/name is required for this field");
            search_bt.setEnabled(false);
        }
    }//GEN-LAST:event_search_tfFocusLost

    private void search_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyTyped
        char ch = evt.getKeyChar();
        if (search_cmb.getSelectedIndex() == 0) {
            if (!((ch >= 48 && ch <= 57) || ch == 8 || ch == 82 || ch == 114)) {
                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            } else {
                search_bt.setEnabled(true);
            }
        } else if (!((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122) || ch == 32 || ch == 8)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            search_bt.setEnabled(true);
        }
    }//GEN-LAST:event_search_tfKeyTyped

    private void search_cmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_search_cmbItemStateChanged
        search_tf.setText("");
        search_bt.setEnabled(false);
    }//GEN-LAST:event_search_cmbItemStateChanged

    private void delregno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_delregno_tfKeyTyped
        char ch = evt.getKeyChar();
        if (ch == ' ' && delregno_tf.getText().length() == 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else if (!((ch >= 48 && ch <= 57) || ch == 8 || ch == 82 || ch == 114)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else if (ch == ' ' && c1 == ' ') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        c1 = ch;
    }//GEN-LAST:event_delregno_tfKeyTyped

    private void upsname_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upsname_tfKeyTyped
        update_bt.setEnabled(true);
    }//GEN-LAST:event_upsname_tfKeyTyped

    private void upregno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upregno_tfKeyTyped
        char ch = evt.getKeyChar();
        if (ch == ' ' && delregno_tf.getText().length() == 0) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else if (!((ch >= 48 && ch <= 57) || ch == 8 || ch == 82 || ch == 114)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else if (ch == ' ' && c1 == ' ') {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        c1 = ch;
    }//GEN-LAST:event_upregno_tfKeyTyped

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete_bt;
    private org.jdesktop.swingx.JXSearchField delregno_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton load;
    private javax.swing.JButton search_bt;
    private javax.swing.JComboBox<String> search_cmb;
    private org.jdesktop.swingx.JXSearchField search_tf;
    private javax.swing.JTabbedPane searchall;
    private javax.swing.JTable tab;
    private javax.swing.JTextArea upcadd;
    private javax.swing.JTextField upcontact;
    private javax.swing.JButton update_bt;
    private javax.swing.JTextField upemail;
    private javax.swing.JTextField upfname_tf;
    private org.jdesktop.swingx.JXSearchField upregno_tf;
    private javax.swing.JTextField upsname_tf;
    // End of variables declaration//GEN-END:variables
}
