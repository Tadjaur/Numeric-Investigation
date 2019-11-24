/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fenetres;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import Other.ScanFile;
import Principal.ImagePanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Toolkit;

/**
 *
 * @author Estébane
 */
public class AnalyseFile extends javax.swing.JFrame {

    /**
     * Creates new form AnalyseFile
     */
    private FileChooser chooser;// = new FileChooser();
    private String chemin;// = chooser.getSelectedPath();
    private ScanFile f;// = new ScanFile(chemin);
    public AnalyseFile() {
        initComponents();
        this.setResizable(false);
        this.setLocation(30, 50);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); // EDIT
        this.pack();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - unknown
    private void initComponents() {
        jPanel1 = new JPanel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel1 = new JLabel();
        jButton3 = new JButton();
        jButton4 = new JButton();

        //======== this ========
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/media/logo.png")));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Analyse De Fichiers - Winner");
        setResizable(false);
        var contentPane = getContentPane();

        //======== jPanel1 ========
        {
            jPanel1.setBackground(new Color(153, 153, 255));
            jPanel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new
            javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax
            . swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java
            .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,jPanel1. getBorder( )) ); jPanel1. addPropertyChangeListener (new java. beans.
            PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .
            equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- jLabel2 ----
            jLabel2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 14));
            jLabel2.setText("Choisir un fichier \u00e0 analyser...");

            //---- jButton1 ----
            jButton1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jButton1.setText("Choose a file");
            jButton1.setContentAreaFilled(false);
            jButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            jButton1.setOpaque(true);
            jButton1.addActionListener(e -> jButton1ActionPerformed(e));

            //---- jLabel3 ----
            jLabel3.setBackground(Color.white);
            jLabel3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel3.setText("Nom Complet Du Fichier                 ");
            jLabel3.setOpaque(true);

            //---- jLabel4 ----
            jLabel4.setBackground(Color.white);
            jLabel4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel4.setText("Chemin Absolue Vers Le Fichier        ");
            jLabel4.setOpaque(true);

            //---- jLabel5 ----
            jLabel5.setBackground(Color.white);
            jLabel5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel5.setText("Date De Cr\u00e9ation                                  ");
            jLabel5.setOpaque(true);

            //---- jLabel6 ----
            jLabel6.setBackground(Color.white);
            jLabel6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel6.setText("Date De Dernier Acces                      ");
            jLabel6.setOpaque(true);

            //---- jLabel7 ----
            jLabel7.setBackground(Color.white);
            jLabel7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel7.setText("Date De Derni\u00e8re Modification               ");
            jLabel7.setOpaque(true);

            //---- jLabel8 ----
            jLabel8.setBackground(Color.white);
            jLabel8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel8.setText("Propri\u00e9taire                                   ");
            jLabel8.setOpaque(true);

            //---- jLabel9 ----
            jLabel9.setBackground(Color.white);
            jLabel9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel9.setText("Extension Du Fichier                       ");
            jLabel9.setOpaque(true);

            //---- jLabel10 ----
            jLabel10.setBackground(Color.white);
            jLabel10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel10.setText("Taille Du Fichier                                ");
            jLabel10.setOpaque(true);

            //---- jLabel11 ----
            jLabel11.setBackground(Color.white);
            jLabel11.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
            jLabel11.setText("Droits D'Acc\u00e8s                             ");
            jLabel11.setOpaque(true);

            GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup()
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
            );
        }

        //---- jLabel1 ----
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/media/analysator-Inv.png")));

        //---- jButton3 ----
        jButton3.setIcon(new ImageIcon(getClass().getResource("/media/home.png")));
        jButton3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jButton3MouseClicked(e);
            }
        });
        jButton3.addActionListener(e -> jButton3ActionPerformed(e));

        //---- jButton4 ----
        jButton4.setIcon(new ImageIcon(getClass().getResource("/media/exit-small.png")));
        jButton4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jButton4.addActionListener(e -> jButton4ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(8, 8, 8)
                    .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))))
        );
        pack();
        setLocationRelativeTo(getOwner());
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        this.chooser = new FileChooser();
        this.chemin = chooser.getSelectedPath();
        this.f = new ScanFile(chemin);
        try {
            setMetaData();
        } catch (IOException ex) {
            Logger.getLogger(AnalyseFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        String[] args = null;
        Principal.Main.main(args);
    }//GEN-LAST:event_jButton3MouseClicked

    /**
     * @param args the command line arguments
     */
    public void showFrame() {
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
            java.util.logging.Logger.getLogger(AnalyseFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalyseFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalyseFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalyseFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalyseFile().setVisible(true);
            }
        });
        
    }
    public void setMetaData() throws IOException{
        this.jLabel4.setText( this.jLabel4.getText() + "" + this.f.getPath() );
        this.jLabel3.setText( this.jLabel3.getText() + "" + this.f.getName() );
        this.jLabel5.setText( this.jLabel5.getText() + "" + this.f.getCreatedDate() );
        this.jLabel6.setText( this.jLabel6.getText() + "" + this.f.getLastAccessDate() );
        this.jLabel7.setText( this.jLabel7.getText() + "" + this.f.LastModifiedDate() );
        this.jLabel8.setText( this.jLabel8.getText() + "" + this.f.getOwner() );
        this.jLabel9.setText( this.jLabel9.getText() + "" + this.f.getType() );
        this.jLabel10.setText( this.jLabel10.getText() + "" + this.f.getSize() + "Kb" );
        this.jLabel11.setText( this.jLabel11.getText() + "" + this.f.getPermission() );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel jPanel1;
    private JLabel jLabel2;
    private JButton jButton1;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel1;
    private JButton jButton3;
    private JButton jButton4;
    // End of variables declaration//GEN-END:variables

   
}
