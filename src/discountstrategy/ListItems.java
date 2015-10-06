/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Thomas
 */
public class ListItems {
    private int qty;
    private Product product;

    public ListItems(int qty, Product product) {
        this.qty = qty;
        this.product = product;
    }

   
    
    public double getSubtotal(){
        return product.getUnitPrice() * qty;
    }
    
    public double getSubtotalDiscount(){
        return getSubtotal() - product.getDiscountProductTotal(qty);
    }
    
    public String getProdId(){
        return product.getProdId();
    }
    
    public String getName() {
        return product.getName();
    }
    
    public double getUnitPrice(){
        return product.getUnitPrice();
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public static void main(String[] args) {
        ListItems items = new ListItems(4, new Product("A100","Shorts", 40.00, new PercentOffDiscount(.25)));
        double subtotal = items.getSubtotal();
        double subtotalDiscount = items.getSubtotalDiscount();
        
        System.out.println("My number should be 160 and it is: " + subtotal);
        System.out.println("My discount should be 40 and it is: " + subtotalDiscount);
        
    }
}
