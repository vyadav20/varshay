import java.awt.*;

import javax.swing.*;

public class SwingPasswordFielf {

	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100, 100, 1000, 500);
		Container c=jf.getContentPane();
         c.setLayout(null);
         JPasswordField jp=new JPasswordField();
         jp.setBounds(100, 50, 100, 30);
         Font f=new Font("Arial",Font.BOLD,15);
         jp.setFont(f);
         jp.setBackground(Color.YELLOW);
         jp.setForeground(Color.RED);
         c.add(jp);
         
         JButton jb=new JButton("click");
         jb.setBounds(100, 100, 100, 40);
         jb.setText("Another");
         Font ff=new Font("Arial",Font.BOLD,20);
         jb.setFont(ff);
         jb.setBackground(Color.GREEN);
         jb.setForeground(Color.RED);
         Cursor cu=new Cursor(Cursor.HAND_CURSOR);
         jb.setCursor(cu);
         c.add(jb);
	}

}
