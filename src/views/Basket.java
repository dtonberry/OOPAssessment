/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import models.Customer;
import models.Order;
import models.OrderLine;

/**
 *
 * @author mark
 */
public class Basket extends javax.swing.JFrame {

    private Customer loggedInCustomer;
    private Order currentOrder;
    private Object[] message = {
        "No Product Selected",
        "Product Successfully Removed"
    };

    /**
     * Creates new form Basket
     */
    public Basket(Customer customer, Order order) {
        loggedInCustomer = customer; //taking the currently logged in customer as an arguement
        currentOrder = order; //taking the current order as an arguement
        initComponents();

        DefaultTableModel basketModel = (DefaultTableModel)tblBasket.getModel();

        for(Map.Entry<Integer, OrderLine> olEntry : currentOrder.getOrderLines().entrySet())
        {
            OrderLine ol = olEntry.getValue();
            basketModel.addRow( new Object[] {
                ol.getProduct().getProductId(),
                ol.getProduct().getProductName(),
                ol.getProduct().getPrice(),
                ol.getQuantity()
            }

            );


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

        jMenu1 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBasket = new javax.swing.JTable();
        btnAddMoreProducts = new javax.swing.JButton();
        btnRemoveProducts = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBasket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblBasket);

        btnAddMoreProducts.setText("ADD MORE PRODUCTS");
        btnAddMoreProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMoreProductsActionPerformed(evt);
            }
        });

        btnRemoveProducts.setText("Remove Selected Products");
        btnRemoveProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemoveProducts)
                            .addComponent(btnAddMoreProducts))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAddMoreProducts)
                .addGap(27, 27, 27)
                .addComponent(btnRemoveProducts)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMoreProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMoreProductsActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "This will remove all items from your basket", "Are you sure?", JOptionPane.YES_NO_OPTION);

        

        if (result == JOptionPane.YES_OPTION)
        {
            currentOrder.removeAllOrderLine();
            BrowseProducts bmenu = new BrowseProducts(loggedInCustomer, currentOrder);
            this.dispose();
            bmenu.setVisible(true);
        }
    }//GEN-LAST:event_btnAddMoreProductsActionPerformed

    private void btnRemoveProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductsActionPerformed
        DefaultTableModel basketModel = (DefaultTableModel)tblBasket.getModel(); // new table model to handle removal

        int result  = JOptionPane.showConfirmDialog(null, "This will remove the selected item from your basket", "Are you sure?", JOptionPane.YES_NO_CANCEL_OPTION);

        if (result == JOptionPane.YES_OPTION)
        {
            if (tblBasket.getSelectedRow() == -1)
            {
                JOptionPane.showMessageDialog(null, message[0]);
            }
            else
            {
                int productId = Integer.parseInt(String.valueOf(tblBasket.getValueAt(tblBasket.getSelectedRow(), 0)));

                currentOrder.removeOrderLine(productId); //remove the orderline using the "productId"

                basketModel.removeRow(tblBasket.getSelectedRow());
                JOptionPane.showMessageDialog(null, message[1]);
                
            }
        }
    }//GEN-LAST:event_btnRemoveProductsActionPerformed

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
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Basket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Basket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMoreProducts;
    private javax.swing.JButton btnRemoveProducts;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBasket;
    // End of variables declaration//GEN-END:variables
}
