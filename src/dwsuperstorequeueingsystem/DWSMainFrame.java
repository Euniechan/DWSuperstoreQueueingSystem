/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dwsuperstorequeueingsystem;

/**
 *
 * @author User
 */
public class DWSMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form DWSMainFrame
     */
    public DWSMainFrame() {
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

        ServiceButton = new javax.swing.JButton();
        AboutButton = new javax.swing.JButton();
        EnterButton = new javax.swing.JButton();
        MainFrameBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ServiceButton.setBorder(null);
        ServiceButton.setBorderPainted(false);
        ServiceButton.setContentAreaFilled(false);
        ServiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ServiceButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 60, 30));

        AboutButton.setBorder(null);
        AboutButton.setBorderPainted(false);
        AboutButton.setContentAreaFilled(false);
        AboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AboutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 80, 30));

        EnterButton.setBorder(null);
        EnterButton.setBorderPainted(false);
        EnterButton.setContentAreaFilled(false);
        EnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EnterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 140, 40));

        MainFrameBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DWSuperstoreQueueing System/DIGITAL WORLD SUPERSTORE (USER & EMPLOYEE POV).png"))); // NOI18N
        getContentPane().add(MainFrameBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutButtonActionPerformed

        dispose();
        
        DWSAboutFrame about = new DWSAboutFrame();
        about.setVisible(true);
        
    }//GEN-LAST:event_AboutButtonActionPerformed

    private void ServiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiceButtonActionPerformed

        dispose();
        
        DWSServiceFrame service = new DWSServiceFrame();
        service.setVisible(true);
        
    }//GEN-LAST:event_ServiceButtonActionPerformed

    private void EnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterButtonActionPerformed

        dispose ();
        
    DWSUserPOV user = new DWSUserPOV();
    DWSGetTokenNumFrame getTokenNum = new DWSGetTokenNumFrame();
    DWSEmployeePOV employeePOV = new DWSEmployeePOV(getTokenNum, user);


    user.setVisible(true);
    employeePOV.setVisible(true);
    getTokenNum.setVisible(true);
        
//        DWSGetTokenNumFrame tokenNum = new DWSGetTokenNumFrame();
//        tokenNum.setVisible(true);
        
    }//GEN-LAST:event_EnterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DWSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DWSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DWSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DWSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DWSMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AboutButton;
    private javax.swing.JButton EnterButton;
    private javax.swing.JLabel MainFrameBG;
    private javax.swing.JButton ServiceButton;
    // End of variables declaration//GEN-END:variables
}
