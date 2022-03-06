/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixes;

import java.util.Scanner;

import java.util.Random;
public class Matrixes {

    
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        Random rnd = new Random();
        System.out.println("here is the matrix ");
        int [][] arr=new int [12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                arr[i][j]=rnd.nextInt(10);
                System.out.print(arr[i][j]+" ");
               
            }
            System.out.println();
        }
        int x=0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr[i][j]==arr[i+1][j]&&arr[i][j]==arr[i][j+1]&&arr[i][j]==arr[i+1][j+1]) {
                    x++;
                    
                    
                }
            }
                   
        }
        System.out.println("there are " + x+ " quads ");
    }
    
}
