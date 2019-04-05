
/*Project : student Grade book*/

package student.profile;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ujjal kundu
 */

public class student extends javax.swing.JFrame {

    double ct=0,kt=0,r1=0;
    double c1,g1;
    String cgpa,S,P;
     public student() {
        initComponents();
    
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent = new javax.swing.JPanel();
        sign = new javax.swing.JPanel();
        signb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        tf2 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        level = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        wrr = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Sprofile = new javax.swing.JPanel();
        add1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        name1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        roll1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cn1 = new javax.swing.JTextField();
        del1 = new javax.swing.JButton();
        up1 = new javax.swing.JButton();
        wg1 = new javax.swing.JLabel();
        calc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        reg1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sesson1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        cr1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        gr1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        adm = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        std = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        wg = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        datas = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parent.setLayout(new java.awt.CardLayout());

        sign.setBackground(new java.awt.Color(151, 108, 108));

        signb.setBackground(new java.awt.Color(106, 34, 34));
        signb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signb.setForeground(new java.awt.Color(51, 51, 51));
        signb.setText("Sign In");
        signb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(63, 49, 49));
        jLabel1.setText("    Log In");

        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(47, 22, 22));
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(47, 22, 22));
        jLabel3.setText("Password");

        lb1.setBackground(new java.awt.Color(204, 0, 0));
        lb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb1.setForeground(new java.awt.Color(204, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        jLabel7.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/profile/book1.jpg"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        level.setBackground(new java.awt.Color(102, 0, 0));
        level.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        level.setForeground(new java.awt.Color(153, 153, 153));
        level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Student", " " }));

        jLabel14.setBackground(new java.awt.Color(0, 102, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(47, 22, 22));
        jLabel14.setText("Sign As");

        wrr.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        wrr.setForeground(new java.awt.Color(204, 204, 204));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 153));
        jLabel16.setText("Change password?");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signLayout = new javax.swing.GroupLayout(sign);
        sign.setLayout(signLayout);
        signLayout.setHorizontalGroup(
            signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf1)
                            .addComponent(tf2)
                            .addComponent(level, 0, 174, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                                .addComponent(signb)
                                .addGap(92, 92, 92))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                .addContainerGap(757, Short.MAX_VALUE)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                        .addComponent(wrr, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        signLayout.setVerticalGroup(
            signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signLayout.createSequentialGroup()
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(39, 39, 39)
                        .addGroup(signLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(29, 29, 29)
                        .addComponent(wrr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(signb))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        parent.add(sign, "card4");

        Sprofile.setBackground(new java.awt.Color(255, 255, 255));
        Sprofile.setLayout(null);

        add1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add1.setText("Add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        Sprofile.add(add1);
        add1.setBounds(20, 130, 75, 23);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course no", "Course  Title ", "Credit", "Grade"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table2);

        Sprofile.add(jScrollPane3);
        jScrollPane3.setBounds(10, 345, 765, 250);

        name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name1ActionPerformed(evt);
            }
        });
        Sprofile.add(name1);
        name1.setBounds(54, 18, 131, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(158, 148, 148));
        jLabel11.setText("Name");
        Sprofile.add(jLabel11);
        jLabel11.setBounds(10, 18, 40, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(182, 181, 181));
        jLabel12.setText("Roll");
        Sprofile.add(jLabel12);
        jLabel12.setBounds(203, 18, 25, 17);

        roll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roll1ActionPerformed(evt);
            }
        });
        Sprofile.add(roll1);
        roll1.setBounds(232, 18, 131, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Course no ");
        Sprofile.add(jLabel13);
        jLabel13.setBounds(10, 71, 75, 17);
        Sprofile.add(cn1);
        cn1.setBounds(109, 71, 132, 30);

        del1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        del1.setText("Delete");
        del1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del1ActionPerformed(evt);
            }
        });
        Sprofile.add(del1);
        del1.setBounds(180, 130, 73, 23);

        up1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        up1.setText("Update");
        up1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up1ActionPerformed(evt);
            }
        });
        Sprofile.add(up1);
        up1.setBounds(360, 130, 73, 23);

        wg1.setBackground(new java.awt.Color(204, 0, 0));
        Sprofile.add(wg1);
        wg1.setBounds(848, 513, 193, 28);

        calc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        calc.setText("Calculate");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });
        Sprofile.add(calc);
        calc.setBounds(680, 130, 90, 23);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Roll No.", "Reg No.", "Session", "CGPA"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        Sprofile.add(jScrollPane1);
        jScrollPane1.setBounds(10, 169, 765, 97);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(182, 181, 181));
        jLabel4.setText("Reg no");
        Sprofile.add(jLabel4);
        jLabel4.setBounds(373, 18, 49, 17);

        reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg1ActionPerformed(evt);
            }
        });
        Sprofile.add(reg1);
        reg1.setBounds(435, 18, 131, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(182, 181, 181));
        jLabel5.setText("Session");
        Sprofile.add(jLabel5);
        jLabel5.setBounds(584, 18, 52, 17);

        sesson1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesson1ActionPerformed(evt);
            }
        });
        Sprofile.add(sesson1);
        sesson1.setBounds(671, 18, 131, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(182, 181, 181));
        jLabel24.setText("Title name");
        Sprofile.add(jLabel24);
        jLabel24.setBounds(259, 71, 83, 17);
        Sprofile.add(t1);
        t1.setBounds(346, 71, 163, 30);
        Sprofile.add(cr1);
        cr1.setBounds(601, 71, 60, 30);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(182, 181, 181));
        jLabel36.setText(" CREDIT");
        Sprofile.add(jLabel36);
        jLabel36.setBounds(524, 71, 59, 17);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(182, 181, 181));
        jLabel37.setText(" GRADE");
        Sprofile.add(jLabel37);
        jLabel37.setBounds(671, 71, 59, 17);

        gr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gr1ActionPerformed(evt);
            }
        });
        Sprofile.add(gr1);
        gr1.setBounds(734, 71, 68, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Warning!!");
        Sprofile.add(jLabel6);
        jLabel6.setBounds(10, 595, 70, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Admin");
        Sprofile.add(jLabel8);
        jLabel8.setBounds(885, 11, 55, 30);

        adm.setBackground(new java.awt.Color(230, 230, 230));
        adm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adm.setForeground(new java.awt.Color(102, 102, 102));
        adm.setToolTipText("Enter your comment");
        adm.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admActionPerformed(evt);
            }
        });
        Sprofile.add(adm);
        adm.setBounds(885, 67, 332, 94);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Student");
        Sprofile.add(jLabel9);
        jLabel9.setBounds(885, 187, 68, 22);

        std.setBackground(new java.awt.Color(230, 230, 230));
        std.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        std.setForeground(new java.awt.Color(204, 204, 204));
        std.setToolTipText("");
        std.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdActionPerformed(evt);
            }
        });
        Sprofile.add(std);
        std.setBounds(885, 227, 332, 101);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Sprofile.add(jLabel10);
        jLabel10.setBounds(421, 602, 353, 0);

        wg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        wg.setForeground(new java.awt.Color(204, 204, 204));
        wg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Sprofile.add(wg);
        wg.setBounds(143, 595, 272, 29);

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        Sprofile.add(reset);
        reset.setBounds(530, 130, 70, 23);

        datas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        datas.setText("Show data");
        datas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasActionPerformed(evt);
            }
        });
        Sprofile.add(datas);
        datas.setBounds(890, 400, 100, 23);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/profile/background_color_faded_surface_texture_50421_2560x1080.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        Sprofile.add(jLabel15);
        jLabel15.setBounds(0, 0, 1350, 720);

        parent.add(Sprofile, "card3");

        getContentPane().add(parent, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signbActionPerformed
        // TODO add your handling code here:
        
        Scanner s1 = null,s2=null;
        boolean flag=false;
        try {
            s1=new Scanner(new FileInputStream("G:\\Student Profile\\user.txt"));
            s2=new Scanner(new FileInputStream("G:\\Student Profile\\student.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String u,p,name1,pass1,name2,pass2;
        u=tf1.getText().toString();
        p=tf2.getText().toString();
       
        name1=s1.next();
        pass1=s1.next();
        name2=s2.next();
        pass2=s2.next();
       
        
     if(u.equals(name1) && p.equals(pass1) && level.getSelectedItem()=="Admin")
     {
       parent.removeAll();
       parent.add(Sprofile);
       parent.repaint();
       parent.revalidate();
       
       add1.setVisible(true);
       del1.setVisible(true);
       up1.setVisible(true);
       calc.setVisible(true);
       
       adm.setText("Enter your comment");
       adm.setEditable(true);
       std.setEditable(false);
     }
        
     else if(u.equals(name2) && p.equals(pass2) && level.getSelectedItem()=="Student")
     {
       parent.removeAll();
       parent.add(Sprofile);
       parent.repaint();
       parent.revalidate();
       
       add1.setVisible(false);
       del1.setVisible(false);
       up1.setVisible(false);
       calc.setVisible(false);
       reset.setVisible(false);
       datas.setVisible(false);
       std.setText("Enter your comment ");
       std.setEditable(true);
       adm.setEditable(false);
       
     }
     else
     {
         wrr.setText("Username Or Password is Incorret!!!!!!!");
     }
        
       
    }//GEN-LAST:event_signbActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       parent.removeAll();
       parent.add(sign);
       parent.repaint();
       parent.revalidate();
       tf1.setText(null);
       tf2.setText(null);
       wrr.setText(null);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void sesson1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesson1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sesson1ActionPerformed

    private void reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reg1ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model1=(DefaultTableModel)table1.getModel();
        name1.setText(model1.getValueAt(table1.getSelectedRow(), 0).toString());
        roll1.setText(model1.getValueAt(table1.getSelectedRow(), 1).toString());
        reg1.setText(model1.getValueAt(table1.getSelectedRow(), 2).toString());
        sesson1.setText(model1.getValueAt(table1.getSelectedRow(), 3).toString());
       
    }//GEN-LAST:event_table1MouseClicked

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
     DefaultTableModel model1=(DefaultTableModel)table1.getModel();
        if(!name1.getText().trim().equals(""))
        {
            model1.addRow(new Object[]{name1.getText(),roll1.getText(),reg1.getText(),sesson1.getText(),cgpa});
            try {
                //Write labels and corresponding fields to text file
                BufferedWriter outfile = new BufferedWriter(new FileWriter("output.txt",true));
                
                outfile.write(name1.getText()+" "+roll1.getText()+" "+reg1.getText()+" "+sesson1.getText()+" "+cgpa+"\n");
                outfile.newLine();
                outfile.close();
                //repeat for CC, Bcc, and Subject labels/fields, and for Message label/text area


            }catch(FileNotFoundException e) {
                System.out.println("File not found.");
            }catch(NullPointerException j){
                System.out.println("Null.");
            }catch(IOException k){
                System.out.println("IO Exception.");            
            }
            JOptionPane.showMessageDialog(this,"data is Saved");
        }
        else
        {
           wg.setText("Name Field Can Not Be Empty!!!");
        }

    }//GEN-LAST:event_calcActionPerformed

    private void up1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model2=(DefaultTableModel)table2.getModel();
        DefaultTableModel model1=(DefaultTableModel)table1.getModel();
        c1=Double.parseDouble(cr1.getText().toString());
        g1=Double.parseDouble(gr1.getText().toString());
        
        
            r1+=(c1*g1);
            
            kt+=c1;
         DecimalFormat df = new DecimalFormat("#.##");
        df.format(ct);
         String p=df.format(ct);
        //values for grade
            if(table1.getSelectedRow()==-1)
        {
           
            if(table1.getRowCount()==0)
            {
                wg.setText("There Are No Data To Update");
            }
            else
            {
                wg.setText("You Must Select A Item");
                
            }
        }
        else
        {
            model1.setValueAt(name1.getText(),table1.getSelectedRow(),0);
            model1.setValueAt(roll1.getText(),table1.getSelectedRow(),1);
            model1.setValueAt(reg1.getText(),table1.getSelectedRow(),2);
            model1.setValueAt(sesson1.getText(),table1.getSelectedRow(),3);
            model1.setValueAt((r1/kt),table1.getSelectedRow(),4);
           
        }
               if(table2.getSelectedRow()==-1)
        {
            
            if(table2.getRowCount()==0)
            {
                wg.setText("There Are No Data To Update");
            }
            else
            {
                wg.setText("You Must Select A Item");
            }
        }
        else
        {
            model2.setValueAt(cn1.getText(),table2.getSelectedRow(),0);
            model2.setValueAt(t1.getText(),table2.getSelectedRow(),1);
            model2.setValueAt(cr1.getText(),table2.getSelectedRow(),2);
            model2.setValueAt(gr1.getText(),table2.getSelectedRow(),3);
            
           
        }

      

    }//GEN-LAST:event_up1ActionPerformed

    private void del1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del1ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model1=(DefaultTableModel)table1.getModel();
           DefaultTableModel model2=(DefaultTableModel)table2.getModel();
        if(table1.getSelectedRow()==-1)
        {
            if(table1.getRowCount()==0)
            {
                wg.setText("There Are No Data To Delete");
            }
            else
            {
                wg.setText("You Must Select A Item");
            }
        }
        else
        {
            model1.removeRow(table1.getSelectedRow());
            
        }
          
        if(table2.getSelectedRow()==-1)
        {
            if(table2.getRowCount()==0)
            {
               wg.setText("There Are No Data To delete");
            }
            else
            {
                wg.setText("You Must Select A Item");
            }
        }
        else
        {
            model2.removeRow(table2.getSelectedRow());
            
        }
    }//GEN-LAST:event_del1ActionPerformed

    private void roll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roll1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roll1ActionPerformed

    private void name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name1ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model2=(DefaultTableModel)table2.getModel();
        cn1.setText(model2.getValueAt(table2.getSelectedRow(), 0).toString());
        t1.setText(model2.getValueAt(table2.getSelectedRow(), 1).toString());
        cr1.setText(model2.getValueAt(table2.getSelectedRow(), 2).toString());
        gr1.setText(model2.getValueAt(table2.getSelectedRow(), 3).toString());
        
    }//GEN-LAST:event_table2MouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model2=(DefaultTableModel)table2.getModel();
//        DefaultTableModel model1=(DefaultTableModel)table1.getModel();
        c1=Double.parseDouble(cr1.getText().toString());
        g1=Double.parseDouble(gr1.getText().toString());
        
        
            r1+=(c1*g1);
            
            kt+=c1;
          ct=r1/kt;  
         DecimalFormat df = new DecimalFormat("#.##");
        df.format(ct);
          cgpa=df.format(ct);//values for grade

        

        if(!cn1.getText().trim().equals(""))
        {
            model2.addRow(new Object[]{cn1.getText(),t1.getText(),c1,g1});
             try {
                //Write labels and corresponding fields to text file
                BufferedWriter outfile = new BufferedWriter(new FileWriter("table2.txt",true));
                
                outfile.write(cn1.getText()+" "+t1.getText()+" "+cr1.getText()+" "+gr1.getText());
                outfile.newLine();
                outfile.close();
                //repeat for CC, Bcc, and Subject labels/fields, and for Message label/text area


            }catch(FileNotFoundException e) {
                System.out.println("File not found.");
            }catch(NullPointerException j){
                System.out.println("Null.");
            }catch(IOException k){
                System.out.println("IO Exception.");            
            }
            
        }
        else
        {
            wg.setText("Name Field Can Not Be Empty!!!");
        }

    }//GEN-LAST:event_add1ActionPerformed

    private void gr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gr1ActionPerformed

    private void stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdActionPerformed

    private void admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        name1.setText(null);
        roll1.setText(null);
        reg1.setText(null);
        sesson1.setText(null);
        cn1.setText(null);
        t1.setText(null);
        cr1.setText(null);
        gr1.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void datasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasActionPerformed
        Runtime rt = Runtime.getRuntime();
        String file1 = "G:\\Student Profile\\output.txt";
        String file2 = "G:\\Student Profile\\table2.txt";
        try {
            Process p1 = rt.exec("notepad "+file1);
            Process p2 = rt.exec("notepad "+file2);
        } catch (IOException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_datasActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        String k,us,pa,u,u1,s,s1;
        Scanner S1=null,S2=null;
         try {
            S1=new Scanner(new FileInputStream("G:\\Student Profile\\user.txt"));
            S2=new Scanner(new FileInputStream("G:\\Student Profile\\student.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
        }
         u=S1.next();
         u1=S1.next();
         s=S2.next();
         s1=S2.next();
        k = JOptionPane.showInputDialog("Enter your old password");
        if(k.equals(u1)){
            try {
                us=JOptionPane.showInputDialog("Enter your user name");
                pa=JOptionPane.showInputDialog("Enter your new password");
                BufferedWriter uspas = new BufferedWriter(new FileWriter("user.txt",false));
                uspas.write(us);
                uspas.newLine();
                uspas.write(pa);
                uspas.close();
                JOptionPane.showMessageDialog(null, "Password has been changed");
            } catch (IOException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(k.equals(s1)){
             try {
                us=JOptionPane.showInputDialog("Enter your user name");
                pa=JOptionPane.showInputDialog("Enter your new password");
                BufferedWriter uspas = new BufferedWriter(new FileWriter("student.txt",false));
                uspas.write(us);
                uspas.newLine();
                uspas.write(pa);
                uspas.close();
                JOptionPane.showMessageDialog(null, "Password has been changed");
            } catch (IOException ex) {
                Logger.getLogger(student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Wrong Password!!");
        }
    }//GEN-LAST:event_jLabel16MouseClicked

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Sprofile;
    private javax.swing.JButton add1;
    private javax.swing.JTextField adm;
    private javax.swing.JButton calc;
    private javax.swing.JTextField cn1;
    private javax.swing.JTextField cr1;
    private javax.swing.JButton datas;
    private javax.swing.JButton del1;
    private javax.swing.JTextField gr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb1;
    private javax.swing.JComboBox level;
    private javax.swing.JTextField name1;
    private javax.swing.JPanel parent;
    private javax.swing.JTextField reg1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField roll1;
    private javax.swing.JTextField sesson1;
    private javax.swing.JPanel sign;
    private javax.swing.JButton signb;
    private javax.swing.JTextField std;
    private javax.swing.JTextField t1;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    private javax.swing.JButton up1;
    private javax.swing.JLabel wg;
    private javax.swing.JLabel wg1;
    private javax.swing.JLabel wrr;
    // End of variables declaration//GEN-END:variables
}
