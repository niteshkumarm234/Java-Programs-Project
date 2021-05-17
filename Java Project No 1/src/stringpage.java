import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class stringpage extends JFrame{
	JLabel l31,l32;
	JPanel p8,p9;
	stringpage()
	{
		l31=new JLabel("You have Successfully Login ");
		l31.setBounds(15,15,200,20);
		l31.setForeground(Color.WHITE);
		add(l31);
		
		p8=new JPanel();
		p8.setBounds(10,10,565,30);
		p8.setBackground(Color.BLACK);
		add(p8);
		
		
		l32=new JLabel("Click here to go mainpage");
		l32.setBounds(240,410,160, 20);
		l32.setForeground(Color.BLACK);
		l32.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l32.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
			dispose();
			new mainpage().setVisible(true);
			}
			
		});
		add(l32);
		
		p9=new JPanel();
		p9.setBounds(10,50,565,400);
		p9.setBackground(Color.LIGHT_GRAY);
		add(p9);
		
		setLayout(null);
		setSize(600,500);
		setLocation(400,210);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new stringpage().setVisible(true);

	}

}
