/**
 * 
 */
/**
 * @author cobysci
 *
 */
package Image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class buffer{
	
	private BufferedImage img ;
	private int size,X,Y;
	private String ImageNameSave,ImageNameLoad;
	 
	public buffer(int size)
	{
		this.size=size;
		 img = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB );
		 X=0;
		 Y=0;
		 ImageNameLoad="picture.jpg";
		 ImageNameSave="result_pic.png";
	}
	
	public boolean fillArray(int r,int g, int b)
	{
		X=0;
		Y=0;
      int col = (r << 16) | (g << 8) | b;
        try{
        	if(Y<=size)
        	{
        		img.setRGB(X, Y, col);
        		X++;
        		if(X>=size)
        		{	
        			X=0;
        			Y++;
        		}
        	}
		}catch(Exception ex){
            System.out.println(X+" "+Y);
			return false;
		}
        return true;
	}
	
	public boolean printArray()
	{
		
		Color mycolor ;//= new Color(img.getRGB(x, y));
        try{
        	
        	for(int i=0;i<img.getHeight()/3;i++)
        	{	
        		for(int j = 0;j<img.getWidth()/3 ; j++)
        		{
        			mycolor = new Color(img.getRGB(i,j));
        			
        			System.out.print("["+mycolor.getRed()+","+mycolor.getGreen()+","+mycolor.getBlue()+"]  ");
        			
        		}
                System.out.println();
        	}
        	
        	
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
        return true;
	}
	
	public void Load(){
		X=0;
		Y=0;
		try{
			
			 img.flush();
			 File imgPath = new File(ImageNameLoad);
			 img= ImageIO.read(imgPath);
			 X=  img.getWidth();
			 Y=  img.getHeight();
			 size = X*Y;
			 
		}
		catch(Exception ex)
		{
			System.out.println("path not found");
		}
				
	}
	
	public boolean save()
	{
		try{
			
            File f = new File(ImageNameSave);
//            int r = 5;
//            int g = 25;
//            int b = 255;
//            
//            int col = (r << 16) | (g << 8) | b;
//            System.out.println(col);
//            
//            for(int x = 0; x < size; x++){
//                for(int y = 0; y < size; y++){
//                    img.setRGB(x, y, col);
//                }
//            }
            
            ImageIO.write(img, "PNG", f);
            return true;
        }
        catch(Exception e){
            e.printStackTrace();
            return true;
        }
	}

	public boolean add_to_pixels(int r,int g , int b)
	{
		

		Color mycolor ;//= new Color(img.getRGB(x, y));
        try{
        	
        	for(int i=0;i<img.getWidth() ;i++)
        	{	
        		for(int j = 0;j<img.getHeight(); j++)
        		{

        			mycolor = new Color(img.getRGB(i,j));
        			if(check_color(mycolor,r,g,b))
        			{	
        				int col = ((mycolor.getRed()+r)<<16) | ((mycolor.getGreen()+g)<<8) | mycolor.getBlue()+b;
            			img.setRGB(i, j, col);
        			}
        		}
        		
        	}
        	
        	
		}catch(Exception ex){
			ex.printStackTrace();
			return false;
		}
        return true;
	}

	private boolean check_color(Color mycolor,int r,int g,int b) {
		if(mycolor.getRed()+r>=0 && (mycolor.getRed()+r<=255))
			if(mycolor.getGreen()+g>=0 && (mycolor.getGreen()+g<=255))
				if(mycolor.getBlue()+b>=0 && (mycolor.getBlue()+b<=255))
					return true;
		return false;
	}
}