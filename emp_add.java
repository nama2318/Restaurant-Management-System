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

public class emp_add extends JFrame implements ActionListener
  {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l11,l12,l9,l10;
	JPasswordField password;
	JTextField t1,a11,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton  login_button,show,b11,b12,b13,b14;
	
          public emp_add()
          {
	
       		 getContentPane().setBackground(Color.BLACK);
		 setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	 setLayout(null);
 	  	 setVisible(true);
		 setSize(1900,1900);

		Font f=new Font("Papyrus",Font.BOLD,50);
		Font f2=new Font("Viner Hand ITC",Font.BOLD,30);
	  	Font f1=new Font("Lucida Calligraphy",Font.BOLD,20);
		Font f3=new Font("Harrington",Font.BOLD,20);


		

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

			Border b = BorderFactory.createLineBorder(new Color(0,155,0), 2);
			Border a2 = BorderFactory.createLineBorder(new Color(0,155,0), 3);
			Border a1 = BorderFactory.createLineBorder(new Color(0,155,0), 1);

			
			TitledBorder a=new TitledBorder(new LineBorder(new Color(0,155,0), 2), "-     Employee Details     -", TitledBorder.LEADING,TitledBorder.TOP,null,Color.white);
			a.setTitleFont(new Font("Modern No. 20", Font.PLAIN, 20));


			JPanel p3=new JPanel();
			p3.setLayout(null);
			p3.setSize(400,350);
			p3.setBackground(new Color(0,0,0,20));
			p3.setBounds(350,170,1300,780);
			p3.setBorder(a);
			add(p3);


			

			l4=new JLabel("First Name:");
      		     
        		l5=new JLabel("Last Name:");
       		        l6=new JLabel("Mobile No:");
        		l7=new JLabel("Address:");
        		l8=new JLabel("Date of Birth:");
        		l9=new JLabel("Username :");
        		l10=new JLabel("Password :");



			b11=new JButton("Cancel");
       		        b12=new JButton("Clear");
        		b13=new JButton("Submit");


       			 t1=new JTextField();
       			
      		         t3=new JTextField();
        		 t4=new JTextField("+91 ");
      		         t5=new JTextField();
       			 t6=new JTextField();
       			 t7=new JTextField();
       			 t9=new JTextField();

			
			



		
			   l4.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		 
     			   l5.setFont(new Font("Times New Roman",Font.BOLD,30));
     			   l6.setFont(new Font("Times New Roman",Font.BOLD,30));
     	 		   l7.setFont(new Font("Times New Roman",Font.BOLD,30));
     	                   l8.setFont(new Font("Times New Roman",Font.BOLD,30));
                           l9.setFont(new Font("Times New Roman",Font.BOLD,30));
                           l10.setFont(new Font("Times New Roman",Font.BOLD,30));

      
        b11.setFont(new Font("Times New Roman",Font.BOLD,30));
        b12.setFont(new Font("Times New Roman",Font.BOLD,30));
        b13.setFont(new Font("Times New Roman",Font.BOLD,30));

        t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    
        t3.setFont(new Font("Times New Roman",Font.BOLD,30));
        t4.setFont(new Font("Times New Roman",Font.BOLD,30));
        t5.setFont(new Font("Times New Roman",Font.BOLD,30));
        t6.setFont(new Font("Times New Roman",Font.BOLD,30));
        t7.setFont(new Font("Times New Roman",Font.BOLD,30));
        t9.setFont(new Font("Times New Roman",Font.BOLD,30)); 
     

        l4.setBounds(50,100,200,50);
        l5.setBounds(600,100,180,50);
        l6.setBounds(50,190,200,50);
        l7.setBounds(50,260,150,50);
        l8.setBounds(50,330,200,50);
        l9.setBounds(50,410,150,50);
        l10.setBounds(400,410,150,50);

            
        //l3.setBounds(730,100,150,50);
        /*l6.setBounds(50,180,200,50);
        l7.setBounds(50,250,150,50);
        l8.setBounds(50,310,200,50);
        l9.setBounds(420,310,100,50);
       l10.setBounds(690,310,190,50);
        l11.setBounds(50,400,150,50);
        l12.setBounds(390,400,200,50);
        l13.setBounds(690,400,100,50);
        l14.setBounds(50,500,150,50);*/


	b11.setBounds(160,550,150,50);
        b12.setBounds(660,550,150,50);
        b13.setBounds(380,550,150,50);

        t1.setBounds(200,110,200,35);
        t3.setBounds(750,110,200,35);
  
        t4.setBounds(195,200,280,35);
        t5.setBounds(190,270,500,35);
        t6.setBounds(230,340,150,35);
        t7.setBounds(230,420,150,35);
        
        t9.setBounds(570,420,150,35);

	l4.setForeground(Color.WHITE);

	l5.setForeground(Color.WHITE);
	l6.setForeground(Color.WHITE);
	l7.setForeground(Color.WHITE);
	l8.setForeground(Color.WHITE);
	l9.setForeground(Color.WHITE);
	l10.setForeground(Color.WHITE);
	
		
			t1.setForeground(new Color(0,155,0));
			t3.setForeground(new Color(0,155,0));
			t4.setForeground(new Color(0,155,0));
			t5.setForeground(new Color(0,155,0));
			t6.setForeground(new Color(0,155,0));
			t7.setForeground(new Color(0,155,0));
			t9.setForeground(new Color(0,155,0));

			b11.setForeground(new Color(0,155,0));
			b12.setForeground(new Color(0,155,0));
			b13.setForeground(new Color(0,155,0));

			t1.setBackground(Color.WHITE);
			t3.setBackground(Color.WHITE);
			t4.setBackground(Color.WHITE);
			t5.setBackground(Color.WHITE);
			t6.setBackground(Color.WHITE);
			t7.setBackground(Color.WHITE);
			t9.setBackground(Color.WHITE);


			b11.setBackground(Color.WHITE);
			b12.setBackground(Color.WHITE);
			b13.setBackground(Color.WHITE);

			b11.setBorder(b);
			b12.setBorder(b);
			b13.setBorder(b);
			t1.setBorder(b);
			t3.setBorder(b);
			t4.setBorder(b);
			t5.setBorder(b);
			t6.setBorder(b);
			t7.setBorder(b);
        		t9.setBorder(b);       			

      


          p3.add(l4);
        
          p3.add(l5);
          p3.add(l6);
         p3.add(l7);
          p3.add(l8);
         //p3.add(l9);
//p3.add(l10);

	   p3.add(b11);
           p3.add(b12);
           p3.add(b13);

         p3.add(t1);
 
         p3.add(t3);
         p3.add(t4);
         p3.add(t5);
         p3.add(t6);
         //p3.add(t7);
	 //p3.add(t9);
      
        
        
	add(p3);
     
	

	

	b12.addActionListener(this);
	b13.addActionListener(this);
	

				
			






}

public void actionPerformed(ActionEvent ae)
	{
			
		
		String s=ae.getActionCommand();
			
				if(ae.getSource()==b13)
			  	 {      String a,b,c,d,e,f,g,h,i,j,k,l;
			     		 int i1;
			    
	     

                                try{
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
				
					//PreparedStatement p=co.prepareStatement("select Id from tdd");
						
					
                                         
		      			k=("3000");

                                       a=t1.getText();
	  				b=t3.getText();
					c=t4.getText();
					d=t5.getText();
					e=t6.getText();
           PreparedStatement ps=co.prepareStatement("insert into tdd (Fn,Ln,Mn,ad,dob,pr)values(?,?,?,?,?,?)");

		  
		     ps.setString(1,a);		
		     ps.setString(2,b);
		     ps.setString(3,c);
		     ps.setString(4,d);
		     ps.setString(5,e);
		     ps.setString(6,k);

ps.executeUpdate();
 		
		JOptionPane.showMessageDialog(this,"Inserted");
		
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText("+91 ");
				  t5.setText("  ");
				  t6.setText("  ");
				 
				
		
		    ps.close();
		    co.close();
				}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
}
					if(ae.getSource()==b12)
			  	 {   
				  t1.setText("  ");
	  			  t3.setText("  ");
				  t4.setText("+91 ");
				  t5.setText("  ");
				  t6.setText("  ");
				 
}

}

public static void main(String args[])
{
	new emp_add();
}
}