/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad Shinde
 */
public class AddDeleteFrame extends javax.swing.JFrame {

    /**
     * Creates new form AddDeleteFrame
     */
    private int digit;
    private int alpha;
    private int deleteid;
    private int newid;
    public AddDeleteFrame() 
    {
        initComponents();
        setnewid();
    }
    private void setnewid()
    {
        try 
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Prasadshinde@93");
            Statement st=con.createStatement();
            ResultSet rst=st.executeQuery("select count(*)from total_books");
            if(rst.first())
            {
                newid=Integer.parseInt(rst.getString("count(*)"))+1001;
                lblbookid.setText("New Book id="+newid);
            }
        }
        catch (Exception e) 
        {
            System.err.println("Error"+e);
        }
    }
    private boolean digitOrNot(KeyEvent e)
    {
        Character ch=e.getKeyChar();
        if(Character.isDigit(ch))
        {
            return true;
        }else
        {
            e.consume();
            return false;
        }
    }
    private boolean alphabetOrNot(KeyEvent e)
    {
        Character ch=e.getKeyChar();
        if(Character.isAlphabetic(ch))
        {
            return true;
        }else
        {
            e.consume();
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adddeletePanel = new javax.swing.JPanel();
        lbltrackhead = new javax.swing.JLabel();
        lbladdhead = new javax.swing.JLabel();
        adddeleTpanel = new javax.swing.JTabbedPane();
        addPanel = new javax.swing.JPanel();
        lblbookid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        lblauthor = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        lblpublisher = new javax.swing.JLabel();
        txtpublisher = new javax.swing.JTextField();
        txtisbn = new javax.swing.JTextField();
        lblisbn = new javax.swing.JLabel();
        lbllength = new javax.swing.JLabel();
        lblcategory = new javax.swing.JLabel();
        txtlength = new javax.swing.JTextField();
        lblnoofcopies = new javax.swing.JLabel();
        txtnoofcopies = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        cmbcategory = new javax.swing.JComboBox<>();
        deletePanel = new javax.swing.JPanel();
        lbldeleteid = new javax.swing.JLabel();
        txtdeletid = new javax.swing.JTextField();
        lblor = new javax.swing.JLabel();
        lbldeletename = new javax.swing.JLabel();
        txtdeletename = new javax.swing.JTextField();
        btncheck = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkTable = new javax.swing.JTable();
        btntrackhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        adddeletePanel.setPreferredSize(new java.awt.Dimension(750, 443));

        lbltrackhead.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbltrackhead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltrackhead.setText("Collage Library Department");

        lbladdhead.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lbladdhead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbladdhead.setText("Add/Delete Books");

        adddeleTpanel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblbookid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblbookid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblbookid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblname.setText("*Book Name");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblauthor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblauthor.setText("*Author");

        txtauthor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblpublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblpublisher.setText("*Publisher");

        txtpublisher.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        txtisbn.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        lblisbn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblisbn.setText("ISBN");

        lbllength.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbllength.setText("*Length");

        lblcategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcategory.setText("*Category");

        txtlength.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtlength.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlengthKeyTyped(evt);
            }
        });

        lblnoofcopies.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnoofcopies.setText("*Copies");

        txtnoofcopies.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtnoofcopies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnoofcopiesKeyTyped(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        cmbcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "other", "art & music", "biographies", "chemical engg", "comic", "computer engg", "electrical", "electronics", "health", "history", "mechanical", "medical", "religion", "sports", "travel" }));

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lblname)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lblauthor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lblpublisher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lblisbn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lbllength)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlength, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(lblcategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(95, 95, 95))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(lblnoofcopies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnoofcopies, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 68, Short.MAX_VALUE))))
            .addGroup(addPanelLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(lblbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblauthor, lblname, lblnoofcopies, lblpublisher});

        addPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblcategory, lblisbn, lbllength});

        addPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbcategory, txtauthor, txtisbn, txtlength, txtname, txtnoofcopies, txtpublisher});

        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblbookid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtisbn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbllength, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlength, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblnoofcopies, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnoofcopies, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        addPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbcategory, txtauthor, txtisbn, txtlength, txtname, txtnoofcopies, txtpublisher});

        adddeleTpanel.addTab("ADD", addPanel);

        lbldeleteid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldeleteid.setText("Enter Book id:");

        txtdeletid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdeletid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdeletidKeyTyped(evt);
            }
        });

        lblor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblor.setText("OR");

        lbldeletename.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbldeletename.setText("Enter Book Name:");

        txtdeletename.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdeletename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdeletenameKeyTyped(evt);
            }
        });

        btncheck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncheck.setText("CHECK");
        btncheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        checkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book id", "Book Name", "Author", "Publisher", "ISBN", "Length", "Category", "Total Copies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        checkTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        checkTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(checkTable);

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deletePanelLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(lbldeleteid, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdeletid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblor)
                                .addGap(27, 27, 27)
                                .addComponent(lbldeletename, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdeletename, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(deletePanelLayout.createSequentialGroup()
                                .addGap(264, 264, 264)
                                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btncheck, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdeletid)
                        .addComponent(lbldeleteid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblor)
                        .addComponent(lbldeletename)
                        .addComponent(txtdeletename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btncheck, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        deletePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbldeleteid, txtdeletename, txtdeletid});

        adddeleTpanel.addTab("Delete", deletePanel);

        btntrackhome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntrackhome.setText("HOME");
        btntrackhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrackhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adddeletePanelLayout = new javax.swing.GroupLayout(adddeletePanel);
        adddeletePanel.setLayout(adddeletePanelLayout);
        adddeletePanelLayout.setHorizontalGroup(
            adddeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddeletePanelLayout.createSequentialGroup()
                .addGroup(adddeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adddeletePanelLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lbladdhead, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adddeletePanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lbltrackhead, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btntrackhome)
                    .addGroup(adddeletePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(adddeleTpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adddeletePanelLayout.setVerticalGroup(
            adddeletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adddeletePanelLayout.createSequentialGroup()
                .addComponent(btntrackhome)
                .addGap(17, 17, 17)
                .addComponent(lbltrackhead, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbladdhead, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adddeleTpanel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(adddeletePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(adddeletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnoofcopiesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoofcopiesKeyTyped
        digitOrNot(evt);
    }//GEN-LAST:event_txtnoofcopiesKeyTyped

    private void txtlengthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlengthKeyTyped
        digitOrNot(evt);
    }//GEN-LAST:event_txtlengthKeyTyped

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try 
        {
            String name=txtname.getText();
            String author=txtauthor.getText();
            String publisher=txtpublisher.getText();
            String isbn=txtisbn.getText();
            int length=Integer.parseInt(txtlength.getText());
            String category=(String)cmbcategory.getSelectedItem();
            int no=Integer.parseInt(txtnoofcopies.getText());
            if(name.equals("")||author.equals("")||publisher.equals("")||category.equals(""))
            {
                JOptionPane.showMessageDialog(this, "Must enter * info");
                return;
            }
            String str="INSERT INTO `library`.`total_books`VALUES ('"+newid+"', '"+name+"','"+author+"','"+publisher+"','"+isbn+"','"+length+"','"+category+"','"+no+"')";
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Prasadshinde@93");
            Statement st=con.createStatement();
            st.executeUpdate(str);
            JOptionPane.showMessageDialog(this, "Book Added successfully");
            newid++;
            setnewid();
            txtauthor.setText("");
            txtisbn.setText("");
            txtlength.setText("");
            txtname.setText("");
            txtnoofcopies.setText("");
            txtpublisher.setText("");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(this, "Must enter * info");
                return;
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckActionPerformed
        try 
        {
            DefaultTableModel tbl=(DefaultTableModel)checkTable.getModel();
            tbl.setRowCount(0);
            String id=""+txtdeletid.getText();
            String name=""+txtdeletename.getText();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Prasadshinde@93");
            Statement st=con.createStatement();
            String str="";
            if(digit==1 && alpha==1)
            {
                str="select* from total_books where book_id="+Integer.parseInt(id)+"||book_name like'%"+name+"%'";
            }else if(digit==1)
            {
                str="select* from total_books where book_id="+Integer.parseInt(id);
            }else if(alpha==1)
            {
                str="select* from total_books where book_name like'%"+name+"%'";
            }else
            {
                JOptionPane.showMessageDialog(this, "Invalid input");
                return;
            }
            
            ResultSet rst=st.executeQuery(str);
            while(rst.next())
            {
                String book_id=rst.getString("book_id");
                String book_name=rst.getString("book_name");
                String author=rst.getString("author");
                String publisher=rst.getString("publisher");
                String isbn=rst.getString("isbn");
                String length=rst.getString("length");
                String category_id=rst.getString("category_id");
                String no_of_copies=rst.getString("no_of_copies");
                
                
                String tbdata[]={book_id,book_name,author,publisher,isbn,length,category_id,no_of_copies};
                DefaultTableModel tblModel=(DefaultTableModel)checkTable.getModel();
                tblModel.addRow(tbdata);
            }
            con.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Error"+e);
        }
    }//GEN-LAST:event_btncheckActionPerformed

    private void txtdeletidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeletidKeyTyped
        if(digitOrNot(evt))
        {
            digit=1;
        }
        else
        {
            digit=0;
        }
    }//GEN-LAST:event_txtdeletidKeyTyped

    private void txtdeletenameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdeletenameKeyTyped
        if(alphabetOrNot(evt))
        {
            alpha=1;
        }else
        {
            alpha=0;
        }
    }//GEN-LAST:event_txtdeletenameKeyTyped

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try 
        {
            int a=checkTable.getSelectedRow();
            if(checkTable.isRowSelected(a))
            {
                String id=(String)checkTable.getValueAt(a,0);
                int noofcopies=Integer.parseInt((String)checkTable.getValueAt(a,7));
                if(noofcopies==1)
                {
                    String str="DELETE FROM total_books WHERE book_id="+Integer.parseInt(id);
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Prasadshinde@93");
                    Statement st=con.createStatement();
                    st.executeUpdate(str);
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                    DefaultTableModel tbl=(DefaultTableModel)checkTable.getModel();
                    tbl.setRowCount(0);
                }else
                {
                    int n=Integer.parseInt(JOptionPane.showInputDialog(this,"Total copies="+noofcopies+"\nHow many copies have to delete?"));
                    noofcopies=noofcopies-n;
                    String str="update total_books set no_of_copies="+noofcopies+ " where book_id="+Integer.parseInt(id);
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Prasadshinde@93");
                    Statement st=con.createStatement();
                    st.executeUpdate(str);
                    JOptionPane.showMessageDialog(this, "Deleted Successfully");
                    DefaultTableModel tbl=(DefaultTableModel)checkTable.getModel();
                    tbl.setRowCount(0);
                }
                
                
                setnewid();
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error:"+e);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btntrackhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntrackhomeActionPerformed
        mainFrame obj=new mainFrame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_btntrackhomeActionPerformed

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
            java.util.logging.Logger.getLogger(AddDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JTabbedPane adddeleTpanel;
    private javax.swing.JPanel adddeletePanel;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncheck;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btntrackhome;
    private javax.swing.JTable checkTable;
    private javax.swing.JComboBox<String> cmbcategory;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdhead;
    private javax.swing.JLabel lblauthor;
    private javax.swing.JLabel lblbookid;
    private javax.swing.JLabel lblcategory;
    private javax.swing.JLabel lbldeleteid;
    private javax.swing.JLabel lbldeletename;
    private javax.swing.JLabel lblisbn;
    private javax.swing.JLabel lbllength;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnoofcopies;
    private javax.swing.JLabel lblor;
    private javax.swing.JLabel lblpublisher;
    private javax.swing.JLabel lbltrackhead;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtdeletename;
    private javax.swing.JTextField txtdeletid;
    private javax.swing.JTextField txtisbn;
    private javax.swing.JTextField txtlength;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnoofcopies;
    private javax.swing.JTextField txtpublisher;
    // End of variables declaration//GEN-END:variables
}
