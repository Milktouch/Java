/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionsnations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author User
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
          //****************************************       
//     
        for (int i = 0; i < 7; i++) {
            
            for (int j = 0; j < 7-i; j++) {
                
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
        
     //****************************************       
//    
//        int[][] arr = new int[10][];
//           for (int[] item: arr) {
//               item = new int[10];
//           }
//        for(int i =0 ; i <10 ;i++)
//        {
//            for (int j = 0; j < 10; j++) {
//                System.out.print((i+1)*(j+1)+"\t");
//            }
//            System.out.println("");
//        }
//     
        
 //****************************************       
//        File f = new File("c:/Users/User/Downloads/myText.txt");
//        try {
//
//            FileInputStream fis = new FileInputStream(f);
//            int c;
//            while ((c = fis.read()) != (-1)) {
//                System.out.print((char) c);
//            }
//            System.out.println("");
//        } catch (IOException ex) {
//
//            boolean flag = true;
//            while (flag) {
//                System.out.println("error in reading file " + ex.getMessage());
//                try {
//                    f.createNewFile();
//                    flag = false;
//                } catch (IOException e) {
//                }
//            }
//        }
 //****************************************  
//        int[] arr = {1,2,3};
//        // ->> | 1 | 2 | 3 |
//        int i = new Random().nextInt(10);
//        try{
//            if(i>(arr.length-1))
//            {
//                IndexOutOfBoundsException ex = new IndexOutOfBoundsException(String.valueOf(i));
//             
//                throw ex;
//            }
//            else{
//                arr[i] =  6;
//            }
//        }
//        catch(IndexOutOfBoundsException ex)
//        {
//            System.out.println("the error is : "+ex.getMessage());
//           // add the number to the array
//           int[] temp_arr = new int[arr.length];
//           for (int j=0 ; j < arr.length;j++) {
//                temp_arr[j] = arr[j];
//            }
//           arr = new int[temp_arr.length+1];
//           
//           for (int j=0 ; j < temp_arr.length;j++) {
//                arr[j] = temp_arr[j];
//            }
//           arr[arr.length-1] = 6;
//          
//        }
//        finally{
//             i=0;
//            for (int u : arr) {
//              
//                System.out.println(" index : "+i+ "  -  value : "+ String.valueOf(u));
//                i++;
//            }
//        }
    }

}
