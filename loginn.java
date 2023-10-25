import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class loginn extends JFrame implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6;
	JPasswordField pass;
	JTextField t1;
	JButton  login_button,show;
	 Border b1;
	
          public loginn()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1500,900);

		java.awt.Font f=new java.awt.Font("Papyrus",java.awt.Font.BOLD,50);
		java.awt.Font f2=new java.awt.Font("Viner Hand ITC",java.awt.Font.BOLD,30);
	  	//java.awt.Font f1=new java.awt.Font("Lucida Calligraphy",java.awt.Font.BOLD,20);
		java.awt.Font f3=new java.awt.Font("Harrington",java.awt.Font.BOLD,20);


		

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

			//login panel
			JPanel l=new JPanel();
			l.setLayout(null);
			l.setSize(500,450);
			//l.setBackground(new Color(255,165,0,123));
			l.setBackground(new Color(0,0,0,80));


			l4=new JLabel("LO");
			l5=new JLabel("G");
			l6=new JLabel("IN");


			l4.setFont(f2);
			l4.setForeground(new Color(0,155,0));
			l.add(l4);

			l5.setFont(f2);
			l5.setForeground(Color.WHITE);
			l.add(l5);

			l6.setFont(f2);
			l6.setForeground(new Color(0,155,0));
			l.add(l6);

			l4.setBounds(190,40,200,30);
			l5.setBounds(230,40,200,30);
			l6.setBounds(250,40,200,30);

			t1=new JTextField("Enter username");
			t1.setBounds(50,90,370,60);
			//t1.setOpaque(false);
			t1.setForeground(Color.BLACK);
                         //t1.setForeground(new Color(0,155,0));
			t1.setBackground(new Color(255,255,255));

			Border b = BorderFactory.createLineBorder(new Color(0,155,0), 2);
			Border b2 = BorderFactory.createLineBorder(Color.WHITE, 2);
			t1.setBorder(b2);
			l.setBorder(b);

			l.setBounds(1199,270,480,480);
			l.add(t1);


			
			 pass=new JPasswordField("Enter password");
			pass.setBackground(new Color(255,255,255));
			pass.setForeground(Color.BLACK);
			//password.setOpaque(false);
			pass.setBounds(50,220,370,60);
			pass.setBorder(b2);

			l.add(pass);
			

			  login_button=new JButton("login");
			login_button.setBounds(190,350,100,50);
			login_button.setBackground(Color.WHITE);
			login_button.setForeground(new Color(0,155,0));
			login_button.setFont(f3);

			b1 = BorderFactory.createLineBorder(Color.ORANGE, 1);
			login_button.setBorder(b);
			l.add(login_button);


			show=new JButton(new ImageIcon("pass.jpg"));
			show.setBounds(370,190,30,20);
			show.setBackground(Color.WHITE);
			//show.setForeground(new Color(0,155,0));
			l.add(show);
			add(l);
	


			login_button.addActionListener(this);
			show.addActionListener(this);

}
 public void actionPerformed(ActionEvent ae)
          {
			String s=ae.getActionCommand();
			
			
			if(s.equals("login"))
			{
	 			   String user;
         			   String pwd;
          	 		   user= t1.getText();
          	 		   pwd= pass.getText();
           			   if (user.equalsIgnoreCase("admin") && pwd.equalsIgnoreCase("12345"))
	   	 		   {
           	   			  JOptionPane.showMessageDialog(this, "Login Successful");
						new admin_main();
           	                   } 
	  			  else 
	  	                   {
           	    				 JOptionPane.showMessageDialog(this, "Invalid Username or Password");
	   	                   }
		
			}

			if(ae.getSource()==show)
			{
				pass.setEchoChar((char)0);
			}
}

public static void main(String args[])
{
	new loginn();
}
}