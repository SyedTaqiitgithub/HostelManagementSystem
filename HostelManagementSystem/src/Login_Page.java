
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Syed Taqi
 */
public class Login_Page extends javax.swing.JFrame {

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTexUsername = new javax.swing.JTextField();
        jRBShow = new javax.swing.JRadioButton();
        jBtnLogin = new javax.swing.JButton();
        jTexPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1440, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, 20));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 370, 70, -1));
        getContentPane().add(jTexUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 230, -1));

        jRBShow.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRBShow.setText("Show Password");
        jRBShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBShowActionPerformed(evt);
            }
        });
        getContentPane().add(jRBShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 460, -1, 20));

        jBtnLogin.setBackground(new java.awt.Color(0, 204, 51));
        jBtnLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jBtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        jBtnLogin.setText("LOGIN");
        jBtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, -1, -1));
        getContentPane().add(jTexPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2021-10-03 at 5.35.08 AM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LB.jpg"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(1440, 800));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBShowActionPerformed
        if(jRBShow.isSelected()){
         jTexPassword.setEchoChar((char)0);
         }
         else
         {
         jTexPassword.setEchoChar('*');
         }
    }//GEN-LAST:event_jRBShowActionPerformed

    private void jBtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLoginActionPerformed
        String Username = jTexUsername.getText();
        String Password = jTexPassword.getText();
        if(Password.contains("Hostel110")&&Username.contains("Hostel")){
        Home_Page Info = new Home_Page();
        Info.setVisible(true);
        dispose();
        jTexPassword.setText(null);
        }
        else
        {
        JOptionPane.showMessageDialog(this,"Invalid Username or Password","Login Error",JOptionPane.ERROR_MESSAGE);
        jTexPassword.setText(null);
        }
    }//GEN-LAST:event_jBtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBShow;
    private javax.swing.JPasswordField jTexPassword;
    private javax.swing.JTextField jTexUsername;
    // End of variables declaration//GEN-END:variables
}
