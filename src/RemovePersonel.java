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


public class RemovePersonel extends JFrame {

	
	JTextField id = new JTextField();
	JButton b1 = new JButton("REMOVE personel");
	JLabel lb = new JLabel();
	JLabel sil = new JLabel("Enter ID for the remove");

	
	
	 ArrayList <String> Personellistesi = new ArrayList<String>();

	
	
	 public RemovePersonel()   {
			
		 
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		sil.setBounds(40,235,200,50);
		id.setBounds(200,250,80,20);
		b1.setBounds(200,300,200,50);
		lb.setBounds(200,380,200,50);

		
		ImageIcon logo = new ImageIcon("images/TA.png");
	    JLabel logom = new JLabel(logo);
	    
	    logom.setBounds(400,-120,1000,1000);
	    jp.add(logom);
		
			
	    	File file = new File("files/personel.txt");

	    	 

	    		 Scanner scanner;
				try {
					scanner = new Scanner(file);
					
					while(scanner.hasNext()){
		 				String s = scanner.next();
		 				
		 				Personellistesi.add(s);
		 				
		 			}
					
				} catch (FileNotFoundException e2) {
					e2.printStackTrace();
				}
	 			
	 			
			
			b1.addActionListener(new ActionListener(){
				  
			    public void actionPerformed(ActionEvent e) 
			    {
			    	
			    	
			 		try {	
			 			String no = id.getText();
			 			
			 			boolean kontrol = false;
			 			
			 			for(int i = 0; i<Personellistesi.size();i++){
			 				
			 				if(no.equals(Personellistesi.get(i))){
			 					int gecici = (Personellistesi.indexOf(no));
			 					Personellistesi.remove(gecici);
			 					Personellistesi.remove(gecici);
			 					Personellistesi.remove(gecici);
			 					Personellistesi.remove(gecici);
			 					Personellistesi.remove(gecici);

					 			kontrol=true;		
					 			
			 				}
			 			}
			 		
			 			PrintWriter writer = new PrintWriter(file);
			 			
			             
			             for(Object data:Personellistesi ){
			             	
				 			writer.println(String.valueOf(data));
			             }	
			             
			             writer.close();
			             if(kontrol==true){
			             lb.setText("Personel Removed");
		 		         lb.setForeground(Color.GREEN);
			             }
			             else{
			            		lb.setText("No Personel Found... ");	
				 		         lb.setForeground(Color.red);
			             }

			 		} 
			    	 catch (IOException e1) {
			    		  
			 			e1.printStackTrace();
			 		}
			 		
			 	}
			
			});
			
			
			
			
			
			
			
			
			
			
				
				jp.add(id);
				jp.add(b1);
				jp.add(lb);
				jp.add(sil);

				setSize(1300,1024);
				setLocation(0,0);		
				setContentPane(jp);
				setVisible(true);
				
	}
}