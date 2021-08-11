package studentresultsystem;

import java.awt.Color;
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

public class forget_password extends javax.swing.JFrame {
      Connection con;
      PreparedStatement stmt;
      ResultSet rs; int r;
      public forget_password() throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        this.getRootPane().setDefaultButton(next);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jobrole = new javax.swing.JComboBox<>();
        question = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Id");

        userid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                useridFocusLost(evt);
            }
        });
        userid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                useridKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security Question");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer");

        answer.setEditable(false);
        answer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerFocusLost(evt);
            }
        });
        answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                answerKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Job Role");

        next.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        next.setForeground(new java.awt.Color(255, 51, 102));
        next.setText("Next");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jobrole.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jobrole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Faculty", "Student", "Branch Assistant" }));
        jobrole.setEnabled(false);
        jobrole.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jobroleItemStateChanged(evt);
            }
        });

        question.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Security Question", "Aadhar Number", "Pan Number", "Pet Name" }));
        question.setToolTipText("Please select your question!");
        question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                questionKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Harrington", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("Forget Password");

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userid)
                            .addComponent(answer)
                            .addComponent(jobrole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(question, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jobrole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(next)
                .addGap(51, 51, 51))
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

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
          try {
               String s1,s2;
               s1=JOptionPane.showInputDialog(this,"Enter your New Password!");
               s2=JOptionPane.showInputDialog(this,"Please re-enter the Password!");
               if(s1.equals(s2)){
               stmt=con.prepareStatement("update login set pwd=? where upper(userid)=?");
               stmt.setString(1,s1);
               stmt.setString(2,userid.getText().toUpperCase());
               stmt.executeUpdate();
               backdata.back("select * from forget_password","forget_passwordbackup.xls");
               this.dispose();
               }
               else
                   JOptionPane.showMessageDialog(this,"Your password has not been changed");
          } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
              Logger.getLogger(forget_password.class.getName()).log(Level.SEVERE, null, ex);
          }
       
    }//GEN-LAST:event_nextActionPerformed

    private void useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_useridFocusLost
          try {
              stmt=con.prepareStatement("select question,answer,jobrole from login where upper(userid)=?");
              stmt.setString(1,userid.getText().toUpperCase());
              rs=stmt.executeQuery();
              if(rs.next()){
                  question.setEditable(true);
                  answer.setEditable(true);
              }
              else{
                  userid.setText("");
                  userid.setBorder(BorderFactory.createLineBorder(Color.red,3));
                  userid.setToolTipText("Invalid userid... Please try again...");
                  userid.requestFocus();
                  question.setEditable(false);
              }
          } catch (SQLException ex) {
              Logger.getLogger(forget_password.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_useridFocusLost

    private void answerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusLost
        try{
        if(rs.getString(1).equalsIgnoreCase(question.getSelectedItem().toString())&&rs.getString(2).equalsIgnoreCase(answer.getText()))
                jobrole.setEnabled(true);
        else{
            answer.setText("");
            answer.setBorder(BorderFactory.createEtchedBorder(Color.RED,Color.yellow));
            answer.setToolTipText("Please insert the correct answer!");
            jobrole.setEnabled(false);
        }
        } catch (SQLException ex) {
            Logger.getLogger(forget_password.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_answerFocusLost

    private void jobroleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jobroleItemStateChanged
          try {
              if(jobrole.getSelectedIndex()==rs.getInt(3))
                  next.setEnabled(true);
              else
                  next.setEnabled(false);
          } catch (SQLException ex) {
              Logger.getLogger(forget_password.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jobroleItemStateChanged

    private void questionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questionKeyTyped
        evt.consume();
    }//GEN-LAST:event_questionKeyTyped

    private void useridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useridKeyTyped
        userid.setBorder(null);
        userid.setToolTipText("");
        question.setEditable(false);
    }//GEN-LAST:event_useridKeyTyped

    private void answerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerKeyTyped
        answer.setBorder(null);
        answer.setToolTipText("");
        jobrole.setEnabled(false);
        answer.requestFocus();
    }//GEN-LAST:event_answerKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> jobrole;
    private javax.swing.JButton next;
    private javax.swing.JComboBox<String> question;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
