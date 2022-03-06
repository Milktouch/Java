/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithfiles;

import java.io.IOException;

/**
 *
 * @author User
 */
public class WorkingWithFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         try {
             myFilesWorker.writeToFile("C:\\Users\\User\\Documents\\myFile.txt","Johny , 12 , Gaming_", true);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            
            String []strs =  myFilesWorker.readFile("C:\\Users\\User\\Documents\\myFile.txt").split("_");
            for(String s : strs)
            {
                for (String str : s.split(",")) {
                    System.out.print(str);
                }
                System.out.println("");
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }

}
