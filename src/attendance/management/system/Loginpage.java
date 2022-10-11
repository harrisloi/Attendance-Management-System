package attendance.management.system;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Loginpage extends javax.swing.JFrame {
    int user = 1;

    public Loginpage() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        studentbutton = new javax.swing.JButton();
        adminbutton = new javax.swing.JButton();
        lecturerbutton = new javax.swing.JButton();
        Exitbutton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        loginerror = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        IDinput = new javax.swing.JTextField();
        passinput = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1037, 573));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_university-of-delaware-online-masters-nursing-degree1.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 580));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentbutton.setBackground(new java.awt.Color(102, 0, 102));
        studentbutton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        studentbutton.setForeground(new java.awt.Color(255, 255, 255));
        studentbutton.setText("Student");
        studentbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        studentbutton.setFocusPainted(false);
        studentbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentbuttonMouseClicked(evt);
            }
        });
        jPanel3.add(studentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, 40));

        adminbutton.setBackground(new java.awt.Color(51, 0, 51));
        adminbutton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        adminbutton.setForeground(new java.awt.Color(255, 255, 255));
        adminbutton.setText("Admin");
        adminbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminbutton.setFocusPainted(false);
        adminbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminbuttonMouseClicked(evt);
            }
        });
        jPanel3.add(adminbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 40));

        lecturerbutton.setBackground(new java.awt.Color(102, 0, 102));
        lecturerbutton.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lecturerbutton.setForeground(new java.awt.Color(255, 255, 255));
        lecturerbutton.setText("Lecturer");
        lecturerbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lecturerbutton.setFocusPainted(false);
        lecturerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerbuttonMouseClicked(evt);
            }
        });
        jPanel3.add(lecturerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 100, 40));

        Exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel_24px_1.png"))); // NOI18N
        Exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitbuttonMousePressed(evt);
            }
        });
        jPanel3.add(Exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 500, 120));

        jPanel4.setBackground(new java.awt.Color(102, 0, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginerror.setBackground(new java.awt.Color(255, 255, 255));
        loginerror.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginerror.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(loginerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 250, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 510, 120));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 160, 40));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 27)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 160, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 340, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 340, 20));

        IDinput.setBackground(new java.awt.Color(51, 0, 51));
        IDinput.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        IDinput.setForeground(new java.awt.Color(255, 255, 255));
        IDinput.setText("Enter your ID");
        IDinput.setBorder(null);
        IDinput.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        IDinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDinputMouseClicked(evt);
            }
        });
        IDinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDinputActionPerformed(evt);
            }
        });
        jPanel1.add(IDinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 340, 30));

        passinput.setBackground(new java.awt.Color(51, 0, 51));
        passinput.setForeground(new java.awt.Color(255, 255, 255));
        passinput.setText("jPasswordField1");
        passinput.setBorder(null);
        passinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passinputMouseClicked(evt);
            }
        });
        passinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passinputActionPerformed(evt);
            }
        });
        jPanel1.add(passinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 340, 30));

        loginbutton.setBackground(new java.awt.Color(102, 0, 102));
        loginbutton.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        loginbutton.setForeground(new java.awt.Color(255, 255, 255));
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(loginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 110, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 510, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        String record, name, pass;
        User u = new User();
        name = IDinput.getText();
        pass = passinput.getText();
        //Inside the class it will combine user ID 
        //and password then match with text file
        u.User(name, pass);
        String combine = u.Userlogin();

        
        switch (user) {
            case 1:
                try{
                    //it will connect to text file and search whether this ID exists or not
                    BufferedReader br = new BufferedReader( new FileReader("adminlogin.txt") );
                    while( ( record = br.readLine() ) != null ){
                        if( record.contains(combine) ){
                            JOptionPane.showMessageDialog(null,"Login Successfully","Login",JOptionPane.INFORMATION_MESSAGE);
                            Admin profile = new Admin();
                            profile.setVisible(true);
                            this.setVisible(false);
                            
                        }
                        
                        else{
                            loginerror.setText("Invalid ID or Password!");
                        }
                        
                    }
                    br.close();                    
                }
                catch (IOException e){
                    JOptionPane.showMessageDialog(null,"Error","Logout",JOptionPane.INFORMATION_MESSAGE);
                }   break;
            case 2:
                try{
                    BufferedReader br = new BufferedReader( new FileReader("lecturerlogin.txt") );
                    while( ( record = br.readLine() ) != null ){
                        if( record.contains(combine) ){
                            JOptionPane.showMessageDialog(null,"Login Successfully","Login",JOptionPane.INFORMATION_MESSAGE);
                            LecturerMain profile = new LecturerMain();
                            profile.setVisible(true);
                            this.setVisible(false);
                            br.close();
                        }
                        
                        else{
                            loginerror.setText("Invalid ID or Password!");
                        }
                        
                    }
                }
                catch (IOException e){
                    
                }   break;
                
            default:
                try{
                    BufferedReader br = new BufferedReader( new FileReader("studentlogin.txt") );
                    while( ( record = br.readLine() ) != null ){
                        if( record.contains(combine) ){
                            JOptionPane.showMessageDialog(null,"Login Successfully","Login",JOptionPane.INFORMATION_MESSAGE);
                            StudentMain profile = new StudentMain();
                            profile.setVisible(true);
                            this.setVisible(false);
                            br.close();
                        }
                        
                        else{
                            loginerror.setText("Invalid ID or Password!");
                        }
                        
                    }
                }
                catch (IOException e){
                    
                }   break;
        }    
    
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void IDinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDinputMouseClicked
        IDinput.setText("");
    }//GEN-LAST:event_IDinputMouseClicked

    private void IDinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDinputActionPerformed

    private void passinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passinputMouseClicked
        passinput.setText("");
    }//GEN-LAST:event_passinputMouseClicked

    private void lecturerbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerbuttonMouseClicked
        adminbutton.setBackground(new Color(102,0,102));
        studentbutton.setBackground(new Color(102,0,102));
        lecturerbutton.setBackground(new Color(51,0,51));
        user = 2;
        loginerror.setText("");
    }//GEN-LAST:event_lecturerbuttonMouseClicked

    private void adminbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminbuttonMouseClicked
        adminbutton.setBackground(new Color(51,0,51));
        studentbutton.setBackground(new Color(102,0,102));
        lecturerbutton.setBackground(new Color(102,0,102));
        user = 1;
        loginerror.setText("");        
    }//GEN-LAST:event_adminbuttonMouseClicked

    private void studentbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentbuttonMouseClicked
        adminbutton.setBackground(new Color(102,0,102));
        studentbutton.setBackground(new Color(51,0,51));
        lecturerbutton.setBackground(new Color(102,0,102));
        user = 3;
    }//GEN-LAST:event_studentbuttonMouseClicked

    private void ExitbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitbuttonMousePressed

    private void passinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passinputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passinputActionPerformed

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
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exitbutton;
    private javax.swing.JTextField IDinput;
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton lecturerbutton;
    private javax.swing.JButton loginbutton;
    private javax.swing.JLabel loginerror;
    private javax.swing.JPasswordField passinput;
    private javax.swing.JButton studentbutton;
    // End of variables declaration//GEN-END:variables
}
