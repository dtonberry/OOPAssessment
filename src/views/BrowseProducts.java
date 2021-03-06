/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import models.Customer;
import models.DBManager;
import models.Order;
import models.OrderLine;
import models.Product;

/**
 *
 * @author mark
 */
public class BrowseProducts extends javax.swing.JFrame {

    private Customer loggedInCustomer;
    private HashMap<Integer, Product> products;
    ArrayList<Product> productList = new ArrayList<Product>();
    private Order currentOrder;
    
    public ArrayList<Product> productList()
    {
        return productList;
    }

    //method to sleep for "seconds" amount of seconds
    public void Sleep(int seconds)
    {
        try
        {
            TimeUnit.SECONDS.sleep(seconds);
        }
        catch (Exception exception)
        {
            exception.printStackTrace(); //catch and print the exception in the console
        }
    }

    /**
     * Creates new form BrowseProducts
     */
    public BrowseProducts(Customer customer) {

        loggedInCustomer = customer; //sets the Customer object "loggedInCustomer" to customer
        DBManager db  = new DBManager(); //loads a new instance of Database Manager
        //sets the products HashMap to populate with the 
        //contents from "loadProducts"
        products = db.loadProducts(); 

        initComponents();
        this.getContentPane().setBackground(Color.lightGray); //set colour to light grey
    }

    //this constructor will handle when an order needs to be passed back to the "BrowseProducts" view
    public BrowseProducts(Customer customer, Order order) {

        loggedInCustomer = customer; //sets the Customer object "loggedInCustomer" to customer
        currentOrder = order;
        DBManager db  = new DBManager(); //loads a new instance of Database Manager
        //sets the products HashMap to populate with the 
        //contents from "loadProducts"
        products = db.loadProducts(); 

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

        btnBack = new javax.swing.JButton();
        lblProducts = new javax.swing.JLabel();
        btnViewBasket = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCatagories = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listProducts = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        btnAddToBasket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblErrorBasket = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblProducts.setText("PRODUCTS");

        btnViewBasket.setText("VIEW BASKET");
        btnViewBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBasketActionPerformed(evt);
            }
        });

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

        jScrollPane2.setViewportView(listProducts);

        jLabel1.setText("Quantity:");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        btnAddToBasket.setText("ADD TO BASKET");
        btnAddToBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToBasketActionPerformed(evt);
            }
        });

        jLabel2.setText("CATAGORIES");

        jLabel3.setText("PRODUCTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(lblErrorBasket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddToBasket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQuantity)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnViewBasket)))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblProducts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewBasket))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddToBasket))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblErrorBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "This will remove all items from your basket", "Are you sure?", JOptionPane.YES_NO_OPTION);

        

        if (result == JOptionPane.YES_OPTION) {
            currentOrder.removeAllOrderLine();
            CustomerHome cmenu = new CustomerHome(loggedInCustomer);
            this.dispose();
            cmenu.setVisible(true);
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBasketActionPerformed
        //this will pass the current order in to the basket
        Basket basket  = new Basket(loggedInCustomer, currentOrder);
        this.dispose();
        basket.setVisible(true);
    }//GEN-LAST:event_btnViewBasketActionPerformed

    private void btnAddToBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToBasketActionPerformed
        //sets the text of the error label when no quantities have been selected
        lblErrorBasket.setText("");
        if (listProducts.getSelectedIndex() == -1)
        {
            lblErrorBasket.setText("You have not selected any product");
        }
        else
        {
            //convert the "listProducts" values to Object instead of string
            Object selectedProductObject = (Object)listProducts.getSelectedValue(); 
            //convert the "selectedProductObject" to a Product
            Product selectedProduct = (Product)selectedProductObject;

            if (selectedProduct.getStockLevel() == 0)
            {
                lblErrorBasket.setText("Selection not currently in stock");
            }
            
            else
            {         
                //convert the text field value to an int 
                //so we can compare it to the stock level
                int productQuantity = Integer.parseInt(txtQuantity.getText());
                if (selectedProduct.getStockLevel() < productQuantity)
                {
                    lblErrorBasket.setText("Current quantity exceeds stock");
                }
                else
                {
                    OrderLine orderLine = new OrderLine(0, selectedProduct, productQuantity); //OrderLine(int orderLineIdIn, Product productIn, int quantityIn)

                    if(currentOrder.addOrderLine(orderLine))
                    {
                        lblErrorBasket.setText("Product Successfully Added To Basket");

                        currentOrder.calculateOrderTotal();
                    }
                    else 
                    {
                        lblErrorBasket.setText("Error: Product Already In Basket");
                    }
                }
            }
            

        }

    }//GEN-LAST:event_btnAddToBasketActionPerformed

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

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed

    }//GEN-LAST:event_txtQuantityActionPerformed

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
            java.util.logging.Logger.getLogger(BrowseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrowseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrowseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrowseProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new BrowseProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToBasket;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnViewBasket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblErrorBasket;
    private javax.swing.JLabel lblProducts;
    private javax.swing.JList<String> listCatagories;
    private javax.swing.JList<String> listProducts;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
