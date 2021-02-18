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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AddPersonel extends JFrame{

	
	JTextField id = new JTextField();
	JTextField name = new JTextField();
	JTextField surname = new JTextField();
	JTextField job = new JTextField();
	JButton b1 = new JButton("ADD personel");
	
	JLabel lb = new JLabel();
	
    JLabel lbid = new JLabel("Personel ID"); 
	JLabel isim = new JLabel("Enter name");
	JLabel soy = new JLabel("Enter surname");
	JLabel is = new JLabel("Departman");

	
	public AddPersonel()  {
		
	

	JPanel jp = new JPanel();
	jp.setLayout(null);
	jp.setBackground(Color.GRAY);
	id.setBounds(300,170,100,20);
	name.setBounds(300,250,100,20);
	surname.setBounds(300,320,100,20);
	job.setBounds(300,390,100,20);
	b1.setBounds(300,460,80,50);
	lb.setBounds(300,530,350,50);
	isim.setBounds(100,240,200,50);
	soy.setBounds(100,310,200,50);
	is.setBounds(100,380,200,50);
	lbid.setBounds(100,170,100,20);


	ImageIcon logo = new ImageIcon("images/TA.png");
    JLabel logom = new JLabel(logo);
    
    logom.setBounds(400,-120,1000,1000);
    jp.add(logom);
	
    
    
    
	b1.addActionListener(new ActionListener(){
		  
	    public void actionPerformed(ActionEvent e) 
	    {
	    	File file = new File("files/personel.txt");
	    	
	    	boolean kontrol = true;
	    	
	    	try {
	    	        Scanner read=new Scanner(file);

	    	        ArrayList arr=new ArrayList();

	    	        while(read.hasNext()) {
	    	            arr.add(read.next());
	    	           
	    	       
	    	        }	    	
	    	      
	    	        for(int i=0;i<arr.size();i++) {
	    	          
	    	        	
	    	        	if(id.getText().equals(arr.get(i))) {
	    	                	    	            	
	    	                  lb.setText("Sorryy!!! You Should Enter Differrent ID Because This ID Token");
  	    		              lb.setForeground(Color.red);
	    	                  kontrol = false;
	    	                  break;
	    	            }
	    	        	
	    	        }
	    	        
}
	    	
	    	        catch(Exception ex) {
	    	        	
	    	            ex.printStackTrace();
	    	        }

	    	    if(kontrol == true){
	    	    	
	    	    	
    	                Personel personel=new Personel(id.getText(),name.getText(),surname.getText(),job.getText());
    	                FileWriter fw;
    	    			
    	                try {
    	    				fw = new FileWriter(file,true);
    	    				
    	    				   BufferedWriter bw=new BufferedWriter(fw);
    	    				  
    	    				    bw.write(personel.getId());
    	    		            bw.newLine();
    	    		            bw.write(personel.getIsim());
    	    		            bw.newLine();
    	    		            bw.write(personel.getSoyad());
    	    		            bw.newLine();
    	    		            bw.write(personel.getGorev());
    	    		            bw.newLine();
    	    		            bw.write("---");
    	    		            bw.newLine();
    	    		            bw.close();
    	    		            lb.setText("Personel Added");
    	    		            lb.setForeground(Color.GREEN);
    	    			
    	                } catch (IOException e1) {
    	    	           

    	    				e1.printStackTrace();
    	    			}
    	        	

	    	    	
	    	    }
	    	
	    	
	    }
		
		
	});
	
	
	
	
	
	
	
	jp.add(name);
	jp.add(surname);
	jp.add(job);
	jp.add(b1);
	jp.add(lb);
	jp.add(logom);
	jp.add(isim);
	jp.add(soy);
	jp.add(is);
	jp.add(lbid);
	jp.add(id);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(1300,1024);
	setLocation(0,0);		
	setContentPane(jp);
	setVisible(true);
	add(jp);
	
}}
