
package tableencryption;

import java.util.Scanner;
import java.util.Random;

public class Tableencryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] table = new int[26][26];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j <= 26; j++) {
                System.out.print((i*26+j)+"|");
                table[j-1][i]=(i*26+j);
            }
            System.out.println();
        }
        System.out.println("Enter 1 for encryption 2 for decryption");
        int choice= scan.nextInt();
        System.out.println("enter the message");
        String msg = scan.next();
        msg.toLowerCase();
        String nm="";
        if (choice==1) {
            
            if (msg.length()%2==1) {
                Random rnd =new Random();
                msg+= (char)(rnd.nextInt(25)+97);
            }
            
            for (int i = 0; i < msg.length(); i+=2) {
                nm+=table[msg.charAt(i)-97][msg.charAt(i+1)-97];
                nm+="-";
            }
        }
        else{
            String [] arr=msg.split("-");
            boolean flag=false;
            for (int i = 0; i < arr.length; i++) {
                flag=false;
                for (int j = 0; j < 26&&flag==false; j++) {   
                    for (int k = 0; k < 26&&flag==false; k++) {
                        if (arr[i].equals(String.valueOf(table[j][k]))) {
                           nm+=(char)(j+97);
                           nm+=(char)(k+97);
                           flag=true;
                        }
                    }
                }
            }
            
        }
        System.out.println(nm);
    }
    
    
}
