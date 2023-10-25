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

public class menu extends JFrame implements ActionListener
  {
	JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l01,l02,l03,la,lb;
JCheckBox
c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36;
	JPasswordField password;
	//JTextField t1;
JTextField t1,t2,t3,t4,t5,t6,t7,ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8,ts9,ts10,ts11,ts12,ts13,ts14,ts15,ts16,ts17,ts18,ts19,ts20,ts21,ts22,ts23,ts24,ts25,ts26,ts27,ts28,ts29,ts30,ts31,ts32,ts33,ts34,ts35,ts36;
	JButton  login_button,show;
	 int x = 500,a=500,c=500,d=500,e=500;
	int amt =0;
String msg="";

	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b14;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8;

	 JScrollPane pane;
	DefaultTableModel model;
	   JTable tbl;
	java.awt.Font m=new java.awt.Font("Consolas",java.awt.Font.BOLD,40);
          public menu()
          {

		JFrame j = new JFrame("Frame in Java Swing");
		  j.getContentPane().setBackground(Color.BLACK);;
	 	 j.setLayout(null);
 	  	
		j.setVisible(true);
		 j.setSize(1500,900);
	
       		
		 j.setContentPane(new JLabel(new ImageIcon("bg.jpg")));
	 	

		java.awt.Font f=new java.awt.Font("Papyrus",java.awt.Font.BOLD,50);
		java.awt.Font f2=new java.awt.Font("Viner Hand ITC",java.awt.Font.BOLD,30);
	  	java.awt.Font f1=new java.awt.Font("Courier",java.awt.Font.BOLD,15);
		java.awt.Font f3=new java.awt.Font("Times New Roman",java.awt.Font.BOLD,30);
			
			

			JPanel p1=new JPanel();
			p1.setLayout(null);
			p1.setSize(400,350);
			p1.setBackground(new Color(0,225,0,40));		
			p1.setBounds(0,0,2000,100);
			j.add(p1);
			
		

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
b1=new JButton("Order");

b1.setFont(m);
b1.setForeground(Color.yellow);
b1.setContentAreaFilled(false);
b1.setBounds(1200,900,200,50);
b1.addActionListener(this);
j.add(b1);
Border g=BorderFactory.createLineBorder(Color.white,2);
b1.setBorder(g);

			la=new JLabel("Name");
			lb=new JLabel("Contact");
	
			t1=new JTextField();
			t2=new JTextField("+91");

			la.setForeground(new Color(0,155,0));
			lb.setForeground(new Color(0,155,0));
			t1.setForeground(new Color(0,155,0));
			t2.setForeground(new Color(0,155,0));
                        la.setFont(f3);
			lb.setFont(f3);
			t1.setFont(f3);
			t2.setFont(f3);

		la.setBounds(250,900,200,30);
		t1.setBounds(350,900,200,30);
		lb.setBounds(590,900,200,30);
		t2.setBounds(730,900,200,30);

		j.add(la);
		j.add(lb);
		j.add(t1);
		j.add(t2);





 ts1=new JTextField();
   ts2=new JTextField();
ts3=new JTextField();
ts4=new JTextField();
ts5=new JTextField();
ts6=new JTextField();
ts7=new JTextField();
ts8=new JTextField();
ts9=new JTextField();
ts10=new JTextField();
ts11=new JTextField();
ts12=new JTextField();
ts13=new JTextField();
ts14=new JTextField();
ts15=new JTextField();
ts16=new JTextField();
ts17=new JTextField();
ts18=new JTextField();
ts19=new JTextField();
ts20=new JTextField();
ts21=new JTextField();
ts22=new JTextField();
ts23=new JTextField();
ts24=new JTextField();
ts25=new JTextField();
ts26=new JTextField();
ts27=new JTextField();
ts28=new JTextField();
ts29=new JTextField();
ts30=new JTextField();
ts31=new JTextField();
ts32=new JTextField();
ts33=new JTextField();
ts34=new JTextField();
ts35=new JTextField();
ts36=new JTextField();


ts1.setBounds(650,240,25,25);
ts2.setBounds(650,280,25,25);
ts3.setBounds(650,320,25,25);
ts4.setBounds(650,360,25,25);
ts5.setBounds(650,400,25,25);
ts6.setBounds(650,440,25,25);


ts19.setBounds(650,560,25,25);
ts20.setBounds(650,600,25,25);
ts21.setBounds(650,640,25,25);
ts22.setBounds(650,680,25,25);
ts23.setBounds(650,720,25,25);
ts24.setBounds(650,760,25,25);


ts7.setBounds(1150,240,25,25);
ts8.setBounds(1150,280,25,25);
ts9.setBounds(1150,320,25,25);
ts10.setBounds(1150,360,25,25);
ts11.setBounds(1150,400,25,25);
ts12.setBounds(1150,440,25,25);


ts25.setBounds(1150,560,25,25);
ts26.setBounds(1150,600,25,25);
ts27.setBounds(1150,640,25,25);
ts28.setBounds(1150,680,25,25);
ts29.setBounds(1150,720,25,25);
ts30.setBounds(1150,760,25,25);


ts13.setBounds(1610,240,25,25);
ts14.setBounds(1610,280,25,25);
ts15.setBounds(1610,320,25,25);
ts16.setBounds(1610,360,25,25);
ts17.setBounds(1610,400,25,25);
ts18.setBounds(1610,440,25,25);


ts31.setBounds(1610,560,25,25);
ts32.setBounds(1610,600,25,25);
ts33.setBounds(1610,640,25,25);
ts34.setBounds(1610,680,25,25);
ts35.setBounds(1610,720,25,25);
ts36.setBounds(1610,760,25,25);

j.add(ts1);
j.add(ts2);
j.add(ts3);
j.add(ts4);
j.add(ts5);
j.add(ts6);
j.add(ts19);
j.add(ts20);
j.add(ts21);
j.add(ts22);
j.add(ts23);
j.add(ts24);
j.add(ts7);
j.add(ts8);
j.add(ts9);
j.add(ts10);  
j.add(ts11);
j.add(ts12);
j.add(ts25);
  j.add(ts26);
  j.add(ts27);
  j.add(ts28);
  j.add(ts29);
j.add(ts30);
j.add(ts13);
j.add(ts14);
j.add(ts15);
j.add(ts16);
j.add(ts17);
j.add(ts18);
j.add(ts31);
j.add(ts32);
j.add(ts33);
j.add(ts34);
j.add(ts35);
j.add(ts36);



  
  
  

  
  

/*l01=new JLabel(i1);
l02=new JLabel(i2);
l03=new JLabel(i3);
l4=new JLabel(i4);
l5=new JLabel(i5);
l6=new JLabel(i6);
l7=new JLabel(i7);
l8=new JLabel(i8);
l9=new JLabel(i9);
l10=new JLabel(i10);
l11=new JLabel(i11);
l12=new JLabel(i12);
l13=new JLabel(i13);
l14=new JLabel(i14);
l15=new JLabel(i15);
l16=new JLabel(i16);
l17=new JLabel(i17);
l18=new JLabel(i18);
l19=new JLabel(i19);
l20=new JLabel(i20);
l21=new JLabel(i21);



l22=new JLabel(i22);*/
l23=new JLabel("--<--<<-- Menu -->>-->--");
l24=new JLabel("Snacks");
l25=new JLabel("Starters");
l26=new JLabel("Main Course");
l27=new JLabel("Soups");
l28=new JLabel("Salads");
l29=new JLabel("Desserts");
l23.setFont(f1); l23.setForeground(Color.yellow);
l24.setFont(f2); l24.setForeground(Color.yellow);
l25.setFont(f2); l25.setForeground(Color.yellow);
l26.setFont(f2); l26.setForeground(Color.yellow);
l27.setFont(f2); l27.setForeground(Color.yellow);
l28.setFont(f2); l28.setForeground(Color.yellow);
l29.setFont(f2); l29.setForeground(Color.yellow);
l23.setBounds(650,30,700,50);
l24.setBounds(320,170,320,50);
l25.setBounds(320,490,320,50);
l26.setBounds(800,170,320,50);
l27.setBounds(800,490,320,50);
l28.setBounds(1280,170,320,50);
l29.setBounds(1280,490,320,50);
/*l01.setBounds(0,0,150,150);
l02.setBounds(0,160,150,150);
l03.setBounds(0,320,150,150);
l4.setBounds(0,480,150,150);
l5.setBounds(0,640,150,150);
l6.setBounds(0,800,150,150);
l7.setBounds(170,90,150,150);
l8.setBounds(170,250,150,150);
l9.setBounds(170,410,150,150);
l10.setBounds(170,570,150,150);
l11.setBounds(170,730,150,150);
l12.setBounds(1740,0,150,150);
l13.setBounds(1740,160,150,150);
l14.setBounds(1740,320,150,150);
l15.setBounds(1740,480,150,150);
l16.setBounds(1740,640,150,150);
l17.setBounds(1740,800,150,150);
l18.setBounds(1570,90,150,150);
l19.setBounds(1570,250,150,150);
l20.setBounds(1570,410,150,150);
l21.setBounds(1570,570,150,150);
l22.setBounds(1570,730,150,150);*/
c1=new JCheckBox("Aloo Chaat..........................................................Rs.50");
c2=new JCheckBox("Cheese Balls......................................................Rs.100");
c3=new JCheckBox("Samosa................................................................Rs.20");
c4=new JCheckBox("Momos.................................................................Rs.60");
c5=new JCheckBox("Cutlet..................................................................Rs.60");
c6=new JCheckBox("Manchurian........................................................Rs.50");
c7=new JCheckBox("Veg Kadai...........................................................Rs.130");
c8=new JCheckBox("Paneer Masala..................................................Rs.140");
c9=new JCheckBox("Kaju Curry..........................................................Rs.150");



c10=new JCheckBox("Veg Kholapuri...................................................Rs.120");
c11=new JCheckBox("Dal Tadka..........................................................Rs.110");
c12=new JCheckBox("Panner Makhani................................................Rs.160");
c13=new JCheckBox("Carrot Salad........................................................Rs.70");
c14=new JCheckBox("Barely Salad........................................................Rs.40");
c15=new JCheckBox("Leafy Salad With Walnuts................................Rs.50");
c16=new JCheckBox("Crunchy Ribbion Salad......................................Rs.90");
c17=new JCheckBox("Mixed Bean Salad...............................................Rs.70");
c18=new JCheckBox("Pickled Beetroot Salad......................................Rs.60");
c19=new JCheckBox("Paneer Tikka.....................................................Rs.120");
c20=new JCheckBox("Potato Nuggets....................................................Rs.80");
c21=new JCheckBox("Aloo Tikki...........................................................Rs.120");
c22=new JCheckBox("Onion Pakoda.....................................................Rs.60");
c23=new JCheckBox("French Fries.........................................................Rs.60");
c24=new JCheckBox("Spring Rolls..........................................................Rs.50");
c25=new JCheckBox("Tomato Soup........................................................Rs.50");
c26=new JCheckBox("Baby Corn Soup..................................................Rs.60");
c27=new JCheckBox("Mexican Soup......................................................Rs.70");
c28=new JCheckBox("Machow................................................................Rs.60");
c29=new JCheckBox("Leafy Veggie Soup..............................................Rs.60");
c30=new JCheckBox("Radish Soup.........................................................Rs.50");
c31=new JCheckBox("Cad......................................................................Rs.120");
c32=new JCheckBox("Nutela Brownies...............................................Rs.130");
c33=new JCheckBox("Oreo Mint Cake.................................................Rs.220");
c34=new JCheckBox("Strawberry Pastry..............................................Rs.60");
c35=new JCheckBox("ButterFinger Cookie.........................................Rs.160");
c36=new JCheckBox("Butter Cannoli....................................................Rs.130");
c1.setBounds(330,240,300,30);
c2.setBounds(330,280,300,30);
c3.setBounds(330,320,300,30);
c4.setBounds(330,360,300,30);
c5.setBounds(330,400,300,30);
c6.setBounds(330,440,300,30);
c7.setBounds(810,240,300,30);
c8.setBounds(810,280,300,30);
c9.setBounds(810,320,300,30);
c10.setBounds(810,360,300,30);
c11.setBounds(810,400,300,30);
c12.setBounds(810,440,300,30);
c13.setBounds(1290,240,300,30);
c14.setBounds(1290,280,300,30);
c15.setBounds(1290,320,300,30);
c16.setBounds(1290,360,300,30);
c17.setBounds(1290,400,300,30);
c18.setBounds(1290,440,300,30);
c19.setBounds(330,560,300,30);
c20.setBounds(330,600,300,30);
c21.setBounds(330,640,300,30);
c22.setBounds(330,680,300,30);
c23.setBounds(330,720,300,30);
c24.setBounds(330,760,300,30);
c25.setBounds(810,560,300,30);



c26.setBounds(810,600,300,30);
c27.setBounds(810,640,300,30);
c28.setBounds(810,680,300,30);
c29.setBounds(810,720,300,30);
c30.setBounds(810,760,300,30);
c31.setBounds(1290,560,300,30);
c32.setBounds(1290,600,300,30);
c33.setBounds(1290,640,300,30);
c34.setBounds(1290,680,300,30);
c35.setBounds(1290,720,300,30);
c36.setBounds(1290,760,300,30);
 //j.add(l23);
 j.add(l24);
 j.add(l25);
 j.add(l26);
 j.add(l27);
 j.add(l28);
 j.add(l29);
/* j.add(l01);
 j.add(l02);
 j.add(l03);
 j.add(l4);
 j.add(l5);
 j.add(l6);
 j.add(l7);
 j.add(l8);
 j.add(l9);
 j.add(l10);
 j.add(l11);
 j.add(l12);
 j.add(l13);
 j.add(l14);
 j.add(l15);
 j.add(l16);
 j.add(l17);
 j. j.add(l18);
 j.add(l19);
 j.add(l20);
 j.add(l21);
 j.add(l22);*/
 j.add(c1);
 j.add(c2);
 j.add(c3);
 j.add(c4);
 j.add(c5);
 j.add(c6);
 j.add(c7);
 j.add(c8);
 j.add(c9);
 j.add(c10);
 j.add(c11);
 j.add(c12);
 j.add(c13);
 j.add(c14);



 j.add(c15);
 j.add(c16);
 j.add(c17);
 j.add(c18);
 j.add(c19);
 j.add(c20);
 j.add(c21);
 j.add(c22);
 j.add(c23);
 j.add(c24);
 j.add(c25);
 j.add(c26);
 j.add(c27);
 j.add(c28);
 j.add(c29);
 j.add(c30);
 j.add(c31);
 j.add(c32);
 j.add(c33);
 j.add(c34);
 j.add(c35);
 j.add(c36);
 j.add(l);





}
public void actionPerformed(ActionEvent ae)
{

 String a,b,c;
int cs1,cs2,cs3,cs4,cs5,cs6,cs7,cs8,cs9,cs10,cs11,cs12,cs13,cs14,cs15,cs16,cs17,cs18,cs19,cs20,cs21,cs22,cs23,cs24,cs25,cs26,cs27,cs28,cs29,cs30,cs31,cs32,cs33,cs34,cs35,cs36;
int t=0;

if(c1.isSelected())
{
String s1=ts1.getText();
cs1=Integer.parseInt(s1);
amt=amt+50*cs1;
msg=msg+"Aloo Chaat Rs.50\n";
}
if(c2.isSelected())
{
String s2=ts2.getText();
cs2=Integer.parseInt(s2);
amt=amt+100*cs2;
msg=msg+"Cheese Balls Rs.100\n";
}
if(c3.isSelected())
{
String s3=ts3.getText();
cs3=Integer.parseInt(s3);
amt=amt+20*cs3;
msg=msg+"Samosa Rs.20\n";
}
if(c4.isSelected())
{
String s4=ts4.getText();
cs4=Integer.parseInt(s4);
amt=amt+60*cs4;
msg=msg+"Momos Rs.60\n";
}
if(c5.isSelected())
{
String s5=ts5.getText();
cs5=Integer.parseInt(s5);
amt=amt+60*cs5;
msg=msg+"Cutlet Rs.60\n";



}
if(c6.isSelected())
{
String s6=ts6.getText();
cs6=Integer.parseInt(s6);
amt=amt+50*cs6;
msg=msg+"Manchurian Rs.50\n";
}
if(c7.isSelected())
{
String s7=ts7.getText();
cs7=Integer.parseInt(s7);
amt=amt+130*cs7;
msg=msg+"Veg Kadai Rs.130\n";
}
if(c8.isSelected())
{
String s8=ts8.getText();
cs8=Integer.parseInt(s8);
amt=amt+140*cs8;
msg=msg+"Paneer Masala Rs.140\n";
}
if(c9.isSelected())
{
String s9=ts9.getText();
cs9=Integer.parseInt(s9);
amt=amt+150*cs9;
msg=msg+"Kaju Curry Rs.150\n";
}
if(c10.isSelected())
{
String s10=ts10.getText();
cs10=Integer.parseInt(s10);
amt=amt+120*cs10;
msg=msg+"Veg Kholapuri Rs.120\n";
}
if(c11.isSelected())
{
String s11=ts11.getText();
cs11=Integer.parseInt(s11);
amt=amt+110*cs11;
msg=msg+"Dal Tadka Rs.110\n";
}
if(c12.isSelected())
{
String s12=ts12.getText();
cs12=Integer.parseInt(s12);
amt=amt+160*cs12;
msg=msg+"Panner Makhani Rs.160\n";
}
if(c13.isSelected())
{
String s13=ts13.getText();
cs13=Integer.parseInt(s13);
amt=amt+70*cs13;
msg=msg+"Carrot Salad Rs.70\n";
}
if(c14.isSelected())
{
String s14=ts14.getText();
cs14=Integer.parseInt(s14);
amt=amt+40*cs14;
msg=msg+"Barely Salad Rs.40\n";
}
if(c15.isSelected())
{
String s15=ts15.getText();
cs15=Integer.parseInt(s15);
amt=amt+50*cs15;
msg=msg+"Leafy Salad With Walnuts Rs.50\n";
}
if(c16.isSelected())
{
String s16=ts16.getText();
cs16=Integer.parseInt(s16);
amt=amt+90*cs16;
msg=msg+"Crunchy Ribbion Salad Rs.90\n";



}
if(c17.isSelected())
{
String s17=ts17.getText();
cs17=Integer.parseInt(s17);
amt=amt+70*cs17;
msg=msg+"Mixed Bean Salad Rs.70\n";
}
if(c18.isSelected())
{
String s18=ts18.getText();
cs18=Integer.parseInt(s18);
amt=amt+60*cs18;
msg=msg+"Pickled Beetroot Salad Rs.60\n";
}
if(c19.isSelected())
{
String s19=ts19.getText();
cs19=Integer.parseInt(s19);
amt=amt+120*cs19;
msg=msg+"Paneer Tikka Rs.120\n";
}
if(c20.isSelected())
{
String s20=ts20.getText();
cs20=Integer.parseInt(s20);
amt=amt+80*cs20;
msg=msg+"Potato Nuggets Rs.80\n";
}
if(c21.isSelected())
{
String s21=ts21.getText();
cs21=Integer.parseInt(s21);
amt=amt+120*cs21;
msg=msg+"Aloo Tikki Rs.120\n";
}
if(c22.isSelected())
{
String s22=ts22.getText();
cs22=Integer.parseInt(s22);
amt=amt+60*cs22;
msg=msg+"Onion Pakoda Rs.60\n";
}
if(c23.isSelected())
{
String s23=ts23.getText();
cs23=Integer.parseInt(s23);
amt=amt+60*cs23;
msg=msg+"French Fries Rs.60\n";
}
if(c24.isSelected())
{
String s24=ts24.getText();
cs24=Integer.parseInt(s24);
amt=amt+50*cs24;
msg=msg+"Spring Rolls Rs.50\n";
}
if(c25.isSelected())
{
String s25=ts25.getText();
cs25=Integer.parseInt(s25);
amt=amt+50*cs25;
msg=msg+"Tomato Soup Rs.50\n";
}
if(c26.isSelected())
{
String s26=ts26.getText();
cs26=Integer.parseInt(s26);
amt=amt+60*cs26;
msg=msg+"Baby Corn Soup Rs.60\n";
}
if(c27.isSelected())
{
String s27=ts27.getText();
cs27=Integer.parseInt(s27);
amt=amt+70*cs27;
msg=msg+"Mexican Soup Rs.70\n";
}
if(c28.isSelected())
{
String s28=ts28.getText();
cs28=Integer.parseInt(s28);
amt=amt+60*cs28;


msg=msg+"Machow Rs.60\n";
}
if(c29.isSelected())
{
String s29=ts29.getText();
cs29=Integer.parseInt(s29);
amt=amt+60*cs29;
msg=msg+"Leafy Veggie Soup Rs.60\n";
}
if(c30.isSelected())
{
String s30=ts30.getText();
cs30=Integer.parseInt(s30);
amt=amt+50*cs30;
msg=msg+"Radish Soup Rs.50\n";
}
if(c31.isSelected())
{
String s31=ts31.getText();
cs31=Integer.parseInt(s31);
amt=amt+120*cs31;
msg=msg+"Cad Rs.120\n";
}
if(c32.isSelected())
{
String s32=ts32.getText();
cs32=Integer.parseInt(s32);
amt=amt+130*cs32;
msg=msg+"Nutela Brownies Rs.130\n";
}
if(c33.isSelected())
{
String s33=ts33.getText();
cs33=Integer.parseInt(s33);
amt=amt+220*cs33;
msg=msg+"Oreo Mint Cake Rs.220\n";
}
if(c34.isSelected())
{
String s34=ts34.getText();
cs34=Integer.parseInt(s34);
amt=amt+60*cs34;
msg=msg+"Strawberry Pastry Rs.60\n";
}
if(c35.isSelected())
{
String s35=ts35.getText();
cs35=Integer.parseInt(s35);
amt=amt+160*cs35;
msg=msg+"ButterFinger Cookie Rs.160\n";
}
if(c36.isSelected())
{
String s36=ts36.getText();
cs36=Integer.parseInt(s36);
amt=amt+130*cs36;
msg=msg+"Butter Cannoli Rs.130\n";
}
JOptionPane.showMessageDialog(this,msg+" Total : "+amt);
//J_MP.smsg=msg;
//J_MP.samt=amt;

try{
					Class.forName("com.mysql.jdbc.Driver");
					JOptionPane.showMessageDialog(this,"Driver registerd");
					
					Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/rest","root","root");
					JOptionPane.showMessageDialog(this,"connection created");
				
					a=t1.getText();
	  				b=t2.getText();
					t=amt;
 				PreparedStatement ss=co.prepareStatement("insert into cust(nm,ph,tot) values(?,?,?)");
                                             ss.setString(1,a1);
		    			 ss.setString(2,a2);
		    			 ss.setInt(3,t);
                                             ss.executeUpdate();
					 t1.setText("  ");
	  			  t2.setText("  ");
ss.close();
		    co.close();
				}catch(Exception z){JOptionPane.showMessageDialog(this,""+z);}
			


}




public static void main(String args[])
{
	new menu();
}


















}
