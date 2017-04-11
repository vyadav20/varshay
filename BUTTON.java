import javax.swing.*;
import java.awt.*;
public class BUTTON 
{
     BUTTON()
     {
    	 JFrame f= new JFrame("create by me");
    	 f.setSize(400,400);
    	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 f.setLayout(new FlowLayout());
    	 JLabel h=new JLabel("");
    	 JButton a= new JButton("click");
    	f.add(h);
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
