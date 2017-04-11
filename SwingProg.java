import java.awt.*;

import javax.swing.*;

public class SwingProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     JFrame jf=new JFrame();
      jf.setVisible(true);
      jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      jf.setBounds(100,100,800,400);
     Container c =jf.getContentPane();
     c.setLayout(null);
     JTextField jt=new JTextField();
      jt.setBounds(100, 50, 200, 40); 
      Font f=new Font("Arial",Font.ITALIC,20);
      jt.setFont(f);
      Color clr=new Color(10,200,30);
      //jt.setBackground(Color.YELLOW);
      jt.setBackground(clr);
      jt.setForeground(Color.RED);
      c.add(jt);
	}

}
