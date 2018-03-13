/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author USER
 */
public class Flower extends Plant {
    private boolean hasSmell;
    private boolean hasThorn;

    public Flower(String name, String color) {
        super(name, color);
    }
    
    public Flower(String name, String color, boolean hasSmell, boolean hasThorn) {
        super(name, color);
        this.hasSmell = hasSmell;
        this.hasThorn = hasThorn;
    }
    
    public Flower() {
    }

    public boolean isHasSmell() {
        return hasSmell;
    }

    public void setHasSmell(boolean hasSmell) {
        this.hasSmell = hasSmell;
    }

    public boolean isHasThorn() {
        return hasThorn;
    }

    public void setHasThorn(boolean hasThorn) {
        this.hasThorn = hasThorn;
    }

    @Override
    public String toString() {
        return super.toString()+"Flower{" + "hasSmell=" + hasSmell + ", hasThorn=" + hasThorn + '}';
    }
    
    
    
}
