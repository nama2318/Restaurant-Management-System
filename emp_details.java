import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Graphics;
import java.util.*;
import javax.swing.border.*;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;

public class emp_details extends JFrame implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6,l9,l10;
	JPasswordField password;
        JTable tbl;
         JPanel p3;
        JScrollPane pane;
	DefaultTableModel model;
	JTextField t1,a11,t6,t7;
	JButton  login_button,show,b11,b12,b13,b14;

               java.awt.Font f=new java.awt.Font("Papyrus",java.awt.Font.BOLD,50);
		java.awt.Font f2=new java.awt.Font("Viner Hand ITC",java.awt.Font.BOLD,30);
	  	java.awt.Font f1=new java.awt.Font("Lucida Calligraphy",java.awt.Font.BOLD,20);
		java.awt.Font f3=new java.awt.Font("Times New Roman",java.awt.Font.BOLD,15);
              

	
          public emp_details()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1500,1500);

		

		

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

			
			TitledBorder a=new TitledBorder(new LineBorder(new Color(0,155,0), 2), "-     Employee Details     -", TitledBorder.LEADING,TitledBorder.TOP,null,Color.white);
			a.setTitleFont(new java.awt.Font("Modern No. 20", java.awt.Font.PLAIN, 20));


		        p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(600,210,1060,750);
			p3.setBorder(a);
			add(p3);


		b11=new JButton("View");
		b12=new JButton("Update");
		b13=new JButton("Delete");
		b14=new JButton("Add");

		b11.setBackground(Color.WHITE);
		b11.setForeground(new Color(0,155,0));
		b12.setBackground(Color.WHITE);
		b12.setForeground(new Color(0,155,0));
		b13.setBackground(Color.WHITE);
		b13.setForeground(new Color(0,155,0));
		b14.setBackground(Color.WHITE);
		b14.setForeground(new Color(0,155,0));

		a11=new JTextField();  
		a11.setForeground(new Color(0,155,0));

		a11.setBounds(130,400,200,30);  

		b13.setBounds(130,480,200,40);  
		b11.setBounds(130,550,200,40);  
		b12.setBounds(130,620,200,40);
		b14.setBounds(130,690,200,40);

		 
    	
	
			add(a11);
			add(b11);
			add(b12);
			add(b13);
			add(b14);
	
	b11.addActionListener(this);
	b13.addActionListener(this);
	b12.addActionListener(this);
	b14.addActionListener(this);






}

public void actionPerformed(ActionEvent ae)
{

		String s = ae.getActionCommand();
		
		if(ae.getSource()==b11)
		{
		   
	             
	try{
			Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
				

				PreparedStatement ps=co.prepareStatement("select * from tdd");
						
				ResultSet re=ps.executeQuery();

				String Co[]={"ID","FirstName","LastName","Contact","Address","DOB"};

				 String rs[][]={{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""},
						{"","","","","",""}
					      };
			
					tbl=new JTable(rs,Co); 

					JScrollPane jsp=new JScrollPane(tbl,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); 
					tbl.setFont(f3);
					tbl.setRowHeight(20);
					
					
					tbl.setBackground(Color.WHITE);
					//tbl.setForeground(new Color(130,0,250));
				
					
					jsp.setBounds(20,28,1000,600);
					int i=0;

				while(re.next())
			        {
					tbl.setValueAt(re.getString(1),i,0);
                                        tbl.setValueAt(re.getString(2),i,1);
                                        tbl.setValueAt(re.getString(3),i,2);
					tbl.setValueAt(re.getString(4),i,3);
					tbl.setValueAt(re.getString(5),i,4);
					tbl.setValueAt(re.getString(6),i,5);
					//tbl.setValueAt(re.getString(7),i,6);
					//tbl.setValueAt(re.getString(8),i,7);
					
					i++;
					
				}

						ps.close();
						co.close();
					p3.add(jsp);
				
		}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
		}
		if(ae.getSource() == b12)
		{
                   new emp_update();
		}
		
		if(ae.getSource()==b13)
		{

                           String a;
			      int b;
			      
			    
	     

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
				
					a=a11.getText();
					//b=a11.getInt();
					
	  				
					PreparedStatement ps=co.prepareStatement("delete from tdd where Id=?");

		   
		   			 ps.setString(1,a);		
		   
		     			ps.executeUpdate();
 		
					JOptionPane.showMessageDialog(this,"DELETE");
		
				
			  a11.setText("  ");
			
							
				
			  ps.close();
		   
		    co.close();	
			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}

 
			
		}

		if(ae.getSource() == b14)
		{
			new emp_add();
		}







}

public static void main(String args[])
{
	new emp_details();
}
}