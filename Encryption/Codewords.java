/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewords;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Codewords {
    public static String insertspace(String str, int[] s) {
        int from=0;
        String str2 ="";
        for (int i = 0; i < s.length; i++) {
            str2+=str.substring(from,from+s[i]);
            str2+=" ";
            from += s[i];
            
        }
        return str2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String message, newmessage;
        int words;
        System.out.println("enter how many words");
        words=in.nextInt();
        int [] spaces=new int[words];
        System.out.println("enter the message");
        message=in.next();
        for (int i = 0; i < spaces.length; i++) {
            System.out.println("enter the amount of letters in word "+(i+1));
            spaces[i] =in.nextInt();
            
        }
        newmessage=insertspace(message,spaces);
        System.out.println(newmessage);
    }
    
}
