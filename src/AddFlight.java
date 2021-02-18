import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class AddFlight extends JFrame{

	
	public AddFlight()  {
		
	

	JPanel jp = new JPanel();
	jp.setLayout(null);
	jp.setBackground(Color.GRAY);
    JButton b=new JButton("ADD Flight");  
    JLabel lb = new JLabel("Flight NO"); 
    JLabel lb2 = new JLabel("Departure"); 
    JLabel lb3 = new JLabel("Arrival"); 
    JLabel lb4 = new JLabel("Aircraft"); 
    JLabel lb5 = new JLabel(); 
    JLabel lb7 = new JLabel(); 
    JLabel lb9 = new JLabel(); 

    ImageIcon logo = new ImageIcon("images/TA.png");
    JLabel logom = new JLabel(logo);
    
    ImageIcon image = new ImageIcon("images/d.png");
    JLabel lbimg = new JLabel(image);
  
    ImageIcon image2 = new ImageIcon("images/a.png");
    JLabel lbimg2 = new JLabel(image2);
    
      
    
    String id[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};        
    JComboBox cb=new JComboBox(id);    
    
    String Departure[]={"ANKARA","ISTANBUL","ANTALYA","DUBAI","LONDON","NEW YORK","MIAMI","SEATTLE","TORONTO","PARIS","BERLIN","ROMA","DUBLIN","JEDDAH","DOHA","AMSTERDAM","CAPE TOWN","SOFIA"};        
    JComboBox cb2=new JComboBox(Departure);             
	
    String Arrival[]={"ANKARA","ISTANBUL","ANTALYA","DUBAI","LONDON","NEW YORK","MIAMI","SEATTLE","TORONTO","PARIS","BERLIN","ROMA","DUBLIN","JEDDAH","DOHA","AMSTERDAM","CAPE TOWN","SOFIA"};        
    JComboBox cb3=new JComboBox(Arrival); 
        
	
    String plane[]={"Airbus A320","Airbus A330-200","Airbus A330-300","Airbus A340-500","Boeing B737-800","Boeing B777-300ER","Boeing B777-200LR","Boeing B747-400","Boeing B737-900"};        
    JComboBox cb4=new JComboBox(plane);  
    
 

    
    b.addActionListener(new ActionListener() { 
    	
        public void actionPerformed(ActionEvent e) { 
	    	

        	if(cb2.getSelectedItem().equals(cb3.getSelectedItem())){
        		lb7.setText("Sorryy!!! Please Choose Two Different Cities...");
		        lb7.setForeground(Color.red);

        	}
        	
        	else if(!cb2.getSelectedItem().equals(cb3.getSelectedItem())){
        		
        	

        	
    	    	boolean kontrol = true;

    	    	
            	File file = new File("files/flights.txt");

    	    	try {
	    	        Scanner read=new Scanner(file);

	    	        ArrayList arr=new ArrayList();

	    	        while(read.hasNext()) {
	    	            arr.add(read.next());
	    	           	    	      		    	 

	    	        }	    	
	    	      
	    	        for(int i=0;i<arr.size();i++) {
	    	          
	    	        	 	if(cb.getSelectedItem().equals(arr.get(i))) {
	    	                
	    	            	
	    	                  lb7.setText("Sorryy!!! You Should Enter Differrent ID Because This ID Token");
	    	  		          lb7.setForeground(Color.red);
	    	                  kontrol = false;
	    	                  break;
	    	            }
	    	        	
	    	        }
	    	        
    	    		}
	    	
	    	        catch(Exception ex) {
	    	        	
	    	            ex.printStackTrace();
	    	        }

	    	    if(kontrol == true){
	    	    	
	        	    Flight flight=new Flight(cb.getSelectedItem().toString() ,cb2.getSelectedItem().toString(),cb3.getSelectedItem().toString(),cb4.getSelectedItem().toString());
	        	    FileWriter fw;	    	    	
	    	    	
	        	    
	        	    try {
	     				fw = new FileWriter(file,true);
	     				
	     				   BufferedWriter bw=new BufferedWriter(fw);
	     		            
	     		            bw.write(flight.getId());
	     		            bw.newLine();
	     		            bw.write(flight.getDeparture());
	     		            bw.newLine();
	     		            bw.write(flight.getArrival());
	     		            bw.newLine();
	     		            bw.write(flight.getPlane());
	    		            bw.newLine();
	     		            bw.write("");
	     		            bw.newLine();
	     		            bw.close();
	     		            lb7.setText("Flight Added...");
	     		            lb7.setForeground(Color.GREEN);
	     			
	                 } 
	        	    catch (IOException e1) {
	     	            	e1.printStackTrace();
	     			
	                 }
	        	    
	            } 	    
        	}
        }
        });    
       
    
	    	    
	    	    
	    	    
	    	    
    
    
    
    
    
    
    logom.setBounds(500,-200,1000,1000);

    cb.setBounds(70, 150,125,20);  
   	cb2.setBounds(220, 150,125,20);  
   	lbimg.setBounds(145,10,200,200);
   	lbimg2.setBounds(295,10,200,200);
   	
   	cb3.setBounds(370, 150,135,20); 
    cb4.setBounds(520, 150,125,20);  
    lb.setBounds(70, 130,75,20);  
    lb2.setBounds(220, 130,75,20);  
    lb3.setBounds(370, 130,75,20);  
    lb4.setBounds(520, 130,75,20 );
    lb7.setBounds(150, 200,500,20);  
    lb9.setBounds(370, 500,250,20);  

    b.setBounds(520,200,120,30);  
   
    	
    	
    	
    	
    	
    	
	
	jp.add(b);
	jp.add(cb);
	jp.add(cb2);
	jp.add(cb3);
	jp.add(cb4);
	jp.add(lb);
	jp.add(lb2);
	jp.add(lb3);
	jp.add(lb4);
	jp.add(lb5);
	jp.add(lb7);
    jp.add(lbimg);
    jp.add(lbimg2);
    jp.add(logom);

    setSize(1300,1024);
    setLocation(0,0);		
	setContentPane(jp);
	setVisible(true);
	add(jp);
	
}
}
