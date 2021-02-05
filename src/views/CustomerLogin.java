/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import javax.swing.JOptionPane;

import models.Customer;
import models.DBManager;

/**
 *
 * @author mark
 */
public class CustomerLogin extends javax.swing.JFrame {

    /**
     * Creates new form customerLogin
     */
    public CustomerLogin() {
        initComponents();
        this.getContentPane().setBackground(Color.lightGray); //set colour to light grey
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomerLoginPassword = new javax.swing.JTextField();
        txtCustomerLoginUsername = new javax.swing.JTextField();
        btnCustomerLogin = new javax.swing.JButton();
        btnCustomerRegister = new javax.swing.JButton();
        btnMainMenuRtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username: ");

        jLabel2.setText("Password: ");

        txtCustomerLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerLoginUsernameActionPerformed(evt);
            }
        });

        btnCustomerLogin.setText("LOGIN");
        btnCustomerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerLoginActionPerformed(evt);
            }
        });

        btnCustomerRegister.setText("REGISTER");
        btnCustomerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerRegisterActionPerformed(evt);
            }
        });

        btnMainMenuRtn.setText("RETURN TO MAIN MENU");
        btnMainMenuRtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuRtnActionPerformed(evt);
            }
        });

        jLabel3.setText("CUSTOMER LOGIN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCustomerRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMainMenuRtn))
                            .addComponent(btnCustomerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtCustomerLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(txtCustomerLoginUsername))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtCustomerLoginUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCustomerLogin)
                        .addGap(18, 18, 18)
                        .addComponent(btnCustomerRegister)
                        .addGap(18, 18, 18)
                        .addComponent(btnMainMenuRtn))
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerLoginUsernameActionPerformed

    }//GEN-LAST:event_txtCustomerLoginUsernameActionPerformed

    private void btnMainMenuRtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuRtnActionPerformed
        MainMenu mmenu = new MainMenu();
        this.dispose();
        mmenu.setVisible(true);
    }//GEN-LAST:event_btnMainMenuRtnActionPerformed

    private void btnCustomerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerLoginActionPerformed
        //test code to make sure the database can pull customers
        DBManager db = new DBManager(); //creating a new database object
        // HashMap<String, Customer> customer = db.loadCustomers(); //creating a hashmap to store the customers in

        String username = txtCustomerLoginUsername.getText();
        String password = txtCustomerLoginPassword.getText();

        Customer customer  = db.customerLogin(username, password);

        if (customer != null)
        {
            lblErrorMessage.setText("CORRECT LOGIN DETAILS ENTERED");
            CustomerHome cmenu = new CustomerHome(customer);
            this.dispose();
            cmenu.setVisible(true);
            JOptionPane.showMessageDialog(cmenu, "Welcome " + username + "\nEnjoy Shopping!");
        }
        else{
            lblErrorMessage.setText("Error: Invalid Username and/or Password");
        }


    }//GEN-LAST:event_btnCustomerLoginActionPerformed

    private void btnCustomerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerRegisterActionPerformed
        Registration reg = new Registration();
        this.dispose();
        reg.setVisible(true);
    }//GEN-LAST:event_btnCustomerRegisterActionPerformed


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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerLogin;
    private javax.swing.JButton btnCustomerRegister;
    private javax.swing.JButton btnMainMenuRtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JTextField txtCustomerLoginPassword;
    private javax.swing.JTextField txtCustomerLoginUsername;
    // End of variables declaration//GEN-END:variables
}
