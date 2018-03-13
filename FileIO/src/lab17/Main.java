/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab17;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author USER
 */
public class Main {
    
    public static String highest(Quiz[] list){
        int index=0;
        int max =list[0].getMark();
        
        for(int i=0; i<(list.length)-1; i++){
            if(list[i].getMark()>max ){
                index = i;
                max = list[i].getMark();
            }
        }
        return "ID: "+ list[index].getId()+" mark: "+list[index].getMark();
    }
    
    public static void main(String[] args) {
        
        File file = new File("Record.txt");
        int numOfEntry = 0;
        Scanner read = null;
        try {
            read = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(read.hasNext()){
            read.nextLine();
            numOfEntry++;
        }
        
        Quiz[] quizList = new Quiz[numOfEntry];
        for(int i=0 ; i<numOfEntry; i++){
            quizList[i] = new Quiz();
        }
        //System.out.println(quizList.length);
        
        Scanner read2 = null;
        try { 
            read2 = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0 ; i<numOfEntry ; i++){
            
            quizList[i].setId(read2.next());
            quizList[i].setMark(Integer.parseInt(read2.next()));
                
        }
        
//        System.out.println(read2.next());
        
//        for(Quiz quiz: quizList){
//            System.out.println(quiz.getMark());
//        }
        System.out.println(highest(quizList));
        
    }
    
}
