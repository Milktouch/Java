/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption.pkg5;

import java.util.Scanner;

/**
 *
 * @author bayah
 */
public class Encryption5 {

    public static String zigzagen(String m){
        String nm="";
        m=m.replaceAll(" ", "");
        for (int i = 0; i < m.length(); i++) {
            if (i%2==0) {
                nm+=m.charAt(i);
            }
            
        }
        nm+=" ";
        for (int i = 0; i < m.length(); i++) {
            if (i%2==1) {
                nm+=m.charAt(i);
            }
            
        }
        return nm;
    }
    public static String zigzagde(String m){
        String m1,m2,nm="";
        String[] arr=m.split(" ");
        m1=arr[0];
        m2=arr[1];
        for (int i = 0; i < m1.length(); i++) {
            nm+= m1.charAt(i);
            if (i<m2.length()) {
                nm+=m2.charAt(i);
                
            }
        }
        return nm;
    }
    public static void main(String[] args) {
        String m,nm="";
        int c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message:");
        m=in.nextLine();
        m=m.toLowerCase();
        
        System.out.println("Type 1 for encryption or 2 for decryption:");
        c=in.nextInt();
        if (c==1) {
            nm=zigzagen(m);
        }
        if (c==2) {
            nm=zigzagde(m);
        }
        System.out.println(nm);
    }
    
}
