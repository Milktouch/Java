/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morsecodeencryption;

import java.util.HashMap;
import java.util.Scanner;
public class Morsecodeencryption {
    public static String decrypt(String msg){
        HashMap<Character, String> morsecode = new HashMap<Character, String>();
        morsecode.put('a', "._");
        morsecode.put('b', "_...");
        morsecode.put('c', "_._.");
        morsecode.put('d', "_..");
        morsecode.put('e', ".");
        morsecode.put('f', ".._.");
        morsecode.put('g', "__.");
        morsecode.put('h', "....");
        morsecode.put('i', "..");
        morsecode.put('j', ".___");
        morsecode.put('k', "_._");
        morsecode.put('l', "._..");
        morsecode.put('m', "__");
        morsecode.put('n', "_.");
        morsecode.put('o', "___");
        morsecode.put('p', ".__.");
        morsecode.put('q', "__._");
        morsecode.put('r', "._.");
        morsecode.put('s', "...");
        morsecode.put('t', "_");
        morsecode.put('u', ".._");
        morsecode.put('v', "..._");
        morsecode.put('w', ".__");
        morsecode.put('x', "_.._");
        morsecode.put('y', "_.___");
        morsecode.put('z', "__..");
        String nm="";
        String  [] str = msg.split("$");
        for (int i = 0; i < str.length; i++) {
            String morse=str[i];
            for ( Character key : morsecode.keySet() ) {
                if (str[i].equals(morsecode.get(key))) {
                    char c=key;
                    nm+=c;
                }
            }
        }
        return nm;
    }
    public static String encrypt(String msg){
        HashMap<Character, String> morsecode = new HashMap<Character, String>();
        morsecode.put('a', "._");
        morsecode.put('b', "_...");
        morsecode.put('c', "_._.");
        morsecode.put('d', "_..");
        morsecode.put('e', ".");
        morsecode.put('f', ".._.");
        morsecode.put('g', "__.");
        morsecode.put('h', "....");
        morsecode.put('i', "..");
        morsecode.put('j', ".___");
        morsecode.put('k', "_._");
        morsecode.put('l', "._..");
        morsecode.put('m', "__");
        morsecode.put('n', "_.");
        morsecode.put('o', "___");
        morsecode.put('p', ".__.");
        morsecode.put('q', "__._");
        morsecode.put('r', "._.");
        morsecode.put('s', "...");
        morsecode.put('t', "_");
        morsecode.put('u', ".._");
        morsecode.put('v', "..._");
        morsecode.put('w', ".__");
        morsecode.put('x', "_.._");
        morsecode.put('y', "_.___");
        morsecode.put('z', "__..");
        String nm="";
        for (int i = 0; i < msg.length(); i++) {
            nm+= morsecode.get(msg.charAt(i));
            nm+='$';
        }
        
        return nm;
    }
    public static void main(String[] args) {
       String nm="";
       Scanner scan = new Scanner(System.in);
       System.out.println("enter the message");
       String msg= scan.nextLine();
       System.out.println("type 1 for encrytion or 2 for decryption");
       int choice=scan.nextInt();
        if (choice==1) {
            nm=encrypt(msg);
        }
        else{
            nm=decrypt(msg);
        }
        System.out.println(nm);
   }
}
