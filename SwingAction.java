import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class SwingAction 
{
	static Container c;

	public static void main(String[] args)
	{
	  JFrame jf=new JFrame("HELLO");
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setBounds(200, 100, 700, 500);
	  c=jf.getContentPane();
	  c.setLayout(null);
	  JButton jb=new JButton("First");
	  jb.setBounds(100, 50, 70, 30);
	  Main m=new Main();
	  jb.addActionListener(m);
	  JButton jb1=new JButton("Second");
	  jb1.setBounds(100, 100, 70, 30);
	  Main1 mm=new Main1();
	  jb1.addActionListener(mm);
	  c.add(jb);
	  c.add(jb1);
	  
	}
}

class Main implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
		SwingAction.c.setBackground(Color.RED);
	}
}

class Main1 implements ActionListener 
{
	public void actionPerformed(ActionEvent e)
	{
		SwingAction.c.setBackground(Color.GREEN);
	}
}

