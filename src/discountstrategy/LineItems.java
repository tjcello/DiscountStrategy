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
public class LineItems {
    private int qty;
    private Product product;
    private DatabaseAccessStrategy db;

    public LineItems(DatabaseAccessStrategy db, int qty, String prodId) {
        this.db = db;
        this.qty = qty;
        this.product = product;
    }

    public LineItems(){
        
    }
   
    private final Product findProduct(final String prodId){
        //validation needed
        return db.findProduct(prodId);
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

    public DatabaseAccessStrategy getDb() {
        return db;
    }

    public void setDb(DatabaseAccessStrategy db) {
        this.db = db;
    }
    
    
}
