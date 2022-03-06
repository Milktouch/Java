/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Encryption4 {

    public static String encrypt(String a){
        String nm="";
        int ind;
        char b;
        for (int i = 0; i < a.length(); i++) {
            ind=a.length()-i - 1;
            b=a.charAt(ind);
            nm+=(char)(b);
            
        }
        
        
       return nm; 
    }
    
    public static void main(String[] args) {
        int c,s=1;
        char a;
        String m="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message:");
        m=in.nextLine();
        m=m.toLowerCase();
        m=m.replaceAll(" ", "");
        m=encrypt(m);
        System.out.println(m);
    }
    
}
