package studentresultsystem;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class recovery extends javax.swing.JFrame {
    String str,filename,url;
    ImageIcon img;
    PreparedStatement stmt,st;
    ResultSet rs;
    Connection con;
    File f;
    boolean flag;
    public recovery() throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        img=new ImageIcon(new ImageIcon(getClass().getResource("nce.png")).getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        logo.setIcon(img);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rcv = new javax.swing.JComboBox<>();
        recover = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        rcv.setFont(new java.awt.Font("Lucida Handwriting", 1, 28)); // NOI18N
        rcv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ....", "student", "faculty", "branchassistant", "addexam", "addmarks", "subject", "enrollment", "forget_password", "program", "login", "automatic" }));

        recover.setFont(new java.awt.Font("Footlight MT Light", 1, 36)); // NOI18N
        recover.setForeground(new java.awt.Color(255, 0, 102));
        recover.setText("Recover");
        recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(344, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(rcv, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(recover, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 740, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("Script MT Bold", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Recovery ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoverActionPerformed
        try {
        str=rcv.getSelectedItem().toString();
            if(str.equalsIgnoreCase("student")){
                stmt=con.prepareStatement("truncate table student");
            stmt.executeUpdate();
            f=new File("backup\\studentbackup.xls"); 
            st=con.prepareStatement("select * from student");
            url="Insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)";
        }
       else if(str.equalsIgnoreCase("faculty")){
            stmt=con.prepareStatement("truncate table faculty");
            stmt.executeUpdate();
            f=new File("backup\\facultybackup.xls"); 
            st=con.prepareStatement("select * from faculty");
            url="Insert into faculty values(?,?,?,?,?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("branchassistant")){
            stmt=con.prepareStatement("truncate table branchassistant");
            stmt.executeUpdate();
            f=new File("backup\\branchassistantbackup.xls");
            st=con.prepareStatement("select * from branchassistnat");
            url="Insert into branchassistnat values(?,?,?,?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("addexam")){
            stmt=con.prepareStatement("truncate table addexam");
            stmt.executeUpdate();
            f=new File("backup\\addexambackup.xls"); 
            st=con.prepareStatement("select * from addexam");
            url="Insert into addexam values(?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("addmarks")){
            stmt=con.prepareStatement("truncate table addmarks");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from addmarks");
            f=new File("backup\\addmarksbackup.xls");
            url="Insert into addmarks values(?,?,?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("subject")){
            stmt=con.prepareStatement("truncate table subject");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from subject");
            f=new File("backup\\subjectbackup.xls");     
            url="Insert into subject values(?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("enrollment")){
            stmt=con.prepareStatement("truncate table enrollement");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from enrollment");
            f=new File("backup\\enrollmentbackup.xls");     
            url="Insert into enrollment values(?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("forget_password")){
            stmt=con.prepareStatement("truncate table forget_password");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from forget_password");
            f=new File("backup\\forget_passwordbackup.xls");     
            url="Insert into forget_password values(?,?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("program")){
            stmt=con.prepareStatement("truncate table program");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from program");
            f=new File("backup\\programbackup.xls");     
            url="Insert into program values(?,?,?,?,?)";
        }
         else if(str.equalsIgnoreCase("login")){
            stmt=con.prepareStatement("truncate table login");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from login");
            f=new File("backup\\loginbackup.xls");     
            url="Insert into login values(?,?,?,?,?)";
        }
        else if(str.equalsIgnoreCase("automatic")){
            stmt=con.prepareStatement("truncate table automatic");
            stmt.executeUpdate();
            st=con.prepareStatement("select * from automatic");
            f=new File("backup\\automaticbackup.xls");     
            url="insert into automatic values(?,?,?)";
        }
                FileInputStream fs=new FileInputStream(f);
                Workbook wb=Workbook.getWorkbook(fs);
                Sheet sh=wb.getSheet(0);
                stmt=con.prepareStatement(url);
                ResultSetMetaData rsmd=st.getMetaData();
                for(byte i=1;i<sh.getRows();i++){
                    for(byte j=0;j<sh.getColumns();j++){
                        String str=sh.getCell(j,i).getContents();
                        if(rsmd.getColumnTypeName(j+1).equalsIgnoreCase("blob")){
                         FileInputStream fin=new FileInputStream(str);
                         stmt.setBinaryStream(j+1,fin,fin.available());
                        }
                        else
                            stmt.setString(j+1,str.substring(1,str.length()));
                    }
                    stmt.executeUpdate();
                }
                System.out.print("recovery complete!");
        
            } catch (FileNotFoundException ex) {
                Logger.getLogger(recovery.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | BiffException | SQLException ex) {
                Logger.getLogger(recovery.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_recoverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JComboBox<String> rcv;
    private javax.swing.JButton recover;
    // End of variables declaration//GEN-END:variables
}
