import java.util.Random;

import javax.swing.JButton;


public class AnimatedButton extends JButton implements Runnable{

	int x_side = 1;
	int y_side = 1;
	
	public boolean pleaseWait = false;
	
	AnimatedButton(String title){
		super(title);
		this.setBounds(320, 240, 50, 40);
	}
 
	public void run() {
		while(true){
			Random r = new Random();
			int x = this.getBounds().x;
			int y = this.getBounds().y;
			
			if ( y > 400 )
				y_side = -1;
			
			if ( x >550)
				x_side = -1;
			
			if ( x<0 )
				x_side = 1;
			
			if ( y< 0)
				y_side = 1;
				
			if ( x_side == 1)
				x = x + 3-r.nextInt(6);
			else 
				x = x - 3-r.nextInt(6);
			
			if ( y_side == 1)
				y = y + 3-r.nextInt(6);
			else 
				y = y - 3-r.nextInt(6);
			
			this.setBounds(x, y, 50, 40);
			synchronized (this) {
				while( pleaseWait ){
					try {
						wait();
					} catch (InterruptedException e) {}
				}
			}
			
			try{
				Thread.sleep(20);
			}catch(Exception e){};
		}		
	}
}
