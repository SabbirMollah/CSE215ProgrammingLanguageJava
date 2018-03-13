/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author USER
 */
public class PercentageDiscount implements Discountable {
    private double percentage;
    
    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    
    @Override
    public double discountedPrice(double price) {
        return price-price*percentage;
    }
    
    
}
