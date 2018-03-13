/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author USER
 */
public class Problem3 {
    public static void main(String[] args) {
        int[][] arr = {{3,4,9}, {2,9,11}, {4,6,0}};
        int sum = 0;
        int[] colSum = new int[3];
        //Calculating row
        System.out.println("Sum of each row:");
        for(int i=0; i<3; i++){
            sum = 0;
            for(int j=0; j<3; j++){
                sum+= arr[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println("");
        
        System.out.println("Sum of each column: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                colSum[j] += arr[i][j];
            }
        }
        System.out.println(colSum[0] + " " + colSum[1]+ " "+colSum[2]);
        
        int diagonalSum = 0;
        for(int i=0; i<3; i++){
            for(int j = 0; j<3 ; j++){
                if(i==j)
                    diagonalSum+= arr[i][j];
            }
        }
        System.out.println("Diagonal 1 sum: " + diagonalSum);
        
        diagonalSum = 0;
        for(int i=0; i<3; i++){
            for(int j = 0; j<3 ; j++){
                if(i+j==2)
                    diagonalSum+= arr[i][j];
            }
        }
        System.out.println("Diagonal 2 sum" +diagonalSum);
    }
}
