import java.awt.*;  
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.*;
import javax.swing.border.*;
import java.lang.*;
import java.io.*;
import javax.swing.table.*;
import static java.sql.DriverManager.registerDriver;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.Properties;

public class add_menu extends JFrame	 implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l9,l10;
	JPasswordField password;
	JTextField t1,a11,t2,t3,t4,t5,t8,t9,t10,t6,t7;
	JButton  login_button,show,b11,b12,b13,b14;
	JPanel p1,p2,p3;

	Font f=new Font("Papyrus",Font.BOLD,40);
		Font f2=new Font("Viner Hand ITC",Font.BOLD,30);
	  	Font f1=new Font("Lucida Calligraphy",Font.BOLD,20);
		Font f3=new Font("Harrington",Font.BOLD,20);
          public add_menu()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1900,1900);

	


		

			 p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,225,0,40));		
			p1.setBounds(0,0,1500,100);
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
			l3.setBounds(700,10,600,100);
			p1.add(l1);
			p1.add(l2);
			p1.add(l3);

			Border b = BorderFactory.createLineBorder(new Color(0,155,0), 2);
			Border a2 = BorderFactory.createLineBorder(new Color(0,155,0), 3);
			Border a1 = BorderFactory.createLineBorder(new Color(0,155,0), 1);

			
			TitledBorder a=new TitledBorder(new LineBorder(new Color(0,155,0), 2), "-     Employee Details     -", 				TitledBorder.LEADING,TitledBorder.TOP,null,Color.white);
			a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 20));

			l4=new JLabel("Item Name:");
      		     
        		l5=new JLabel("Item Price");
       		        l6=new JLabel("Category");
        		


			b11=new JButton("Cancel");
       		        b12=new JButton("Clear");
        		b13=new JButton("Submit");


       			 t1=new JTextField();
       			
      		         t3=new JTextField();
        		 t4=new JTextField();
      		         
			
			



		
			   l4.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		 
     			   l5.setFont(new Font("Times New Roman",Font.BOLD,30));
     			   l6.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		 

      
        b11.setFont(new Font("Times New Roman",Font.BOLD,30));
        b12.setFont(new Font("Times New Roman",Font.BOLD,30));
        b13.setFont(new Font("Times New Roman",Font.BOLD,30));

        t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    
        t3.setFont(new Font("Times New Roman",Font.BOLD,30));
        t4.setFont(new Font("Times New Roman",Font.BOLD,30));
        
     

        l4.setBounds(50,100,200,50);
        l5.setBounds(600,100,180,50);
        l6.setBounds(50,190,200,50);
       
            
     


	b11.setBounds(160,550,150,50);
        b12.setBounds(660,550,150,50);
        b13.setBounds(380,550,150,50);

        t1.setBounds(200,110,200,35);
        t3.setBounds(750,110,200,35);
  
        t4.setBounds(195,200,280,35);
      

	l4.setForeground(Color.WHITE);

	l5.setForeground(Color.WHITE);
	l6.setForeground(Color.WHITE);

	
		
			t1.setForeground(new Color(0,155,0));
			t3.setForeground(new Color(0,155,0));
			t4.setForeground(new Color(0,155,0));
			

			b11.setForeground(new Color(0,155,0));
			b12.setForeground(new Color(0,155,0));
			b13.setForeground(new Color(0,155,0));

			t1.setBackground(Color.WHITE);
			t3.setBackground(Color.WHITE);
			t4.setBackground(Color.WHITE);
			


			b11.setBackground(Color.WHITE);
			b12.setBackground(Color.WHITE);
			b13.setBackground(Color.WHITE);

			b11.setBorder(b);
			b12.setBorder(b);
			b13.setBorder(b);
			t1.setBorder(b);
			t3.setBorder(b);
			t4.setBorder(b);
					

      


          add(l4);
        
          add(l5);
          add(l6);
         

	   add(b11);
           add(b12);
           add(b13);

         add(t1);
 
         add(t3);
         add(t4);
        
        
        
	//add(p3);
     
	

	
	//b11.addActionListener(this);
	//b12.addActionListener(this);
	b13.addActionListener(this);
	
				
			






}
public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b13)
			  	 {     
					 String a,b,c,d,e,f,g,h,i,j,k,l;
			     		 int i1;
			    

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
						
						a=t1.getText();
	  					b=t3.getText();
						c=t4.getText();
                                               
		                              i1=Integer.parseInt(b);
						
					if(c.equals("beverages"))
				{

					PreparedStatement ps=co.prepareStatement("insert into addbev(nm,pr,cat) values(?,?,?)");

		   
				
		    			 ps.setString(1,a);
		   			  ps.setInt(2,i1);
		   			  ps.setString(3,c);
		     

		 			    ps.executeUpdate();
 		
				JOptionPane.showMessageDialog(this,"Inserted");
		
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText(" ");
				 
		  		  ps.close();

			}
			if(c.equals("maincourse"))
			{


				PreparedStatement ps=co.prepareStatement("insert into addmain(nm,pr,cat) values(?,?,?)");

		   
				
		    			 ps.setString(1,a);
		   			  ps.setInt(2,i1);
		   			  ps.setString(3,c);
		     

		 			    ps.executeUpdate();
 		
				JOptionPane.showMessageDialog(this,"Inserted");
		
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText(" ");
				 
		  		  ps.close();






			}
			if(c.equals("dessert"))
			{


				PreparedStatement ps=co.prepareStatement("insert into adddes(nm,pr,cat) values(?,?,?)");

		   
				
		    			 ps.setString(1,a);
		   			  ps.setInt(2,i1);
		   			  ps.setString(3,c);
		     

		 			    ps.executeUpdate();
 		
				JOptionPane.showMessageDialog(this,"Inserted");
		
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText(" ");
				 
		  		  ps.close();






			}
		    co.close();
				}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
			}
	}
				

public static void main(String args[])
{
	new add_menu();
}
}

