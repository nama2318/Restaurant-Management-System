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
import java.awt.Component;
import java.awt.Container;
import java.awt.print.*;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.util.Calendar;
import java.text.SimpleDateFormat;


import java.io.*;


import java.util.Calendar;
import java.text.SimpleDateFormat;

public class sales extends JFrame implements ActionListener
  {
	
	JPasswordField password;
	JTextField t1,a11;
JPanel p3;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	JButton  login_button,show,b11,b12,b13,b14;
	String i,s4,s1,s2,s3;
int i1,i2,i3,i6,i7,i8;
	int i4=0;
	int i5=0;
	
          public sales()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1500,1500);

	java.awt.Font f=new java.awt.Font("Times New Roman",java.awt.Font.BOLD,17);
		java.awt.Font f2=new java.awt.Font("Times New Roman",java.awt.Font.BOLD,20);
	  	java.awt.Font f1=new java.awt.Font("Times New Roman",java.awt.Font.BOLD,20);
		java.awt.Font f3=new java.awt.Font("Papyrus",java.awt.Font.BOLD,50);
		
		

			JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,225,0,40));		
			p1.setBounds(0,0,2000,100);
			add(p1);
			
		

			l1=new JLabel("Restaurant");
			l2=new JLabel("Management");
			l3=new JLabel("System");

			l1.setFont(f3);
			l2.setFont(f3);
			l3.setFont(f3);

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

			
			
                             

                            
			p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(Color.WHITE);
			p3.setBounds(750,350,350,500);
			add(p3);

			l4=new JLabel("Restaurant Management System ");
			l4.setBounds(30,10,290,80);
			l4.setFont(f1);

			l5=new JLabel("By GPM Students ");
			l5.setBounds(80,40,250,80);
			l5.setFont(f);



			l6=new JLabel("-----------------------------------------------");
			l6.setBounds(10,70,350,80);
			l6.setFont(f2);

			l7=new JLabel("-----------------------------------------------");
			l7.setBounds(10,75,350,80);
			l7.setFont(f2);


			
			l8=new JLabel("TOTAL SALES:");
			l8.setBounds(10,140,290,80);
			l8.setFont(f2);

			l9=new JLabel("-----------------------------------------------");
			l9.setBounds(10,160,350,80);
			l9.setFont(f2);

			l10=new JLabel("EMPLOYEE:");
			l10.setBounds(10,205,290,80);
			l10.setFont(f2);

			l11=new JLabel("-----------------------------------------------");
			l11.setBounds(10,225,350,80);
			l11.setFont(f2);

			l12=new JLabel("MAINTENANCE :");
			l12.setBounds(10,265,290,80);
			l12.setFont(f2);

			l13=new JLabel("----------------------------------------------");
			l13.setBounds(10,285,350,80);
			l13.setFont(f2);

			l14=new JLabel("TOTAL :");
			l14.setBounds(40,335,290,80);
			l14.setFont(f2);


				/*try{
					Class.forName("com.mysql.jdbc.Driver");
					//JOptionPane.showMessageDialog(this,"Driver registerd");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
					//JOptionPane.showMessageDialog(this,"connection created");

				PreparedStatement ps=co.prepareStatement("select * from sales");
			
				ResultSet re=ps.executeQuery();

				while(re.next())
			        {
						i1=re.getInt(1);
						//s1=Integer.toString(i1);
					l15=new JLabel(""+i1);

				}
						
						ps.close();
						co.close();


			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}


			try{
					Class.forName("com.mysql.jdbc.Driver");
					//JOptionPane.showMessageDialog(this,"Driver registerd");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
					//JOptionPane.showMessageDialog(this,"connection created");
				PreparedStatement p=co.prepareStatement("select * from salary");
			
				ResultSet r1=p.executeQuery();

				while(r1.next())
			        {
						i2=r1.getInt(1);
						//i2=Integer.parseInt(i);
						
					l16=new JLabel(""+i2);

				}
						
						p.close();
						co.close();


			}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}

			

				
						i3=1000;
						
					l17=new JLabel(""+i3);

						
					


			


					i4=i1-i2;
					i5=i4-i3;

			s4=String.valueOf(i5);
		
				l18=new JLabel(s4);
			l15.setBounds(190,140,290,80);
			l15.setFont(f1);

			
			l16.setBounds(190,205,290,80);
			l16.setFont(f1);

			
			l17.setBounds(190,265,290,80);
			l17.setFont(f1);

			l18.setBounds(190,335,290,80);
			l18.setFont(f1);*/


                              p3.add(l4);

                               p3.add(l5);
 p3.add(l6);
 p3.add(l7);
 p3.add(l8);
 p3.add(l9); p3.add(l10); p3.add(l11); p3.add(l12); p3.add(l13); p3.add(l14);/* p3.add(l15); p3.add(l16); p3.add(l17); p3.add(l18);*/


b11 = new JButton("Print");
b11.setBounds(820,870,100,50);
b11.setBackground(Color.WHITE);
add(b11);

b11.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
	String s = ae.getActionCommand();
		
		if(ae.getSource()==b11)
		{
		
			try {
				Document d= new Document();
				PdfWriter pd=PdfWriter.getInstance(d,new FileOutputStream("aaa.pdf"));
				d.open();

				d.add(new Paragraph("\n\n\n"+l4.getText())); 
				d.add(new Paragraph("\n \t"+l5.getText())); 
				d.add(new Paragraph("\n "+l6.getText()));
				d.add(new Paragraph("\n "+l7.getText()));
				d.add(new Paragraph("\n \t"+l8.getText())); 
				d.add(new Paragraph("\n "+l9.getText()));
				d.add(new Paragraph("\n \t"+l10.getText()));
				d.add(new Paragraph("\n "+l11.getText()));
				d.add(new Paragraph("\n \t"+l12.getText()));  
				d.add(new Paragraph("\n "+l13.getText()));  
				d.add(new Paragraph("\n \t"+l14.getText())); 
				d.close();
       								
				JOptionPane.showMessageDialog(this,"PDF saved");           



		}catch (Exception e) {
			JOptionPane.showMessageDialog(this,e);   
			
		}


}
}
public static void main(String args[])
{
	new sales();
}

}