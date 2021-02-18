import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UcusYonet {
	
	
	public void Frame(){

		JFrame jf = new JFrame("MANAGE FLIGHT ");
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		
		ImageIcon logo = new ImageIcon("images/TA.png");
	    JLabel logom = new JLabel(logo);  
	    logom.setBounds(400,-120,1000,1000);
	    jp.add(logom);
	       
		
		JButton b1 = new JButton("ADD FLIGHT");
		
		b1.setLocation(30,150);
		b1.setSize(350,30);
		jp.add(b1);
		b1.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {

		    	new AddFlight();
		    	
		    }
			
			});
		
		JButton b2 = new JButton("REMOVE FLIGHT");
		
		b2.setLocation(30,250);
		b2.setSize(350,30);
		jp.add(b2);
		b2.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	new RemoveFlight();
		    }			
		});
		
		JButton b3 = new JButton("Find FLIGHT ");
		
		b3.setLocation(30,350);
		b3.setSize(350,30);
		jp.add(b3);
		b3.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	new FindFlight();
		    
		    }		
			
		});
		
		JButton b4 = new JButton("All FLIGHTS");
		
		b4.setLocation(30,450);
		b4.setSize(350,30);
		jp.add(b4);
		b4.addActionListener(new ActionListener(){
			  
		    public void actionPerformed(ActionEvent e) 
		    {
		    	new AllFlight();
		    }
			
			
		});
		
		
		b3.setVisible(true);
		jf.setSize(1300,1024);	
		jf.setLocation(0,0);		
		jf.setContentPane(jp);
		jf.setVisible(true);
		
	}

	
}
