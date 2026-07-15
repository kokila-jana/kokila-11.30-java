package morning;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class RegisteerPage implements ActionListener
{
	JFrame f;
	JTextField t,t2;
	JPasswordField t1;
	JButton b;
	RegisteerPage()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.setResizable(false);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#8FBC8F"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\img1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Register Page");
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
		
		JLabel l3=new JLabel("Email");
		l3.setBounds(500, 320, 500, 100);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(l3);
		
		t2=new JTextField();
		t2.setBounds(800, 350, 350, 50);
		t2.setForeground(Color.white);
		t2.setBackground(Color.decode("#8FBC8F"));
		t2.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(t2);
		
		b=new JButton("Register");
		b.setBounds(700, 450, 250, 50);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#8FBC8F"));
		b.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
	}
	public static void main(String[] args) {
		new RegisteerPage();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s=t.getText();
		String s1=t1.getText();
		String s2=t2.getText();
		if(e.getSource()==b)
		{
			if(s.isEmpty() || s1.isEmpty() || s2.isEmpty())
			{
				JOptionPane.showMessageDialog(b, "fill all field");
			}
			else
			{
			String url="jdbc:mysql://localhost/evening";
			String user="root";
			String pass="kokilajana";
			try {
				Connection con=DriverManager.getConnection(url, user, pass);
				String Sql="insert into info1 values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(Sql);
				ps.setString(1,s);
				ps.setString(2,s1);
				ps.setString(3,s2);
				ps.execute();
				JOptionPane.showMessageDialog(b, "register success");
				LoginPage l=new LoginPage();
				l.demo();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		}
	}

}



package morning;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginPage implements ActionListener 
{
	JButton b,b1;
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
		
		b=new JButton("Login");
		b.setBounds(700, 350, 250, 50);
		b.setForeground(Color.white);
		b.setBackground(Color.decode("#8FBC8F"));
		b.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(b);
		b.addActionListener(this);
		
		b1=new JButton("Register");
		b1.setBounds(700, 450, 250, 50);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#8FBC8F"));
		b1.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(b1);
		b1.addActionListener(this);
		
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
			else 
			{
				String url="jdbc:mysql://localhost/evening";
				String user="root";
				String pass="kokilajana";
				try {
					Connection con=DriverManager.getConnection(url, user, pass);
					String sql="select * from info1 where name=? and pass=?";
					PreparedStatement ps=con.prepareStatement(sql);
					ps.setString(1, s);
					ps.setString(2, s1);
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						JOptionPane.showMessageDialog(b, "Login Success");
						f.setVisible(false);
						Next n=new Next();
						n.fun();
					}
					else
					{
						JOptionPane.showMessageDialog(b,"invalid username or password..");
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b1)
		{
			f.setVisible(false);
			new RegisteerPage();
		}

	}
}



