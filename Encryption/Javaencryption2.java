
package javaencryption2;

import java.util.Scanner;


public class Javaencryption2 {
    public static String e(String m){
        char a;
        String newm ="";
        for (int i = 0; i < m.length(); i++) {
           a = m.charAt(i);
            if (a-97<13) {
                newm += (char)(a+13);
            }
            if (a-97>=13) {
                newm += (char)(a-13);          
            }
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
