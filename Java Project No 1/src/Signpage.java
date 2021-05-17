import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.sql.*;

public class Signpage extends JFrame{
	JPanel p1;
    JLabel l8,l9,l10,l14;
    JTextField t2,t3;
    JButton b2,b3;
	Signpage()
	{
		l8=new JLabel("Login ");
		l8.setBounds(60,30,50,50);
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("Ariel",Font.BOLD,15));
		add(l8);
		
		l9=new JLabel("Username");
		l9.setBounds(50,80,90,50);
		l9.setForeground(Color.BLACK);
		add(l9);
		
		t2=new JTextField();
		t2.setBounds(130, 95, 90, 25);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(130,134,90,25);
		add(t3);
		
		l10=new JLabel("Password");
		l10.setBounds(50,120,90,50);
		add(l10);
		
		b2=new JButton("Login ");
		b2.setBounds(45, 180, 90, 40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				try {
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/programs","root","");
					java.sql.Statement pr=con.createStatement();
					String sql="Select * from register where username='"+t2.getText()+"' and password='"+t3.getText()+"'"; 
					java.sql.ResultSet rs=pr.executeQuery(sql);
					if(rs.next())
					{
						dispose();
						new mainpage().setVisible(true);
					}else
					{
						b2.setBackground(Color.RED);
						b2.setVisible(true);
					}
				}catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
			
		});
		add(b2);
		
		b3=new JButton("Register");
		b3.setBounds(150,180,90,40);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new Registerpage().setVisible(true);
			}
		});
		add(b3);
		
		p1=new JPanel();
		p1.setBackground(Color.BLACK);
		p1.setBounds(40, 30, 200, 50);
		add(p1);
		
		l14=new JLabel("Click for Home Page");
		l14.setBounds(80,210,120,60);
		l14.setForeground(Color.BLACK);
		l14.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l14.addMouseListener(new MouseAdapter() {
			public  void mouseClicked(MouseEvent e)
			{
				dispose();
				new Firstpage().setVisible(true);
			}
			
		});
		add(l14);
		
		setLayout(null);
		setSize(300,300);
		setLocation(470,250);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Signpage().setVisible(true);

	}

}
