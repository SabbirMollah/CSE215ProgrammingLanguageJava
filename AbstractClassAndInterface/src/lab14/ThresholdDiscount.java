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
public class ThresholdDiscount implements Discountable {
    private double discount;
    private double threshold;

    public ThresholdDiscount(double discount, double threshold) {
        this.discount = discount;
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }
    
    @Override
    public double discountedPrice(double price) {
        if(threshold>150)
            return price-discount;
        return price;
    }
}
