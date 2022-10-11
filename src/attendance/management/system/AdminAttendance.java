package attendance.management.system;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AdminAttendance extends javax.swing.JFrame {
    Vector data;

    
    public AdminAttendance() {
        initComponents();
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,200));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(85,65,153));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Sidepane = new javax.swing.JPanel();
        Registerbutton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Profilebutton = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Viewbutton = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Searchbutton = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Motifybutton = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Namelabel = new javax.swing.JLabel();
        Attendancebutton = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Exitbutton = new javax.swing.JLabel();
        Findbutton = new javax.swing.JButton();
        IDinput = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        attendancecombo = new javax.swing.JComboBox<>();
        years = new javax.swing.JComboBox<>();
        months = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendancetable = new javax.swing.JTable();
        days = new javax.swing.JComboBox<>();
        savebutton = new javax.swing.JButton();
        intake = new javax.swing.JComboBox<>();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BG.setEnabled(false);
        BG.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BGMouseMoved(evt);
            }
        });
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Sidepane.setBackground(new java.awt.Color(51, 0, 102));
        Sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registerbutton.setBackground(new java.awt.Color(85, 65, 153));
        Registerbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                RegisterbuttonMouseMoved(evt);
            }
        });
        Registerbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterbuttonMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add User Male_48px_1.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(240, 240, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Register");

        javax.swing.GroupLayout RegisterbuttonLayout = new javax.swing.GroupLayout(Registerbutton);
        Registerbutton.setLayout(RegisterbuttonLayout);
        RegisterbuttonLayout.setHorizontalGroup(
            RegisterbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterbuttonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RegisterbuttonLayout.setVerticalGroup(
            RegisterbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Sidepane.add(Registerbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 330, -1));

        Profilebutton.setBackground(new java.awt.Color(85, 65, 153));
        Profilebutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ProfilebuttonMouseMoved(evt);
            }
        });
        Profilebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProfilebuttonMousePressed(evt);
            }
        });
        Profilebutton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User_48px.png"))); // NOI18N
        Profilebutton.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 0, 61, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Profile");
        Profilebutton.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 0, 109, 60));

        Sidepane.add(Profilebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, -1));

        Viewbutton.setBackground(new java.awt.Color(85, 65, 153));
        Viewbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ViewbuttonMouseMoved(evt);
            }
        });
        Viewbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ViewbuttonMousePressed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View Details_48px.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("View");

        javax.swing.GroupLayout ViewbuttonLayout = new javax.swing.GroupLayout(Viewbutton);
        Viewbutton.setLayout(ViewbuttonLayout);
        ViewbuttonLayout.setHorizontalGroup(
            ViewbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewbuttonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ViewbuttonLayout.setVerticalGroup(
            ViewbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Sidepane.add(Viewbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 330, -1));

        Searchbutton.setBackground(new java.awt.Color(85, 65, 153));
        Searchbutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SearchbuttonMouseMoved(evt);
            }
        });
        Searchbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchbuttonMousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search_48px.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(240, 240, 153));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search & Delete");

        javax.swing.GroupLayout SearchbuttonLayout = new javax.swing.GroupLayout(Searchbutton);
        Searchbutton.setLayout(SearchbuttonLayout);
        SearchbuttonLayout.setHorizontalGroup(
            SearchbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchbuttonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addContainerGap())
        );
        SearchbuttonLayout.setVerticalGroup(
            SearchbuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Sidepane.add(Searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 330, -1));

        Motifybutton.setBackground(new java.awt.Color(85, 65, 153));
        Motifybutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MotifybuttonMouseMoved(evt);
            }
        });
        Motifybutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MotifybuttonMousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Change User_48px.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modify");

        javax.swing.GroupLayout MotifybuttonLayout = new javax.swing.GroupLayout(Motifybutton);
        Motifybutton.setLayout(MotifybuttonLayout);
        MotifybuttonLayout.setHorizontalGroup(
            MotifybuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MotifybuttonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        MotifybuttonLayout.setVerticalGroup(
            MotifybuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Sidepane.add(Motifybutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 330, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Male User_96px.png"))); // NOI18N
        Sidepane.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 90));

        Namelabel.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        Namelabel.setForeground(new java.awt.Color(255, 255, 255));
        Namelabel.setText("User");
        Sidepane.add(Namelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        Attendancebutton.setBackground(new java.awt.Color(85, 65, 200));
        Attendancebutton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                AttendancebuttonMouseMoved(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Classroom_48px.png"))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Attendance");

        javax.swing.GroupLayout AttendancebuttonLayout = new javax.swing.GroupLayout(Attendancebutton);
        Attendancebutton.setLayout(AttendancebuttonLayout);
        AttendancebuttonLayout.setHorizontalGroup(
            AttendancebuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AttendancebuttonLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        AttendancebuttonLayout.setVerticalGroup(
            AttendancebuttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Sidepane.add(Attendancebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 330, -1));

        BG.add(Sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 850));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Attendance List");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BG.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 600, 150));

        Exitbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel_24px_1.png"))); // NOI18N
        Exitbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ExitbuttonMousePressed(evt);
            }
        });
        BG.add(Exitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, -1, -1));

        Findbutton.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        Findbutton.setText("Enter");
        Findbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Findbutton.setFocusable(false);
        Findbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindbuttonActionPerformed(evt);
            }
        });
        BG.add(Findbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 90, 30));

        IDinput.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        IDinput.setText("Lecturer Name");
        IDinput.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        IDinput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IDinputMouseClicked(evt);
            }
        });
        BG.add(IDinput, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 210, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit Sign_30px.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        BG.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 7, -1, -1));

        attendancecombo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        attendancecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Absent with reason", "Late" }));
        BG.add(attendancecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, -1, -1));

        years.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        years.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951" }));
        BG.add(years, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 320, -1, 32));

        months.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        months.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        BG.add(months, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 90, 32));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Date");
        BG.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        attendancetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Student ID", "Subject", "Intake", "Course", "Attendance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attendancetable);
        if (attendancetable.getColumnModel().getColumnCount() > 0) {
            attendancetable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 600, 300));

        days.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        days.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        BG.add(days, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, 32));

        savebutton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        savebutton.setText("Save record");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        BG.add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 790, -1, -1));

        intake.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        intake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UC1F1605", "UC1F1705" }));
        BG.add(intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 138, 30));

        updatebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        BG.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 730, 100, 40));

        deletebutton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deletebutton.setText("Delete Previous record");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        BG.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 680, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BGMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BGMouseMoved
        // TODO add your handling code here:
        setColor(Attendancebutton);
        resetColor(Profilebutton);
        resetColor(Viewbutton);
        resetColor(Motifybutton);
        resetColor(Searchbutton);
        resetColor(Registerbutton);
    }//GEN-LAST:event_BGMouseMoved

    private void ViewbuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewbuttonMouseMoved
        // TODO add your handling code here:
        setColor(Viewbutton);
        resetColor(Profilebutton);
        resetColor(Searchbutton);
        resetColor(Motifybutton);
        resetColor(Registerbutton);
        resetColor(Attendancebutton);
    }//GEN-LAST:event_ViewbuttonMouseMoved

    private void SearchbuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchbuttonMouseMoved
        // TODO add your handling code here:
        setColor(Searchbutton);
        resetColor(Profilebutton);
        resetColor(Viewbutton);
        resetColor(Motifybutton);
        resetColor(Registerbutton);
        resetColor(Attendancebutton);
    }//GEN-LAST:event_SearchbuttonMouseMoved

    private void MotifybuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotifybuttonMouseMoved
        // TODO add your handling code here:
        setColor(Motifybutton);
        resetColor(Profilebutton);
        resetColor(Searchbutton);
        resetColor(Viewbutton);
        resetColor(Registerbutton);
        resetColor(Attendancebutton);
    }//GEN-LAST:event_MotifybuttonMouseMoved

    private void RegisterbuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterbuttonMouseMoved
        // TODO add your handling code here:
        setColor(Registerbutton);
        resetColor(Profilebutton);
        resetColor(Searchbutton);
        resetColor(Motifybutton);
        resetColor(Viewbutton);
        resetColor(Attendancebutton);
    }//GEN-LAST:event_RegisterbuttonMouseMoved

    private void AttendancebuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendancebuttonMouseMoved
        // TODO add your handling code here:
        setColor(Attendancebutton);
        resetColor(Profilebutton);
        resetColor(Searchbutton);
        resetColor(Motifybutton);
        resetColor(Viewbutton);
        resetColor(Registerbutton);
    }//GEN-LAST:event_AttendancebuttonMouseMoved

    private void ProfilebuttonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfilebuttonMouseMoved
        // TODO add your handling code here:
        setColor(Profilebutton);
        resetColor(Attendancebutton);
        resetColor(Searchbutton);
        resetColor(Motifybutton);
        resetColor(Viewbutton);
        resetColor(Registerbutton);
    }//GEN-LAST:event_ProfilebuttonMouseMoved

    private void ProfilebuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfilebuttonMousePressed
        // TODO add your handling code here:
        Admin profile = new Admin();
        profile.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfilebuttonMousePressed

    private void ExitbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitbuttonMousePressed
        // TODO add your handling code here:
        int closeprogram = JOptionPane.showConfirmDialog(null,"Do you want to exit system?","Exit",
                JOptionPane.YES_NO_OPTION);
        if (closeprogram == JOptionPane.YES_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_ExitbuttonMousePressed

    private void ViewbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewbuttonMousePressed
        // TODO add your handling code here:
        AdminView view = new AdminView();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewbuttonMousePressed

    private void IDinputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IDinputMouseClicked
        IDinput.setText("");
    }//GEN-LAST:event_IDinputMouseClicked

    private void SearchbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchbuttonMousePressed
        // TODO add your handling code here:
        AdminSearch search = new AdminSearch();
        search.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SearchbuttonMousePressed

    private void MotifybuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MotifybuttonMousePressed
        // TODO add your handling code here:
        AdminMotify motify = new AdminMotify();
        motify.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_MotifybuttonMousePressed

    private void RegisterbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterbuttonMousePressed
        // TODO add your handling code here:
        AdminRegister delete = new AdminRegister();
        delete.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegisterbuttonMousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        int logout = JOptionPane.showConfirmDialog(null,"Do you want to logout ID?","Logout",
                JOptionPane.YES_NO_OPTION);
        if (logout == JOptionPane.YES_OPTION)
        {
        Loginpage login = new Loginpage();
        login.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_jLabel14MousePressed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        adminclass admin = new adminclass();
        String date = admin.DOB();
        String intake = admin.getIntake();
        
        
        // i = the index of the selected row
        int i = attendancetable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)attendancetable.getModel();

        if(i >= 0)
        {
            model.setValueAt(attendancecombo.getSelectedItem().toString(), i, 5);
        }
        else{
            JOptionPane.showMessageDialog(null,"Update Error!","Update",JOptionPane.INFORMATION_MESSAGE);
        }

        //write the attendance to specific student addtendance file
        String student = model.getValueAt(i, 0).toString();
        try{
            FileWriter fw = new FileWriter(student+intake+"attendance.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(attendancetable.getModel().getValueAt(i, 0)+"|");
            bw.write(attendancetable.getModel().getValueAt(i, 2)+"|");
            bw.write(date+"|");
            bw.write(attendancetable.getModel().getValueAt(i, 5)+"|");
            bw.write("\n");

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null,"Saved!","Attendance",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_updatebuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        //Using class to get the attandance code
        adminclass admin = new adminclass();
        String attendance = admin.attendance();
        
        //Save the record to textfile
        try{
            FileWriter fw = new FileWriter(attendance+".txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < attendancetable.getRowCount(); i++){
                for(int j = 0; j < attendancetable.getColumnCount(); j++){
                    bw.write(attendancetable.getModel().getValueAt(i, j)+"|");
                }
                bw.write("\n");
            }

            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null,"Saved!","Attendance",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Record does not Save!");
        }
    }//GEN-LAST:event_savebuttonActionPerformed

    private void FindbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindbuttonActionPerformed
        //Using class to set the attandance code
        adminclass admin = new adminclass();
        admin.getID(IDinput.getText());
        //get set method setIntake
        admin.setIntake(intake.getSelectedItem().toString());
        admin.getDay(days.getSelectedItem().toString());
        admin.getMonth(months.getSelectedItem().toString());
        admin.getYear(years.getSelectedItem().toString());
        String attendance = admin.attendance();
        
        String line = null;
        DefaultTableModel dtm = (DefaultTableModel) attendancetable.getModel();

        try {
            BufferedReader br = new BufferedReader(new FileReader(attendance+".txt"));

            while ((line = br.readLine()) != null) {
                data = new Vector();// this is important
                StringTokenizer st1 = new StringTokenizer(line, "|");
                while (st1.hasMoreTokens()) {
                    String nextToken = st1.nextToken();
                    data.add(nextToken);
                    System.out.println(nextToken);

                }
                dtm.addRow(data);//add here 
            }

            br.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Record not found!");
        }
    }//GEN-LAST:event_FindbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
            adminclass admin = new adminclass();
            String date = admin.DOB();
            //get set method getIntake
            String intake = admin.getIntake();
            
            //find the record of student previous attendance
            int i = attendancetable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)attendancetable.getModel();
            String student = model.getValueAt(i, 0).toString();
            String subject = model.getValueAt(i, 2).toString();
            String time = date;
            String att = model.getValueAt(i, 5).toString();
            String record = student+"|"+subject+"|"+time+"|"+att+"|";

            //delete previous record in student attendance file
            try{
            File inputFile = new File(student+intake+"attendance.txt");
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String lineToRemove = record;
            String currentLine;

            while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
            }
            writer.close(); 
            reader.close(); 
            inputFile.delete();
            tempFile.renameTo(inputFile);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error!");
            }
            
            JOptionPane.showMessageDialog(null, "Previous record has been deleted!");
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        adminclass a = new adminclass();
        String name = a.full();
        Namelabel.setText(name);
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
            java.util.logging.Logger.getLogger(AdminAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Attendancebutton;
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Exitbutton;
    private javax.swing.JButton Findbutton;
    private javax.swing.JTextField IDinput;
    private javax.swing.JPanel Motifybutton;
    private javax.swing.JLabel Namelabel;
    private javax.swing.JPanel Profilebutton;
    private javax.swing.JPanel Registerbutton;
    private javax.swing.JPanel Searchbutton;
    private javax.swing.JPanel Sidepane;
    private javax.swing.JPanel Viewbutton;
    private javax.swing.JComboBox<String> attendancecombo;
    private javax.swing.JTable attendancetable;
    private javax.swing.JComboBox<String> days;
    private javax.swing.JButton deletebutton;
    private javax.swing.JComboBox<String> intake;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> months;
    private javax.swing.JButton savebutton;
    private javax.swing.JButton updatebutton;
    private javax.swing.JComboBox<String> years;
    // End of variables declaration//GEN-END:variables
}
