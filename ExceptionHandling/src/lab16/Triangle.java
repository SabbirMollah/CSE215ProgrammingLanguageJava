/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author USER
 */
public class Triangle {
    private int sideA, sideB, sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        try{
            if (sideA+sideB <= sideC || sideA+sideC <= sideB || sideB+sideC <= sideA ){
                throw new IllegalTriangleException("Not a valid triangle");
            }
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
                
        }
    }   
}
