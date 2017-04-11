import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Frame extends JFrame implements ActionListener
{
	JButton jb=new JButton("red");
	JButton jb1=new JButton("yellow");
	JButton jb2=new JButton("green");
	Container c;
	
	Frame()
	{
	  	c=this.getContentPane();
	  	c.setLayout(null);
	  	jb.setBounds(100, 50, 100, 50);
	  	jb1.setBounds(200, 50, 100, 50);
	  	jb2.setBounds(300, 50, 100, 50);
	  	jb.addActionListener(this);
	  	jb1.addActionListener(this);
	  	jb2.addActionListener(this);
	  	c.add(jb);
	  	c.add(jb1);
	  	c.add(jb2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb)
		{
		    c.setBackground(Color.RED);
		}
		if(e.getSource()==jb1)
		{
			c.setBackground(Color.YELLOW);
		}
		if(e.getSource()==jb2)
		{
			c.setBackground(Color.GREEN);
		}
	}
}

public class SwingButton 
     {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Frame f=new Frame();
      f.setTitle("DEMO");
      f.setVisible(true);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 700, 500);
      
	}

	

}
