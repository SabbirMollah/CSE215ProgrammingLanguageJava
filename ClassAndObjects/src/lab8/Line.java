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
public class Line {
    private Point start;
    private Point end;
    
    public Line(Point start, Point end){
        this.start = new Point(start.getX(), start.getY());
        this.end = new Point(end.getX(), end.getY());
    }
    public Line(int x1, int y1, int x2, int y2){
        start = new Point(x1,y1);
        end = new Point(x2,y2);
    }
    public Line(){
        start = new Point();
        end = new Point();
    }
    
    public Point getStart(){
        Point p = new Point();
        p.setX(start.getX());
        p.setY(start.getY());
        return p;
    }
    public Point getEnd(){
        Point p = new Point();
        p.setX(end.getX());
        p.setY(end.getY());
        return p;
    }
    public void setStart(Point point){
        start.setX(point.getX());
        start.setX(point.getY());
    }
    public void setEnd(Point point){
        end.setX(point.getX());
        end.setX(point.getY());
    }
    public double length(){
        return start.distance(end);
    }  
}
