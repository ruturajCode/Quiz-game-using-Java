import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
class Ans extends JFrame implements ActionListener
{
	JLabel l10 = new JLabel();
	Button b1 = new Button("OK");
	Ans(int ans)
	{
		//Frame setting
		setVisible(true);
		setBounds(550,300,300,190);
		setTitle("Advance java result");

		//For panel add
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		add(p1);

		int m=ans;
		p1.add(l10);
		l10.setBounds(93,20,120,50);
		l10.setText("You got "+Integer.toString(m)+" marks.");
		
		//ok button
		p1.add(b1);
		b1.setBounds(90,80,100,30);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			setVisible(false);
		}
	}
}
class ALevel extends JFrame implements ActionListener
{
	int ans;
	int ans1=0;
	int ans2=0;
	int ans3=0;
	int ans4=0;
	JLabel l10 = new JLabel();
	//ans
		JRadioButton r4 = new JRadioButton("setLayout()");
		JRadioButton r5 = new JRadioButton("Label");
		JRadioButton r12 = new JRadioButton("ItemListener");
		JRadioButton r13 = new JRadioButton("actionPerformed()");
	
	//re
		//1
		JRadioButton r1 = new JRadioButton("StartLayout()");
		JRadioButton r2 = new JRadioButton("initLayout()");
		JRadioButton r3 = new JRadioButton("layoutcontainer()");
		
		//2
		JRadioButton r6 = new JRadioButton("button");
		JRadioButton r7 = new JRadioButton("list");
		JRadioButton r8 = new JRadioButton("scrollbar");
		
		//3
		JRadioButton r9 = new JRadioButton("ComponentListener");
		JRadioButton r10 = new JRadioButton("ContentListener");
		JRadioButton r11 = new JRadioButton("ActionListener");

		//4
		JRadioButton r14 = new JRadioButton("ActionEvemt()");
		JRadioButton r15 = new JRadioButton("Componentadded()");
		JRadioButton r16 = new JRadioButton("None of these");

	Button b2 = new Button("Submit");
	Button b1 = new Button("<-- Back");
	ALevel()
	{
		//Frame settings
		Toolkit tk = Toolkit.getDefaultToolkit();
		int x = (int) tk.getScreenSize().getWidth();
		int y = (int) tk.getScreenSize().getHeight();
		setVisible(true);
		setSize(x,y);
		setTitle("'A' Level MCQ's");

		//UI
		Font head = new Font("TimesNewRoman",Font.ITALIC,30);	
		Font fontl = new Font("Arial",Font.PLAIN,20);
		Font fontb = new Font("Arial",Font.PLAIN,20);

		//For panel add
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		add(p1);

		//For label1 add
		JLabel l1 = new JLabel("Advance java 'A' Level MCQ's");
		p1.add(l1);
		l1.setFont(head);
		l1.setBounds(500,2,1000,40);

		//Quetion no. 1
		
			ButtonGroup bg1 = new ButtonGroup();
		
			//For label2 add
			JLabel l2 = new JLabel("Q1.Which method is used to set the layout of container?");
			p1.add(l2);
			l2.setFont(fontl);
			l2.setBounds(20,50,1000,30);

			//For 1 choice

			p1.add(r1);
			r1.setBounds(50,100,130,30);

			p1.add(r2);
			r2.setBounds(450,100,130,30);

			p1.add(r3);
			r3.setBounds(50,150,130,30);

			p1.add(r4);
			r4.setBounds(450,150,130,30);

			bg1.add(r1);
			bg1.add(r2);
			bg1.add(r3);
			bg1.add(r4);

		//Quetion no. 2

			ButtonGroup bg2 = new ButtonGroup();

			//For label3 add
			JLabel l3 = new JLabel("Q2.Which of the following controls does not support interaction to user?");
			p1.add(l3);
			l3.setFont(fontl);
			l3.setBounds(20,200,1000,30);

			//For 2 choice

			p1.add(r5);
			r5.setBounds(50,250,130,30);

			p1.add(r6);
			r6.setBounds(450,250,130,30);

			p1.add(r7);
			r7.setBounds(50,300,130,30);

			p1.add(r8);
			r8.setBounds(450,300,130,30);

			bg2.add(r5);
			bg2.add(r6);
			bg2.add(r7);
			bg2.add(r8);

		//Quetion no. 3

			ButtonGroup bg3 = new ButtonGroup();

			//For label4 add
			JLabel l4 = new JLabel("Q3.Which of these interface define a method itemstateChanged()?");
			p1.add(l4);
			l4.setFont(fontl);
			l4.setBounds(20,350,1000,30);

			//For 3 choice

			p1.add(r9);
			r9.setBounds(50,400,330,30);

			p1.add(r10);
			r10.setBounds(450,400,130,30);

			p1.add(r11);
			r11.setBounds(50,450,130,30);

			p1.add(r12);
			r12.setBounds(450,450,130,30);

			bg3.add(r9);
			bg3.add(r10);
			bg3.add(r11);
			bg3.add(r12);

		//Quetion no. 4

			ButtonGroup bg4 = new ButtonGroup();
	
			//For label5 add
			JLabel l5 = new JLabel("Q4.If a class extends ActionListener interface, then it should contain a method ____");
			p1.add(l5);
			l5.setFont(fontl);
			l5.setBounds(20,500,1000,30);

			//For 4 choice
			
			p1.add(r13);
			r13.setBounds(50,550,130,30);

			p1.add(r14);
			r14.setBounds(450,550,130,30);

			p1.add(r15);
			r15.setBounds(50,600,330,30);

			p1.add(r16);
			r16.setBounds(450,600,130,30);

			bg4.add(r13);
			bg4.add(r14);
			bg4.add(r15);
			bg4.add(r16);

		//For Sub button
		p1.add(b2);
		b2.setFont(fontb);
		b2.setBounds(450,650,120,50);

		//For Back button
		p1.add(b1);
		b1.setFont(fontb);
		b1.setBounds(50,650,120,50);

		//For action button
		b1.addActionListener(this);
		b2.addActionListener(this);

		//For option
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
		r8.addActionListener(this);
		r9.addActionListener(this);
		r10.addActionListener(this);
		r11.addActionListener(this);
		r12.addActionListener(this);
		r13.addActionListener(this);
		r14.addActionListener(this);
		r15.addActionListener(this);
		r16.addActionListener(this);

		//For closing frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		//Ans
		if(e.getSource() == r4)
		{
			ans1++;
		}
		if(e.getSource() == r5)
		{
			ans2++;
		}
		if(e.getSource() == r12)
		{
			ans3++;
		}
		if(e.getSource() == r13)
		{
			ans4++;
		}

		//re
			//1
				if(e.getSource() == r1)
				{
					ans1 = 0;
				}
				if(e.getSource() == r2)
				{
					ans1 = 0;
				}
				if(e.getSource() == r3)
				{
					ans1 = 0;
				}

			//2
				if(e.getSource() == r6)
				{
					ans2 = 0;
				}
				if(e.getSource() == r7)
				{
					ans2 = 0;
				}
				if(e.getSource() == r8)
				{
					ans2 = 0;
				}

			//3
				if(e.getSource() == r9)
				{
					ans3 = 0;
				}
				if(e.getSource() == r10)
				{
					ans3 = 0;
				}
				if(e.getSource() == r11)
				{
					ans3 = 0;
				}

			//4
				if(e.getSource() == r14)
				{
					ans4 = 0;
				}
				if(e.getSource() == r15)
				{
					ans4 = 0;
				}
				if(e.getSource() == r16)
				{
					ans4 = 0;
				}
		//sub		
		if(e.getSource() == b2)
		{
			ans=ans1 + ans2 + ans3 +ans4;
			Ans a1 = new Ans(ans);
		}

		//back
		if(e.getSource() == b1)
		{
			Frm2 fm = new Frm2();
			fm.setVisible(true);
		}
	}
}
class ULevel extends JFrame implements ActionListener
{
	int ans;
	int ans1=0;
	int ans2=0;
	int ans3=0;
	int ans4=0;

	JLabel l10 = new JLabel();
	
	//ans
	JRadioButton r2 = new JRadioButton("ItemListener");
	JRadioButton r7 = new JRadioButton("HostNotFoundException");
	JRadioButton r9 = new JRadioButton("getLocalHost()");
	JRadioButton r14 = new JRadioButton("getresultset()");

	//re
		//1
			JRadioButton r1 = new JRadioButton("MouseListener");
			JRadioButton r3 = new JRadioButton("FocousListener");
			JRadioButton r4 = new JRadioButton("ButtonListener");

		//2
			JRadioButton r5 = new JRadioButton("UnknownHostException");
			JRadioButton r6 = new JRadioButton("IOException");
			JRadioButton r8 = new JRadioButton("None of these");

		//3
			JRadioButton r10 = new JRadioButton("getByName()");
			JRadioButton r11 = new JRadioButton("getHostName()");
			JRadioButton r12 = new JRadioButton("getAddress()");

		//4
			JRadioButton r13 = new JRadioButton("setresultset()");
			JRadioButton r15 = new JRadioButton("getResultset()");
			JRadioButton r16 = new JRadioButton("setResultSet()");

	Button b2 = new Button("Submit");
	Button b1 = new Button("<-- Back");
	ULevel()
	{
		//Frame settings
		Toolkit tk = Toolkit.getDefaultToolkit();
		int x = (int) tk.getScreenSize().getWidth();
		int y = (int) tk.getScreenSize().getHeight();
		setVisible(true);
		setSize(x,y);
		setTitle("'U' Level MCQ's");

		//UI
		Font head = new Font("TimesNewRoman",Font.ITALIC,30);	
		Font fontl = new Font("Arial",Font.PLAIN,20);
		Font fontb = new Font("Arial",Font.PLAIN,20);

		//For panel add
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		add(p1);

		//For label1 add
		JLabel l1 = new JLabel("Advance java 'U' Level MCQ's");
		p1.add(l1);
		l1.setFont(head);
		l1.setBounds(500,2,1000,40);

		//Quetion no. 1
		
			ButtonGroup bg1 = new ButtonGroup();
		
			//For label2 add
			JLabel l2 = new JLabel("Q1.Which listener handles all list related events?");
			p1.add(l2);
			l2.setFont(fontl);
			l2.setBounds(20,50,1000,30);

			//For 1 choice

			p1.add(r1);
			r1.setBounds(50,100,330,30);

			p1.add(r2);
			r2.setBounds(450,100,330,30);

			p1.add(r3);
			r3.setBounds(50,150,330,30);

			p1.add(r4);
			r4.setBounds(450,150,330,30);

			bg1.add(r1);
			bg1.add(r2);
			bg1.add(r3);
			bg1.add(r4);

		//Quetion no. 2

			ButtonGroup bg2 = new ButtonGroup();

			//For label3 add
			JLabel l3 = new JLabel("Q2.Which exception indicates that the IP address of host could not be determined?");
			p1.add(l3);
			l3.setFont(fontl);
			l3.setBounds(20,200,1000,30);

			//For 2 choice

			p1.add(r5);
			r5.setBounds(50,250,330,30);

			p1.add(r6);
			r6.setBounds(450,250,330,30);

			p1.add(r7);
			r7.setBounds(50,300,330,30);

			p1.add(r8);
			r8.setBounds(450,300,330,30);

			bg2.add(r5);
			bg2.add(r6);
			bg2.add(r7);
			bg2.add(r8);

		//Quetion no. 3

			ButtonGroup bg3 = new ButtonGroup();

			//For label4 add
			JLabel l4 = new JLabel("Q3.The _____ method simply returns inetaddress object that represents localhost?");
			p1.add(l4);
			l4.setFont(fontl);
			l4.setBounds(20,350,1000,30);

			//For 3 choice

			p1.add(r9);
			r9.setBounds(50,400,330,30);

			p1.add(r10);
			r10.setBounds(450,400,330,30);

			p1.add(r11);
			r11.setBounds(50,450,330,30);

			p1.add(r12);
			r12.setBounds(450,450,330,30);

			bg3.add(r9);
			bg3.add(r10);
			bg3.add(r11);
			bg3.add(r12);

		//Quetion no. 4

			ButtonGroup bg4 = new ButtonGroup();
	
			//For label5 add
			JLabel l5 = new JLabel("Q4.Which method is used to retrive resultset created?");
			p1.add(l5);
			l5.setFont(fontl);
			l5.setBounds(20,500,1000,30);

			//For 4 choice
			
			p1.add(r13);
			r13.setBounds(50,550,330,30);

			p1.add(r14);
			r14.setBounds(450,550,330,30);

			p1.add(r15);
			r15.setBounds(50,600,330,30);

			p1.add(r16);
			r16.setBounds(450,600,330,30);

			bg4.add(r13);
			bg4.add(r14);
			bg4.add(r15);
			bg4.add(r16);

		//For Sub button
		p1.add(b2);
		b2.setFont(fontb);
		b2.setBounds(450,650,120,50);

		//For Back button
		p1.add(b1);
		b1.setFont(fontb);
		b1.setBounds(50,650,120,50);

		//For action button
		b1.addActionListener(this);
		b2.addActionListener(this);

		//For option
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
		r8.addActionListener(this);
		r9.addActionListener(this);
		r10.addActionListener(this);
		r11.addActionListener(this);
		r12.addActionListener(this);
		r13.addActionListener(this);
		r14.addActionListener(this);
		r15.addActionListener(this);
		r16.addActionListener(this);

		//For closing frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		//Ans
		if(e.getSource() == r2)
		{
			ans1++;
		}
		if(e.getSource() == r7)
		{
			ans2++;
		}
		if(e.getSource() == r9)
		{
			ans3++;
		}
		if(e.getSource() == r14)
		{
			ans4++;
		}

		//re
			//1
				if(e.getSource() == r1)
				{
					ans1 = 0;
				}
				if(e.getSource() == r3)
				{
					ans1 = 0;
				}
				if(e.getSource() == r4)
				{
					ans1 = 0;
				}

			//2
				if(e.getSource() == r5)
				{
					ans2 = 0;
				}
				if(e.getSource() == r6)
				{
					ans2 = 0;
				}
				if(e.getSource() == r8)
				{
					ans2 = 0;
				}

			//3
				if(e.getSource() == r10)
				{
					ans3 = 0;
				}
				if(e.getSource() == r11)
				{
					ans3 = 0;
				}
				if(e.getSource() == r12)
				{
					ans3 = 0;
				}

			//4
				if(e.getSource() == r13)
				{
					ans4 = 0;
				}
				if(e.getSource() == r15)
				{
					ans4 = 0;
				}
				if(e.getSource() == r16)
				{
					ans4 = 0;
				}

		//sub		
		if(e.getSource() == b2)
		{
			ans=ans1 + ans2 + ans3 +ans4;
			Ans a1 = new Ans(ans);
		}				

		//back
		if(e.getSource() == b1)
		{
			Frm2 fm = new Frm2();
			fm.setVisible(true);
		}
	}
}
class RLevel extends JFrame implements ActionListener
{
	int ans;
	int ans1=0;
	int ans2=0;
	int ans3=0;
	int ans4=0;

	JLabel l10 = new JLabel();
	
	//ans
	JRadioButton r1 = new JRadioButton("Horizontal");
	JRadioButton r6 = new JRadioButton("Top level");
	JRadioButton r12 = new JRadioButton("All of the above");
	JRadioButton r15 = new JRadioButton("setManuBar()");

	//re
		//1
			JRadioButton r2 = new JRadioButton("Vertical");
			JRadioButton r3 = new JRadioButton("Both A and B");
			JRadioButton r4 = new JRadioButton("None of the above");
	
		//2
			JRadioButton r5 = new JRadioButton("Middle level");
			JRadioButton r7 = new JRadioButton("Bottom level");
			JRadioButton r8 = new JRadioButton("none of the above");

		//3
			JRadioButton r9 = new JRadioButton("JLabel()");
			JRadioButton r10 = new JRadioButton("JLabel(String str,ImageIcon i)");
			JRadioButton r11 = new JRadioButton("JLabel(String str)");

		//4
			JRadioButton r13 = new JRadioButton("add()");
			JRadioButton r14 = new JRadioButton("setMenubar()");
			JRadioButton r16 = new JRadioButton("addMenuBar()");

	Button b1 = new Button("Submit");
	Button b2 = new Button("<-- Back");

	RLevel()
	{
		//Frame settings
		Toolkit tk = Toolkit.getDefaultToolkit();
		int x = (int) tk.getScreenSize().getWidth();
		int y = (int) tk.getScreenSize().getHeight();
		setVisible(true);
		setSize(x,y);
		setTitle("'R' Level MCQ's");

		//UI
		Font head = new Font("TimesNewRoman",Font.ITALIC,30);	
		Font fontl = new Font("Arial",Font.PLAIN,20);
		Font fontb = new Font("Arial",Font.PLAIN,20);

		//For panel add
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		add(p1);

		//For label1 add
		JLabel l1 = new JLabel("Advance java 'R' Level MCQ's");
		p1.add(l1);
		l1.setFont(head);
		l1.setBounds(500,2,1000,40);

		//For Sub button
		p1.add(b1);
		b1.setFont(fontb);
		b1.setBounds(450,650,120,50);

		//For Back button
		p1.add(b2);
		b2.setFont(fontb);
		b2.setBounds(50,650,120,50);

		//Quetion no. 1
		
			ButtonGroup bg1 = new ButtonGroup();
		
			//For label2 add
			JLabel l2 = new JLabel("Q1. The default orientation of JProgressBar is.................");
			p1.add(l2);
			l2.setFont(fontl);
			l2.setBounds(20,50,1000,30);

			//For 1 choice

			p1.add(r1);
			r1.setBounds(50,100,130,30);

			p1.add(r2);
			r2.setBounds(450,100,130,30);

			p1.add(r3);
			r3.setBounds(50,150,130,30);

			p1.add(r4);
			r4.setBounds(450,150,130,30);

			bg1.add(r1);
			bg1.add(r2);
			bg1.add(r3);
			bg1.add(r4);


		//Quetion no. 2

			ButtonGroup bg2 = new ButtonGroup();

			//For label3 add
			JLabel l3 = new JLabel("Q2. Model is the .......... of the MVC architecture.");
			p1.add(l3);
			l3.setFont(fontl);
			l3.setBounds(20,200,1000,30);

			//For 2 choice

			p1.add(r5);
			r5.setBounds(50,250,130,30);

			p1.add(r6);
			r6.setBounds(450,250,130,30);

			p1.add(r7);
			r7.setBounds(50,300,130,30);

			p1.add(r8);
			r8.setBounds(450,300,130,30);

			bg2.add(r5);
			bg2.add(r6);
			bg2.add(r7);
			bg2.add(r8);


		//Quetion no. 3

			ButtonGroup bg3 = new ButtonGroup();

			//For label4 add
			JLabel l4 = new JLabel("Q3. Which of the following is the constuctor of JLabel?");
			p1.add(l4);
			l4.setFont(fontl);
			l4.setBounds(20,350,1000,30);

			//For 3 choice

			p1.add(r9);
			r9.setBounds(50,400,130,30);

			p1.add(r10);
			r10.setBounds(450,400,130,30);

			p1.add(r11);
			r11.setBounds(50,450,130,30);

			p1.add(r12);
			r12.setBounds(450,450,130,30);

			bg3.add(r9);
			bg3.add(r10);
			bg3.add(r11);
			bg3.add(r12);


		//Quetion no. 4

			ButtonGroup bg4 = new ButtonGroup();
	
			//For label5 add
			JLabel l5 = new JLabel("Q4. ............method to add the menubar on           the frame window");
			p1.add(l5);
			l5.setFont(fontl);
			l5.setBounds(20,500,1000,30);

			//For 4 choice
	
			p1.add(r13);
			r13.setBounds(50,550,130,30);

			p1.add(r14);
			r14.setBounds(450,550,130,30);

			p1.add(r15);
			r15.setBounds(50,600,130,30);

			p1.add(r16);
			r16.setBounds(450,600,130,30);

			bg4.add(r13);
			bg4.add(r14);
			bg4.add(r15);
			bg4.add(r16);

		//For action button
		b1.addActionListener(this);
		b2.addActionListener(this);

		//For option
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
		r4.addActionListener(this);
		r5.addActionListener(this);
		r6.addActionListener(this);
		r7.addActionListener(this);
		r8.addActionListener(this);
		r9.addActionListener(this);
		r10.addActionListener(this);
		r11.addActionListener(this);
		r12.addActionListener(this);
		r13.addActionListener(this);
		r14.addActionListener(this);
		r15.addActionListener(this);
		r16.addActionListener(this);

		//For closing frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		//Ans
		if(e.getSource() == r1)
		{
			ans1++;
		}
		if(e.getSource() == r6)
		{
			ans2++;
		}
		if(e.getSource() == r12)
		{
			ans3++;
		}
		if(e.getSource() == r15)
		{
			ans4++;
		}
	
		//re
			//1
				if(e.getSource() == r2)
				{
					ans1 = 0;
				}
				if(e.getSource() == r3)
				{
					ans1 = 0;
				}
				if(e.getSource() == r4)
				{
					ans1 = 0;
				}

			//2
				if(e.getSource() == r5)
				{
					ans2 = 0;
				}
				if(e.getSource() == r7)
				{
					ans2 = 0;
				}
				if(e.getSource() == r8)
				{
					ans2 = 0;
				}

			//3
				if(e.getSource() == r9)
				{
					ans3 = 0;
				}
				if(e.getSource() == r10)
				{
					ans3 = 0;
				}
				if(e.getSource() == r11)
				{
					ans3 = 0;
				}

			//4
				if(e.getSource() == r13)
				{
					ans4 = 0;
				}
				if(e.getSource() == r14)
				{
					ans4 = 0;
				}
				if(e.getSource() == r16)
				{
					ans4 = 0;
				}

		//back
		if(e.getSource() == b2)
		{
			Frm2 fm = new Frm2();
			fm.setVisible(true);
		}

		//ans
		if(e.getSource() == b1)
		{
			ans=ans1 + ans2 + ans3 +ans4;
			Ans a1 = new Ans(ans);
		}

	}
}
class Frm2 extends Frame implements ActionListener
{
	Button b1 = new Button("'R' Level");
	Button b2 = new Button("'U' Level");
	Button b3 = new Button("'A' Level");
	Button b4 = new Button("Exit");
	Frm2()
	{
		//Frame settings
		Toolkit tk = Toolkit.getDefaultToolkit();
		int x = (int) tk.getScreenSize().getWidth();
		int y = (int) tk.getScreenSize().getHeight();
		setVisible(true);
		setSize(x,y);
		setTitle("Main menu");

		//Font UI 
		Font fontl1 = new Font("TimesNewRoman",Font.ITALIC,30);	
		Font fontl2 = new Font("Arial",Font.BOLD,25);
		Font fontb = new Font("Arial",Font.BOLD,20);	

		//For panel add
		Panel p1 = new Panel();
		p1.setLayout(null);
		add(p1);
 
		//For label1 add
		Label l1 = new Label("Advance java MCQ's");
		p1.add(l1);
		l1.setFont(fontl1);
		l1.setBounds(580,200,530,40);

		//For label2 add
		Label l2 = new Label("Select as per Quetions level");
		p1.add(l2);
		l2.setFont(fontl2);
		l2.setBounds(550,300,1000,40);

		//For button1 add
		p1.add(b1);
		b1.setFont(fontb);
		b1.setBounds(300,400,120,50);

		//For button2 add

		p1.add(b2);
		b2.setFont(fontb);
		b2.setBounds(630,400,120,50);

		//For button3 add
		p1.add(b3);
		b3.setFont(fontb);
		b3.setBounds(950,400,120,50);
		
		//For exit button4 add
		p1.add(b4);
		b4.setFont(fontb);
		b4.setBounds(630,500,120,50);

		//For action button
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		//For closing frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			RLevel r = new RLevel();
			r.setVisible(true);
		}
		if(e.getSource() == b2)
		{
			ULevel u = new ULevel();
			u.setVisible(true);
		}
		if(e.getSource() == b3)
		{
			ALevel a = new ALevel();
			a.setVisible(true);
		}
		if(e.getSource() == b4)
		{
			System.exit(0);
		}
	}
}		
class Frm1 extends JFrame implements ActionListener
{
	JPanel p1 = new JPanel();
	JTextField jt = new JTextField(10);
	JPasswordField jp = new JPasswordField(10);
	JButton b1 = new JButton("Login");
	JLabel l4 = new JLabel();
	Frm1()
	{
		//Frame settings
		Toolkit tk = Toolkit.getDefaultToolkit();
		int x = (int) tk.getScreenSize().getWidth();
		int y = (int) tk.getScreenSize().getHeight();
		setVisible(true);
		setSize(x,y);
		setTitle("Advance java login");

		//Font UI 
		Font head = new Font("TimesNewRoman",Font.ITALIC,30);	
		Font fontl = new Font("Arial",Font.BOLD,25);
		Font fontb = new Font("Arial",Font.BOLD,20);	

		//For panel add
		p1.setLayout(null);
		add(p1);
 
		//For label1 add
		JLabel l1 = new JLabel("Login page");
		p1.add(l1);
		l1.setFont(head);
		l1.setBounds(580,200,330,40);

		//For label2 add
		JLabel l2 = new JLabel("Enter Username");
		p1.add(l2);
		l2.setFont(fontl);
		l2.setBounds(400,300,300,30);

		//For label3 add
		JLabel l3 = new JLabel("Enter Password");
		p1.add(l3);
		l3.setFont(fontl);
		l3.setBounds(400,370,330,30);

		//For label4 add
		p1.add(l4);
		l4.setFont(fontl);
		l4.setBounds(500,530,1000,30);
		
		//For JTextField1 add
		p1.add(jt);
		jt.setBounds(680,300,300,30);

		//For PasswordField add
		p1.add(jp);
		jp.setBounds(680,370,300,30);

		//For button1 add
		p1.add(b1);
		b1.setFont(fontb);
		b1.setBounds(600,450,120,50);

		//For action button
		b1.addActionListener(this);
		
		//For closing frame
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b1)
		{
			String s1 = jt.getText();
			String s2 = new String(jp.getPassword());
			if(s1.equals("java") && s2.equals("1234"))
			{
				Frm2 fm = new Frm2();
				fm.setVisible(true);
			}
			else
			{
				l4.setText("Invalid Password/ Username.");
			}
		}
	}
}
class PRO2
{
	public static void main(String args[])
	{
		new Frm1();
	}
}

