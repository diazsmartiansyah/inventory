
import api.requests.BarangRequest;
import api.requests.NotesRequest;
import app.helpers.SessionHelper;
import app.models.Notes;
import app.models.Schedulling;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import resource.implement.SchedullingImplement;
import app.models.Barang;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import resource.implement.BarangImplement;
import javax.swing.JLabel;
import javax.swing.border.Border;
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
    private BarangImplement service;
    private DefaultTableModel tableModel;
    private Barang[] listProducts;
    private int selectedRow;
    private String fileBase64 = "";
    
    
    /**
     * Creates new form addProducts
     */
    public addProduct() {
        initComponents();
        
        service = new BarangImplement();
        
        Border border = BorderFactory.createLineBorder(new Color(71,141,241));
                
        foto.setBorder(border);
        foto.setHorizontalAlignment(JLabel.CENTER);
        foto.setVerticalAlignment(JLabel.CENTER);
        
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

        jPanel25 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        dashboardPage = new javax.swing.JLabel();
        productPage = new javax.swing.JLabel();
        ordersPage = new javax.swing.JLabel();
        schedulePage = new javax.swing.JLabel();
        notesPage = new javax.swing.JLabel();
        profilePage = new javax.swing.JLabel();
        jButton25 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        importBtn = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        kodeProduk = new javax.swing.JTextField();
        namaProduk = new javax.swing.JTextField();
        hargaProduk = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        stock = new javax.swing.JSpinner();
        kategori = new javax.swing.JComboBox<>();
        foto = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        deskripsi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel25.setBackground(new java.awt.Color(233, 235, 242));

        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tableProduk);

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
        dashboardPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboardPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardPageMouseClicked(evt);
            }
        });

        productPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productPage.setForeground(new java.awt.Color(71, 141, 241));
        productPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/add-box-line.png"))); // NOI18N
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
        ordersPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ordersPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersPageMouseClicked(evt);
            }
        });

        schedulePage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        schedulePage.setForeground(new java.awt.Color(255, 255, 255));
        schedulePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/calendar-check-fill-pth.png"))); // NOI18N
        schedulePage.setText("Schedule");
        schedulePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        schedulePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                schedulePageMouseClicked(evt);
            }
        });

        notesPage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        notesPage.setForeground(new java.awt.Color(255, 255, 255));
        notesPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/sticky-note-line-pth.png"))); // NOI18N
        notesPage.setText("Notes");
        notesPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        notesPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesPageMouseClicked(evt);
            }
        });

        profilePage.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        profilePage.setForeground(new java.awt.Color(255, 255, 255));
        profilePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/resources/icon/user-line-pth.png"))); // NOI18N
        profilePage.setText("My Profile");
        profilePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(productPage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ordersPage)
                .addGap(38, 38, 38)
                .addComponent(schedulePage)
                .addGap(44, 44, 44)
                .addComponent(notesPage)
                .addGap(43, 43, 43)
                .addComponent(profilePage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25)
                .addGap(20, 20, 20))
        );

        jPanel24.setBackground(new java.awt.Color(233, 235, 242));

        importBtn.setText("Import");
        importBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importBtnMouseClicked(evt);
            }
        });

        jLabel51.setText("Product Code     :");
        jLabel51.setToolTipText("");

        jLabel52.setText("Product Name    :");

        jLabel53.setText("Category            :");

        jLabel54.setText("Price                   :");
        jLabel54.setToolTipText("");

        jLabel55.setText("Stock                  :");

        addBtn.setBackground(new java.awt.Color(71, 141, 241));
        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(71, 141, 241));
        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBtnMouseClicked(evt);
            }
        });
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(71, 141, 241));
        jButton29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("Clear");
        jButton29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(71, 141, 241));
        hapusBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hapusBtn.setForeground(new java.awt.Color(255, 255, 255));
        hapusBtn.setText("Delete");
        hapusBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hapusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusBtnMouseClicked(evt);
            }
        });

        kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman" }));

        foto.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel56.setText("Deskripsi             :");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel53)
                                .addComponent(jLabel52)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kodeProduk)
                            .addComponent(namaProduk)
                            .addComponent(kategori, 0, 134, Short.MAX_VALUE)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel54)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55))
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaProduk)
                            .addComponent(stock))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(importBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29))
                .addGap(43, 43, 43)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(importBtn)
                .addGap(20, 20, 20)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(kodeProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(namaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(hargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton29)
                    .addComponent(hapusBtn))
                .addContainerGap())
        );

        jLabel54.getAccessibleContext().setAccessibleName("Price       :");

        deskripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deskripsiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(681, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addComponent(deskripsi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
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
        dashboardFrame = new Dashboard();
        dashboardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dashboardFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_dashboardPageMouseClicked

    private void productPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPageMouseClicked
        // TODO add your handling code here:
        addProductFrame = new addProduct();
        addProductFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addProductFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_productPageMouseClicked

    private void schedulePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schedulePageMouseClicked
        // TODO add your handling code here:
        scheduleFrame = new Schedule();
        scheduleFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        scheduleFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_schedulePageMouseClicked

    private void notesPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesPageMouseClicked
        // TODO add your handling code here:
        noteFrame = new AddNotes();
        noteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        noteFrame.setVisible(true);
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_notesPageMouseClicked

    private void profilePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilePageMouseClicked
        // TODO add your handling code here:
        profileFrame = new Profil();
        profileFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        profileFrame.setVisible(true);
        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_profilePageMouseClicked

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void ordersPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersPageMouseClicked
        // TODO add your handling code here:
        ordersFrame = new Orders();
        ordersFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ordersFrame.setVisible(true);

        // Menutup form dashboard
        this.setVisible(false);
    }//GEN-LAST:event_ordersPageMouseClicked

    private void hapusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusBtnMouseClicked
        // TODO add your handling code here:
        try {
            boolean status = service.delete(listProducts[selectedRow].getId());
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
            e.printStackTrace();
        }
    }//GEN-LAST:event_hapusBtnMouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtnActionPerformed

    private void updateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtnMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            BarangRequest request = new BarangRequest();

            request.setId(listProducts[selectedRow].getId());
            request.setKodeBarang(kodeProduk.getText());
            request.setNama(namaProduk.getText());
            request.setHarga(Double.parseDouble(hargaProduk.getText()));
            request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
            request.setStok(Integer.parseInt(stock.getValue().toString()));
            request.setSupplierId(-1);
            request.setKategori_id(kategori.getSelectedIndex() + 1);
            request.setKategori("-1");
            request.setDeskripsi(deskripsi.getText());
            
            if(!"".equals(fileBase64) ) {
                request.setFoto(fileBase64);
            } else {
                request.setFoto("-1");
            }

            Barang barang = service.update(request);

            JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data Gagal Diupdate");
            e.printStackTrace();       }
    }//GEN-LAST:event_updateBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        // TODO add your handling code here:

        BarangRequest request = new BarangRequest();
        request.setKodeBarang(kodeProduk.getText());
        request.setNama(namaProduk.getText());
        request.setHarga(Double.parseDouble(hargaProduk.getText()));
        request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
        request.setStok(Integer.parseInt(stock.getValue().toString()));
        request.setKategori_id(kategori.getSelectedIndex() + 1);
        request.setSupplierId(-1);
        request.setKategori("-1");
        request.setFoto(fileBase64);
        request.setDeskripsi(deskripsi.getText());

        Barang barang = service.store(request);

        if(barang != null) {
            JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
            refreshTable();
        }
    }//GEN-LAST:event_addBtnMouseClicked

    private void importBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importBtnMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();

        // Set the file filter to display only image files
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().toLowerCase().endsWith(".png")
                || file.getName().toLowerCase().endsWith(".jpg")
                || file.getName().toLowerCase().endsWith(".jpeg")
                || file.isDirectory();
            }

            @Override
            public String getDescription() {
                return "Image Files (*.png, *.jpg,  *.jpeg)";
            }
        });

        // Show the file chooser dialog
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Read the file content into a byte array
                byte[] fileContent = Files.readAllBytes(selectedFile.toPath());

                // Encode the byte array to a Base64 string
                String base64String = Base64.getEncoder().encodeToString(fileContent);

                fileBase64 = base64String;

            } catch (IOException ex) {
                ex.printStackTrace();
            }

            // Set the selected image file to the JLabel
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            Image image = imageIcon.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_SMOOTH);
            foto.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_importBtnMouseClicked

    private void deskripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deskripsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deskripsiActionPerformed

    
    public final void setTable() {
        tableModel = new DefaultTableModel(
                new Object[]{"Kode Produk", "Nama Produk", "Kategori","Harga","Stok"},
                0
        );
        
        BarangRequest request = new BarangRequest();
        request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
        
        listProducts = service.getList(request);
        
        for(Barang barang : listProducts) {
            if(barang == null) {
                continue;
            }
            
            Object[] rowData = {
                    barang.getKodeBarang(),
                    barang.getNama(),
                    barang.getKategori(),
                    barang.getHarga(),
                    barang.getStok()
            };
            tableModel.addRow(rowData);
        }

        tableProduk.setModel(tableModel);
        
        tableProduk.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        tableProduk.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selected = tableProduk.getSelectedRow();
                if (selected != -1) {
                    // Handle row selection here
                    selectedRow = selected;
                    setData();
                }
            }
        });
    }
    public void refreshTable() {
        // Clear the existing table model
        tableModel.setRowCount(0);
        
        BarangRequest request = new BarangRequest();
        request.setPedagangId(SessionHelper.getCurrentPedagang().getId());
        
        listProducts = service.getList(request);
        
        for(Barang barang : listProducts) {
            if(barang == null) {
                continue;
            }
            
              Object[] rowData = {
                    barang.getKodeBarang(),
                    barang.getNama(),
                    barang.getKategori(),
                    barang.getHarga(),
                    barang.getStok()
            };
            
            tableModel.addRow(rowData);
        }
        
        tableModel.fireTableDataChanged();
    }
    
    
    public void setData() {
        setFoto();
        kodeProduk.setText(listProducts[selectedRow].getKodeBarang());
        namaProduk.setText(listProducts[selectedRow].getNama());
        stock.setValue(listProducts[selectedRow].getStok());
        hargaProduk.setText(String.valueOf(listProducts[selectedRow].getHarga()));
        deskripsi.setText(listProducts[selectedRow].getDeskripsi());
        kategori.setSelectedIndex(listProducts[selectedRow].getKategori_id() - 1);
    }
    
    public void setFoto() {
        try {
            String imageUrl = listProducts[selectedRow].getFoto();
            
            URL url = new URL(imageUrl);
            try {
                Image image = ImageIO.read(url);
                ImageIcon imageIcon = new ImageIcon(image);
                foto.setIcon(imageIcon);
            } catch (IOException ex) {
                foto.setIcon(null);
                fileBase64 = "-1";
                Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(addProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel dashboardPage;
    private javax.swing.JTextField deskripsi;
    private javax.swing.JLabel foto;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JTextField hargaProduk;
    private javax.swing.JButton importBtn;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton29;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> kategori;
    private javax.swing.JTextField kodeProduk;
    private javax.swing.JTextField namaProduk;
    private javax.swing.JLabel notesPage;
    private javax.swing.JLabel ordersPage;
    private javax.swing.JLabel productPage;
    private javax.swing.JLabel profilePage;
    private javax.swing.JLabel schedulePage;
    private javax.swing.JSpinner stock;
    private javax.swing.JTable tableProduk;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
