/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author USER
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1 = new Point(10,2);
        Point p2 = new Point(1,2);
        System.out.println( p1.distance(p2));
        
        Line L1 = new Line(10,2,2,2);
        System.out.println(L1.length());
    }
}
