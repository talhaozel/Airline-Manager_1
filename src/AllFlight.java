import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class AllFlight extends JFrame{

	JTable table;
	JScrollPane pane;
	DefaultTableModel tableModel;


	
	
	
	public AllFlight () {
		
		
		JPanel jp = new JPanel();
		jp.setLayout(null);
		jp.setBackground(Color.GRAY);
		
	    	File file = new File("files/flights.txt");

	    	String columnNames[]={"Flight Number","Departure City","Arrival City","Aircraft Type"};
	    	tableModel = new DefaultTableModel(columnNames, 0);


	    	table=new JTable(tableModel);

	    	table.setPreferredScrollableViewportSize(new Dimension(500,200));
	    	table.setFillsViewportHeight(true);
	    	pane=new JScrollPane(table);
	    	
	   	 ArrayList <String> FlightList = new ArrayList<String>();
	   
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
	    	
	    	try {
	    			
	    			for(int i=0;i<FlightList.size();i+=5){
	    					    		   	
	    				 String [] veri = {FlightList.get(i),FlightList.get(i+1),FlightList.get(i+2),FlightList.get(i+3)};
	    			    tableModel.addRow(veri);
		
	    		}
	
	    	}
	
	    	catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	
	
	    	
	    	
	    	
	    	add(pane);
	    	setVisible(true);
	    	setSize(1300,1024);
	    	setLocation(0,0);
	    	setTitle("Airline Manager System");
	    	
	   
	}
}

