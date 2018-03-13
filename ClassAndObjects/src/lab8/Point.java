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
public class Point {
    private int x;
    private int y;
    
    Point(){}
    Point(int x, int y){
        this.x = x;
        this.y = y;
        
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y = y;
    }
    public String toString(){
        return ("( " + x + ", " + y + " )");
    }
    public double distance(Point point){
        double distance;
        
        double x = Math.pow(this.x - point.x,2);
        double y = Math.pow(this.y - point.y,2);
        distance = Math.sqrt(x+y);
        //System.out.println(x + " "+ y);
        return distance;
    }
    
}
