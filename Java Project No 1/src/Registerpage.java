import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
public class Registerpage extends JFrame{
	JPanel p2,p3;
	JLabel l13,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
	JTextField t6,t7,t8,t9;
	JButton b5;
	Registerpage()
	{
		l13=new JLabel("Registration");
		l13.setBounds(20, 20, 80, 20);
		l13.setForeground(Color.WHITE);
		l13.setFont(new Font("Ariel",Font.BOLD,13));
		add(l13);
		
		p2=new JPanel();
		p2.setBounds(10, 10, 265, 40);
		p2.setBackground(Color.BLACK);
		p2.setForeground(Color.WHITE);
		add(p2);
		
		l15=new JLabel("Key:");
		l15.setForeground(Color.BLACK);
		l15.setBounds(20,70,50,30);
		add(l15);
		
		t6=new JTextField();
		t6.setBounds(140, 70, 100, 30);
		add(t6);
		
		l19=new JLabel("*");
		l19.setBounds(250,70,30,30);
		l19.setForeground(Color.RED);
		add(l19);
		
		l16=new JLabel("Username:");
		l16.setForeground(Color.BLACK);
		l16.setBounds(20,110,130,30);
		add(l16);
		
		t7=new JTextField();
		t7.setBounds(140, 110, 100, 30);
		add(t7);
		
		l20=new JLabel("*");
		l20.setForeground(Color.RED);
		l20.setBounds(250, 110, 30, 30);
		add(l20);
		
		l17=new JLabel("Password:");
		l17.setForeground(Color.BLACK);
		l17.setBounds(20,145,130,30);
		add(l17);
		
		t8=new JTextField();
		t8.setBounds(140, 145, 100, 30);
		add(t8);
		
		l21=new JLabel("*");
		l21.setForeground(Color.RED);
		l21.setBounds(250, 146, 30, 30);
		add(l21);
		
		l18=new JLabel("Re-enter Password:");
		l18.setForeground(Color.BLACK);
		l18.setBounds(20,185,130,30);
		add(l18);
		
		t9=new JTextField();
		t9.setBounds(140, 185, 100, 30);
		add(t9);
		
		l22=new JLabel("*");
		l22.setForeground(Color.RED);
		l22.setBounds(250, 186, 30, 30);
		add(l22);
		
		b5=new JButton("Submit");
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		b5.setBounds(30, 225, 90, 40);
		b5.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				String st=t6.getText();
				String st1=t7.getText();
				String st2=t8.getText();
				String st3=t9.getText();
				
				if(st2.equals(st3))  
				{
					l26.setVisible(false);
				}
				else 
				{
					l26.setVisible(true);
				}
				if(st.isEmpty() || st1.isEmpty() || st2.isEmpty() || st3.isEmpty())
				{
					l24.setVisible(true);
				}else
				{
					l24.setVisible(false);
				}
				
			}
		});
		b5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
				    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/programs","root","");
					PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?);");
					ps.setString(1, t6.getText());
					ps.setString(2, t7.getText());
					ps.setString(3, t8.getText());
					int x=ps.executeUpdate();
					if(x>0)
					{
						System.out.println("Registration");
					}else
					{
						System.out.println("Invalid");
					}
					
				}catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		add(b5);
		
		
		l24=new JLabel("Please Fill all Details");
		l24.setForeground(Color.RED);
		l24.setBounds(30,260,130,30);
		l24.setVisible(false);
		add(l24);
		
		l25=new JLabel("Click for Home Page");
		l25.setBounds(80,290,120,60);
		l25.setForeground(Color.BLACK);
		l25.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l25.addMouseListener(new MouseAdapter() {
			public  void mouseClicked(MouseEvent e)
			{
				dispose();
				new Firstpage().setVisible(true);
			}
			
		});
		add(l25);
		
		l26=new JLabel("Password not Match");
		l26.setVisible(false);
		l26.setForeground(Color.RED);
		l26.setBounds(120,225,130,30);
		add(l26);
		
		p3=new JPanel();
		p3.setBounds(10,60,265,290);
		p3.setBackground(Color.LIGHT_GRAY);
		add(p3);
		
		
		
		
		setLayout(null);
		setSize(300,400);
		setLocation(470,250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Registerpage().setVisible(true);

	}

}
