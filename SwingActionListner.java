import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class SwingActionListner 
{
  static Container c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame jf=new JFrame();
     jf.setTitle("HELLO");
     jf.setVisible(true);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     jf.setBounds(200, 100,700, 500);
     c=jf.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.BLUE);
     JButton jb=new JButton("red");
     jb.setBounds(100,50,70,30);
     jb.addActionListener(new ActionListener()
                           {public void actionPerformed(ActionEvent e)
                           {jbButtonAction(e);}});
     JButton jb1=new JButton("blue");
     jb1.setBounds(100,100,70,30);
     jb1.addActionListener(new ActionListener()
                           {public void actionPerformed(ActionEvent e)
                            {jb1ButtonAction(e);}});
     JButton jb2=new JButton("green");
     jb2.setBounds(100,150,70,30);
     jb2.addActionListener(new ActionListener()
                            {public void actionPerformed(ActionEvent e)
                             {jb2ButtonAction(e);}});
     c.add(jb);
     c.add(jb1);
     c.add(jb2);
	}
	static void jbButtonAction(ActionEvent e)
	{
		c.setBackground(Color.RED);
	}
	static void jb1ButtonAction(ActionEvent e)
	{
		c.setBackground(Color.BLUE);
	}
	static void jb2ButtonAction(ActionEvent e)
	{
		c.setBackground(Color.GREEN);
	}

}
