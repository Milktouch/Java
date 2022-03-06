/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spiralencryption;

import java.util.Scanner;

/**
 *
 * @author bayah
 */
public class Spiralencryption {
    public static String spiralde(String m,int size){
        String nm="";
        char [][] table =new char[size][size];
        int count=0;
        for (int i = 0; i < (size*2)-1; i++) {
            switch(i%4){
                case 0:
                    for (int j = i/4; j < size-(i/4); j++) {
                        table[i/4][j]=m.charAt(count);
                        count++;
                    }
                    break;
                case 1:
                    for (int j = (i/4)+1; j < size-(i/4); j++) {
                        table[j][size-((i/4)+1)]=m.charAt(count);
                        count++;
                    }
                    break;
                case 2:
                    for (int j = size-(i/4)-2; j >= i/4; j--) {
                        table[size-((i/4)+1)][j]=m.charAt(count);
                        count++;
                    }
                    break;
                case 3:
                    for (int j = size-(i/4)-2; j >= (i/4)+1; j--) {
                        table[j][i/4]=m.charAt(count);
                        count++;
                    }
                    break;
            }
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size*i+j>=m.length()) {
                   nm+= ' ';
                    continue;
                }
                nm+=table[i][j];
            }
        }
        return nm;
    }

    public static String spirlaen(String m,int size){
        String nm="";
        
        
        char [][] table =new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size*i+j>=m.length()) {
                    table[i][j]=' ';
                    continue;
                }
                table[i][j]=m.charAt(i*size+j);
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(table[i][j] + "|");
            }
            System.out.println();
            for (int j = 0; j < 10; j++) {
                System.out.print("_");
            }
            System.out.println();
        }
        for (int i = 0; i < (size*2)-1; i++) {
            switch(i%4){
                case 0:
                    for (int j = i/4; j < size-(i/4); j++) {
                        nm+=table[i/4][j];
                    }
                    break;
                case 1:
                    for (int j = (i/4)+1; j < size-(i/4); j++) {
                        nm+=table[j][size-((i/4)+1)];
                    }
                    break;
                case 2:
                    for (int j = size-(i/4)-2; j >= i/4; j--) {
                        nm+=table[size-((i/4)+1)][j];
                    }
                    break;
                case 3:
                    for (int j = size-(i/4)-2; j >= (i/4)+1; j--) {
                        nm+=table[j][i/4];
                    }
                    break;
            }
        }
        
        return nm;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("enter the message");
        String msg = in.nextLine();
        System.out.println("type 1 for encryption ot 2 for decryption");
        int c=in.nextInt();
        int size = (int)Math.ceil(Math.sqrt(msg.length()));
        if(c==1){
            msg=spirlaen(msg,size);
        }
        if (c==2) {
            msg=spiralde(msg,size);
        }
        System.out.println(msg);
    }
    
}
