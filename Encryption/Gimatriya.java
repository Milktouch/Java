
package gimatriya;

import java.util.Arrays;
import java.util.Scanner;


public class Gimatriya {
    public static String Encrypt(String msg){
        int[]g;
        int x=0,a=0;
        msg=msg.replaceAll(" ","");
        msg=msg.toLowerCase();
        for (int i = 0; i < msg.length(); i++) {
            if(msg.charAt(i)>='a'&& msg.charAt(i)<='z'){
                x++;
                
            }
            
                
        }
        g=new int[x];
        for (int i = 0; i < x; i++) {
            if(msg.charAt(i)>='a'&& msg.charAt(i)<='z'){
                g[a]=msg.charAt(i)-97;
                a++;
                
            }
        }
        return Arrays.toString(g);
    }
    public static String Decrypt(String msg){
    String f="";
    msg=msg.replaceAll("[", "");
    msg=msg.replaceAll("]", "");
    String [] g=msg.split(", ");
    int[] h=new int[g.length];
    for (int i = 0; i < g.length; i++) {
        h[i]=Integer.parseInt(g[i]);
            
    }
    for (int j = 0; j < h.length; j++) {
        f+=(char)(h[j]+97);
            
    }
        return f;
    }

    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input,emsg="",dmsg="";
        int c;
        System.out.println("Enter 1 to encrypt or 2 to decrypt");
        c=in.nextInt();
        if (c==1) {
            System.out.println("Enter message to encrypt");
        input=in.next();
        emsg=Encrypt(input);
        System.out.println("The encrypted message is: " + emsg);
        }
        if (c==2){
            System.out.println("Enter message to decrypt");
        input=in.next();
        dmsg=Decrypt(input);
        System.out.println("The decrypted message is: " + dmsg);
        }
    }
    
}
