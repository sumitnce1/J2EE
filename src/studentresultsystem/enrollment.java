package studentresultsystem;

import java.awt.Color;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class enrollment extends javax.swing.JFrame {

    Connection con;
    PreparedStatement stmt;
    int ano; boolean flag;char c1;String uid;ResultSet rs;
    public enrollment(String reg) throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        regno_tf.setText(reg);
        stream_cmb.setEditable(false);
        stmt=con.prepareStatement("select distinct pname from program");
        rs=stmt.executeQuery();
        while(rs.next())
            progname_cmb.addItem(rs.getString(1));
        //astric.setVisible(false);
        astric1.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regno_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rollno_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        astric = new javax.swing.JLabel();
        astric1 = new javax.swing.JLabel();
        progname_cmb = new javax.swing.JComboBox<>();
        stream_cmb = new javax.swing.JComboBox<>();
        sem_cmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ENROLLMENT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration No.");

        regno_tf.setEditable(false);
        regno_tf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        regno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regno_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                regno_tfFocusLost(evt);
            }
        });
        regno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regno_tfKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll No.");

        rollno_tf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        rollno_tf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rollno_tfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rollno_tfFocusLost(evt);
            }
        });
        rollno_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rollno_tfKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Program Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stream");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Semester");

        submit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        astric.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric.setForeground(new java.awt.Color(255, 0, 0));
        astric.setText("*");
        astric.setToolTipText("<html>\n<b><big><font color=\"red\">Registration Number must not be empty. </font><big/></b>\n</html>\n");

        astric1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric1.setForeground(new java.awt.Color(255, 0, 0));
        astric1.setText("*");
        astric1.setToolTipText("<html>\n<b><big><font color=\"red\">Roll Number must not be empty. </font><big/></b>\n</html>\n");

        progname_cmb.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        progname_cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progname_cmbActionPerformed(evt);
            }
        });

        stream_cmb.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        sem_cmb.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        sem_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5", "6", "7", "8" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stream_cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regno_tf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(rollno_tf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(progname_cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sem_cmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(astric)
                            .addComponent(astric1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(astric))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rollno_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(astric1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(progname_cmb))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(stream_cmb, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(sem_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            stmt=con.prepareStatement("insert into enrollment values(?,?,?,?,?)");
            stmt.setString(1,regno_tf.getText());
            stmt.setString(2,rollno_tf.getText());
            stmt.setString(3,progname_cmb.getSelectedItem().toString());
            stmt.setString(4,stream_cmb.getSelectedItem().toString());
            stmt.setString(5,sem_cmb.getSelectedItem().toString());
            int r=stmt.executeUpdate();
            backdata.back("select * from enrollment","enrollment backup.xls");
            JOptionPane.showMessageDialog(null,"The subject has been added to the table!"+r);
            this.dispose(); 
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void regno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regno_tfKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&&regno_tf.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch; 
    }//GEN-LAST:event_regno_tfKeyTyped

    private void rollno_tfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollno_tfKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& rollno_tf.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!(ch>=48&&ch<=57)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch; 
    }//GEN-LAST:event_rollno_tfKeyTyped

    private void regno_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regno_tfFocusGained
       astric.setVisible(false);
        regno_tf.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_regno_tfFocusGained

    private void regno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regno_tfFocusLost
        if(regno_tf.getText().length()==0){
            astric.setVisible(true);
            regno_tf.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
    }//GEN-LAST:event_regno_tfFocusLost

    private void rollno_tfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollno_tfFocusGained
        astric1.setVisible(false);
        rollno_tf.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_rollno_tfFocusGained

    private void rollno_tfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollno_tfFocusLost
        if(rollno_tf.getText().length()==0){
            astric1.setVisible(true);
            rollno_tf.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
    }//GEN-LAST:event_rollno_tfFocusLost

    private void progname_cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progname_cmbActionPerformed
        stream_cmb.setEditable(true);
        try {
            stmt=con.prepareStatement("select stream from program where pname=?");
            stmt.setString(1,progname_cmb.getSelectedItem().toString());
            rs=stmt.executeQuery();
            while(rs.next())
                  stream_cmb.addItem(rs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(enrollment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_progname_cmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel astric;
    private javax.swing.JLabel astric1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> progname_cmb;
    private javax.swing.JTextField regno_tf;
    private javax.swing.JTextField rollno_tf;
    private javax.swing.JComboBox<String> sem_cmb;
    private javax.swing.JComboBox<String> stream_cmb;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
