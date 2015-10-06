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
public class Product {
    private String prodId;
    private String Name;
    private double unitPrice;
    private DiscountStrategy discount;

    public Product(String prodId, String Name, double unitPrice, DiscountStrategy discount) {
        this.prodId = prodId;
        this.Name = Name;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }
    
     public double getDiscountProductTotal(int qty){
        return discount.getDiscountProductTotal(unitPrice,qty);
    };

    public double getAmountSaved(int qty){
        return discount.getAmountSaved(unitPrice, qty);
    };
    
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    public static void main(String[] args) {
        Product product = new Product("A100","Hat",20.00,new PercentOffDiscount(.10));
        double amountSaved= product.getAmountSaved(2);
        System.out.println("Expect 2.00, and got:" + amountSaved);
    }
    
}
