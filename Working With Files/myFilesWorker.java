/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithfiles;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author User
 */
public class myFilesWorker {
    
    private static FileInputStream fis;
    private static FileOutputStream fos;
    private static FileWriter writer;
    private static BufferedWriter buffer; 
            
            
    public static String readFile(String path) throws IOException{
        
        String data="";
        fis = new FileInputStream(path);
        int c;
        while((c=fis.read())!=(-1))
        {
            data += (char)c;
        }
        fis.close();
        return data;
    }
    
    public static void writeToFile(String path,String data,boolean mode)throws IOException
    {
        if(mode) //this is append option
        {
            
            writer = new FileWriter(path,mode);
            buffer = new BufferedWriter(writer);
            buffer.newLine();
            buffer.append(data);
            buffer.close();
            writer.close();
        }
        else //this is over-writing the old data in the file
        {
            fos = new FileOutputStream(path);
            fos.write(data.getBytes());
            fos.close();
        }
    }
}
