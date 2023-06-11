
import api.requests.BarangRequest;
import api.requests.NotesRequest;
import api.requests.SchedullingRequest;
import app.helpers.SessionHelper;
import app.models.Barang;
import app.models.Notes;
import app.models.Schedulling;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
public class Schedule extends javax.swing.JFrame {
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
     * Creates new form schedule
     */
    public Schedule() {
        initComponents();
        
        service = new SchedullingImplement();
        
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
        schedule = new javax.swing.JLabel();
        notes = new javax.swing.JLabel();
        myProfile = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSchedule = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailSchedule = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        tanggal = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        mode = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(34, 41, 50));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));

        dashboard.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");
        dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        addProducts.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addProducts.setForeground(new java.awt.Color(255, 255, 255));
        addProducts.setText("Add Products");
        addProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProductsMouseClicked(evt);
            }
        });

        orders.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orders.setForeground(new java.awt.Color(255, 255, 255));
        orders.setText("Orders");
        orders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersMouseClicked(evt);
            }
        });

        schedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        schedule.setForeground(new java.awt.Color(255, 255, 255));
        schedule.setText("Schedule");
        schedule.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        notes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        notes.setForeground(new java.awt.Color(255, 255, 255));
        notes.setText("Notes");
        notes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesMouseClicked(evt);
            }
        });

        myProfile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myProfile.setForeground(new java.awt.Color(255, 255, 255));
        myProfile.setText("My Profile");
        myProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        myProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myProfileMouseClicked(evt);
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
                            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orders)
                            .addComponent(schedule)
                            .addComponent(notes)
                            .addComponent(myProfile)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton25)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(orders)
                .addGap(38, 38, 38)
                .addComponent(schedule)
                .addGap(44, 44, 44)
                .addComponent(notes)
                .addGap(43, 43, 43)
                .addComponent(myProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(22, 22, 22))
        );

        jPanel1.setBackground(new java.awt.Color(233, 235, 242));

        tableSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Judul", "Detail Schedule", "Tanggal", "Mode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableSchedule);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(233, 235, 242));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Judul                 :");

        judul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Detail Schedule  :");

        detailSchedule.setColumns(20);
        detailSchedule.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        detailSchedule.setRows(5);
        jScrollPane2.setViewportView(detailSchedule);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal            :");

        tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Mode                :");

        mode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(71, 141, 241));
        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        btnUpdate.setBackground(new java.awt.Color(71, 141, 241));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(71, 141, 241));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reset");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnDelete.setBackground(new java.awt.Color(71, 141, 241));
        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(judul))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(btnDelete))
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalActionPerformed

    private void judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulActionPerformed

    private void notesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesMouseClicked
        // TODO add your handling code here:
        noteFrame = new AddNotes();
        noteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        noteFrame.setVisible(true);
        
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_notesMouseClicked

    private void myProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileMouseClicked
        // TODO add your handling code here:
        profileFrame = new Profil();
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profileFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_myProfileMouseClicked

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

    private void ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersMouseClicked
        // TODO add your handling code here:
        ordersFrame = new Orders();
        ordersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ordersFrame.setVisible(true);
    
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_ordersMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        SchedullingRequest request = new SchedullingRequest();
        request.setJudul(judul.getText());
        request.setIsiSchedule(detailSchedule.getText());
        request.setTanggal(detailSchedule.getText());
        request.setMode(mode.getText());
        request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
        
        Schedulling barang = service.store(request);
        
        if(barang != null) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
            refreshTable();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        try {
            Schedulling schedulling = service.update((SchedullingRequest) updateSchedulling);
            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate");
            e.printStackTrace();       }
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            boolean status = service.delete(updateSchedulling.getId());
            if(status) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                refreshTable();
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            e.printStackTrace();       }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    public final void setTable() {
        tableModel = new DefaultTableModel(
                new Object[]{"Judul", "Isi Catatan", "Tanggal Dibuat"},
                0
        );
        
        SchedullingRequest request = new SchedullingRequest();
        
        listSchedulling = service.getList(request);
        
        for(Schedulling schedulling : listSchedulling) {
            Object[] rowData = {
                    schedulling.getJudul(),
                    schedulling.getIsiSchedule(),
                    schedulling.getTanggal(),
                    schedulling.getMode()
            };
            tableModel.addRow(rowData);
        }
        
        tableSchedule = new JTable(tableModel);
        
        tableSchedule.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tableSchedule.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = tableSchedule.getSelectedRow();
                if (selectedRow != -1) {
                    // Handle row selection here
                    Schedulling selectedNotes = listSchedulling[selectedRow];
                    updateSchedulling = selectedNotes;
                    setData();
                }
            }
        });
    }
    
    public void refreshTable() {
        // Clear the existing table model
        tableModel.setRowCount(0);
        
        SchedullingRequest request = new SchedullingRequest();
        
        listSchedulling = service.getList(request);

        for(Schedulling schedulling : listSchedulling) {
            Object[] rowData = {
                    schedulling.getJudul(),
                    schedulling.getIsiSchedule(),
                    schedulling.getTanggal(),
                    schedulling.getMode()
            };
            tableModel.addRow(rowData);
        }
        
        tableModel.fireTableDataChanged();
    }
    
    public void setData() {
        judul.setText(updateSchedulling.getJudul());
        detailSchedule.setText(updateSchedulling.getIsiSchedule());
        tanggal.setText(updateSchedulling.getTanggal());
        mode.setText(updateSchedulling.getMode());
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addProducts;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel dashboard;
    private javax.swing.JTextArea detailSchedule;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField mode;
    private javax.swing.JLabel myProfile;
    private javax.swing.JLabel notes;
    private javax.swing.JLabel orders;
    private javax.swing.JLabel schedule;
    private javax.swing.JTable tableSchedule;
    private javax.swing.JFormattedTextField tanggal;
    // End of variables declaration//GEN-END:variables
}
