import java.awt.*;
import javax.swing.*;

public class SwingPrograms 
{
  public static void main(String arr[])
  {
	JFrame jf=new JFrame();
	jf.setVisible(true);
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	//jf.setSize(300, 300);
	//jf.setLocation(550, 250);
	jf.setBounds(550,250,300,300);
	jf.setTitle("Welcome");
	//ImageIcon icon=new ImageIcon(" 89037627_1_1000x700_wanna-sell-my-jaguar-xkr-s-delhi.jpg");//error
	//jf.setIconImage(icon.getImage());
	Container c=jf.getContentPane();
	c.setBackground(Color.RED);
	c.setLayout(null);
	jf.setResizable(true);
	//ImageIcon ii=new ImageIcon("image.jpg");
	//JLabel label=new JLabel(ii);
	//c.add(label);
	//label.setBounds(10,10,100,30);
	//label.setText("Password");
	//Font f=new Font("Arial",Font.BOLD,10);
	//label.setFont(f);
	ImageIcon i=new ImageIcon("image.jpg");
	
	JLabel l=new JLabel("hello",i,JLabel.LEFT);
	l.setBounds(100,50,200,40);
	JLabel ll=new JLabel("hello",i,JLabel.RIGHT);
	ll.setBounds(100,10,200,40);
	JLabel lll=new JLabel("hello",i,JLabel.CENTER);
	lll.setBounds(100,150,200,40);
	c.add(l);
	c.add(ll);
	c.add(lll);
	
  }
}
