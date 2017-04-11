import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox {

	static Container c;
	static JComboBox jc;
	static JButton jb;
	static JLabel jl;
	public static void main(String[] args) 
	{
		JFrame jf=new JFrame("HELLO");
		  jf.setVisible(true);
		  jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  jf.setBounds(200, 100, 700, 500);
		  c=jf.getContentPane();
		  c.setLayout(null);
		
		  String[] arr={"A","B","C","D","E","f"};
          jc=new JComboBox(arr);
          jc.setBounds(100, 50, 101, 30);
          //jc.setEditable(true);
         // jc.setSelectedIndex(2);
          //jc.setSelectedItem("E");
          
          jc.addItem("G");
          jc.addItem("H");
          jc.removeItem("d");
          
          jb=new JButton("ok");
          jb.setBounds(250,50,100,30);
          
          jb.addActionListener(new ActionListener(){
        	                    public void actionPerformed(ActionEvent e)
        	                    {jbButtonAction(e);} });
          
          jl=new JLabel("msg");
          jl.setBounds(100,150,150,40);
          c.add(jc);
          c.revalidate();
          c.add(jb);
          c.add(jl);
	}
  static void jbButtonAction(ActionEvent e)
  {
	  String item=(String)jc.getSelectedItem();
	  jl.setText(item);
	  //jl.setText(Integer.toString(jc.getSelectedIndex()));
  }
}
