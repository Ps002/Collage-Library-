/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Prasad Shinde
 */
public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
        initComponents();
        try 
        {
            BufferedImage img=ImageIO.read(new File("D:\\Java\\Library\\src\\main\\java\\Images\\—Pngtree—black straight arrow clip art_5575752.png"));
            Image newing=img.getScaledInstance(lblarrow2.getWidth(), lblarrow2.getWidth(), Image.SCALE_SMOOTH);
            ImageIcon icon=new ImageIcon(newing);
            lblarrow2.setIcon(icon);
            lblarrow3.setIcon(icon);
            lblarrow4.setIcon(icon);
            lblarrow5.setIcon(icon);
        } catch (Exception e) {
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

        mainpanel = new javax.swing.JPanel();
        lblmainhead = new javax.swing.JLabel();
        lblissue = new javax.swing.JLabel();
        lbltrack1 = new javax.swing.JLabel();
        lblarrow2 = new javax.swing.JLabel();
        lblarrow3 = new javax.swing.JLabel();
        lbladd = new javax.swing.JLabel();
        lblarrow4 = new javax.swing.JLabel();
        lblcheck = new javax.swing.JLabel();
        lblarrow5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainpanel.setPreferredSize(new java.awt.Dimension(750, 443));

        lblmainhead.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblmainhead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmainhead.setText("Collage Library Department");

        lblissue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblissue.setText("Issue/Return Book");
        lblissue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblissueMouseClicked(evt);
            }
        });

        lbltrack1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbltrack1.setText("Track numbers of books");
        lbltrack1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbltrack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbltrack1MouseClicked(evt);
            }
        });

        lbladd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbladd.setText("Add/Delete Book");
        lbladd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbladd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbladdMouseClicked(evt);
            }
        });

        lblcheck.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblcheck.setText("Book Availability Check");
        lblcheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblcheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainpanelLayout = new javax.swing.GroupLayout(mainpanel);
        mainpanel.setLayout(mainpanelLayout);
        mainpanelLayout.setHorizontalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblmainhead, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainpanelLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addComponent(lblarrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainpanelLayout.createSequentialGroup()
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblarrow4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblarrow2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblarrow5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltrack1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblissue, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );

        mainpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbladd, lblcheck, lblissue, lbltrack1});

        mainpanelLayout.setVerticalGroup(
            mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainpanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblmainhead, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblarrow2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltrack1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblarrow5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblarrow3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblarrow4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblissue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainpanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbladd, lblcheck, lblissue, lbltrack1});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbltrack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbltrack1MouseClicked
        Trackframe obj=new Trackframe();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbltrack1MouseClicked

    private void lbladdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbladdMouseClicked
        AddDeleteFrame obj=new AddDeleteFrame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbladdMouseClicked

    private void lblcheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcheckMouseClicked
        AvailabilityFrame obj=new AvailabilityFrame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblcheckMouseClicked

    private void lblissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblissueMouseClicked
        IssueFrame obj=new IssueFrame();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblissueMouseClicked

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbladd;
    private javax.swing.JLabel lblarrow2;
    private javax.swing.JLabel lblarrow3;
    private javax.swing.JLabel lblarrow4;
    private javax.swing.JLabel lblarrow5;
    private javax.swing.JLabel lblcheck;
    private javax.swing.JLabel lblissue;
    private javax.swing.JLabel lblmainhead;
    private javax.swing.JLabel lbltrack1;
    private javax.swing.JPanel mainpanel;
    // End of variables declaration//GEN-END:variables
}
