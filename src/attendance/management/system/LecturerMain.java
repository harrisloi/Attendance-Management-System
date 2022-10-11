/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.management.system;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class LecturerMain extends javax.swing.JFrame {
    

    /**
     * Creates new form LecturerMain
     */
    public LecturerMain() {
        initComponents();
        
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        View = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Attendance = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Modify = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        idfield = new javax.swing.JTextField();
        sexfield = new javax.swing.JTextField();
        religionfield = new javax.swing.JTextField();
        dobfield = new javax.swing.JTextField();
        racefield = new javax.swing.JTextField();
        nationfield = new javax.swing.JTextField();
        emailfield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        addfield = new javax.swing.JTextField();
        firstnamefield = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        lastnamefield = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        subjectfield = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        intake2 = new javax.swing.JTextField();
        intake = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Userlabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Exitbutton = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        View.setBackground(new java.awt.Color(255, 255, 255));
        View.setForeground(new java.awt.Color(255, 255, 255));
        View.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View_40px.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("View");

        javax.swing.GroupLayout ViewLayout = new javax.swing.GroupLayout(View);
        View.setLayout(ViewLayout);
        ViewLayout.setHorizontalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        ViewLayout.setVerticalGroup(
            ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewLayout.createSequentialGroup()
                .addGroup(ViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ViewLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, -1));

        Attendance.setBackground(new java.awt.Color(255, 255, 255));
        Attendance.setForeground(new java.awt.Color(255, 255, 255));
        Attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AttendanceMousePressed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Attendance_40px.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Attendance");

        javax.swing.GroupLayout AttendanceLayout = new javax.swing.GroupLayout(Attendance);
        Attendance.setLayout(AttendanceLayout);
        AttendanceLayout.setHorizontalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        AttendanceLayout.setVerticalGroup(
            AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendanceLayout.createSequentialGroup()
                .addGroup(AttendanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AttendanceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AttendanceLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, -1));

        Modify.setBackground(new java.awt.Color(255, 255, 255));
        Modify.setForeground(new java.awt.Color(255, 255, 255));
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ModifyMouseReleased(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update_40px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Modify");

        javax.swing.GroupLayout ModifyLayout = new javax.swing.GroupLayout(Modify);
        Modify.setLayout(ModifyLayout);
        ModifyLayout.setHorizontalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        ModifyLayout.setVerticalGroup(
            ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModifyLayout.createSequentialGroup()
                .addGroup(ModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ModifyLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(Modify, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        Profile.setBackground(new java.awt.Color(153, 255, 51));
        Profile.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male User_40px_2.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Profile");

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ProfileLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BG.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 440));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("Date of Birth:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("Intake2:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("User ID:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setText("Nationality:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel22.setText("Religion:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel23.setText("Race:");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel24.setText("Staff Email:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel25.setText("Mobile Phone:");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel26.setText("Address:");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        idfield.setEditable(false);
        jPanel3.add(idfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 182, -1));

        sexfield.setEditable(false);
        jPanel3.add(sexfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 182, -1));

        religionfield.setEditable(false);
        jPanel3.add(religionfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 182, -1));

        dobfield.setEditable(false);
        jPanel3.add(dobfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 182, -1));

        racefield.setEditable(false);
        jPanel3.add(racefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 182, -1));

        nationfield.setEditable(false);
        jPanel3.add(nationfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 182, -1));

        emailfield.setEditable(false);
        jPanel3.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 182, -1));

        phonefield.setEditable(false);
        jPanel3.add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 182, -1));

        addfield.setEditable(false);
        jPanel3.add(addfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 320, 74));

        firstnamefield.setEditable(false);
        jPanel3.add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 182, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel27.setText("Last name:");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        lastnamefield.setEditable(false);
        jPanel3.add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 182, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel28.setText("Sex:");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        subjectfield.setEditable(false);
        jPanel3.add(subjectfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 180, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel29.setText("First name:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        intake2.setEditable(false);
        jPanel3.add(intake2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 180, -1));

        intake.setEditable(false);
        jPanel3.add(intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 180, -1));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel30.setText("Subject:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel31.setText("Intake:");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        BG.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 680, 530));

        jPanel2.setBackground(new java.awt.Color(0, 102, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Userlabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Userlabel.setForeground(new java.awt.Color(255, 255, 255));
        Userlabel.setText("User");
        jPanel2.add(Userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 132, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home_40px.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, -1, 41));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome,");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("XYZ University");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 20, -1, -1));

        Exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel_24px_2.png"))); // NOI18N
        Exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitbuttonMousePressed(evt);
            }
        });
        jPanel2.add(Exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit Sign_30px_2.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 7, -1, -1));

        BG.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 210));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMousePressed
        // TODO add your handling code here:
        int closeprogram = JOptionPane.showConfirmDialog(null,"Do you want to exit system?","Exit",
                JOptionPane.YES_NO_OPTION);
        if (closeprogram == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_ExitbuttonMousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null,"Do you want to logout ID?","Logout",
            JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION)
        {
            Loginpage login = new Loginpage();
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel17MousePressed

    private void ViewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewMousePressed
        // TODO add your handling code here:
        LecturerView view = new LecturerView();
        view.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_ViewMousePressed

    private void AttendanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceMousePressed
        // TODO add your handling code here:
        LecturerAttendance attendance = new LecturerAttendance();
        attendance.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AttendanceMousePressed

    private void ModifyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseReleased
        // TODO add your handling code here:
        LecturerModify modify = new LecturerModify();
        modify.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ModifyMouseReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lecturerclass c = new lecturerclass();
        String ID = c.getUsername();
        /**Step 1: 
         * count how many lines.
         * Step 2:
         * Create the array and copy the elements in
         * This process will make data inside text file become array
        */
        int ctr = 0;
        try{
            Scanner sc1 = new Scanner(new File(ID+".txt"));
            while (sc1.hasNextLine()){
                ctr = ctr +1;
                sc1.next();
            }
            
            String[] words = new String[ctr];
            
            Scanner sc2 = new Scanner(new File(ID+".txt"));
            for (int i = 0; i < ctr; i++){
                words[i] = sc2.next();

                //it will get the information from array and show it on textfield
                firstnamefield.setText(words[0]);
                lastnamefield.setText(words[1]);
                idfield.setText(words[2]);
                sexfield.setText(words[3]);
                dobfield.setText(words[4]);
                nationfield.setText(words[5]);
                religionfield.setText(words[6]);
                racefield.setText(words[7]);
                emailfield.setText(words[8]);
                phonefield.setText(words[9]);
                addfield.setText(words[10]);
                subjectfield.setText(words[11]);
                intake.setText(words[12]);
                intake2.setText(words[13]);
            }
            
        } 
        catch(FileNotFoundException e){
            
        }
        
        //it will set the user name and show it on the main page
        //first name and last name will combine together through user class
        lecturerclass u = new lecturerclass();
        u.getFirst(firstnamefield.getText());
        u.getLast(lastnamefield.getText());
        String full = u.full();
        Userlabel.setText(full);
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LecturerMain().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendance;
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Exitbutton;
    private javax.swing.JPanel Modify;
    private javax.swing.JPanel Profile;
    private javax.swing.JLabel Userlabel;
    private javax.swing.JPanel View;
    private javax.swing.JTextField addfield;
    private javax.swing.JTextField dobfield;
    private javax.swing.JTextField emailfield;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JTextField idfield;
    private javax.swing.JTextField intake;
    private javax.swing.JTextField intake2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JTextField nationfield;
    private javax.swing.JTextField phonefield;
    private javax.swing.JTextField racefield;
    private javax.swing.JTextField religionfield;
    private javax.swing.JTextField sexfield;
    private javax.swing.JTextField subjectfield;
    // End of variables declaration//GEN-END:variables
}