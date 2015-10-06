/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author alancerio18
 */
public interface DiscountStrategy {

    double getAmountSaved(double unitPrice, int quantity);

    double getDiscountProductTotal(double unitPrice, int quantity);

    double getDiscountRate();

    void setDiscountRate(double discountRate);
    
}
