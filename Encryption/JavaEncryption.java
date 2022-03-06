/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencryption;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaEncryption {

    public static String e(String m){
        char a;
        String newm ="";
        for (int i = 0; i < m.length(); i++) {
           a = m.charAt(i);
           newm += (char)('z'-a+'a');
           
           
           
           
           
        }
        return newm;
    }
    public static void main(String[] args) {
        String message = "";
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the message");
        message = in.nextLine();
        message.toLowerCase();
        message = e(message);
        System.out.println(message);
        
    }
    
}
