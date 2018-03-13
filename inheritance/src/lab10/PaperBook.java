package lab10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PaperBook extends Book{
    private double shippingWeight;
    private int inStock;
    
    public PaperBook() {}
    
    public PaperBook(double shippingWeight, int inStock) {
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    public double getShippingWeight() {
        return shippingWeight;
    }

    public void setShippingWeight(double shippingWeight) {
        this.shippingWeight = shippingWeight;
    }

    public int getInStock() {
        return inStock;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }
    
    
}
