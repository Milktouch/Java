/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption3.pkg5;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Encryption35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c;
        char a;
        String m,nm="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message:");
        m=in.next();
        m=m.toLowerCase();
        m=m.replaceAll(" ", "");
        System.out.println("Type 1 for encryption or 2 for decryption:");
        c=in.nextInt();
        if (c==1) {
            for (int i = 0; i < m.length(); i++) {
            a= m.charAt(i);
            if (a+i>122) {
                nm+=(char)(a+i-26);
            }
            if (a+i<=122) {
                nm+= (char)(a+i);
            } 
        }
        }
        if (c==2) {
            for (int i = 0; i < m.length(); i++) {
            a =m.charAt(i);
            if (a-i<97) {
                nm+=(char)(a-i+26);
            }
            if (a-i>=97) {
                nm+=(char)(a-i);
            } 
                    
            }
                
        }
        System.out.println(nm);
        
    }
    
}
