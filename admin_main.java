import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.io.File;
import java.awt.Graphics;
import java.io.IOException;
import java.awt.Desktop;


public class admin_main extends JFrame implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6;
	JPasswordField password;
	JTextField t1;
	JButton  login_button,show;
	 int x = 500,a=500,c=500,d=500,e=500;
	Timer timer;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b14;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;
	
          public admin_main()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(2000,2000);

		java.awt.Font f=new java.awt.Font("Papyrus",java.awt.Font.BOLD,50);
		java.awt.Font f2=new java.awt.Font("Viner Hand ITC",java.awt.Font.BOLD,30);
	  	java.awt.Font f1=new java.awt.Font("Courier",java.awt.Font.BOLD,15);
		java.awt.Font f3=new java.awt.Font("Harrington",java.awt.Font.BOLD,17);


		

			JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,225,0,40));		
			p1.setBounds(0,0,2000,100);
			add(p1);
			
		

			l1=new JLabel("Restaurant");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f);
			l2.setFont(f);
			l3.setFont(f);

			l1.setForeground(Color.WHITE);
			l2.setForeground(new Color(0,155,0));
			l3.setForeground(Color.WHITE);

			l1.setBounds(20,10,600,100);
			l2.setBounds(340,10,600,100);
			l3.setBounds(680,10,600,100);
			p1.add(l1);
			p1.add(l2);
			p1.add(l3);

			Border b = BorderFactory.createLineBorder(Color.WHITE, 1);
			Border a2 = BorderFactory.createLineBorder(new Color(0,155,0), 3);
			Border a1 = BorderFactory.createLineBorder(new Color(0,155,0), 1);



			JPanel p2 = new JPanel();
			p2.setLayout(null);
			p2.setBounds(10,120,1900,550);
			p2.setBackground(new Color(0,0,0,0));
			add(p2);

			 b1=new JButton(new ImageIcon("emp.jpg"));
			b1.setBounds(110,230,250,230);
			b1.setBorder(a2);
			b1.setBackground(Color.WHITE);
			p2.add(b1);

		
			 b2 = new JButton(new ImageIcon("cust.jpg"));
			b2.setBounds(620,230,250,230);
			b2.setBorder(a2);
			b2.setBackground(Color.WHITE);
			p2.add(b2);

			b3 = new JButton(new ImageIcon("menu.jpg"));
			b3.setBounds(1100,230,250,230);
			b3.setBorder(a2);
			b3.setBackground(Color.WHITE);
			p2.add(b3);

			b4 = new JButton(new ImageIcon("sales.jpg"));
			b4.setBounds(1530,230,250,230);
			b4.setBorder(a2);
			b4.setBackground(Color.WHITE);
			p2.add(b4);


			JButton l4= new JButton("Employee Details");
			l4.setBounds(140,480,180,30);
			l4.setBorder(a1);
			l4.setBackground(Color.white);
			l4.setForeground(new Color(0,155,0));
			l4.setFont(f3);
			p2.add(l4);

			JButton l5= new JButton("Customer Details");
			l5.setBounds(650,480,180,30);
			l5.setBorder(a1);
			l5.setBackground(Color.white);
			l5.setForeground(new Color(0,155,0));
			l5.setFont(f3);
			p2.add(l5);

	
			JButton l6= new JButton("Order Mangement");
			l6.setBounds(1140,480,160,30);
			l6.setBorder(a1);
			l6.setBackground(Color.white);
			l6.setForeground(new Color(0,155,0));
			l6.setFont(f3);
			p2.add(l6);


			JButton l7= new JButton("Total Sales");
			l7.setBounds(1579,480,160,30);
			l7.setBorder(a1);
			l7.setBackground(Color.white);
			l7.setForeground(new Color(0,155,0));
			l7.setFont(f3);
			p2.add(l7);

		
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			l4.addActionListener(this);
			


}
public void actionPerformed(ActionEvent ae)
{

		String s = ae.getActionCommand();
		
		if(ae.getSource()==b1)
		{
		
                          
	              new emp_details(); 
		}
		if(ae.getSource() == b2)
		{
                   new cus_details();
		}
		
		if(ae.getSource()==b3)
		{
		   new menu();	
		}

		if(ae.getSource() == b4)
		{
			new sales();
		}







}


public static void main(String args[])
{
	new admin_main();
}




}