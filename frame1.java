import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class frame1
{
	JLabel h;
	JButton b,c;
    frame1()
    {
    	JFrame f = new JFrame("created by varha yadav");
    	f.setSize(500,500);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	f.setLayout(new FlowLayout());
    	 h = new JLabel("");
    	 b = new JButton("ok");
    	 b.addActionListener(new ActionListener()
         
    	 
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			 h.setText("hello");
    		}
    	});
    	 c = new JButton("click");
    	 c.addActionListener(new ActionListener()
    	 {
    		 public void actionPerformed(ActionEvent ae)
    		 {
    			 h.setText("varsha");
    		 }
    	 }
    			 	);
    	f.add(h);
    	f.add(b);
    	f.add(c);
    	f.setVisible(true);
    	
    }
    
    public static void main(String arr[])
    {
    	SwingUtilities.invokeLater(new Runnable()
    	{
    		public void run()
    		{
    			new frame1();
    		}
    	});
    			
    }
}
