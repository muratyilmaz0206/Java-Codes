import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonViewer extends JFrame {
	
	AnimatedButton[] btnList = new AnimatedButton[20];
	
	ButtonViewer(){
		setLayout(null);
		
		for(int i=0; i<20; i++){
			btnList[i] = new AnimatedButton(i+"");
			add( btnList[i] );
			Thread t = new Thread( btnList[i] );
			t.start();
			
		}
		
		JButton pause = new JButton("Pause");
		pause.setBounds(10, 10, 100, 40);
		pause.addActionListener( new BtnPuase());
		add(pause);
		
		JButton resume = new JButton("Resume");
		resume.setBounds(10, 50, 100, 40);
		resume.addActionListener( new BtnResume());
		add(resume);
		
		
		setVisible(true);
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class BtnPuase implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<20; i++){
				synchronized (btnList[i]) {
					btnList[i].pleaseWait = true;
				}				
			}
			
		}	
	}
	
	class BtnResume implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(int i=0; i<20; i++){
				synchronized (btnList[i]) {
					btnList[i].pleaseWait = false;
					btnList[i].notify(); // stop waiting (wake-up)
					
				}				
			}
			
		}	
	}

	public static void main(String[] args) {
		new ButtonViewer();
	}

}
