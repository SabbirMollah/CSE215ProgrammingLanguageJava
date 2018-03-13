/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author USER
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square sq = new Square("Bob", 10);
        System.out.println(sq.area() + " " + sq.perimeter() );
        
        EBook eb = new EBook("www.hey.com", 10 , "123" , "The King", "Sabbir", 120);
        System.out.println(eb.toString());
    }
    
}
