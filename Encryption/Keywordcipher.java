
package keywordcipher;
import java.util.Arrays;
import java.util.Scanner;

public class Keywordcipher {
    public static String encryption(String msg,int[]key){
        String nm="";
        for (int i = 0; i < msg.length(); i++) {
            nm+= (char)((msg.charAt(i))+(key[i%(key.length)]));
        }
        return nm;
    }
    public static String decryption(String msg,int[]key){
        String nm="";
        for (int i = 0; i < msg.length(); i++) {
            nm+= (char)((msg.charAt(i))-(key[i%(key.length)]));
        }
        return nm;
    }

    public static int[] getorder(String key){
        int[] order=new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            order[i]=(int)(key.charAt(i));
        }
        for (int i = 0; i < order.length; i++) {
            order[i]-=96;
        }
        Arrays.sort(order);
        return order;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the message");
        String msg=scan.nextLine();
        System.out.println("Enter the keyword");
        String key=scan.next();
        System.out.println("type 1 for encryption and 2 for decryption");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                int[] order = getorder(key);
                msg=encryption(msg,order);
                break;
            case 2:
                int[] keyorder = getorder(key);
                msg=decryption(msg,keyorder);
        }
        System.out.println(msg);
    }
    
} 


