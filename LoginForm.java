import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Form extends JFrame implements ActionListener 
{
	Container c;
	JLabel jl=new JLabel("UserName");
	JLabel jl1=new JLabel("Password");
	JTextField jt=new JTextField();
	JPasswordField jp=new JPasswordField();
	JButton jb=new JButton("Login");
  Form()
  {
	c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.WHITE);
	jl.setBounds(100, 50, 100, 40);
	jl1.setBounds(100, 150, 100, 40);
	
	Font f=new Font("Arial",Font.BOLD,20);
	jl.setFont(f);
	jl1.setFont(f);
	
	jt.setBounds(250, 50, 150, 50);
	jp.setBounds(250, 150,150,50);
	jb.setBounds(150, 250, 200, 50);
	jb.addActionListener(this);
	jt.setFont(f);
	jp.setFont(f);
	jb.setFont(f);
	
	c.add(jl);
	c.add(jl1);
	c.add(jt);
	c.add(jp);
	c.add(jb);
  }
  public void actionPerformed(ActionEvent e)
  {
	  if(e.getSource()==jb)
	  {
		  String username=jt.getText();
		  String password=jp.getText();
		  if(username.equals("ABC") && password.equals("1234"))
		  {
			  c.setBackground(Color.GREEN);
		  }
		  else
		  {
			  c.setBackground(Color.RED);
			  wr.setBounds(100,300,200,40);
			  c.add(wr);
		  }
	  }
  }
  JLabel wr=new JLabel("Wrong username or Password");
}

public class LoginForm 
{
    public static void main(String[] args)
	{
	  Form f=new Form();
	  f.setTitle("Login Form");
	  f.setVisible(true);
	  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  f.setBounds(200, 100, 700,500);
	}

}
