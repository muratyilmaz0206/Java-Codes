/*
 		20090109 mehmet özkan paint uygulamasý

 */

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.util.Random;


public class Painting extends JPanel implements MouseListener, MouseMotionListener, ActionListener, KeyListener{
	private static final Random rnd = new Random();
	private Raster r; //raster to store current drawing
	private Raster rpre; //raster to store previous drawing for undo

	private int x1, y1,x2,y2; //coordinates to draw 

	private boolean point=true,circle,line, rect ,roundrect, start=true;
	public Color resim=Color.black;
	private BufferedImage bf; //buffered image used for drawing
	private JPanel pcen; //çizim alanýmýz
	private Panel psouth; //paletlerin olduðu kýsým
	//contents of Frame 
	private JComboBox drawchooser;
	private JLabel select,filllabel, drawlabel,eraserlabel,color;
	private ButtonGroup group;
	private JRadioButton fill;
	private JRadioButton draw;
	private JRadioButton eraser;
	private static final int N = 4;
	JPanel colorpalet=new JPanel();
	//cursor
	private Cursor cursor;
	private BufferedImage cursorimage; 
	JButton btn[]= new JButton[(N*N)];
	//init method
	//public void init(){
	Painting(){	
		super();

		this.setLayout(new BorderLayout());
		pcen = new JPanel();
		pcen.setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		add(pcen);

		psouth= new Panel();
		psouth.setBackground(Color.LIGHT_GRAY);
        
		colorpalet.setLayout(new GridLayout(N,N,N,N));
		for (int i = 0; i < N * N; i++) {
			btn[i] = new JButton("");
		 //burada resim paletini oluþturuyoruz
			btn[i].setBackground(new Color(rnd.nextInt()));
			colorpalet.add(btn[i]);
			
	       btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					JButton btns=(JButton)arg0.getSource();
				//	if(arg0.getSource()!=null && arg0.getSource()==btn)
					 resim=btns.getBackground();
					
				}
			});
		}
		//colorpalet.addMouseListener(this);
		psouth.add(colorpalet);

		select = new JLabel("Select");
		psouth.add(select);



		drawchooser = new JComboBox();
		drawchooser.addItem("Point");
		drawchooser.addItem("Line");
		drawchooser.addItem("Circle");
		drawchooser.addItem("Rectangle");
		drawchooser.addItem("Round Rect");
		drawchooser.addActionListener(this);

		psouth.add(drawchooser);


		filllabel = new JLabel("fill");
		drawlabel = new JLabel("draw");
		eraserlabel = new JLabel("eraser");

		group = new ButtonGroup();

		fill = new JRadioButton();
		fill.addActionListener(this);

		draw = new JRadioButton();
		draw.addActionListener(this);

		eraser = new JRadioButton();
		eraser.addActionListener(this);

		draw.setSelected(true);
		group.add(draw);
		group.add(fill);
		group.add(eraser);
		psouth.add(drawlabel);
		psouth.add(draw);
		psouth.add(filllabel);
		psouth.add(fill);
		psouth.add(eraserlabel);
		psouth.add(eraser);


	 





		psouth.addMouseListener(this);
		add("South", psouth);

		//adding listeners		
		pcen.addMouseListener(this);
		pcen.addMouseMotionListener(this);
		pcen.addKeyListener(this);

		//setting size of frame
		setSize(500,400);

		//initializing buffered image
		bf = new BufferedImage(this.getWidth(),this.getHeight()-35,BufferedImage.TYPE_INT_RGB);

		//Initializing cursor as cross hair cursor
		cursor=new Cursor(Cursor.CROSSHAIR_CURSOR);
		pcen.setCursor(cursor);

		pcen.requestFocus();
		validate();


	}//end of init

	//paint method 
	public void paint(Graphics g){
		if(bf.getHeight()!=this.getHeight()-35 || bf.getWidth()!= this.getWidth()){
			r= bf.getData();
			bf= new BufferedImage(this.getWidth(),this.getHeight()-35,BufferedImage.TYPE_INT_RGB);
			bf.getGraphics().setColor(Color.WHITE);
			bf.getGraphics().fillRect(0, 0, this.getWidth(), this.getWidth());
			bf.setData(r);

		}

		//call to draw method 
		draw(bf.getGraphics());

		g.drawImage(bf, 0, 0, null);


	}

	//sets the color that user choose


	//draw method 
	public void draw(Graphics g){


		if(start){//this will run only for the first time

			g.setClip(0,0,this.getWidth(),this.getHeight());
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getWidth());

			//saves the drawing of buffered image in raster for undo  
			rpre=bf.getData();
		}


		if(!point && !eraser.isSelected() && !start){

			g.setColor(Color.WHITE);
			g.fillRect(0, 0, this.getWidth(), this.getWidth());
			//sets the raster into buffered image
			bf.setData(r);

		}else{
			//saves the drawing of buffered image in raster
			r=	bf.getData();
		}

		//set start false 
		start=false;

		//set the color choosengetColor()
		g.setColor(resim);

		//if draw option is selected
		if(draw.isSelected()){
			if(circle){
				if(x1<x2 && y1<y2){
					g.drawOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}else if(x1>x2 && y1> y2){
					g.drawOval(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1<y2){
					g.drawOval(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1>y2){
					g.drawOval(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}


			}
			else if(rect){
				if(x1<x2 && y1<y2){
					g.drawRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}else if(x1>x2 && y1> y2){
					g.drawRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1<y2){
					g.drawRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1>y2){
					g.drawRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}
			}
			else if(roundrect){
				if(x1<x2 && y1<y2){
					g.drawRoundRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}else if(x1>x2 && y1> y2){
					g.drawRoundRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}
				else if (y1<y2){
					g.drawRoundRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}
				else if (y1>y2){
					g.drawRoundRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}

			}
			else{
				g.drawLine(x1,y1, x2,y2 );
			}
		}
		//fill option is selected
		else if(fill.isSelected()){

			if(circle){//draw filled circles
				if(x1<x2 && y1<y2){
					g.fillOval(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}else if(x1>x2 && y1> y2){
					g.fillOval(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1<y2){
					g.fillOval(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1>y2){
					g.fillOval(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}


			}
			//draw filled rect
			else if(rect){
				if(x1<x2 && y1<y2){
					g.fillRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}else if(x1>x2 && y1> y2){
					g.fillRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1<y2){
					g.fillRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1));

				}
				else if (y1>y2){
					g.fillRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1));

				}

			}
			//draw filled Round Rect
			else if(roundrect){
				if(x1<x2 && y1<y2){
					g.fillRoundRect(x1, y1, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}else if(x1>x2 && y1> y2){
					g.fillRoundRect(x2, y2, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}
				else if (y1<y2){
					g.fillRoundRect(x2, y1, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}
				else if (y1>y2){
					g.fillRoundRect(x1, y2, Math.abs(x2-x1), Math.abs(y2-y1),20,20);

				}

			}
			else{
				//draw points and lines
				g.drawLine(x1,y1, x2,y2 );
			}
		}//end if for fill option selected
		//for eraser
		else if(eraser.isSelected()){

			g.setColor(Color.WHITE);
			g.fillRect(x2-15,y2-15,30,30);
		}//end of eraser

		//only run when points are drawn
		if(point){
			x1=x2;
			y1=y2;
		}

		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}//end of draw


	//Mouse Listener method
	public void mouseDragged(MouseEvent me) {

		
		x2=me.getX();
		y2= me.getY();
		paint(pcen.getGraphics());

	}


	public void mousePressed(MouseEvent me) {
	 
		
		
		x1=me.getX();
		y1= me.getY();
		x2=x1;
		y2=y1;

		//saves the drawing of buffered image in raster before painting for undo 
		rpre=bf.getData();
		paint(pcen.getGraphics());	

	}


	public void mouseReleased(MouseEvent e) {

		
		
		
		if(!point){
			r=bf.getData();
		}

	}

	public void mouseEntered(MouseEvent me) {
		if(me.getSource()==psouth){
			this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		}
		if(me.getSource()==pcen){
			pcen.setCursor(cursor);
		}
	}


	// action Listener Mehtod used for choosing what to draw
	public void actionPerformed(ActionEvent ae) {
		 
		
		 
			if(ae.getSource()==drawchooser){
				if(drawchooser.getSelectedItem()=="Point"){
					line=false;
					point=true;
					circle=false;
					rect=false;
					roundrect=false;
					
				}
				if(drawchooser.getSelectedItem()=="Circle"){
					line=false;
					circle=true;
					point=false;
					rect=false;
					roundrect=false;
				}
				if(drawchooser.getSelectedItem()=="Line"){
					line=true;
					rect=false;
					circle=false;
					point=false;
					roundrect=false;
				}
				if(drawchooser.getSelectedItem()=="Rectangle"){

					rect=true;
					roundrect=false;
					line=false;
					circle=false;
					point=false;
				}
				if(drawchooser.getSelectedItem()=="Round Rect"){
					roundrect=true;
					rect=false;
					line=false;
					circle=false;
					point=false;
				}


			}
			
			if(ae.getSource()==eraser){
				cursorimage = new BufferedImage(30,30,BufferedImage.TYPE_INT_RGB);
				cursorimage.getGraphics().drawRect(0, 0, 30, 30);
				Toolkit t = Toolkit.getDefaultToolkit();
				cursor = t.createCustomCursor(cursorimage, new Point(15,15), "mycursor");

			}
			if(ae.getSource()==fill){
				cursor = new Cursor( Cursor.CROSSHAIR_CURSOR);
			}
			if(ae.getSource()==draw){
				cursor = new Cursor( Cursor.CROSSHAIR_CURSOR);
			}
			
			
			
			
	 
			
			
			pcen.requestFocus();
		}

		//key listener method
		public void keyPressed(KeyEvent ke) {

			if(ke.getKeyChar()=='z'){
				bf.setData(rpre);
				r=rpre;
				pcen.getGraphics().drawImage(bf,0,0,null);
				System.out.println("key listener");

			}
		}



		public void mouseClicked(MouseEvent e) {
			 
		}

		public void mouseExited(MouseEvent me) {}

		public void mouseMoved(MouseEvent e) {}

		public void keyReleased(KeyEvent arg0) {}

		public void keyTyped(KeyEvent arg0) {}



	}
