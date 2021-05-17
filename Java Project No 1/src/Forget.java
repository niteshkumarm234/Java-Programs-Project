
import javax.swing.JFrame;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.sql.DriverManager;
import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class Forget extends JFrame {
	JLabel l3,l4,l5,l6,l7;
	JTextField t1;
	JButton b3;
	Forget()
	{
		setLayout(null);
		setSize(400,350);
		setLocation(470,250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		l3 =new JLabel("Enter securitry/username key :");
		l3.setBounds(30,30,70,60);
		l3.setSize(200,40);
		add(l3);
		
		t1 = new JTextField(20);
		t1.setBounds(220, 40, 100, 25);
		//t1.setSize(50,40);
		add(t1);
		
		b3=new JButton("Click Here");
		b3.addActionListener(new ActionListener()
				{
			         public void actionPerformed(ActionEvent e)
			         {
			        	 try {
			        	 Class.forName("com.mysql.jdbc.Driver");
			        	 java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/programs","root","");
			        	 java.sql.Statement pk=conn.createStatement();
			        	 String str="Select * from register where username='"+t1.getText()+"'";
			        	 java.sql.ResultSet re=pk.executeQuery(str);
			        	 re.absolute(1);
			        	 String sn=re.getString(2);
			        	 l6.setText("    "+sn);
			        	 l6.setVisible(true);
			        	 System.out.println(sn);
			        	 String sc=re.getString(3);
			        	 l7.setText(" &  "+sc);
			        	 l7.setVisible(true);
			        	 System.out.println(sc);
			        	 
			        	 }
			        	 catch(Exception e1)
			        	 {
			        		 System.out.println(e1);
			        	 }
			         }
				});
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setBounds(150,90,110,30);
		add(b3);
		
		l5=new JLabel("Your username and password is :");
		l5.setBounds(10, 130, 200, 90);
		add(l5);
		
		l6=new JLabel("12338252832987");
		l6.setBounds(200, 150, 100, 50);
		l6.setVisible(false);
		add(l6);
		
		l7=new JLabel("niteshkumar");
		l7.setBounds(300,150 , 80, 50);
		l7.setVisible(false);
		add(l7);
		
		l4 = new JLabel("Click here to login");
		l4.setForeground(Color.BLACK);
		l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l4.setBounds(160,220,50,60);
		l4.setSize(200,60);
		l4.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e1)
			{
				dispose();
				new Firstpage().setVisible(true);
				//new Forget().dispose();
			}
		});
		add(l4);
	}

	public static void main(String[] args) {
		new Forget().setVisible(true);

	}

}
