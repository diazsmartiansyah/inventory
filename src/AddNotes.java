/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import api.requests.NotesRequest;
import app.helpers.SessionHelper;
import app.models.Notes;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import resource.implement.NotesImplement;

/**
 *
 * @author AkbarAbe
 */
public class AddNotes extends javax.swing.JFrame {
    private Dashboard dashboardFrame;
    private addProduct addProductFrame;
    private Orders ordersFrame;
    private Schedule scheduleFrame;
    private Profil profileFrame;
    private NotesImplement service;
    private DefaultTableModel tableModel;
    private Notes[] listNotes;
    private Notes updateNotes;
    private int selectedRow;
    
    /**
     * Creates new form notes
     */
    public AddNotes() {
        initComponents();
        
        service = new NotesImplement();
        
        setTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel17 = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        addProducts = new javax.swing.JLabel();
        orders = new javax.swing.JLabel();
        schdule = new javax.swing.JLabel();
        notes = new javax.swing.JLabel();
        myprofile = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableNotes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        catatan = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnUpdates = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1213, 650));

        jPanel17.setBackground(new java.awt.Color(34, 41, 50));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        dashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/dashboard-line_pth.png"))); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        addProducts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addProducts.setForeground(new java.awt.Color(255, 255, 255));
        addProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/add-box-line-pth.png"))); // NOI18N
        addProducts.setText("Add Products");
        addProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductsMouseClicked(evt);
            }
        });

        orders.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/file-list-3-line_pth.png"))); // NOI18N
        orders.setText("Log Transaksi");
        orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
        });

        schdule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        schdule.setForeground(new java.awt.Color(255, 255, 255));
        schdule.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/calendar-check-fill-pth.png"))); // NOI18N
        schdule.setText("Schedule");
        schdule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schdule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schduleMouseClicked(evt);
            }
        });

        notes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notes.setForeground(new java.awt.Color(71, 141, 241));
        notes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/sticky-note-line.png"))); // NOI18N
        notes.setText("Notes");
        notes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 141, 241)));
        notes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesMouseClicked(evt);
            }
        });

        myprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myprofile.setForeground(new java.awt.Color(255, 255, 255));
        myprofile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/user-line-pth.png"))); // NOI18N
        myprofile.setText("My Profile");
        myprofile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myprofile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myprofileMouseClicked(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(71, 141, 241));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                        .addGap(44, 44, 44)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProducts)
                            .addComponent(orders)
                            .addComponent(schdule)
                            .addComponent(myprofile)
                            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(notes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButton25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(orders)
                .addGap(38, 38, 38)
                .addComponent(schdule)
                .addGap(30, 30, 30)
                .addComponent(notes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(myprofile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(42, 42, 42))
        );

        jPanel3.setBackground(new java.awt.Color(233, 235, 242));

        tableNotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Judul", "Catatan", "Tanggal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableNotes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(233, 235, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Judul                 :");

        judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Catatan             :");

        catatan.setColumns(20);
        catatan.setRows(5);
        jScrollPane4.setViewportView(catatan);

        btnAdd.setBackground(new java.awt.Color(71, 141, 241));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdates.setBackground(new java.awt.Color(71, 141, 241));
        btnUpdates.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdates.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdates.setText("Update");
        btnUpdates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdatesMouseClicked(evt);
            }
        });
        btnUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatesActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(71, 141, 241));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(71, 141, 241));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judul))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(193, 193, 193)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdates))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Anda Yakin Ingin LogOut?","Perhatian", JOptionPane.YES_NO_OPTION);
        if (option == 0){
            Login A = new Login();
            A.setVisible(true);
            this.setVisible(false);
        } else {
            
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatesActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void myprofileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myprofileMouseClicked
        // TODO add your handling code here:
        profileFrame = new Profil();
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profileFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_myprofileMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        dashboardFrame = new Dashboard();
        dashboardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dashboardFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_dashboardMouseClicked

    private void addProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProductsMouseClicked
        // TODO add your handling code here:
        addProductFrame = new addProduct();
        addProductFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addProductFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_addProductsMouseClicked

    private void schduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schduleMouseClicked
        // TODO add your handling code here:
        scheduleFrame = new Schedule();
        scheduleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        scheduleFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_schduleMouseClicked

    private void notesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesMouseClicked
        // TODO add your handling code here:
        this.setVisible(true);
    }//GEN-LAST:event_notesMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);
        
        NotesRequest request = new NotesRequest();
        request.setJudul(judul.getText());
        request.setIsiCatatan(catatan.getText());
        request.setTanggalDibuat(formattedDate);
        request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
        
        Notes notes = service.store(request);
        
        if(notes != null) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
            refreshTable();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnUpdatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatesMouseClicked
        // TODO add your handling code here:
         try {
            NotesRequest request = new NotesRequest();
            request.setId(listNotes[selectedRow].getId());
            request.setJudul(judul.getText());
            request.setIsiCatatan(catatan.getText());
            request.setTanggalDibuat(listNotes[selectedRow].getTanggalDibuat());
            request.setPedagangId(listNotes[selectedRow].getPedagangId());
            
            Notes notes = service.update(request);
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate");
            e.printStackTrace();       }
    }//GEN-LAST:event_btnUpdatesMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        try {
            boolean status = service.delete(listNotes[selectedRow].getId());
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        // TODO add your handling code here:
        ordersFrame = new Orders();
        ordersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ordersFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_ordersMouseClicked

    public final void setTable() {
        tableModel = new DefaultTableModel(
                new Object[]{"Judul", "Isi Catatan", "Tanggal Dibuat"},
                0
        );
        
        NotesRequest request = new NotesRequest();
        
        listNotes = service.getList(request);
        
        System.out.println(listNotes);
        for(Notes notes : listNotes) {
            if(notes == null) {
                continue;
            }
            
            Object[] rowData = {
                    notes.getJudul(),
                    notes.getIsiCatatan(),
                    notes.getTanggalDibuat()
            };
            tableModel.addRow(rowData);
        }

        tableNotes.setModel(tableModel);
        
        tableNotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tableNotes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selected = tableNotes.getSelectedRow();
                if (selected != -1) {
                    // Handle row selection here
                    Notes selectedNotes = listNotes[selected];
                    updateNotes = selectedNotes;
                    selectedRow = selected;
                    setData();
                }
            }
        });
    }
    
    public void refreshTable() {
        // Clear the existing table model
        tableModel.setRowCount(0);
        
        NotesRequest request = new NotesRequest();
        
        listNotes = service.getList(request);
        
        for(Notes notes : listNotes) {
            if(notes == null) {
                continue;
            }
            
            Object[] rowData = {
                    notes.getJudul(),
                    notes.getIsiCatatan(),
                    notes.getTanggalDibuat()
            };
            System.out.println("Debug 3  : " + rowData);
            tableModel.addRow(rowData);
        }
        
        tableModel.fireTableDataChanged();
    }
    
    public void setData() {
        judul.setText(updateNotes.getJudul());
        catatan.setText(updateNotes.getIsiCatatan());
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNotes dashboard = new AddNotes();
                dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                dashboard.setSize(500, 500);
                dashboard.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addProducts;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdates;
    private javax.swing.JTextArea catatan;
    private javax.swing.JLabel dashboard;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField judul;
    private javax.swing.JLabel myprofile;
    private javax.swing.JLabel notes;
    private javax.swing.JLabel orders;
    private javax.swing.JLabel schdule;
    private javax.swing.JTable tableNotes;
    // End of variables declaration//GEN-END:variables
}
