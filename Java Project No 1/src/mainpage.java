import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
public class mainpage  extends JFrame{
	JLabel l27,l28;
    JPanel p4,p5;
    JButton b8,b9,b10;
	mainpage()
	{
		l27=new JLabel("You have Successfully Login ");
		l27.setBounds(15,15,200,20);
		l27.setForeground(Color.WHITE);
		add(l27);
		
		p4=new JPanel();
		p4.setBounds(10,10,366,30);
		p4.setBackground(Color.BLACK);
		add(p4);
		
		
		l28=new JLabel("Click here to Logout");
		l28.setBounds(140,300,160, 20);
		l28.setForeground(Color.BLACK);
		l28.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l28.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
			dispose();
			new Firstpage().setVisible(true);
			}
			
		});
		add(l28);
		
		b8=new JButton("BASIC JAVA PROGRAMS");
		b8.setBounds(90, 80, 200, 30);
		b8.setBackground(Color.BLACK);
		b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b8.setForeground(Color.WHITE);
		b8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new basic().setVisible(true);
			}
			
		});
		add(b8);
		
		b9=new JButton("STRING JAVA PROGRAMS");
		b9.setBounds(90, 120, 200, 30);
		b9.setBackground(Color.BLACK);
		b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b9.setForeground(Color.WHITE);
		b9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new stringpage().setVisible(true);
			}
			
		});
		add(b9);
		
		b10=new JButton("PATTERN JAVA PROGRAMS");
		b10.setBounds(90, 160, 200, 30);
		b10.setBackground(Color.BLACK);
		b10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		b10.setForeground(Color.WHITE);
		b10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				dispose();
				new pattern().setVisible(true);
			}
			
		});
		add(b10);
		
		p5=new JPanel();
		p5.setBounds(10,50,366,300);
		p5.setBackground(Color.LIGHT_GRAY);
		add(p5);
		
		setLayout(null);
		setSize(400,400);
		setLocation(300,250);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new mainpage().setVisible(true);

	}

}
