import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextArea {
    static Container c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("HELLO");
		  jf.setVisible(true);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.setBounds(200, 100, 700, 500);
		  
		  c=jf.getContentPane();
		  c.setLayout(null);
		  JTextArea jt=new JTextArea();
		  jt.setBounds(100,50,200,200);
		  Font f=new Font("Arial",Font.ITALIC,15);
		  jt.setFont(f);
		  c.add(jt);
	}

}
