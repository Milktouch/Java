/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption3;

import java.util.Scanner;

/**
 *
 * 
 * @author User
 */
public class Encryption3 {

    /**
     * @param args the command line arguments
     */                                       
    public static void main(String[] args) {
        int s,c;
        char a;
        String m,nm="";
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for encryption or 2 for decryption:");
        c=in.nextInt();
        System.out.println("Enter the message:");
        m=in.next();
        m.toLowerCase();
        m=m.replaceAll(" ", "");
        System.out.println("Enter the shift:");
        s=in.nextInt();
        
            
        if (c==1) {
            for (int i = 0; i < m.length(); i++) {
            a= m.charAt(i);
            if (a+s>122) {
                nm+=(char)(a+s-26);
            }
            if (a+s<=122) {
                nm+= (char)(a+s);
            } 
        }
        }
        if (c==2) {
            for (int i = 0; i < m.length(); i++) {
            a =m.charAt(i);
            if (a-s<97) {
                nm+=(char)(a-s+26);
            }
            if (a-s>=97) {
                nm+=(char)(a-s);
            } 
                    
            }
                
        }
            
        
        System.out.println(nm);
        

        
        
    }
    
}
