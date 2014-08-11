
// bu program sonsuz sayý alýp avg,min,max hesabý yapar with GUI

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Practice extends JFrame implements ActionListener{

	JTextField tfNewNumber = new JTextField(5);
	JTextField tfResult = new JTextField(5);
	
	JButton addBtn = new JButton("Add");
	JButton btnCalculate = new JButton("Calculate");
	JButton listall = new JButton("list all");
	
	JTextArea ta = new JTextArea(10,20);
	JScrollPane spane = new JScrollPane(ta);
	
	Vector<Integer> list = new Vector<Integer>();
	JRadioButton rAvg, rMAx, rMin, rStdDev;
	
	int sum=0,cnt=0;
	float average;
	double stddev;
	
		
//**********************************************************************************************************	
	
	Practice(){
		
		setLayout(new GridLayout(2, 2));
		
		add( getInputPanel() );
		add( getRadioPanel() );
		add( calculationResult() );
		add( allList() );
		
		pack();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
//***************************************************************************************************************	
	
	public static void main(String[] args) {
		new Practice();
	}
	
	private JPanel getInputPanel(){
		JPanel p = new JPanel( new FlowLayout() );	 
		p.add( new JLabel("Enter Number:"));
		p.add( tfNewNumber );
		p.add( addBtn );
		addBtn.addActionListener( this );
		
		return p;		
	}
	
	private JPanel getRadioPanel(){
		JPanel p = new JPanel(new GridLayout(4, 1));
	 
		rAvg = new JRadioButton("Average");
		rMAx = new JRadioButton("Max"); 
		rMin = new JRadioButton("Min"); 
		rStdDev = new JRadioButton("StdDev");
		
		ButtonGroup gr = new ButtonGroup();
		gr.add(rAvg );
		gr.add(rMAx);
		gr.add(rMin);
		gr.add(rStdDev);
		
		p.add( rAvg );
		p.add( rMAx );
		p.add( rMin );
		p.add( rStdDev );
		
		return p;		
	}
	
	private JPanel calculationResult(){
		JPanel p = new JPanel( new FlowLayout() );	 
		p.add( btnCalculate );
		btnCalculate.addActionListener(this);
		p.add( tfResult );
		
		return p;
	}

	
	private JPanel allList(){
		JPanel p = new JPanel( new FlowLayout() );
		p.add( listall );
		listall.addActionListener(this);
		p.add(ta);
		
		return p;
	}
	

	
//*********************************************************************************************************	
	
	public void actionPerformed(ActionEvent e) {

//--------------------- TO ADD NUMBERS --------------------------------------------------------------------		
		
		if ( e.getSource() == addBtn ){
			list.add( Integer.parseInt( tfNewNumber.getText() ));
			tfNewNumber.setText("");
			cnt++;
		}
		

		
//---------------------- TO SHOW RESULT --------------------------------------------------------------------		
	
		else if ( e.getSource() == btnCalculate){
			
//------------------------------- TO FÝND MAXIMUM NUMBER -----------------------------------------------------
			
			if( rMAx.isSelected()){
				int max = Integer.MIN_VALUE;
				
				for (Integer i : list) {
					if ( i>max)
						max = i;
				}
				tfResult.setText( max + "");
			}
		}
		
//----------------------- TO FIND MINIMUM NUMBER -------------------------------------------------------------		
		
		if(rMin.isSelected()){
			int min = Integer.MAX_VALUE;
			
			for (Integer i : list) {
				if ( i<min)
					min = i;
			}
			
			tfResult.setText( min + "");
		}
	
//-------------------- TO FIND AVERAGE OF NUMBERS --------------------------------------------------------------		
		
		if(rAvg.isSelected()){
			
			
			for (Integer i : list) {
				
				sum+=i;
				average = sum/cnt;
			}
			
			tfResult.setText( average + "");
			
		}
		
		
//--------------------------- TO CALCULATE STD. DEV. ----------------------------------------------------------
		
		if(rStdDev.isSelected()){
			
			
			for (Integer i : list) {
				
				sum+=i;
				average = sum/cnt;
			}
			
			stddev = Math.sqrt( average );
			
			tfResult.setText( stddev + "");
			
		}
		
				
		
//------------------------ TO LÝST ALL VALUES ------------------------------------------------------------------		
		
		if ( e.getSource() == listall ){
			
			for (Integer i : list) {
			ta.setText(list + " ");
			
			}
			
		}
		
//----------------------------------------------------------------------------------------------------------------		
			
		
		}	
	}
