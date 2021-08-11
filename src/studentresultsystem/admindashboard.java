
package studentresultsystem;

import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class admindashboard extends javax.swing.JFrame {
    ImageIcon img;
    String uid;
    public admindashboard(String uid) {
        initComponents();
        img=new ImageIcon(new ImageIcon(getClass().getResource("nce.png")).getImage().getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_DEFAULT));
        logo.setIcon(img);
        this.uid=uid;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addstudent = new javax.swing.JButton();
        studentreport = new javax.swing.JButton();
        addfaculty = new javax.swing.JButton();
        facultyreport = new javax.swing.JButton();
        addba = new javax.swing.JButton();
        bareport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        addsubject = new javax.swing.JButton();
        modifysubject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        modifyexam = new javax.swing.JButton();
        addexam = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        changepassword = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        addmarks = new javax.swing.JButton();
        modifymarks = new javax.swing.JButton();
        allusers = new javax.swing.JButton();
        program = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        addstudent.setFont(new java.awt.Font("Poor Richard", 1, 26)); // NOI18N
        addstudent.setForeground(new java.awt.Color(255, 0, 51));
        addstudent.setText("Add Student");
        addstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addstudentActionPerformed(evt);
            }
        });

        studentreport.setFont(new java.awt.Font("Poor Richard", 1, 26)); // NOI18N
        studentreport.setForeground(new java.awt.Color(255, 0, 51));
        studentreport.setText("Student Report");
        studentreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentreportActionPerformed(evt);
            }
        });

        addfaculty.setFont(new java.awt.Font("Poor Richard", 1, 26)); // NOI18N
        addfaculty.setForeground(new java.awt.Color(255, 0, 51));
        addfaculty.setText("Add Faculty");
        addfaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfacultyActionPerformed(evt);
            }
        });

        facultyreport.setFont(new java.awt.Font("Poor Richard", 1, 26)); // NOI18N
        facultyreport.setForeground(new java.awt.Color(255, 0, 51));
        facultyreport.setText("Faculty Report");
        facultyreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyreportActionPerformed(evt);
            }
        });

        addba.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        addba.setForeground(new java.awt.Color(255, 0, 51));
        addba.setText("Add Branch Asst.");
        addba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbaActionPerformed(evt);
            }
        });

        bareport.setFont(new java.awt.Font("Poor Richard", 1, 20)); // NOI18N
        bareport.setForeground(new java.awt.Color(255, 0, 51));
        bareport.setText("Branch Asst. Report");
        bareport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bareportActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Add User");

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addba, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bareport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultyreport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentreport, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 4, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addstudent, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(studentreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addfaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyreport, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addba, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bareport, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Admin Dashboard");

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        logout.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 0, 153));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(145, 149, 215));

        addsubject.setFont(new java.awt.Font("Poor Richard", 1, 36)); // NOI18N
        addsubject.setForeground(new java.awt.Color(255, 0, 51));
        addsubject.setText("Add Subject");
        addsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubjectActionPerformed(evt);
            }
        });

        modifysubject.setFont(new java.awt.Font("Poor Richard", 1, 28)); // NOI18N
        modifysubject.setForeground(new java.awt.Color(255, 0, 51));
        modifysubject.setText("Modify Subject");
        modifysubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifysubjectActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Add Subject");

        jSeparator3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifysubject, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(addsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifysubject, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        modifyexam.setFont(new java.awt.Font("Poor Richard", 1, 30)); // NOI18N
        modifyexam.setForeground(new java.awt.Color(255, 0, 51));
        modifyexam.setText("Modify Exam");
        modifyexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyexamActionPerformed(evt);
            }
        });

        addexam.setFont(new java.awt.Font("Poor Richard", 1, 30)); // NOI18N
        addexam.setForeground(new java.awt.Color(255, 0, 51));
        addexam.setText("Add Exam");
        addexam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addexamActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Add Exam");

        jSeparator4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addexam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifyexam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addexam, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyexam, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        changepassword.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        changepassword.setForeground(new java.awt.Color(255, 0, 153));
        changepassword.setText("Change Password");
        changepassword.setPreferredSize(new java.awt.Dimension(151, 23));
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 102, 153));

        addmarks.setFont(new java.awt.Font("Poor Richard", 1, 28)); // NOI18N
        addmarks.setForeground(new java.awt.Color(255, 0, 51));
        addmarks.setText("Add Marks");
        addmarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addmarksActionPerformed(evt);
            }
        });

        modifymarks.setFont(new java.awt.Font("Poor Richard", 1, 28)); // NOI18N
        modifymarks.setForeground(new java.awt.Color(255, 0, 51));
        modifymarks.setText("Modify Marks");
        modifymarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifymarksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(addmarks, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(modifymarks, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modifymarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addmarks, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        allusers.setBackground(new java.awt.Color(255, 0, 102));
        allusers.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        allusers.setForeground(new java.awt.Color(255, 255, 255));
        allusers.setText("View All Users");
        allusers.setMaximumSize(new java.awt.Dimension(473, 227));
        allusers.setMinimumSize(new java.awt.Dimension(473, 227));
        allusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allusersActionPerformed(evt);
            }
        });

        program.setBackground(new java.awt.Color(255, 0, 102));
        program.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        program.setForeground(new java.awt.Color(255, 255, 255));
        program.setText("Program");
        program.setMaximumSize(new java.awt.Dimension(473, 227));
        program.setMinimumSize(new java.awt.Dimension(473, 227));
        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Recovery");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(613, 613, 613)
                                .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(allusers, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(allusers, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(166, 166, 166))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void facultyreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyreportActionPerformed
        try {
            new facultyservice().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_facultyreportActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        try {
            new Login().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void addstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addstudentActionPerformed
        try {
            new signup(2).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addstudentActionPerformed

    private void studentreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentreportActionPerformed
        new studentreport().setVisible(true);
    }//GEN-LAST:event_studentreportActionPerformed

    private void addfacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfacultyActionPerformed
        try {
            new signup(1).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addfacultyActionPerformed

    private void addbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbaActionPerformed
        try {
            new signup(3).setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addbaActionPerformed

    private void addsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsubjectActionPerformed
        try {
            new addsubject().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addsubjectActionPerformed

    private void modifysubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifysubjectActionPerformed
        try {
            new modifysubject().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifysubjectActionPerformed

    private void addexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addexamActionPerformed
        try {
            new addexam().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addexamActionPerformed

    private void modifyexamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyexamActionPerformed
        try {
            new modifyexam().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifyexamActionPerformed

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed
        try {
            new changepassword(uid).setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changepasswordActionPerformed

    private void addmarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addmarksActionPerformed
        try {
            new addmarks().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addmarksActionPerformed

    private void modifymarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifymarksActionPerformed
        try {
            new modifymarks().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modifymarksActionPerformed

    private void bareportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bareportActionPerformed
        try {
            new branchassistantservice().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bareportActionPerformed

    private void allusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allusersActionPerformed
        try {
            new allusers().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_allusersActionPerformed

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        try {
            new program().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_programActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new recovery().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(admindashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addba;
    private javax.swing.JButton addexam;
    private javax.swing.JButton addfaculty;
    private javax.swing.JButton addmarks;
    private javax.swing.JButton addstudent;
    private javax.swing.JButton addsubject;
    private javax.swing.JButton allusers;
    private javax.swing.JButton bareport;
    private javax.swing.JButton changepassword;
    private javax.swing.JButton facultyreport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel logo;
    private javax.swing.JButton logout;
    private javax.swing.JButton modifyexam;
    private javax.swing.JButton modifymarks;
    private javax.swing.JButton modifysubject;
    private javax.swing.JButton program;
    private javax.swing.JButton studentreport;
    // End of variables declaration//GEN-END:variables
}
