/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playfair_encryptiob;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Playfair_encryptiob {

    public static String[][] createtable(){
        int num,count=0; boolean found=false;
        String str="";
        String [][] table=new String[4][8];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                found=false;
                count=0;
                        while (found==false) {
                            num = rnd.nextInt(32);
                            if (num>0) {
                            num-=24;
                            str=String.valueOf(num);
                            }
                            else{
                            str=String.valueOf((char)(num+97));
                            }
                            count=0;
                            for (int k = 0; k < 4; k++) {
                                for (int l = 0; l < 8; l++) {
                                    if (str.equals(table[k][l])) {
                                        count++;
                                    }
                                }
                            }
                            if (count==0) {
                                table[i][j]=str;
                                found=true;
                            }
                        }
                        
                        }
                        
                        
                   
                
            }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(table[i][j]+"|");
            }
            System.out.println();
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your message");
        String msg = scan.nextLine();
        String [][] table=createtable();
    }
    
}
