
package studentresultsystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    int a;
    public signup(int a) throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        this.a=a;
        this.getRootPane().setDefaultButton(register);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        question = new javax.swing.JComboBox<>();
        register = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        password = new javax.swing.JPasswordField();
        repassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        jLabel2.setText("User ID");

        userid.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        jLabel4.setText("ReType Password");

        jLabel5.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        jLabel5.setText("Question");

        jLabel6.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        jLabel6.setText("Answer");

        answer.setEditable(false);
        answer.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        answer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                answerFocusLost(evt);
            }
        });

        question.setFont(new java.awt.Font("Footlight MT Light", 1, 20)); // NOI18N
        question.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Question", "Aadhar Number", "Pan Number", "Pet Name" }));
        question.setEnabled(false);
        question.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                questionItemStateChanged(evt);
            }
        });

        register.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        register.setForeground(new java.awt.Color(0, 51, 255));
        register.setText("Register");
        register.setEnabled(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Harrington", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("SignUp");

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        repassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                repasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userid)
                            .addComponent(answer)
                            .addComponent(question, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password)
                            .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(repassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try {
            stmt=con.prepareStatement("insert into login values(?,?,?,?,?)");
            stmt.setString(1,userid.getText());
            stmt.setString(2,password.getText());
            stmt.setString(3,question.getSelectedItem().toString());
            stmt.setString(4,answer.getText());
            stmt.setInt(5,a);
            int r=stmt.executeUpdate();
            //JOptionPane.showMessageDialog(null,"Total row inserted:"+r);
            if(a==1)
                new faculty(userid.getText()).setVisible(true);
            else if(a==2)
                new student(userid.getText()).setVisible(true);
            else if(a==3)
                new branchassistant(userid.getText()).setVisible(true);
            this.dispose();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_useridFocusLost
        try {
            if(userid.getText().length()==0){
                userid.setText("");
                userid.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
                userid.requestFocus();
                userid.setToolTipText("Please insert user id");
            }
            else{
            stmt=con.prepareStatement("select userid from login where upper(userid)=?");
            stmt.setString(1,userid.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                userid.setText("");
                userid.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
                userid.requestFocus();
                userid.setToolTipText("Please insert unique user id");
            }
            }
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_useridFocusLost

    private void repasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_repasswordFocusLost
        if(repassword.getText().length()==0){
           password.setText("");
             repassword.setText("");
             password.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
             password.requestFocus();
             password.setToolTipText("password and repassword are not same"); 
        }
        else if(!(password.getText().equals(repassword.getText()))){
             password.setText("");
             repassword.setText("");
             password.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
             password.requestFocus();
             password.setToolTipText("password and repassword are not same");
        }
        else
            question.setEnabled(true);
    }//GEN-LAST:event_repasswordFocusLost

    private void useridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_useridKeyTyped
        userid.setBorder(null);
        userid.setToolTipText("");
    }//GEN-LAST:event_useridKeyTyped

    private void answerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_answerFocusLost
        if(!(answer.getText().length()==0)){
            register.setEnabled(true);
        }
        else
            register.setEnabled(false);
    }//GEN-LAST:event_answerFocusLost

    private void questionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_questionItemStateChanged
        if(question.getSelectedIndex()==0)
            answer.setEditable(false);
        else
            answer.setEditable(true);
    }//GEN-LAST:event_questionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> question;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField repassword;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
