import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

class Login extends JFrame implements ActionListener{
	JButton rules;
	JButton Insta;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(new Color(51,102,89));
		setLayout(null);

		JLabel bg;
		setSize(1200,500);
		setLayout(null);
		ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("universe.jpg"));
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLocation(200,200);
		bg.setBounds(0,0,1778,1000);
		add(bg);

		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("border.png"));
		JLabel quiz=new JLabel(img1);
		quiz.setBounds(590,130,600,600);
		bg.add(quiz);

		JLabel heading=new JLabel("JAVA QUIZ by ATHARVA");
		heading.setBounds(640,90,1000,250);
		heading.setFont(new Font("Algerian",Font.BOLD,40));
		heading.setForeground(new Color(243,239,232));
		bg.add(heading);

		JLabel name=new JLabel("Enter your Name");
		name.setBounds(810,300,300,20);
		name.setFont(new Font("Times New Roman",Font.BOLD,25));
		name.setForeground(new Color(243,239,232));
		bg.add(name);

		tfname=new JTextField();
		tfname.setBounds(735,350,300,30);
		tfname.setFont(new Font("Raavi",0,15));
		bg.add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(735,470,120,25);
		rules.setBackground(new Color(160,32,240));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		bg.add(rules);

		Insta=new JButton("Start");
		Insta.setBounds(915,470,120,25);
		Insta.setBackground(new Color(160,32,240));
		Insta.setForeground(Color.WHITE);
		Insta.addActionListener(this);
		bg.add(Insta);
		


		setVisible(true);
		setSize(1778,1000);
		setLocation(60,50);
	}
	public void actionPerformed(ActionEvent ae){

		String st=tfname.getText();
		if(ae.getSource()==rules){
			Bio bs=new Bio(st);
		}else if(ae.getSource()==Insta){
			setVisible(false);
			follow ab=new follow(st);
		}
	}

	public static void main(String[] args){
		Login l=new Login();	
	}
}

class Bio extends JFrame implements ActionListener{
	
	String name;
	JButton back;
	Bio(){}
	Bio(String st){
		
		this.name=st;
		getContentPane().setBackground(new Color(51,102,89));
		setLayout(null);

		JLabel bg;
		setSize(1200,500);
		setLayout(null);
		ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("universe.jpg"));
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLocation(200,200);
		bg.setBounds(0,0,1778,1000);
		add(bg);

		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("border.png"));
		JLabel quiz=new JLabel(img1);
		quiz.setBounds(500,140,800,800);
		bg.add(quiz);

		JLabel heading2=new JLabel("Welcome "+st);
		heading2.setBounds(770,50,1000,250);
		heading2.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
		heading2.setForeground(new Color(243,239,232));
		bg.add(heading2);
		
		JLabel heading=new JLabel("Follow the Following Rules ");
		heading.setBounds(690,90,1000,250);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
		heading.setForeground(new Color(243,239,232));
		bg.add(heading);

		JLabel rules=new JLabel();
		rules.setBounds(640,50,1000,1000);
		rules.setForeground(new Color(243,239,232));
		rules.setFont(new Font("Tahoma",Font.PLAIN,20));
		rules.setText(
			"<html>"+
				">> 1. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 2. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 3. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 4. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 5. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 6. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 7. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 8. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 9. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 10. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+

				">> 11. dfffghgjhhgfj jfjhgfh jhjbjjj"+"<br><br>"+
			"<html>"
		);
		bg.add(rules);

		back=new JButton("Back");
		back.setBounds(850,900,120,25);
		back.setBackground(new Color(243,239,232));
		back.setForeground(new Color(51,102,89));
		back.addActionListener(this);
		bg.add(back);


		setVisible(true);
		setSize(1778,1000);
		setLocation(60,50);
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==back){
			setVisible(false);
			new Login();
		}
	}
}

class follow extends JFrame implements ActionListener{
	
	String questions[][]=new String[10][5];
	String answers[][]=new String[10][2];
	String user_ans[][]=new String[10][1];
	String username;

	JLabel qno;
	JLabel question;
	JRadioButton opt1;
	JRadioButton opt2;
	JRadioButton opt3;
	JRadioButton opt4;

	JButton next;
	JButton half;
	JButton sub;
	ButtonGroup butgrp;

	public static int count=0;
	public static int timer=15;
	public static int ansgiven=0;
	public static int score=0;


	follow(String username){
		
		this.username=username;
		getContentPane().setBackground(new Color(0,0,0));
		setLayout(null);
		
		JLabel bg;
		setSize(1500,1000);
		setLayout(null);
		ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("start.jpg"));
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLocation(200,200);
		bg.setBounds(0,0,1778,500);
		add(bg);


		qno=new JLabel();
		qno.setBounds(100,500,50,30);
		qno.setFont(new Font("Tahoma",Font.BOLD,24));
		qno.setForeground(Color.WHITE);
		bg.add(qno);
		add(qno);

		question=new JLabel();
		question.setBounds(170,500,1500,30);
		question.setFont(new Font("Tahoma",Font.BOLD,24));
		question.setForeground(Color.WHITE);
		bg.add(question);
		add(question);
		
		questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
     		questions[0][1] = "JVM";
     		questions[0][2] = "JDB";
     		questions[0][3] = "JDK";
       		questions[0][4] = "JRE";

        	questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        	questions[1][1] = "int";
        	questions[1][2] = "Object";
       		questions[1][3] = "long";
       	 	questions[1][4] = "void";
	
	        questions[2][0] = "Which package contains the Random class?";
        	questions[2][1] = "java.util package";
	        questions[2][2] = "java.lang package";
        	questions[2][3] = "java.awt package";
        	questions[2][4] = "java.io package";

        	questions[3][0] = "An interface with no fields or methods is known as?";
        	questions[3][1] = "Runnable Interface";
        	questions[3][2] = "Abstract Interface";
        	questions[3][3] = "Marker Interface";
        	questions[3][4] = "CharSequence Interface";

        	questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        	questions[4][1] = "Stack";
        	questions[4][2] = "String memory";
        	questions[4][3] = "Random storage space";
        	questions[4][4] = "Heap memory";

        	questions[5][0] = "Which of the following is a marker interface?";
        	questions[5][1] = "Runnable interface";
        	questions[5][2] = "Remote interface";
        	questions[5][3] = "Readable interface";
        	questions[5][4] = "Result interface";

        	questions[6][0] = "Which keyword is used for accessing the features of a package?";
        	questions[6][1] = "import";
        	questions[6][2] = "package";
        	questions[6][3] = "extends";
        	questions[6][4] = "export";
	
        	questions[7][0] = "In java, jar stands for?";
        	questions[7][1] = "Java Archive Runner";
        	questions[7][2] = "Java Archive";
        	questions[7][3] = "Java Application Resource";
        	questions[7][4] = "Java Application Runner";
	
	        questions[8][0] = "Which of the following is a mutable class in java?";
	        questions[8][1] = "java.lang.StringBuilder";
	        questions[8][2] = "java.lang.Short";
	        questions[8][3] = "java.lang.Byte";
	        questions[8][4] = "java.lang.String";
	
	        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
	        questions[9][1] = "Bytecode is executed by JVM";
	        questions[9][2] = "The applet makes the Java code secure and portable";
	        questions[9][3] = "Use of exception handling";
	        questions[9][4] = "Dynamic binding between objects";

		answers[0][1] = "JDB";
        	answers[1][1] = "int";
        	answers[2][1] = "java.util package";
        	answers[3][1] = "Marker Interface";
        	answers[4][1] = "Heap memory";
        	answers[5][1] = "Remote interface";
        	answers[6][1] = "import";
        	answers[7][1] = "Java Archive";
        	answers[8][1] = "java.lang.StringBuilder";
        	answers[9][1] = "Bytecode is executed by JVM";

		opt1=new JRadioButton("A");
		opt1.setBounds(170,620,300,20);
		opt1.setBackground(Color.BLACK);
		opt1.setForeground(Color.WHITE);
		opt1.setFont(new Font("Dialog",Font.PLAIN,20));
		add(opt1);

		opt2=new JRadioButton("B");
		opt2.setBounds(170,660,300,20);
		opt2.setBackground(Color.BLACK);
		opt2.setForeground(Color.WHITE);
		opt2.setFont(new Font("Dialog",Font.PLAIN,20));
		add(opt2);

		opt3=new JRadioButton("C");
		opt3.setBounds(170,690,300,20);
		opt3.setBackground(Color.BLACK);
		opt3.setForeground(Color.WHITE);
		opt3.setFont(new Font("Dialog",Font.PLAIN,20));
		add(opt3);

		opt4=new JRadioButton("D");
		opt4.setBounds(170,720,300,20);
		opt4.setBackground(Color.BLACK);
		opt4.setForeground(Color.WHITE);
		opt4.setFont(new Font("Dialog",Font.PLAIN,20));
		add(opt4);

		butgrp=new ButtonGroup();
		butgrp.add(opt1);
		butgrp.add(opt2);
		butgrp.add(opt3);
		butgrp.add(opt4);
		
		next=new JButton("Next");
		next.setBounds(1300,850,100,20);
		next.setFont(new Font("Times New Roman",Font.BOLD,20));
		next.setBackground(Color.WHITE);
		next.setForeground(Color.BLACK);
		next.addActionListener(this);
		add(next);

		half=new JButton("50-50");
		half.setBounds(1450,850,100,20);
		half.setFont(new Font("Times New Roman",Font.PLAIN,20));
		half.setBackground(Color.WHITE);
		half.setForeground(Color.BLACK);
		half.addActionListener(this);
		add(half);

		sub=new JButton("SUBMIT");
		sub.setBounds(1600,850,130,20);
		sub.setFont(new Font("Times New Roman",Font.PLAIN,20));
		sub.setBackground(Color.WHITE);
		sub.setForeground(Color.BLACK);
		sub.setEnabled(false);
		sub.addActionListener(this);
		add(sub);
		
		start(count);
		
		setVisible(true);
		setSize(1778,1000);
		setLocation(50,50);

	}
	
	public void start(int count){
		qno.setText(""+(count+1)+". ");
		question.setText(questions[count][0]);
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][1]);
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);

		butgrp.clearSelection();
	}
	
	public void paint(Graphics g){
		super.paint(g);

		String time=""+timer;
		g.setColor(Color.RED);
		g.setFont(new Font("Castellar",Font.BOLD,50));
		
		if(timer>0){
			g.drawString(time,840,100);
		}else{
			g.drawString("Time Over !!",700,100);
		}
		timer--;
		try{
			Thread.sleep(1000);
			repaint();
		}catch(Exception e){
			e.printStackTrace();
		}

		if(ansgiven==1){
			ansgiven=0;
			timer=15;
		}else if(timer<0){
			timer=15;
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			
			if(count==8){
				next.setEnabled(false);
				sub.setEnabled(true);
			}
			
			if(count==9){
				if(butgrp.getSelection()==null){
					user_ans[count][0]="";
				}else{
					user_ans[count][0]=butgrp.getSelection().getActionCommand();
				}

				for(int i=0;i<user_ans.length;i++){
					if(user_ans[i][0]==answers[i][1]){
						score=score+10;
					}else{
						score=score;
					}
				}
				count=0;
				setVisible(false);
				new result(username,score);
				
			}else{
				if(butgrp.getSelection()==null){
					user_ans[count][0]="";
				}else{
					user_ans[count][0]=butgrp.getSelection().getActionCommand();
				}
				count++;
				start(count);
			}
		}
	}

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==next){
			repaint();
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			ansgiven=1;
			if(butgrp.getSelection()==null){
				user_ans[count][0]="0";
			}else{
				user_ans[count][0]=butgrp.getSelection().getActionCommand();;
			}

			if(count==8){
				next.setEnabled(false);
				sub.setEnabled(true);
			}
			count++;
			start(count);

	
		}else if(ae.getSource()==half){
			if(count==2||count==4||count==6||count==8||count==9){
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}else{
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			half.setEnabled(false);
		}else if(ae.getSource()==sub){

			ansgiven=1;
			if(butgrp.getSelection()==null){
				user_ans[count][0]="";
			}else{
				user_ans[count][0]=butgrp.getSelection().getActionCommand();
			}

			for(int i=0;i<user_ans.length;i++){
				if(user_ans[i][0]==answers[i][1]){
					score=score+10;
				}else{
					score=score;
				}
			}
			count=0;
			setVisible(false);
			new result(username,score);
		}
	}
}

class result extends JFrame implements ActionListener{
	
	public static int score=0;
	public String username=null;

	JButton Home;
	result(String username,int score){
		this.score=score;
		this.username=username;

		getContentPane().setBackground(new Color(0,0,0));
		setLayout(null);
		
		JLabel bg;
		setSize(1200,500);
		setLayout(null);
		ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("universe.jpg"));
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLocation(200,200);
		bg.setBounds(0,0,1778,1000);
		add(bg);

		ImageIcon img1=new ImageIcon(ClassLoader.getSystemResource("border.png"));
		JLabel quiz=new JLabel(img1);
		quiz.setBounds(600,130,600,600);
		bg.add(quiz);

		JLabel heading=new JLabel("Congratulations!!");
		heading.setBounds(650,90,1000,250);
		heading.setFont(new Font("Castellar",Font.BOLD,40));
		heading.setForeground(new Color(243,239,232));
		bg.add(heading);

		JLabel heading3=new JLabel(username);
		heading3.setBounds(780,150,1000,250);
		heading3.setFont(new Font("Castellar",Font.BOLD,40));
		heading3.setForeground(new Color(243,239,232));
		bg.add(heading3);

		JLabel heading2=new JLabel("Your Score");
		heading2.setBounds(800,250,1000,250);
		heading2.setFont(new Font("Times New Roman",Font.BOLD,40));
		heading2.setForeground(new Color(243,239,232));
		bg.add(heading2);

		Home=new JButton("Go to Home");
		Home.setBounds(800,600,200,25);
		Home.setBackground(new Color(160,32,240));
		Home.setForeground(Color.WHITE);
		Home.addActionListener(this);
		bg.add(Home);

		
		setVisible(true);
		setSize(1778,1000);
		setLocation(50,50);

	}
	public void paint(Graphics g){
		super.paint(g);

		String result=""+score;
		g.setColor(Color.WHITE);

		g.setFont(new Font("Castellar",Font.BOLD,50));
		g.drawString(result,890,500);
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==Home){
			setVisible(false);
			new Login();
		}
	}
		

}
