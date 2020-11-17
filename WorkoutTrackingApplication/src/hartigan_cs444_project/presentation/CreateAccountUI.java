/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hartigan_cs444_project.presentation;

import hartigan_cs444_project.domain.*;
import hartigan_cs444_project.service.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Matt
 */
public class CreateAccountUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    public CreateAccountUI() {
        initComponents();
    }

    /**
     * This method is called from within the
     * constructor to initialize the form. WARNING:
     * Do NOT modify this code. The content of this
     * method is always regenerated by the Form
     * Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lastNameFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        createBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        confirmPasswordFld = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        firstNameFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userNameFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE ACCOUNT");

        lastNameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFldActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name*");

        jLabel3.setText("Password*");

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        passwordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFldActionPerformed(evt);
            }
        });

        createBtn.setText("Create Account");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Confirm Password*");

        confirmPasswordFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFldActionPerformed(evt);
            }
        });

        jLabel4.setText("First Name*");

        firstNameFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFldActionPerformed(evt);
            }
        });

        jLabel7.setText("Username*");

        jLabel9.setText("*indicates required field");

        jLabel10.setText("First and last names must both start with upper case letters.");

        jLabel6.setText("Passwords to be 10-25 chars with at least one digit and one letter.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createBtn)
                                .addGap(18, 18, 18)
                                .addComponent(cancelBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameFld)
                                    .addComponent(firstNameFld)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(confirmPasswordFld)
                                    .addComponent(passwordFld)
                                    .addComponent(userNameFld))))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(firstNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(confirmPasswordFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelBtn)
                    .addComponent(createBtn))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFldActionPerformed

    private void passwordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFldActionPerformed

    private void confirmPasswordFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFldActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        // Create an account
        Account account = new Account();
        account.setFirstName(firstNameFld.getText());
        account.setLastName(lastNameFld.getText());
        Login login = new Login();
        login.setUsername(userNameFld.getText());
        login.setPassword(new String(passwordFld.getPassword()));
        account.setLogin(login);
        
        // Confirm valid first name and last name
        boolean isValid = account.validate();
        if (!isValid) {
            JOptionPane.showMessageDialog(this, "Must supply first and last names, both starting with upper case letters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (login.getUsername() == null || login.getUsername().equals("") || login.getUsername().length() > 10) {
            JOptionPane.showMessageDialog(this, "Must supply a valid username", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (login.getPassword() == null || login.getPassword().equals("") || login.getPassword().length() < 10 || login.getPassword().length() > 25 || !login.getPassword().matches(".*\\d.*") || !login.getPassword().matches(".*[a-zA-Z].*")) {
            JOptionPane.showMessageDialog(this, "Must supply a valid password.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Confirm password match
        String confirmPassword = new String(confirmPasswordFld.getPassword());
        if (!confirmPassword.equals(login.getPassword())) {
            JOptionPane.showMessageDialog(this, "Passwords don't match, try again", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else {
            AccountSvcCacheImpl impl = AccountSvcCacheImpl.getInstance();
            account = impl.create(account);
            JOptionPane.showMessageDialog(this, "Congratulations, your account has been created!", "Account created.", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            LogInUI loginUI = new LogInUI();
            loginUI.setVisible(true);
        }
         
    }//GEN-LAST:event_createBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LogInUI loginUI = new LogInUI();
        loginUI.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void firstNameFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFldActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccountUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccountUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPasswordField confirmPasswordFld;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameFld;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JTextField userNameFld;
    // End of variables declaration//GEN-END:variables
}
