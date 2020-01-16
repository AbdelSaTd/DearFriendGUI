package gui;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



import javax.swing.JFrame;
public class scrollableshit extends JFrame{
	public scrollableshit() {
	    getContentPane().setLayout(new BorderLayout());
		  
	      JPanel panel = createPanel();
	      
	      JScrollPane scroller=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	      scroller.getVerticalScrollBar().setValue(100);
	      getContentPane().add( scroller);
	  
	      addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent we) {
	            System.exit(0);
	         }
	      });
	}
	
	
	 public static JPanel createPanel() {
	      JPanel panel = new JPanel();
	      panel.setLayout(new GridLayout(20, 4, 10, 10));
	  
	      for (int i=0; i<10; i++) {
	        
	            JLabel label = new JLabel("label " + i );
	            label.setPreferredSize(new Dimension(300,100));
	            label.setFont(new Font("Helvetica", Font.PLAIN, 20));
	            panel.add(label);           
	         
	      }
	  
	      return panel;
	   }
	  
	   public static void main(String [] args) {
	      scrollableshit main = new scrollableshit();
	      main.setSize(300, 300);
	      main.setVisible(true);
	   }
}
