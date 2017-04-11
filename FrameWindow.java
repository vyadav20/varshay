import javax.swing.*;
public class FrameWindow
{
   FrameWindow()
   {
	  JFrame f=new JFrame("table");
	   f.setSize(300,250);
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   f.setVisible(true);
   }
   public static void main(String arr[])
   {
	   SwingUtilities.invokeLater(new Runnable()
	    {
		   public void run()
		   {
			   new FrameWindow();
		    }
		});
   }
}
