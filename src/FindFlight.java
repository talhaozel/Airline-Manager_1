import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class FindFlight extends JFrame{

	
	JTextField fno = new JTextField();
	JButton b1 = new JButton("find Flight");
	JLabel lb2 = new JLabel();
	JLabel lb4 = new JLabel("Enter The Flight ID  Which You Want To Find ");
	
	DefaultListModel<String> l1 = new DefaultListModel<>();  
    JList<String> list = new JList<>(l1);  

	
	
	 ArrayList <String> FlightList = new ArrayList<String>();

	
	public FindFlight()  {
	

	
		 
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		fno.setBounds(400,250,80,20);
		lb4.setBounds(130,230,300,50);	
		b1.setBounds(400,350,80,50);
		lb2.setBounds(400,270,200,50);	
		list.setBounds(550,270, 75,75);  

		
		ImageIcon logo = new ImageIcon("images/TA.png");
	    JLabel logom = new JLabel(logo);
	    
	    logom.setBounds(400,-120,1000,1000);
	    jp.add(logom);
		
		

		b1.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
	 	    	File file = new File("files/flights.txt");

		
		    	try{
					
		    		
		    		Scanner scanner = new Scanner(file);
		    			
		            String veri = fno.getText(); 
		            
		            boolean kontrol = false;
		            
		    		while(scanner.hasNext()){
		    			
		    			String s = scanner.next();
		    			
		    			if(veri.equals(s)){
		    				kontrol = true;
		    				
		    				FlightList.add(s);
		    				FlightList.add(scanner.next());
		    				FlightList.add(scanner.next());
		    				FlightList.add(scanner.next());
		    				FlightList.add(scanner.next());

		    				break;
		    			}
		    		}
		    		
		    		if(kontrol==true ){
			            lb2.setText("Flight founded");
			            lb2.setForeground(Color.green);
			            
			            
			            l1.addElement(FlightList.get(0));  
			            l1.addElement(FlightList.get(1));  
			            l1.addElement(FlightList.get(2));  
			            l1.addElement(FlightList.get(3));  
			            l1.addElement(FlightList.get(4));  

			            

		    		}
		    		else if(kontrol==false){
			            lb2.setText("Flight not founded");
			            lb2.setForeground(Color.red);
		    		}
		    		
		    		}
		    		catch(Exception x){
		    			x.printStackTrace();
		    		}
		    			
		
		    }	
			});
			
		
		
		
		

		jp.add(fno);
		jp.add(b1);
		jp.add(lb2);
		jp.add(lb4);
		jp.add(list);

		setSize(1300,1024);
		setLocation(0,0);		
		setContentPane(jp);
		setVisible(true);
		
		
	}
}
