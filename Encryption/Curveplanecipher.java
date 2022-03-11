/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curveplanecipher;

import java.util.Scanner;



public class Curveplanecipher {
    public static String encrypt(String a){
        String nm="";
        int ind;
        char b;
        for (int i = 0; i < a.length(); i++) {
            ind=a.length()-i - 1;
            b=a.charAt(ind);
            nm+=(char)(a.charAt(a.length()-i - 1));
            
        }
        
        
       return nm; 
    }
    public static String curvelanede(String m){
        String nm="";
        int size=m.length(),index=0;
        size = (int)Math.ceil(Math.sqrt(size));
        char[][] arr=new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size*i+j>=m.length()) {
                    continue;
                }
                if ((size-i-1)%2==0) {
                    arr[j][i]=m.charAt(index);
                }
                else{
                    arr[size-1-j][i]= m.charAt(index);
                }
                index++;
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                nm+=arr[i][j];
            }
        }
        //nm=encrypt(nm);
        return nm;
    }
    public static String curvelaneen (String m){
        String nm="";
        int size=m.length();
        
        size = (int)Math.ceil(Math.sqrt(size));
        char[][] arr=new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (size*i+j>=m.length()) {
                    continue;
                }
                arr[i][j]=m.charAt(i*size+j);
                
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                if (i%2==0) {
                    nm+=arr[size-j-1][i];
                }
                else if (i%2==1) {
                    nm+=arr[j][i];
                }
            }
        }
        
        return nm;

}

    
   
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("enter the message");
            String msg = scanner.nextLine();
            System.out.println("type 1 for encryption ot 2 for decryption");
            int c=scanner.nextInt();
            if(c==1){
                msg=curvelaneen(msg);
            }
            if (c==2) {
                msg=curvelanede(msg);
            }
            System.out.println(msg);
        }
    }
    
}
