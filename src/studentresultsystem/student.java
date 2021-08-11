package studentresultsystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public final class student extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ImageIcon img;
    File f;
    ResultSet rs;
    ButtonGroup bg;
    int ano; boolean flag=true ;char c1;
    String uid;
    public student(String uid) throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        img=new ImageIcon(new ImageIcon(getClass().getResource("nce.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        dob.setCurrent(null);
        rb1.setSelected(true);
        astric.setVisible(false);
        astric1.setVisible(false);
        astric2.setVisible(false);
        astric3.setVisible(false);
        astric4.setVisible(false);
        astric5.setVisible(false);
        astric6.setVisible(false);
        astric7.setVisible(false);
        stmt=con.prepareStatement("select regno from automatic");
        rs=stmt.executeQuery();
        rs.next();
        ano=rs.getInt(1)+1;
        auto();
        fname.requestFocus();
        this.uid=uid;
       }
    public final void auto(){
        String str=""; 
        flag=true;
        if(ano<10)
            str="R00"+ano;
        else if(ano<100)
            str="R0"+ano;
        else if(ano<1000)
            str="R"+ano;
        else{
            flag=false;
            JOptionPane.showMessageDialog(this,"More than 999 not allowed!");
        }   
        if(flag)
            regno.setText(str);
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        father_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sessions = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        blood_group = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        padd = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        cadd = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        profile = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();
        astric = new javax.swing.JLabel();
        astric1 = new javax.swing.JLabel();
        astric2 = new javax.swing.JLabel();
        astric3 = new javax.swing.JLabel();
        astric4 = new javax.swing.JLabel();
        astric5 = new javax.swing.JLabel();
        astric6 = new javax.swing.JLabel();
        astric7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dob = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("STUDENT");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registration No.");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");

        regno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        regno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regnoKeyTyped(evt);
            }
        });

        fname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnameFocusLost(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });

        mname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mnameKeyTyped(evt);
            }
        });

        lname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnameKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name");

        father_name.setEditable(false);
        father_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        father_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                father_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                father_nameFocusLost(evt);
            }
        });
        father_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                father_nameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Session");

        sessions.setEditable(false);
        sessions.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sessions.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sessionsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sessionsFocusLost(evt);
            }
        });
        sessions.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sessionsKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Blood Group");

        blood_group.setEditable(false);
        blood_group.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        blood_group.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                blood_groupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                blood_groupFocusLost(evt);
            }
        });
        blood_group.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                blood_groupKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Permanent Address");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Corresponding Address");

        padd.setEditable(false);
        padd.setColumns(20);
        padd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        padd.setRows(5);
        padd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                paddFocusLost(evt);
            }
        });
        padd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                paddKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(padd);

        cadd.setEditable(false);
        cadd.setColumns(20);
        cadd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cadd.setRows(5);
        cadd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caddFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                caddFocusLost(evt);
            }
        });
        cadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caddKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(cadd);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contact No.");

        contact.setEditable(false);
        contact.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactFocusLost(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Gender");

        rb1.setBackground(new java.awt.Color(0, 204, 204));
        rb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 255, 255));
        rb1.setText("Male");

        rb2.setBackground(new java.awt.Color(0, 204, 204));
        rb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 255, 255));
        rb2.setText("Female");

        rb3.setBackground(new java.awt.Color(0, 204, 204));
        rb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 255, 255));
        rb3.setText("Transgender");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");

        email.setEditable(false);
        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");

        submit.setBackground(new java.awt.Color(0, 51, 204));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));

        up.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        up.setText("Upload Photo");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        astric.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric.setForeground(new java.awt.Color(255, 0, 0));
        astric.setText("*");
        astric.setToolTipText("<html>\n<b><big><font color=\"red\">Name must not be empty. </font><big/></b>\n</html>\n");

        astric1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric1.setForeground(new java.awt.Color(255, 0, 0));
        astric1.setText("*");
        astric1.setToolTipText("<html>\n<b><big><font color=\"red\">Father Name must not be empty. </font><big/></b>\n</html>\n");

        astric2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric2.setForeground(new java.awt.Color(255, 0, 0));
        astric2.setText("*");
        astric2.setToolTipText("<html>\n<b><big><font color=\"red\">Session must not be empty. </font><big/></b>\n</html>\n");

        astric3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric3.setForeground(new java.awt.Color(255, 0, 0));
        astric3.setText("*");
        astric3.setToolTipText("<html>\n<b><big><font color=\"red\">Blood Group must not be empty. </font><big/></b>\n</html>\n");

        astric4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric4.setForeground(new java.awt.Color(255, 0, 0));
        astric4.setText("*");
        astric4.setToolTipText("<html>\n<b><big><font color=\"red\">Permanent Address must not be empty. </font><big/></b>\n</html>\n");

        astric5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric5.setForeground(new java.awt.Color(255, 0, 0));
        astric5.setText("*");
        astric5.setToolTipText("<html>\n<b><big><font color=\"red\">Corresponding Address must not be empty. </font><big/></b>\n</html>\n");

        astric6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric6.setForeground(new java.awt.Color(255, 0, 0));
        astric6.setText("*");
        astric6.setToolTipText("<html>\n<b><big><font color=\"red\">Contact Number must not be empty. </font><big/></b>\n</html>\n");

        astric7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        astric7.setForeground(new java.awt.Color(255, 0, 0));
        astric7.setText("*");
        astric7.setToolTipText("<html>\n<b><big><font color=\"red\">Email must not be empty. </font><big/></b>\n</html>\n");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("Ex- Capital A, A+");

        dob.setCurrentView(new datechooser.view.appearance.AppearancesList("Light",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dob.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
        public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
            dobOnSelectionChange(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(27, 27, 27)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(regno)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(astric)
                                        .addComponent(astric1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(sessions)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(astric2)
                        .addComponent(astric5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(20, 20, 20)
                                    .addComponent(astric3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lname)
                                        .addComponent(blood_group, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap(47, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(402, 402, 402)
                                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(astric4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(171, 171, 171))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)))
                    .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(astric7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(astric6)
                            .addGap(38, 38, 38)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(pic1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addComponent(profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(up)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel14)
                    .addGap(3, 3, 3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(blood_group, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric3)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 41, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric))
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(father_name, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sessions, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric1)
                        .addComponent(astric2))))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric4)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(astric7)))
                    .addGap(28, 28, 28)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(astric5)
                    .addGap(146, 146, 146)
                    .addComponent(astric6)))
            .addContainerGap())
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

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
      JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        f=jf.getSelectedFile();
        img=new ImageIcon(new ImageIcon(""+f).getImage().getScaledInstance(profile.getWidth(),profile.getHeight(),Image.SCALE_DEFAULT));
        profile.setIcon(img);
    }//GEN-LAST:event_upActionPerformed
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        try {
            if(dob.getSelectedDate()==null){
                submit.setEnabled(false);
            }   
            else
            { 
            submit.setEnabled(true);
            String str;
            stmt=con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,regno.getText());
            stmt.setString(2,fname.getText()+" "+mname.getText()+" "+lname.getText());
            stmt.setString(3,father_name.getText());
            stmt.setString(4,sessions.getText());
            stmt.setString(5,blood_group.getText());
            stmt.setString(6,padd.getText());
            stmt.setString(7,cadd.getText());
            stmt.setString(8,contact.getText());
            if(rb1.isSelected())
                str="Male";
            else if(rb2.isSelected())
                str="Female";
            else
                str="Transgender";
            stmt.setString(9,str);
            stmt.setString(10,email.getText());
            stmt.setDate(11,new java.sql.Date(dob.getCurrent().getTimeInMillis()));
            stmt.setString(12,uid);
            FileInputStream fin;
            if(f!=null){
            fin=new FileInputStream(f);
            stmt.setBinaryStream(13,fin,fin.available());
            }
            else{
                JOptionPane.showMessageDialog(this,"Please upload your profile photo!");
            }
            /*stmt.setBinaryStream(13,null);*/
            int r=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Your Personal Info record succesfully!"+r);
            stmt=con.prepareStatement("update automatic set regno=?");
            stmt.setInt(1,ano);
            stmt.executeUpdate();
            ano++;
            backdata.back("select * from student","studentbackup.xls");
            backdata.back("select * from automatic","automatic.xls");
            this.dispose();
            new enrollment(regno.getText()).setVisible(true);
            }
        } catch (SQLException | ClassNotFoundException | IOException | WriteException | BiffException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitActionPerformed

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped
       char ch=evt.getKeyChar();
        if(ch==' '&& fname.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        c1=ch;                              
    }//GEN-LAST:event_fnameKeyTyped

    private void mnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnameKeyTyped
       char ch=evt.getKeyChar();
        if(ch==' '&& mname.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } 
         c1=ch;  
    }//GEN-LAST:event_mnameKeyTyped

    private void lnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyTyped
       char ch=evt.getKeyChar();
        if(ch==' '&& lname.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;  
    }//GEN-LAST:event_lnameKeyTyped

    private void father_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_father_nameKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& father_name.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==8)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;  
    }//GEN-LAST:event_father_nameKeyTyped

    private void regnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regnoKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& regno.getText().length()==0)
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
    }//GEN-LAST:event_regnoKeyTyped

    private void contactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& contact.getText().length()==0)
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
    }//GEN-LAST:event_contactKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& email.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)||ch==64|| ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;  
    }//GEN-LAST:event_emailKeyTyped

    private void sessionsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sessionsKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& sessions.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=48&&ch<=57)||ch==45)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;
    }//GEN-LAST:event_sessionsKeyTyped

    private void blood_groupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_blood_groupKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& email.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!(ch==65||ch==66||ch==79||ch==43 || ch==45)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;
    }//GEN-LAST:event_blood_groupKeyTyped

    private void paddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paddKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& padd.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)||ch==32||ch==45||ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch; 
    }//GEN-LAST:event_paddKeyTyped

    private void caddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caddKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& cadd.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)||ch==32||ch==45||ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch; 
    }//GEN-LAST:event_caddKeyTyped

    private void fnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusGained
        astric.setVisible(false);
        fname.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_fnameFocusGained

    private void fnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnameFocusLost
         if(fname.getText().length()==0){
            astric.setVisible(true);
            fname.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
         else
             father_name.setEditable(true);
    }//GEN-LAST:event_fnameFocusLost

    private void father_nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_father_nameFocusGained
       astric1.setVisible(false);
        father_name.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_father_nameFocusGained

    private void father_nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_father_nameFocusLost
       if(father_name.getText().length()==0){
            astric1.setVisible(true);
            father_name.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
       else
           sessions.setEditable(true);
    }//GEN-LAST:event_father_nameFocusLost

    private void sessionsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sessionsFocusGained
        astric2.setVisible(false);
        sessions.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_sessionsFocusGained

    private void sessionsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sessionsFocusLost
        if(sessions.getText().length()==0){
            astric2.setVisible(true);
            sessions.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
            blood_group.setEditable(true);
    }//GEN-LAST:event_sessionsFocusLost

    private void blood_groupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blood_groupFocusGained
        astric3.setVisible(false);
        blood_group.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_blood_groupFocusGained

    private void blood_groupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_blood_groupFocusLost
        if(blood_group.getText().length()==0){
            astric3.setVisible(true);
            blood_group.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
            padd.setEditable(true);
    }//GEN-LAST:event_blood_groupFocusLost

    private void paddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddFocusGained
        astric4.setVisible(false);
        padd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_paddFocusGained

    private void paddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddFocusLost
        if(padd.getText().length()==0){
            astric4.setVisible(true);
            padd.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
            cadd.setEditable(true);
    }//GEN-LAST:event_paddFocusLost

    private void caddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddFocusGained
        astric5.setVisible(false);
        cadd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_caddFocusGained

    private void caddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddFocusLost
        if(cadd.getText().length()==0){
            astric5.setVisible(true);
            cadd.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
            contact.setEditable(true);
    }//GEN-LAST:event_caddFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        astric6.setVisible(false);
        contact.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
        if(contact.getText().length()==0){
            astric6.setVisible(true);
            contact.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
            }
        else
            email.setEditable(true);
    }//GEN-LAST:event_contactFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
         astric7.setVisible(false);
        email.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if(email.getText().length()==0){
            astric7.setVisible(true);
            email.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
    }//GEN-LAST:event_emailFocusLost

    private void dobOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dobOnSelectionChange
            submit.setEnabled(true);
    }//GEN-LAST:event_dobOnSelectionChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel astric;
    private javax.swing.JLabel astric1;
    private javax.swing.JLabel astric2;
    private javax.swing.JLabel astric3;
    private javax.swing.JLabel astric4;
    private javax.swing.JLabel astric5;
    private javax.swing.JLabel astric6;
    private javax.swing.JLabel astric7;
    private javax.swing.JTextField blood_group;
    private javax.swing.JTextArea cadd;
    private javax.swing.JTextField contact;
    private datechooser.beans.DateChooserCombo dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField father_name;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextArea padd;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel profile;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField regno;
    private javax.swing.JTextField sessions;
    private javax.swing.JButton submit;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

}
