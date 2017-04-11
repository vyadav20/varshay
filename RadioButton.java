import javax.swing.*;
import java.awt.*;

public class RadioButton {

	public static void main(String[] args) 
	{
	  JFrame jf=new JFrame("HELLO");
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setBounds(200, 100, 700, 500);
	  Container c=jf.getContentPane();
	  c.setLayout(null);
	  JRadioButton jr=new JRadioButton("male");
	  jr.setBounds(100, 50, 100, 30);
	  JRadioButton jr1=new JRadioButton("female");
	  jr1.setBounds(200, 50, 100, 30);
	  
	  ButtonGroup g=new ButtonGroup();
	  g.add(jr);
	  g.add(jr1);
	  
	  JRadioButton jr2=new JRadioButton("married");
	  jr2.setBounds(100, 150, 100, 30);
	  JRadioButton jr3=new JRadioButton("unmarried");
	  jr3.setBounds(200, 150, 100, 30);
	  
	  ButtonGroup gp=new ButtonGroup();
	  gp.add(jr2);
	  gp.add(jr3);
	  
	  JRadioButton jr4=new JRadioButton("genral");
	  jr4.setBounds(100, 250, 100, 30);
	  JRadioButton jr5=new JRadioButton("OBC");
	  jr5.setBounds(200, 250, 100, 30);
	  JRadioButton jr6=new JRadioButton("ST");
	  jr6.setBounds(300, 250, 100, 30);
	  JRadioButton jr7=new JRadioButton("SC");
	  jr7.setBounds(400, 250, 100, 30);

	  ButtonGroup cat=new ButtonGroup();
	  cat.add(jr4);
	  cat.add(jr5);
	  cat.add(jr6);
	  cat.add(jr7);
	  Font f=new Font("Arial",Font.BOLD,25);
		jr.setFont(f);	  
		jr1.setFont(f);
		jr2.setFont(f);
		jr3.setFont(f);
		jr4.setFont(f);
		jr5.setFont(f);
		jr6.setFont(f);
		jr7.setFont(f);
 
	  c.add(jr);
	  c.add(jr1);
	  c.add(jr2);
	  c.add(jr3);
	  c.add(jr4);
	  c.add(jr5);
	  c.add(jr6);
	  c.add(jr7);
	}

}
