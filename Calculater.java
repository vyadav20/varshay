import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
public class Calculater {
    static Container c;
    static JLabel num=new JLabel("Number 1");
    static JLabel num1=new JLabel("Number 2");
    static JTextField num_t=new JTextField();
    static JTextField num1_t=new JTextField();
    static JButton add=new JButton("Addition");
    static JButton sub=new JButton("Subtraction");
    static JButton mul=new JButton("Multiplication");
    static JButton div=new JButton("Divison");
    static JLabel ans=new JLabel("Answer");
    static JTextField ans_t=new JTextField();
    static JLabel msg=new JLabel();

	public static void main(String[] args) 
	{
	  JFrame jf=new JFrame("CALCULATER");
	  jf.setVisible(true);
	  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  jf.setBounds(200, 100, 800, 500);
	  c=jf.getContentPane();
	  c.setLayout(null);
	  c.setBackground(Color.blue);
	  num.setBounds(50,50,70,25);
	  num1.setBounds(50,90,70,25);
	  
	  num_t.setBounds(130,50,70,25);
	  num1_t.setBounds(130,90,70,25);
	  
	  add.setBounds(20, 130, 100, 30);
	  sub.setBounds(120, 130, 100, 30);
	  mul.setBounds(220, 130, 100, 30);
	  div.setBounds(320, 130, 100, 30);
	  
	  msg.setBounds(50,215,300,25);
	  
	
	  add.addActionListener(new ActionListener(){
		                     public void actionPerformed(ActionEvent e)
		                     {add_action(e);}});
	  sub.addActionListener(new ActionListener(){
                              public void actionPerformed(ActionEvent e)
                               {sub_action(e);}});
	  mul.addActionListener(new ActionListener(){
                             public void actionPerformed(ActionEvent e)
                             {mul_action(e);}});
	  div.addActionListener(new ActionListener(){
                              public void actionPerformed(ActionEvent e)
                               {div_action(e);}});

	  ans.setBounds(50,180,200,25);
	  ans_t.setBounds(130,180,100,20);
	  
	   
	  c.add(num);
      c.add(num1);
      c.add(num_t);
      c.add(num1_t);
      c.add(add);
      c.add(sub);
      c.add(mul);
      c.add(div);
      c.add(ans);
      c.add(ans_t);
      c.add(msg);
	}
	public static void add_action(ActionEvent e)
	{
		String s=num_t.getText();
		String s1=num1_t.getText();
		Float n=(float) 0.0;
	    Float n1=(float) 0.0;
		try
		{
		   n=Float.parseFloat(s);
		   n1=Float.parseFloat(s1);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		Float an=n+n1;
		String anss=Float.toString(an);
		ans_t.setText(anss);
	}
	public static void sub_action(ActionEvent e)
	{
		String s=num_t.getText();
		String s1=num1_t.getText();
		Float n=(float) 0.0;
	    Float n1=(float) 0.0;
		try
		{
		   n=Float.parseFloat(s);
		   n1=Float.parseFloat(s1);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		Float an=n-n1;
		String anss=Float.toString(an);
		ans_t.setText(anss);
	}
	public static void mul_action(ActionEvent e)
	{
		String s=num_t.getText();
		String s1=num1_t.getText();
		Float n=(float) 0.0;
	    Float n1=(float) 0.0;
		try
		{
		   n=Float.parseFloat(s);
		   n1=Float.parseFloat(s1);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		Float an=n*n1;
		String anss=Float.toString(an);
		ans_t.setText(anss);
	}
	public static void div_action(ActionEvent e)
	{
		String s=num_t.getText();
		String s1=num1_t.getText();
		Float n=(float) 0.0;
	    Float n1=(float) 0.0;
		try
		{
		   n=Float.parseFloat(s);
		   n1=Float.parseFloat(s1);
		}
		catch(Exception ex)
		{
			msg.setText("please enter a valid number");
		}
		Float an=n/n1;
		String anss=Float.toString(an);
		ans_t.setText(anss);
	}
	
}
