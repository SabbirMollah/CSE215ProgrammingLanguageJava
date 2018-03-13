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
public class Lab13 {
    static int index = 0;
    
    static void add(Plant[] plants, Plant p){
        plants[index] = p;
        index++;
    }
    /*static void remove(Plant[] plants, String n){
        
    }*/
    
    static Plant search(Plant[] plants, String n){
        
        for(int i=0; i<index; i++){
            if(plants[i].getName().toLowerCase().equals(n.toLowerCase())){
                //System.out.println(plants[i].toString());
                return plants[i];
            }
        }
        return null;
    }
    
    static void display(Plant[] plants){
        for(int i=0; i<10;i++){
            System.out.println(plants[i].toString());
        }
    }
    
    public static void main(String[] args) {
        
        Plant[] plants = new Plant[100];
        
        for(int i=0; i<10; i++){
            plants[i] = new Flower("Rose"+i,"Color"+i);
            index++;
        }
        
        //display(plants);
        
        /*Plant p1 = new Plant("abc", "red");
        Flower p2 = new Flower("def", "black",false,false);
        Plant p3 = new Flower("ghi","purpe", false, false);*/
        
        Plant p = search(plants, "Rose1");
    }
    
}
