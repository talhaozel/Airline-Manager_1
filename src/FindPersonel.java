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


public class FindPersonel extends JFrame{

	
	JTextField name = new JTextField();
	JButton b1 = new JButton("find personel");
	JLabel lb = new JLabel();
	JLabel lb2 = new JLabel();	
	
	DefaultListModel<String> l1 = new DefaultListModel<>();  
    JList<String> list = new JList<>(l1);  

	
	
	  
      
	
	
	JLabel yazi = new JLabel("Enter the personel ID which you want to find ");

	
	
	public FindPersonel()  {
	

	
		 
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		
		yazi.setBounds(20,235,320,50);	
		name.setBounds(300,250,80,20);
		b1.setBounds(300,300,120,50);
		lb.setBounds(300,350,200,50);
		lb2.setBounds(300,380,200,50);	
		
		list.setBounds(500,300, 75,75);  
			
		ImageIcon logo = new ImageIcon("images/TA.png");
	    JLabel logom = new JLabel(logo);
	    
	    logom.setBounds(400,-120,1000,1000);
	    jp.add(logom);
		
		
		

		b1.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
	 	    	File file = new File("files/personel.txt");

	 	  	 ArrayList <String> personel = new ArrayList<String>();

		    	try{
					
		    		
		    		Scanner scanner = new Scanner(file);
		    			
		            String veri = name.getText(); 
		            
		            boolean kontrol = false;
		            
		    		while(scanner.hasNext()){
		    			
		    			String s = scanner.next();
		    			
		    			if(veri.equals(s)){
		    				kontrol = true;
		    				
		    				personel.add(s);
		    				personel.add(scanner.next());
		    				personel.add(scanner.next());
		    				personel.add(scanner.next());

		    				break;
		    			}
		    		}
		    		
		    		if(kontrol==true ){
			            lb2.setText("Personel founded");
			            lb2.setForeground(Color.green);
			            
			            
			            l1.addElement(personel.get(0));  
			            l1.addElement(personel.get(1));  
			            l1.addElement(personel.get(2));  
			            l1.addElement(personel.get(3));  
			            
			          
			            
		    		}
		    		else if(kontrol==false){
			            lb2.setText("personel not founded");
			            lb2.setForeground(Color.red);
		    		}
		    		
		    		}
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    		catch(Exception x){
		    			x.printStackTrace();
		    		}
		    			
		
		    }	
			});
			
		
		
		
		
		jp.add(yazi);
		jp.add(name);
		jp.add(b1);
		jp.add(lb);
		jp.add(lb2);
		jp.add(list);
		setSize(1300,1024);
		setLocation(0,0);		
		setContentPane(jp);
		setVisible(true);
		
		
	}
}
