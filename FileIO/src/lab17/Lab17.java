/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

/**
 *
 * @author USER
 */
import java.io.*;
import java.util.Scanner;


public class Lab17 {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        File file = new File("hello.txt");
        
        PrintWriter pw = null;
        try{
            pw = new PrintWriter(file);
        }
        catch(Exception ex){
            System.out.println("File not found");
        }
        
        while(true){
            int x = input.nextInt();
            if(x<0){
                break;
            }
            pw.println(x);
        }
        
        pw.close();
        
        int sum = 0;
        int count=0;
        
        Scanner read = new Scanner(file);
        while(read.hasNext()){
            sum += read.nextInt();   
            read.nextLine();
            count++;
        }
        
        System.out.println("Average is: " + (double)sum/count);
        
        
    }
    
}
