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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prasad Shinde
 */
public class AvailabilityFrame extends javax.swing.JFrame {

    /**
     * Creates new form AvailabilityFrame
     */
    private int digit=0;
    private int alpha=0;
    public AvailabilityFrame() 
    {
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

        availabilityPanel = new javax.swing.JPanel();
        lblavaihead = new javax.swing.JLabel();
        lblavailabilityhead = new javax.swing.JLabel();
        lblenterid = new javax.swing.JLabel();
        txtentername = new javax.swing.JTextField();
        lblor = new javax.swing.JLabel();
        lblentername = new javax.swing.JLabel();
        txtenterid = new javax.swing.JTextField();
        btncheckavai = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        checkTable = new javax.swing.JTable();
        btntrackhome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblavaihead.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        lblavaihead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavaihead.setText("Book Availability");

        lblavailabilityhead.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblavailabilityhead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblavailabilityhead.setText("Collage Library Department");

        lblenterid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblenterid.setText("Enter Book id:");

        txtentername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtentername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenternameKeyTyped(evt);
            }
        });

        lblor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblor.setText("OR");

        lblentername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblentername.setText("Enter Book Name:");

        txtenterid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtenterid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtenteridKeyTyped(evt);
            }
        });

        btncheckavai.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncheckavai.setText("CHECK");
        btncheckavai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckavaiActionPerformed(evt);
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
        jScrollPane1.setViewportView(checkTable);

        btntrackhome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btntrackhome.setText("HOME");
        btntrackhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntrackhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout availabilityPanelLayout = new javax.swing.GroupLayout(availabilityPanel);
        availabilityPanel.setLayout(availabilityPanelLayout);
        availabilityPanelLayout.setHorizontalGroup(
            availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, availabilityPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availabilityPanelLayout.createSequentialGroup()
                        .addComponent(lblenterid, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtenterid, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(lblor)
                        .addGap(41, 41, 41)
                        .addComponent(lblentername, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtentername, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(availabilityPanelLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(btncheckavai, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(availabilityPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblavaihead, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(availabilityPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblavailabilityhead, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(availabilityPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(availabilityPanelLayout.createSequentialGroup()
                .addComponent(btntrackhome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        availabilityPanelLayout.setVerticalGroup(
            availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, availabilityPanelLayout.createSequentialGroup()
                .addComponent(btntrackhome)
                .addGap(21, 21, 21)
                .addComponent(lblavailabilityhead, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblavaihead, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(availabilityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblenterid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtenterid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblentername)
                    .addComponent(txtentername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncheckavai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(availabilityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(availabilityPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
    private void btncheckavaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckavaiActionPerformed
       
        try 
        {
            DefaultTableModel tbl=(DefaultTableModel)checkTable.getModel();
            tbl.setRowCount(0);
            String id=""+txtenterid.getText();
            String name=""+txtentername.getText();
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
    }//GEN-LAST:event_btncheckavaiActionPerformed

    private void txtenteridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenteridKeyTyped
        if(digitOrNot(evt))
        {
            digit=1;
        }
        else
        {
            digit=0;
        }
    }//GEN-LAST:event_txtenteridKeyTyped

    private void txtenternameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtenternameKeyTyped
        if(alphabetOrNot(evt))
        {
            alpha=1;
        }else
        {
            alpha=0;
        }
    }//GEN-LAST:event_txtenternameKeyTyped

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
            java.util.logging.Logger.getLogger(AvailabilityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AvailabilityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AvailabilityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AvailabilityFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AvailabilityFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel availabilityPanel;
    private javax.swing.JButton btncheckavai;
    private javax.swing.JButton btntrackhome;
    private javax.swing.JTable checkTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblavaihead;
    private javax.swing.JLabel lblavailabilityhead;
    private javax.swing.JLabel lblenterid;
    private javax.swing.JLabel lblentername;
    private javax.swing.JLabel lblor;
    private javax.swing.JTextField txtenterid;
    private javax.swing.JTextField txtentername;
    // End of variables declaration//GEN-END:variables
}
