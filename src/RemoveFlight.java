import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RemoveFlight extends JFrame{

	

	JTextField fno = new JTextField();
	JButton b1 = new JButton("REMOVE Flight");
	JLabel lb = new JLabel();
	JLabel lb2 = new JLabel("Please Enter The Flight Number");
	JLabel lb3 = new JLabel();

	
	
	 ArrayList <String> FlightList = new ArrayList<String>();

	 ImageIcon logo = new ImageIcon("images/TA.png");
	    JLabel logom = new JLabel(logo);
	
	 public RemoveFlight()   {
			
		 
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		fno.setBounds(350,200,80,20);
		lb2.setBounds(150,195,255,30);
		b1.setBounds(350,250,150,30);
		lb.setBounds(50,300,150,30);
		lb3.setBounds(200,250,150,30);

	    logom.setBounds(500,-150,1000,1000);

	    	File file = new File("files/flights.txt");

	    	 

	    		 Scanner scanner;
				try {
					scanner = new Scanner(file);
					
					while(scanner.hasNext()){
		 				String s = scanner.next();
		 				
		 				FlightList.add(s);
		 				
		 			}
					
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
	 			
	 			
			
			b1.addActionListener(new ActionListener(){
				  
			    public void actionPerformed(ActionEvent e) 
			    {
			    	
			    	
			 		try {	
			 			String fnumber = fno.getText();
			 			
			 			for(int i = 0; i<FlightList.size();i++){
			 				
			 				if(fnumber.equals(FlightList.get(i))){
			 					int gecici = (FlightList.indexOf(fnumber));
			 					FlightList.remove(gecici);
			 					FlightList.remove(gecici);
			 					FlightList.remove(gecici);
			 					FlightList.remove(gecici);
			 					FlightList.remove(gecici);
				 				lb3.setText("Flight Removed");
			 		            lb3.setForeground(Color.GREEN);

			 				}
			 			}

			 			PrintWriter writer = new PrintWriter(file);
			 			
			             
			             for(Object data:FlightList ){
			             	
				 			writer.println(String.valueOf(data));
			             }	
			             
			             writer.close();

			 		}
			    	 catch (IOException e1) {
			 				lb3.setText("Flight Did not Removed");
			 				
			 			e1.printStackTrace();
			 		}
			 		
			 		
			 	}
			
		         
			    
			    
				
				
			});
			
			
			
			
			
			
			
			
			
			
			    jp.add(logom);
				jp.add(fno);
				jp.add(b1);
				jp.add(lb);
				jp.add(lb2);
				jp.add(lb3);
				setSize(1300,1024);
				setLocation(0,0);		
				setContentPane(jp);
				setVisible(true);
				
	}

}
