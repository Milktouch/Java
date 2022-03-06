/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Minesweeper {

    
    public static void main(String[] args) {
        int alive=5,tries=0;
        Scanner in=new Scanner(System.in);
        Random rnd = new Random();
        int x,y;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" square " + j+","+i +" | ");
            }
            System.out.println();
        }
        boolean [][] answerarr=new boolean [10][10];
        for (int i = 0; i < alive; i++) {
            
                System.out.println("Enter the x value of the square  you want to put  ship "+(i+1)+" in");
                x=in.nextInt();
                System.out.println("Enter the y value of the square  you want to put  ship "+(i+1)+" in");
                y=in.nextInt();
                
            
            
            
                
                if (answerarr[y][x]==true) {
                    while(answerarr[y][x]==true){
                        System.out.println("this square already has a ship in it choose another square");
                        System.out.println("Enter the x value of the square  you want to put a ship in");
                        x=in.nextInt();
                        System.out.println("Enter the y value of the square  you want to put a ship in");
                        y=in.nextInt();
                            
                    }
                }
                    else
                        answerarr[y][x]=true;
                
                    
                
            
            
            
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (answerarr[i][j]== false) {
                    System.out.print(answerarr[i][j]+" | ");
                   
                }
                else{
                    
                    System.out.print(answerarr[i][j]+"  | ");
                }
            }
            System.out.println();
        }
        
        while (alive>0){
            System.out.println("The enemy has shot a bomb");
            x=rnd.nextInt(10);
            y=rnd.nextInt(10);
            System.out.println("it landed in square "+x+","+y);
            if (answerarr[y][x]==true) {
                answerarr[y][x]=false;
                System.out.println("IT HIT! The ship has sank down");
                alive--;
                
            }
            else{
                System.out.println("it missed");
            }
            tries++;
        }
        System.out.println("game over! Then enemy wasted "+tries+" bombs");
    }
    
}
