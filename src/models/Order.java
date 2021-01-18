/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author mark
 */
public class Order {
    //private variables
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String status;
    private HashMap<Integer, OrderLine> orderLines;
    
    public void addOrderLine(OrderLine ol)
    {
        int orderLineId = 0;

        //while loop that creates a unique OrderLineId by increasing from 0 until one doesn't match
        while (orderLines.containsKey(orderLineId))
        {
            orderLineId++;
        }

        //set the orderline to the 'orderLineId' number
        ol.setOrderLineId(orderLineId);

        //add that number to the orderLines hashmap (Key, Value) => (orderLineId, ol)
        orderLines.put(orderLineId, ol);
    }
    
    //getters and setters
    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the orderDate
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the orderTotal
     */
    public double getOrderTotal() {
        return orderTotal;
    }

    /**
     * @param orderTotal the orderTotal to set
     */
    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    public HashMap<Integer, OrderLine> getOrderLines() {
        return orderLines;
    }

    /**
     * @param orderLines the orderLines to set
     */
    public void setOrderLines(HashMap<Integer, OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
    
    
    //constructors
    public Order()
    {
        orderId = 0;
        orderDate = new Date();
        orderTotal = 0;
        status = "IN PROGRESS";
        orderLines = new HashMap<Integer, OrderLine>();
    }
    
    //constructor with *EVERYTHING EXCEPT orderLines*
    public Order(int orderIdIn, Date orderDateIn, double orderTotalIn,
            String statusIn)
    {
        orderId = orderIdIn;
        orderDate = orderDateIn;
        orderTotal = orderTotalIn;
        status = statusIn;
        orderLines = new HashMap<Integer, OrderLine>();
    }
}
