package studentresultsystem;

import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class addmarks extends javax.swing.JFrame {
    Connection con;
    DefaultTableModel model;
    PreparedStatement stmt;
    int ano; boolean flag;char c1; ResultSet rs;
    public addmarks() throws ClassNotFoundException, SQLException {
        initComponents();
        con = ConnDb.conLink();
        regno.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prog_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stream = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        sem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new org.jdesktop.swingx.JXTable();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RESULT");

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration No.");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Semester");

        regno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                regnoFocusLost(evt);
            }
        });
        regno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regnoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prog. Name");

        prog_name.setEditable(false);
        prog_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        prog_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prog_nameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stream");

        stream.setEditable(false);
        stream.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stream.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                streamKeyTyped(evt);
            }
        });

        submit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        submit.setText("ADD");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        sem.setEditable(false);
        sem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sub. Code", "Sub. Name", "Marks", "Exam Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tab.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(tab);
        if (tab.getColumnModel().getColumnCount() > 0) {
            tab.getColumnModel().getColumn(0).setMinWidth(100);
            tab.getColumnModel().getColumn(0).setMaxWidth(100);
            tab.getColumnModel().getColumn(2).setMinWidth(50);
            tab.getColumnModel().getColumn(2).setMaxWidth(50);
            tab.getColumnModel().getColumn(3).setMinWidth(95);
            tab.getColumnModel().getColumn(3).setMaxWidth(95);
        }

        jLabel2.setFont(new java.awt.Font("High Tower Text", 1, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Add Marks");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(regno)
                        .addComponent(prog_name)
                        .addComponent(stream)
                        .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(413, 413, 413)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(regno)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prog_name, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stream, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
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
            for(int i=0;i<=model.getRowCount();i++){
            stmt=con.prepareStatement("insert into addmarks values(?,?,?,?,?,?,?,?)");
            stmt.setString(1,regno.getText());
            stmt.setString(2,prog_name.getText());
            stmt.setString(3,stream.getText());
            stmt.setString(4,sem.getText());
            stmt.setString(5,model.getValueAt(i,0).toString());
            stmt.setString(6,model.getValueAt(i,1).toString());
            stmt.setString(7,model.getValueAt(i,2).toString());
            stmt.setString(8,model.getValueAt(i,3).toString());
            int r=stmt.executeUpdate();
            backdata.back("select * from addmarks","addmarksbackup.xls");
            }
            JOptionPane.showMessageDialog(null,"Marks Added");
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(addmarks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void regnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regnoKeyTyped
       char ch=evt.getKeyChar();
        if(ch==' '&& regno.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=48&&ch<=57)||ch==82 ||ch==114)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch; 
    }//GEN-LAST:event_regnoKeyTyped

    private void prog_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prog_nameKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& prog_name.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=48&&ch<=57)||ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;
    }//GEN-LAST:event_prog_nameKeyTyped

    private void streamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_streamKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& stream.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=48&&ch<=57)||ch==46||ch==37)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;
    }//GEN-LAST:event_streamKeyTyped

    private void regnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusLost
        try {
            stmt=con.prepareStatement("select pname,stream,sem from enrollment where upper(regno)=?");
            stmt.setString(1,regno.getText().toUpperCase());
            rs=stmt.executeQuery();
            if(rs.next()){
                prog_name.setText(rs.getString(1));
                stream.setText(rs.getString(2));
                sem.setText(rs.getString(3));
                stmt=con.prepareStatement("select subcode,subname from subject where pname=? and stream=? and sem=?");
                stmt.setString(1,rs.getString(1));
                stmt.setString(2,rs.getString(2));
                stmt.setString(3,rs.getString(3));
                rs=stmt.executeQuery();
                model=(DefaultTableModel) tab.getModel();
                model.setRowCount(0);
                while(rs.next()){
                    model.addRow(new Object[]{rs.getString(1),rs.getString(2),"",""});
                }
            }
            /*else
                JOptionPane.showMessageDialog(this,"successfully");*/
        } catch (SQLException ex) {
            Logger.getLogger(addmarks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_regnoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField prog_name;
    private javax.swing.JTextField regno;
    private javax.swing.JTextField sem;
    private javax.swing.JTextField stream;
    private javax.swing.JButton submit;
    private org.jdesktop.swingx.JXTable tab;
    // End of variables declaration//GEN-END:variables

}
