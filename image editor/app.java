package Image;

import java.util.Random;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rnd = new Random();
		buffer bf = new buffer(500);
		for(int i =0 ; i <250000; i++)
			bf.fillArray(rnd.nextInt(254), rnd.nextInt(254), rnd.nextInt(254));
		bf.save();
		
		
		bf.Load();
		System.out.println();
		bf.printArray();
		System.out.println();
                //cartoony (80, 100, 100)
                //green filter (-20, 30, -20)
                //blue filter (-20, -20, 30)
                //red filter (30, -20, -20)
                //pink filter (20, -30, 20)
                //lime filter (-30, 20, 20)
                //yellow filter (20, 20, -30)
		bf.add_to_pixels(30, -20, -20);
		System.out.println();
		bf.save();

	}

}
