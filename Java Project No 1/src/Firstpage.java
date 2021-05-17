import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

import javax.swing.*;

public class Firstpage extends JFrame {
	JLabel l1,l2;
	JPanel p1;
	JButton b1,b2;
	
	Firstpage(){
		
		
		l1=new JLabel("Welcome To Java Program Project");
		l1.setBounds(35,30,70,60);
		l1.setSize(200,40);
		l1.setFont(new Font("Verdana",Font.PLAIN,11));
		l1.setForeground(Color.WHITE);
		add(l1);
		
		p1=new JPanel();
		p1.setBackground(Color.black);
		p1.setBounds(0,0,300,80);
		add(p1);
		
		b1=new JButton("Sign");
		b1.setBounds(28, 90, 90, 40);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new Signpage().setVisible(true);
			}
		});
		add(b1);
		
		b2=new JButton("Register");
		b2.setBounds(170, 90, 90, 40);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
				new Registerpage().setVisible(true);
			}
			
		});
		add(b2);
		
		l2=new JLabel("Forget Username and Password");
		l2.setForeground(Color.BLACK);
		l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l2.setBounds(50,160,50,60);
		l2.setSize(200,40);
		l2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new Forget().setVisible(true);
			}
		});
		add(l2);
		
		setLayout(null);
		setSize(300,300);
		setLocation(470,250);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Firstpage().setVisible(true);

	}

}
