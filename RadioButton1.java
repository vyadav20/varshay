import javax.swing.*;
import java.awt.*;

public class RadioButton1 {
  
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
		  jr.setSelected(true);
		  jr1.setEnabled(false);
		  ButtonGroup bg=new ButtonGroup();
		  bg.add(jr);
		  bg.add(jr1);
		  
		  JRadioButton jr2=new JRadioButton("married");
		  jr2.setBounds(100, 150, 100, 30);
		  JRadioButton jr3=new JRadioButton("unmarried");
		  jr3.setBounds(200, 150, 100, 30);
		  ButtonGroup b=new ButtonGroup();
		  b.add(jr2);
		  b.add(jr3);
          jr3.setSelected(true);
          c.add(jr);
          c.add(jr1);
          c.add(jr2);
          c.add(jr3);
	}

}
