import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pattern extends JFrame{
	JLabel l33,l34;
	JPanel p10,p11;
	pattern()
	{
		l33=new JLabel("You have Successfully Login ");
		l33.setBounds(15,15,200,20);
		l33.setForeground(Color.WHITE);
		add(l33);
		
		p10=new JPanel();
		p10.setBounds(10,10,565,30);
		p10.setBackground(Color.BLACK);
		add(p10);
		
		
		l34=new JLabel("Click here to go mainpage");
		l34.setBounds(240,410,160, 20);
		l34.setForeground(Color.BLACK);
		l34.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l34.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
			dispose();
			new mainpage().setVisible(true);
			}
			
		});
		add(l34);
		
		p11=new JPanel();
		p11.setBounds(10,50,565,400);
		p11.setBackground(Color.LIGHT_GRAY);
		add(p11);
		
		setLayout(null);
		setSize(600,500);
		setLocation(400,210);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new pattern().setVisible(true);

	}

}
