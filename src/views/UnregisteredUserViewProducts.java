/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import models.DBManager;
import models.Product;

/**
 *
 * @author mark
 */
public class UnregisteredUserViewProducts extends javax.swing.JFrame {

    private HashMap<Integer, Product> products;
    
    /**
     * Creates new form UnregisteredUserViewProducts
     */
    public UnregisteredUserViewProducts() {
        //loads a new instance of Database Manager
        //sets the products HashMap to populate with the 
        //contents from "loadProducts"
        DBManager db  = new DBManager(); 
        products = db.loadProducts(); 
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

        btnBack = new javax.swing.JButton();
        lblCatagories = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCatagories = new javax.swing.JList<>();
        lblProducts = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProducts = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCatagories.setText("CATAGORIES");

        listCatagories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Clothing", "Footwear" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCatagories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listCatagoriesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listCatagories);

        lblProducts.setText("PRODUCTS");

        jScrollPane2.setViewportView(listProducts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCatagories, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProducts)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCatagories, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listCatagoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCatagoriesValueChanged
                //new instance of DefaultListModel
        DefaultListModel productList = new DefaultListModel(); 
        
        //get and store the selected value from the list, will be either
        //clothing or footwear
        String selectedCategory = listCatagories.getSelectedValue(); 
        
        //returns a view of the mappings in the productEntry map
        for(Map.Entry<Integer, Product> productEntry : products.entrySet())
        {
            //get and store products from the productEntry map
            Product product = productEntry.getValue();

            //if the product class is the same as the "footwear" or "clothing"
            //class in models, add the element to the DefaultListModel
            if (product.getClass().getName().equals("models." + selectedCategory))
            {
                productList.addElement(product);
            }
        }


        listProducts.setModel(productList);
    }//GEN-LAST:event_listCatagoriesValueChanged

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //new instance of main menu view
        MainMenu mmenu = new MainMenu();
        this.dispose();
        mmenu.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(UnregisteredUserViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnregisteredUserViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnregisteredUserViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnregisteredUserViewProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnregisteredUserViewProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCatagories;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JList<String> listCatagories;
    private javax.swing.JList<String> listProducts;
    // End of variables declaration//GEN-END:variables
}
