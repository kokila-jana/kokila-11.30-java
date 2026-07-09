package morning;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginPage implements ActionListener 
{
	JButton b;
	JTextField t;
	JPasswordField t1;
	JFrame f;
	void demo()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.setResizable(false);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#8FBC8F"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\img1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Login Page");
		l.setBounds(600, 20, 500, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(l);
		
		JLabel l1=new JLabel("UserName");
		l1.setBounds(500, 120, 500, 100);
		l1.setForeground(Color.white);
		l1.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(l1);
		
		t=new JTextField();
		t.setBounds(800, 150, 350, 50);
		t.setForeground(Color.white);
		t.setBackground(Color.decode("#8FBC8F"));
		t.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(t);
		
		JLabel l2=new JLabel("Password");
		l2.setBounds(500, 220, 500, 100);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(l2);
		
		t1=new JPasswordField();
		t1.setBounds(800, 250, 350, 50);
		t1.setForeground(Color.white);
		t1.setBackground(Color.decode("#8FBC8F"));
		t1.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(t1);
		
		b=new JButton("Submit");
		b.setBounds(700, 350, 250, 50);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#8FBC8F"));
		b.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
		
	}

	public static void main(String[] args)
	{
		LoginPage l=new LoginPage();
		l.demo();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s=t.getText();
		String s1=t1.getText();
		
		if(e.getSource()==b)
		{
			if(s.isEmpty() || s1.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "Fill all data...");
			}
			else if(s.equals("Java") && s1.equals("12345"))
			{
			JOptionPane.showMessageDialog(b, "Login Success");
			f.setVisible(false);
			Next n=new Next();
			n.fun();
			}
			else
			{
				JOptionPane.showMessageDialog(b, "invalid username or password");
			}
		}
		
	}

}
