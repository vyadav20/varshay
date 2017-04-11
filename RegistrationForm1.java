import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class RegistrationForm1 implements ActionListener 
{

      static Container c;
      static JLabel name,number,dob,gender,address;
      static JTextField name_t,number_t,address_t;
      static JTextArea output;
      static JComboBox date, month,year;
      static JCheckBox con;
      static JRadioButton male,female;
      static JButton submit;
      static ButtonGroup bg;
      static String a_day,a_month,a_year;
      
	public static void main(String[] args)
	{
		JFrame jf=new JFrame("*REGISTRATION FORM*");
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200, 100, 900, 600);
		c=jf.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.YELLOW);
		name=new JLabel("Name");
		name.setBounds(100, 50, 60, 40);
		name_t=new JTextField();
		name_t.setBounds(200, 50, 150, 40);
		number=new JLabel("Number");
		number.setBounds(100, 100, 60, 40);
		number_t=new JTextField();
		number_t.setBounds(200, 100, 150, 40);
		
		dob=new JLabel("D.O.B");
		dob.setBounds(100, 150, 60, 40);
		
		String a_day[]=new String[31];
		for(int i=1;i<31;i++)
			a_day[i-1]=Integer.toString(i);
		date=new JComboBox(a_day);
		date.setBounds(200, 150, 80, 40);
		
		String a_month[]={"Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
		month=new JComboBox(a_month);
		month.setBounds(280, 150, 100, 40);
		
		String a_year[]=new String[70];
		for(int i=1951;i<2020;i++)
			a_year[i-1951]=Integer.toString(i);
		year=new JComboBox(a_year);
		year.setBounds(380, 150,100, 40);
		
		gender=new JLabel("Gender");
		gender.setBounds(100, 200, 60, 40);
		male=new JRadioButton("Male");
		male.setBounds(200, 200, 100, 40);
		female=new JRadioButton("Female");
		female.setBounds(300,200,100,40);
		bg=new ButtonGroup();
		bg.add(male);
		bg.add(female);
		
		address=new JLabel("Address");
		address.setBounds(100, 250, 60, 40);
		address_t=new JTextField();
		address_t.setBounds(200, 250, 250, 50);
		
		con=new JCheckBox("I accept all the terms and conditions");
		con.setBounds(100,300,300,40);
		
		submit=new JButton("Submit");
		submit.setBounds(170,370,150,50);
		submit.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				{submit_action(e);
			}
			}});
		
		output=new JTextArea();
		output.setBounds(500, 50, 300, 350);
		
		c.add(name);
		c.add(name_t);
		c.add(number);
		c.add(number_t);
		c.add(dob);
		c.add(gender);
		c.add(address);
		c.add(address_t);
		c.add(date);
		c.add(year);
		c.add(month);
		c.add(male);
		c.add(female);
		c.add(con);
        c.add(submit);
        c.add(output);
	}
	 public static void submit_action(ActionEvent e)
	{
		if(con.isSelected()==true)
		{
			String n=name_t.getText();
			String no=number_t.getText();
			String d=(String)date.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			String gen="Male";
			if(female.isSelected())
			{
				gen="Female";
			}
			String add=address.getText();
			output.setText("Name : "+n+"\nNumber : "+no+"\nD.O.B : "+d+" "+m+" "+y+"\nGender : "+gen+"\nAddress : "+add);
		}
		else
		{
			output.setText("please select terms and conditions");
		}
	}

	
}
