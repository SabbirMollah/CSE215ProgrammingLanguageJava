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
public class Plant {
    private String name;
    private String color;

    public Plant(String name, String color) {
        this.name = name;
        this.color = color;
    }
    
    public Plant(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plant{" + "name=" + name + ", color=" + color + '}';
    }
    
    
}
