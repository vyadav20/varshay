import javax.swing.*;
import java.awt.*;

public class CheckBox {

	public static void main(String[] args)
	{
		JFrame jf=new JFrame("HELLO");
		  jf.setVisible(true);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.setBounds(200, 100, 700, 500);
		  Container c=jf.getContentPane();
		  c.setLayout(null);
		  
		  JCheckBox jc=new JCheckBox("java");
		  jc.setBounds(100,50,150,30);
		  JCheckBox jc1=new JCheckBox("c++");
		  jc1.setBounds(200,50,150,30);
		 // jc.setSelected(true);
		  jc1.setEnabled(false);
		  ButtonGroup bg=new ButtonGroup();
		  bg.add(jc);
		  bg.add(jc1);
		  Font f=new Font("Arial",Font.ITALIC,25);
		  jc.setFont(f);
		  jc1.setFont(f);
		  
		   c.add(jc);
          c.add(jc1);
         
	}

}
