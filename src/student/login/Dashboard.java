/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student.login;

import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;
import student.login.dashboard.*;

/**
 *
 * @author shashank
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     * @param s
     */
    Student s;
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("Admin");
//    DefaultTreeModel model;
            
    public Dashboard(Student s) {
        initComponents();
        setTitle("Dashboard");
        setLocationRelativeTo(null);
        this.s=s;
//        setSize(900,450);
//        SwingUtilities.getRootPane(btnRun).setDefaultButton(btnRun);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        dashboard_header.setText("<html>  Hello, <i>"+s.getName()+"</i></html>");
//        dashboard_header.setText("<HTML><B>Helo</B></HTML>");
//        model = (DefaultTreeModel)dashboard_admin.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dashboard_header = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dashboard_admin = new javax.swing.JTree();
        dashboard_logout = new javax.swing.JButton();
        dashboard_profile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dashboard_header.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashboard_header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dashboard_admin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Admin");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Create");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Edit");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Reports");
        treeNode1.add(treeNode2);
        dashboard_admin.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        dashboard_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_adminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dashboard_admin);

        dashboard_logout.setText("LOGOUT");
        dashboard_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_logoutActionPerformed(evt);
            }
        });

        dashboard_profile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dashboard_profile.setText("PROFILE");
        dashboard_profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dashboard_profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboard_profileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard_header, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(dashboard_profile, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dashboard_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashboard_header, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dashboard_profile, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(dashboard_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboard_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_logoutActionPerformed
        // TODO add your handling code here:
        this.s=null;
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_dashboard_logoutActionPerformed

    private void dashboard_profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboard_profileActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Profile(this.s).setVisible(true);
    }//GEN-LAST:event_dashboard_profileActionPerformed

    @SuppressWarnings("empty-statement")
    private void dashboard_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_adminMouseClicked
        // TODO add your handling code here:
//        root = (DefaultMutableTreeNode)dashboard_admin.getModel();
        try{
            root = (DefaultMutableTreeNode)dashboard_admin.getSelectionPath().getLastPathComponent();
        }
        catch(NullPointerException E){
            ;
        }
        
//        String selected = root.getUserObject().toString();
        trigger_node(root.getUserObject().toString());
    }//GEN-LAST:event_dashboard_adminMouseClicked

    private void trigger_node(String str){
        switch (str) {
            case "Create" -> {
                new Create(s).setVisible(true);
                setVisible(false);
            }
            case "Edit" -> {
                new Edit_emailid(s).setVisible(true);
                setVisible(false);
            }
            case "Reports" -> {
                new Reports_frame(s).setVisible(true);
                setVisible(false);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Dashboard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree dashboard_admin;
    private javax.swing.JLabel dashboard_header;
    private javax.swing.JButton dashboard_logout;
    private javax.swing.JButton dashboard_profile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
