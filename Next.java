package morning;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Next implements ActionListener 
{
	JButton b1;
	JFrame f;
	void fun()
	{
		f=new JFrame("My Project");
		f.setSize(1600, 900);
//		f.setResizable(false);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.decode("#825C8A"));
//		f.setContentPane(new JLabel(new ImageIcon("C:\\Users\\manojana\\OneDrive\\Pictures\\img1.png")));
		f.setVisible(true);
		
		JLabel l=new JLabel("Welcome to my Page...");
		l.setBounds(600, 20, 550, 100);
		l.setForeground(Color.white);
		l.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(l);
		
		JRadioButton rb=new JRadioButton("Male");
		rb.setBounds(50, 120, 150, 100);
//		rb.setForeground(Color.white);
		rb.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(rb);
		
		JRadioButton rb1=new JRadioButton("Female");
		rb1.setBounds(250, 120, 250, 100);
//		rb1.setForeground(Color.white);
		rb1.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(rb1);
		
		ButtonGroup bb=new ButtonGroup();
		bb.add(rb1);
		bb.add(rb);
		
		String a[]= {"CSE","EEE","ECE","Civil","Mech"};
		
		JList ll=new JList(a);
		ll.setBounds(50, 320, 250, 400);
		ll.setSelectedIndex(1);
//		ll.setForeground(Color.white);
		ll.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(ll);
		
		String b[]= {"Select","Java","Python","CCNA","PowerBI"};
		JComboBox cb=new JComboBox(b);
		cb.setBounds(350, 320, 250, 100);
//		cb.setForeground(Color.white);
		cb.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(cb);
		
		
		JCheckBox ck= new JCheckBox("I am not Robot");
		ck.setBounds(350, 470, 400, 100);
//		ck.setForeground(Color.white);
		ck.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(ck);
		
		JTextArea ta=new JTextArea();
		ta.setBounds(750, 160, 400, 100);
		ta.setSize(500, 500);
		ta.setLineWrap(true);
		ta.setForeground(Color.white);
		ta.setBackground(Color.black);
		ta.setFont(new Font("Comic Sans MS",Font.ITALIC,50));
		f.add(ta);
		ta.setVisible(false);
				
		b1=new JButton("Logout");
		b1.setBounds(1000, 350, 250, 50);
		b1.setForeground(Color.white);
		b1.setBackground(Color.decode("#8FBC8F"));
		b1.setFont(new Font("Comic Sans MS",Font.ITALIC,40));
		f.add(b1);
		b1.addActionListener(this);
	}

	public static void main(String[] args)
	{
		Next n=new Next();
		n.fun();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f.setVisible(false);
		LoginPage l=new LoginPage();
		l.demo();
		
	}

}
