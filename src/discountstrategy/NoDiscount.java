/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author tduwe
 */
public class NoDiscount implements DiscountStrategy {
    private double discountRate;
    
    public NoDiscount(double discountRate){
        this.discountRate = discountRate;
    }
    
    @Override
     public double getDiscountProductTotal(double unitPrice, int quantity){
        return 0;
    };

    @Override
    public double getAmountSaved(double unitPrice, int quantity) {
        return unitPrice * quantity - discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;    
    }
    
    public static void main(String[] args) {
        DiscountStrategy discount = new NoDiscount(0);
        double amount = discount.getDiscountRate();
        System.out.println("Discount Amount:" + amount);
    }
    
}
