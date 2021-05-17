import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class basic extends JFrame {
	JLabel l29,l30,l31;
	JPanel p6,p7;
	JTextArea t7;
	JButton b12,b13,b14,b15,b16;
	basic()
	{
		l29=new JLabel("You have Successfully Login ");
		l29.setBounds(15,15,200,20);
		l29.setForeground(Color.WHITE);
		add(l29);
		
		p6=new JPanel();
		p6.setBounds(10,10,565,30);
		p6.setBackground(Color.BLACK);
		add(p6);
		
		b12=new JButton("* Program1");
		b12.setBounds(30, 70, 120, 30);
		b12.setBackground(Color.BLACK);
		b12.setForeground(Color.WHITE);
		add(b12);
		
		
		
		l31=new JLabel("nsdnacnsdkl,c nsd,km c\n"
				+ "mdcmdksclsdc nsdm cmsd c");
		l31.setBounds(70, 70, 200, 30);
		l31.setVisible(false);
		b12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				//t7.setText();
				t7.setVisible(true);
			}
		});
		add(l31);
		
		b13=new JButton("* Program2");
		b13.setBounds(30, 110, 120, 30);
		b13.setBackground(Color.BLACK);
		b13.setForeground(Color.WHITE);
		add(b13);
		
		b14=new JButton("* Program3");
		b14.setBounds(30, 150, 120, 30);
		b14.setBackground(Color.BLACK);
		b14.setForeground(Color.WHITE);
		add(b14);
		
		b15=new JButton("* Program4");
		b15.setBounds(30, 190, 120, 30);
		b15.setBackground(Color.BLACK);
		b15.setForeground(Color.WHITE);
		add(b15);
		
		b16=new JButton("* Program5");
		b16.setBounds(30, 230, 120, 30);
		b16.setBackground(Color.BLACK);
		b16.setForeground(Color.WHITE);
		add(b16);
		
		t7=new JTextArea();
		t7.setBounds(330, 70, 225, 360);
		add(t7);
		
		l30=new JLabel("Click here to go mainpage");
		l30.setBounds(170,410,160, 20);
		l30.setForeground(Color.BLACK);
		l30.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		l30.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
			dispose();
			new mainpage().setVisible(true);
			}
			
		});
		add(l30);
		
		p7=new JPanel();
		p7.setBounds(10,50,565,400);
		p7.setBackground(Color.LIGHT_GRAY);
		add(p7);
		
		setLayout(null);
		setSize(600,500);
		setLocation(400,210);
		setResizable(false);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new basic().setVisible(true);

	}

}
