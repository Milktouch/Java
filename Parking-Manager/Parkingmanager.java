/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmanager;

import java.util.Scanner;

import java.util.Random;
public class Parkingmanager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random rnd = new Random();
        int floors=0,spaces=0,whilelloop=0,iffree=0,car=0;
        String answer;
        boolean ifleave=true;
        Scanner in=new Scanner(System.in);
        System.out.println("how much floors?");
        floors=in.nextInt();
        System.out.println("how much space in each floor?");
        spaces=in.nextInt();
        boolean [][] space = new boolean [floors][spaces];
        
           for (int i = 0; i < floors; i++) {
            for (int j = 0; j < spaces; j++) {
                space[i][j]=rnd.nextBoolean();
                if (space[i][j]== false) {
                    System.out.print(space[i][j]+" | ");
                    iffree++;
                }
                else{
                    
                    System.out.print(space[i][j]+"  | ");
                }
                    
                
               
            }
            System.out.println();
        }
        while(whilelloop==0){
            int i,j;
            if (iffree>=1) {
                ifleave=rnd.nextBoolean();
                    
                           while (ifleave==true) {
                                i=rnd.nextInt(floors);
                                j=rnd.nextInt(spaces);
                                if (space[i][j]== true) {
                                    System.out.println("the car thats was parked on floor number " + i + " space number " + (j+1) +" has left");
                                    iffree--;
                                    car--;
                                    space[i][j]=false;
                                    ifleave=false;
                                }
                       
                    }
            }
            ifleave=rnd.nextBoolean();
            if (ifleave==true) {
                System.out.println("a car is approaching");
            car=1;
            }
            
            for ( i = 0; i < floors; i++) {
                for ( j = 0; j < spaces; j++) {
                    if (space[i][j]== false) {
                        if (car>0) {
                            System.out.println("the car has parked on floor number " + i + " space number " + (j+1) );
                            iffree--;
                            car=0;
                            space[i][j]=true;
                        }
                    }        
                }
            }
            if (car==1) {
                System.out.println("oh no the car has no where to park!");
            }
            else if (car>1) {
                System.out.println("oh no " + car + "have no where to park");
            }
            System.out.println("press enter to countinue");
            answer=in.next();
        }
    }
}
    

