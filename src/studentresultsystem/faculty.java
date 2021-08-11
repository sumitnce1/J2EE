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

public class faculty extends javax.swing.JFrame {
    Connection con;
    PreparedStatement stmt;
    ImageIcon img;
    File d;
    ButtonGroup bg;
    ResultSet rs;
    int ano; boolean flag=true ;char c1; String uid;
    public faculty(String uid) throws ClassNotFoundException, SQLException {
        initComponents();
        con=ConnDb.conLink();
        img=new ImageIcon(new ImageIcon(getClass().getResource("nce.png")).getImage().getScaledInstance(pic1.getWidth(),pic1.getHeight(),Image.SCALE_DEFAULT));
        pic1.setIcon(img);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        rb1.setSelected(true);
        dob.setCurrent(null);
        astric.setVisible(false);
        astric1.setVisible(false);
        astric2.setVisible(false);
        astric3.setVisible(false);
        astric4.setVisible(false);
        astric5.setVisible(false);
        astric6.setVisible(false);
        stmt=con.prepareStatement("select fid from automatic");
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
            str="F00"+ano;
        else if(ano<100)
            str="F0"+ano;
        else if(ano<1000)
            str="F"+ano;
        else{
            flag=false;
            JOptionPane.showMessageDialog(this,"More than 999 not allowed!");
        }   
        if(flag)
            fid.setText(str);
       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        padd = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cadd = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        pic2 = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        pic1 = new javax.swing.JLabel();
        specialization = new javax.swing.JTextField();
        astric = new javax.swing.JLabel();
        astric1 = new javax.swing.JLabel();
        astric3 = new javax.swing.JLabel();
        astric4 = new javax.swing.JLabel();
        astric6 = new javax.swing.JLabel();
        astric5 = new javax.swing.JLabel();
        astric2 = new javax.swing.JLabel();
        dob = new datechooser.beans.DateChooserCombo();
        doj = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("FACULTY");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Faculty Id");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Middle Name");

        fid.setEditable(false);
        fid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        fid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fidKeyTyped(evt);
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

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");

        lname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnameKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qualification");

        qualification.setEditable(false);
        qualification.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        qualification.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                qualificationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                qualificationFocusLost(evt);
            }
        });
        qualification.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qualificationKeyTyped(evt);
            }
        });

        l4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));
        l4.setText("Specialization");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date of Joining");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Permanent Address");

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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Corresponding Address");

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

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contact No.");

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender");

        rb1.setBackground(new java.awt.Color(102, 0, 102));
        rb1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 255, 255));
        rb1.setText("Male");

        rb2.setBackground(new java.awt.Color(102, 0, 102));
        rb2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 255, 255));
        rb2.setText("Female");

        rb3.setBackground(new java.awt.Color(102, 0, 102));
        rb3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 255, 255));
        rb3.setText("Others");

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

        submit.setBackground(new java.awt.Color(102, 255, 51));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setEnabled(false);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        pic2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 4, true));

        up.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        up.setText("Upload Photo");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });

        specialization.setEditable(false);
        specialization.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specialization.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                specializationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                specializationFocusLost(evt);
            }
        });
        specialization.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                specializationKeyTyped(evt);
            }
        });

        astric.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric.setForeground(new java.awt.Color(255, 0, 0));
        astric.setText("*");
        astric.setToolTipText("<html>\n<b><big><font color=\"red\">Faculty name must not be empty. </font><big/></b>\n</html>\n");

        astric1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric1.setForeground(new java.awt.Color(255, 0, 0));
        astric1.setText("*");
        astric1.setToolTipText("<html>\n<b><big><font color=\"red\">Qualification must not be empty. </font><big/></b>\n</html>\n");

        astric3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric3.setForeground(new java.awt.Color(255, 0, 0));
        astric3.setText("*");
        astric3.setToolTipText("<html>\n<b><big><font color=\"red\">Permanent Address must not be empty. </font><big/></b>\n</html>\n");

        astric4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric4.setForeground(new java.awt.Color(255, 0, 0));
        astric4.setText("*");
        astric4.setToolTipText("<html>\n<b><big><font color=\"red\">Corresponding Address must not be empty. </font><big/></b>\n</html>\n");

        astric6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric6.setForeground(new java.awt.Color(255, 0, 0));
        astric6.setText("*");
        astric6.setToolTipText("<html>\n<b><big><font color=\"red\">Email must not be empty. </font><big/></b>\n</html>\n");

        astric5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric5.setForeground(new java.awt.Color(255, 0, 0));
        astric5.setText("*");
        astric5.setToolTipText("<html>\n<b><big><font color=\"red\">Contact Number must not be empty. </font><big/></b>\n</html>\n");

        astric2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        astric2.setForeground(new java.awt.Color(255, 0, 0));
        astric2.setText("*");
        astric2.setToolTipText("<html>\n<b><big><font color=\"red\">Specification must not be empty. </font><big/></b>\n</html>\n");

        dob.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
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

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(420, 420, 420)
            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(451, Short.MAX_VALUE))
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(45, 45, 45)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(email))
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(astric1)
                                        .addGap(11, 11, 11)
                                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(astric3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(astric)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(321, 321, 321)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(astric6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(astric5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addComponent(mname)
                                        .addComponent(specialization))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(astric2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel8)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(doj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(60, 60, 60)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(astric4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(44, 44, 44)
                                                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(18, 18, 18)
                                            .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 11, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(up))
                        .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(199, 199, 199)))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(pic2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(up))
                .addComponent(pic1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(4, 4, 4)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addComponent(fid, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(doj, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(qualification, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(astric1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(astric2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(astric3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(astric5))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(astric6))))
                .addComponent(astric4))
            .addGap(18, 18, 18)
            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.showOpenDialog(null);
        d=jf.getSelectedFile();
        img=new ImageIcon(new ImageIcon(""+d).getImage().getScaledInstance(pic2.getWidth(),pic2.getHeight(),Image.SCALE_DEFAULT));
        pic2.setIcon(img);
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
            stmt=con.prepareStatement("insert into faculty values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,fid.getText());
            stmt.setString(2,fname.getText()+" "+mname.getText()+" "+lname.getText());
            stmt.setString(3,qualification.getText());
            stmt.setString(4,specialization.getText());
            stmt.setDate(5,new java.sql.Date(doj.getCurrent().getTimeInMillis()));
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
            FileInputStream fin;
            if(d!=null){
            fin=new FileInputStream(d);
            stmt.setBinaryStream(12,fin,fin.available());
            }
            else{
                JOptionPane.showMessageDialog(this,"Please upload your profile photo!");
            }
            stmt.setString(13,uid);
            int r=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Your Personal Info record succesfully!"+r);
            stmt=con.prepareStatement("update automatic set fid=?");
            stmt.setInt(1,ano);
            stmt.executeUpdate();
            ano++;
            backdata.back("select * from faculty","facultybackup.xls");
            backdata.back("select * from automatic","automatic.xls");
            this.dispose();
            }
        } catch (SQLException | IOException | ClassNotFoundException | WriteException | BiffException ex) {
            Logger.getLogger(faculty.class.getName()).log(Level.SEVERE, null, ex);
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

    private void qualificationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qualificationKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& qualification.getText().length()==0)
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||ch==32||ch==46)){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        else if(ch==' '&&c1==' ')
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }    
        c1=ch;  
    }//GEN-LAST:event_qualificationKeyTyped

    private void specializationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_specializationKeyTyped
        char ch=evt.getKeyChar();
        if(ch==' '&& specialization.getText().length()==0)
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
    }//GEN-LAST:event_specializationKeyTyped

    private void fidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fidKeyTyped
       char ch=evt.getKeyChar();
        if(ch==' '&& fid.getText().length()==0)
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
    }//GEN-LAST:event_fidKeyTyped

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
        else if(!((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57)||ch==32||ch==64|| ch==46)){
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
           qualification.setEditable(true);
    }//GEN-LAST:event_fnameFocusLost

    private void qualificationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationFocusGained
        astric1.setVisible(false);
        qualification.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_qualificationFocusGained

    private void qualificationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qualificationFocusLost
       if(qualification.getText().length()==0){
            astric1.setVisible(true);
            qualification.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
       else
           specialization.setEditable(true);
    }//GEN-LAST:event_qualificationFocusLost

    private void paddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddFocusGained
       astric3.setVisible(false);
        padd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_paddFocusGained

    private void paddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paddFocusLost
       if(padd.getText().length()==0){
            astric3.setVisible(true);
            padd.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
       else
           cadd.setEditable(true);
    }//GEN-LAST:event_paddFocusLost

    private void caddFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddFocusGained
        astric4.setVisible(false);
        cadd.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_caddFocusGained

    private void caddFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caddFocusLost
       if(cadd.getText().length()==0){
            astric4.setVisible(true);
            cadd.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
       else
           contact.setEditable(true);
    }//GEN-LAST:event_caddFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        astric5.setVisible(false);
        contact.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
        if(contact.getText().length()==0){
            astric5.setVisible(true);
            contact.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
           email.setEditable(true);
    }//GEN-LAST:event_contactFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        astric6.setVisible(false);
        email.setBorder(BorderFactory.createLineBorder(Color.gray,2));
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
       if(email.getText().length()==0){
            astric6.setVisible(true);
            email.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
             }
    }//GEN-LAST:event_emailFocusLost

    private void specializationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_specializationFocusGained
        astric2.setVisible(false);
        specialization.setBorder(BorderFactory.createLineBorder(Color.gray,2));

    }//GEN-LAST:event_specializationFocusGained

    private void specializationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_specializationFocusLost
        if(specialization.getText().length()==0){
            astric2.setVisible(true);
            specialization.setBorder(BorderFactory.createEtchedBorder(Color.red, Color.yellow));
      }
        else
           padd.setEditable(true);
    }//GEN-LAST:event_specializationFocusLost

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
    private javax.swing.JTextArea cadd;
    private javax.swing.JTextField contact;
    private datechooser.beans.DateChooserCombo dob;
    private datechooser.beans.DateChooserCombo doj;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JTextArea padd;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic2;
    private javax.swing.JTextField qualification;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JTextField specialization;
    private javax.swing.JButton submit;
    private javax.swing.JButton up;
    // End of variables declaration//GEN-END:variables

}
