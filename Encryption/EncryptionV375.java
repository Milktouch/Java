/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption3.pkg75;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Encryption375 {

    /**
     * @param args the command line arguments
     */
    public static String encrypt(String a){
        String nm="";
        int ind;
        char b;
        for (int i = 0; i < a.length(); i++) {
            ind=a.length()-i - 1;
            b=a.charAt(ind);
            nm+=(char)(b);
            
        }
        
        
       return nm; 
    }
    public static void main(String[] args) {
        int c,s=1;
        char a;
        String m,nm="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message:");
        m=in.nextLine();
        m=m.toLowerCase();
        m=m.replaceAll(" ", "");
        System.out.println("Type 1 for encryption or 2 for decryption:");
        c=in.nextInt();
        if (c==1) {
            for (int i = 0; i < m.length(); i++) {
                
                        
            a= m.charAt(i);
            
                if (s>0)
                {
                    if (a+s>122) {
                        nm+=(char)(a+s-26);
            }
                    else if (a+s<=122) {
                        nm+= (char)(a+s);
            } 
                    s+=1;
                    
                     
                }
                else if (s<0) {
                    if (a+s<97) {
                        nm+=(char)(a+s+26);
            }
                    else if (a+s>=97) {
                        nm+=(char)(a+s);
            } 
                    s-=1;
                    
                }
            s=-s;
            
        }
        }
        if (c==2) {
            m=encrypt(m);
            for (int i = 0; i < m.length(); i++) {
            a =m.charAt(i);
            if (s>0) {
                    if (a-s<97) {
                        nm+=(char)(a-s+26);
            }
                    else if (a-s>=97) {
                        nm+=(char)(a-s);
            } 
                    s+=1;
                    
                    
                }
                else if (s<0) {
                    if (a-s>122) {
                        nm+=(char)(a-s-26);
            }
                    else if (a-s<=122) {
                        nm+= (char)(a-s);
            } 
                    s-=1;
                      
                }
                s=-s;
            } 
                
            
            }   
        nm = encrypt(nm);
        System.out.println(nm);
        }
        
        
    }
    
    
    

