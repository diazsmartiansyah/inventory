
import app.models.Schedulling;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import resource.implement.SchedullingImplement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author AkbarAbe
 */
public class addProduct extends javax.swing.JFrame {
    private Dashboard dashboardFrame;
    private addProduct addProductFrame;
    private Orders ordersFrame;
    private Schedule scheduleFrame;
    private AddNotes noteFrame;
    private Profil profileFrame;
    private SchedullingImplement service;
    private DefaultTableModel tableModel;
    private Schedulling[] listSchedulling;
    private Schedulling updateSchedulling;
    /**
     * Creates new form addProducts
     */
    public addProduct() {
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

        jPanel25 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        dashboardPage = new javax.swing.JLabel();
        productPage = new javax.swing.JLabel();
        ordersPage = new javax.swing.JLabel();
        schedulePage = new javax.swing.JLabel();
        notesPage = new javax.swing.JLabel();
        profilePage = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton26 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jSpinner5 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel25.setBackground(new java.awt.Color(233, 235, 242));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Type", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6))
        );

        jPanel17.setBackground(new java.awt.Color(34, 41, 50));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        dashboardPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dashboardPage.setForeground(new java.awt.Color(255, 255, 255));
        dashboardPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/dashboard-line_pth.png"))); // NOI18N
        dashboardPage.setText("Dashboard");
        dashboardPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardPageMouseClicked(evt);
            }
        });

        productPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productPage.setForeground(new java.awt.Color(71, 141, 241));
        productPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPage.setIcon(new javax.swing.ImageIcon("C:\\Users\\andhi\\Downloads\\Compressed\\add-box-line (1).png")); // NOI18N
        productPage.setText("Add Products");
        productPage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 141, 241)));
        productPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productPageMouseClicked(evt);
            }
        });

        ordersPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ordersPage.setForeground(new java.awt.Color(255, 255, 255));
        ordersPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/file-list-3-line_pth.png"))); // NOI18N
        ordersPage.setText("Log Transaksi");
        ordersPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersPageMouseClicked(evt);
            }
        });

        schedulePage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        schedulePage.setForeground(new java.awt.Color(255, 255, 255));
        schedulePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/calendar-line.png"))); // NOI18N
        schedulePage.setText("Schedule");
        schedulePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedulePageMouseClicked(evt);
            }
        });

        notesPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        notesPage.setForeground(new java.awt.Color(255, 255, 255));
        notesPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/file-line.png"))); // NOI18N
        notesPage.setText("Notes");
        notesPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesPageMouseClicked(evt);
            }
        });

        profilePage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profilePage.setForeground(new java.awt.Color(255, 255, 255));
        profilePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/user-line-pth.png"))); // NOI18N
        profilePage.setText("My Profile");
        profilePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilePageMouseClicked(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(71, 141, 241));
        jButton25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Sign Out");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jButton25))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ordersPage)
                                    .addComponent(schedulePage)
                                    .addComponent(notesPage)
                                    .addComponent(profilePage)
                                    .addComponent(dashboardPage))))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(dashboardPage, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(productPage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ordersPage)
                .addGap(38, 38, 38)
                .addComponent(schedulePage)
                .addGap(44, 44, 44)
                .addComponent(notesPage)
                .addGap(43, 43, 43)
                .addComponent(profilePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(20, 20, 20))
        );

        jPanel24.setBackground(new java.awt.Color(233, 235, 242));

        jPanel23.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton26.setText("Import");

        jLabel51.setText("Product ID           :");

        jLabel52.setText("Product Name    :");

        jLabel53.setText("Product Type      :");

        jLabel54.setText("Price                     :");

        jLabel55.setText("Quantity              :");

        jButton27.setBackground(new java.awt.Color(71, 141, 241));
        jButton27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Add");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(71, 141, 241));
        jButton28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Update");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(71, 141, 241));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Clear");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(71, 141, 241));
        jButton30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("Delete");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField18)
                            .addComponent(jTextField19)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner5))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField20))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(0, 19, Short.MAX_VALUE)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton26)
                .addGap(32, 32, 32)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(jButton30))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1218, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardPageMouseClicked
        // TODO add your handling code here:
        String clickedLabel = dashboardPage.getText();

        if (clickedLabel.equals("Dashboard")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
        } else if (clickedLabel.equals("Add Products")) {
            addProduct addProductFrame = new addProduct();
            addProductFrame.setVisible(true);
        } else if (clickedLabel.equals("Orders")) {
            Orders OrdersFrame = new Orders();
            OrdersFrame.setVisible(true);
        } else if (clickedLabel.equals("Schedule")) {
            Schedule ScheduleFrame = new Schedule();
            ScheduleFrame.setVisible(true);
        } else if (clickedLabel.equals("Notes")) {
            AddNotes noteFrame = new AddNotes();
            noteFrame.setVisible(true);
        } else if (clickedLabel.equals("My Profile")) {
            Profil profileFrame = new Profil();
            profileFrame.setVisible(true);
        }

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_dashboardPageMouseClicked

    private void productPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPageMouseClicked
        // TODO add your handling code here:
        String clickedLabel = productPage.getText();

        if (clickedLabel.equals("Dashboard")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
        } else if (clickedLabel.equals("Add Products")) {
            addProduct addProductFrame = new addProduct();
            addProductFrame.setVisible(true);
        } else if (clickedLabel.equals("Orders")) {
            Orders OrdersFrame = new Orders();
            OrdersFrame.setVisible(true);
        } else if (clickedLabel.equals("Schedule")) {
            Schedule ScheduleFrame = new Schedule();
            ScheduleFrame.setVisible(true);
        } else if (clickedLabel.equals("Notes")) {
            AddNotes noteFrame = new AddNotes();
            noteFrame.setVisible(true);
        } else if (clickedLabel.equals("My Profile")) {
            Profil profileFrame = new Profil();
            profileFrame.setVisible(true);
        }

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_productPageMouseClicked

    private void schedulePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedulePageMouseClicked
        // TODO add your handling code here:
        String clickedLabel = schedulePage.getText();

        if (clickedLabel.equals("Dashboard")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
        } else if (clickedLabel.equals("Add Products")) {
            addProduct addProductFrame = new addProduct();
            addProductFrame.setVisible(true);
        } else if (clickedLabel.equals("Orders")) {
            Orders OrdersFrame = new Orders();
            OrdersFrame.setVisible(true);
        } else if (clickedLabel.equals("Schedule")) {
            Schedule ScheduleFrame = new Schedule();
            ScheduleFrame.setVisible(true);
        } else if (clickedLabel.equals("Notes")) {
            AddNotes noteFrame = new AddNotes();
            noteFrame.setVisible(true);
        } else if (clickedLabel.equals("My Profile")) {
            Profil profileFrame = new Profil();
            profileFrame.setVisible(true);
        }

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_schedulePageMouseClicked

    private void notesPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesPageMouseClicked
        // TODO add your handling code here:
        String clickedLabel = notesPage.getText();

        if (clickedLabel.equals("Dashboard")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
        } else if (clickedLabel.equals("Add Products")) {
            addProduct addProductFrame = new addProduct();
            addProductFrame.setVisible(true);
        } else if (clickedLabel.equals("Orders")) {
            Orders OrdersFrame = new Orders();
            OrdersFrame.setVisible(true);
        } else if (clickedLabel.equals("Schedule")) {
            Schedule ScheduleFrame = new Schedule();
            ScheduleFrame.setVisible(true);
        } else if (clickedLabel.equals("Notes")) {
            AddNotes noteFrame = new AddNotes();
            noteFrame.setVisible(true);
        } else if (clickedLabel.equals("My Profile")) {
            Profil profileFrame = new Profil();
            profileFrame.setVisible(true);
        }

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_notesPageMouseClicked

    private void profilePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePageMouseClicked
        // TODO add your handling code here:
        String clickedLabel = profilePage.getText();

        if (clickedLabel.equals("Dashboard")) {
            Dashboard dashboardFrame = new Dashboard();
            dashboardFrame.setVisible(true);
        } else if (clickedLabel.equals("Add Products")) {
            addProduct addProductFrame = new addProduct();
            addProductFrame.setVisible(true);
        } else if (clickedLabel.equals("Orders")) {
            Orders OrdersFrame = new Orders();
            OrdersFrame.setVisible(true);
        } else if (clickedLabel.equals("Schedule")) {
            Schedule ScheduleFrame = new Schedule();
            ScheduleFrame.setVisible(true);
        } else if (clickedLabel.equals("Notes")) {
            AddNotes noteFrame = new AddNotes();
            noteFrame.setVisible(true);
        } else if (clickedLabel.equals("My Profile")) {
            Profil profileFrame = new Profil();
            profileFrame.setVisible(true);
        }

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_profilePageMouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void ordersPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersPageMouseClicked
        // TODO add your handling code here:
        ordersFrame = new Orders();
        ordersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ordersFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_ordersPageMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardPage;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JLabel notesPage;
    private javax.swing.JLabel ordersPage;
    private javax.swing.JLabel productPage;
    private javax.swing.JLabel profilePage;
    private javax.swing.JLabel schedulePage;
    // End of variables declaration//GEN-END:variables
}
