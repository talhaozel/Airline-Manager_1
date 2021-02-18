import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Menu {

		
	public static void main(String[] args){	


		JFrame jf = new JFrame("MENU ");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		
		
		
		 ImageIcon logo = new ImageIcon("images/TA.png");
		    JLabel logom = new JLabel(logo);
		    
		    logom.setBounds(400,-120,1000,1000);
		    jp.add(logom);
		    
		
		
		JButton b1 = new JButton("MANAGE PERSONEL");
		
		b1.setLocation(200,250);
		b1.setSize(350,30);
		jp.add(b1);
		b1.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	PersonelYonett pers = new PersonelYonett();		    	
		    }		
		});
		
		b1.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	PersonelYonett persq = new PersonelYonett();
		    	persq.Frame();
		    }
			
			
		});
		
		
		
		
		JButton b2 = new JButton("MANAGE FLIGHT");
		b2.setLocation(200,350);
		b2.setSize(350,30);
		jp.add(b2);
		
		b2.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	UcusYonet flt = new UcusYonet();		    	
		    }
		});
		
		b2.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	UcusYonet flts = new UcusYonet();
		    	flts.Frame();
		    }
			
			
		});
		
		
		
		
		
		
		
		
		
		
		
		jf.setSize(1300,1024);
		jf.setLocation(0,0);		
		jf.setContentPane(jp);
		jf.setVisible(true);
		
}
}