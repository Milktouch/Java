/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digits;


import java.util.Scanner;
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int [] counter = new int[10];
        String kellet;
        
        for (int j = 0; j < 10; j++) {
            counter[j]=0;
        }
        System.out.print("Enter a seriesof digits:");
        kellet=in.next();       
                    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < kellet.length() ; j++) {
             if ((kellet.charAt(i)-48)==j) {
                 counter[j]++;
             }
        }
        }
        System.out.println("the results");    
        for (int i = 0; i < 10; i++) {
            System.out.println();
               
        }
        }
      
    }
    
}
