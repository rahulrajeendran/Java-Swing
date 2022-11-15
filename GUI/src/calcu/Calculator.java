package calcu;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Choice;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Label;

public class Calculator {
	double result;
	String strg="";
	char op;

	private JFrame frame;
	private JTextField display;
	private JTextField conv;
	private JTextField conve;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 859, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("<-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(0, 76, 49, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton ceback = new JButton("CE");
		ceback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuffer sb= new StringBuffer(strg); 
			    System.out.println(strg.length());
				int l=strg.length()-1;
				sb.deleteCharAt(l);
				strg=String.valueOf(sb);
				display.setText(String.valueOf(sb));
			}
		});
		ceback.setBounds(51, 76, 49, 32);
		frame.getContentPane().add(ceback);
		
		JButton clr = new JButton("C");
		clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText(null);
				display.setText(null);
				strg="";
			}
		});
		clr.setBounds(104, 76, 49, 32);
		frame.getContentPane().add(clr);
		
		JButton porm = new JButton("+/-");
		porm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		porm.setBounds(158, 76, 49, 32);
		frame.getContentPane().add(porm);
		
		JButton no7 = new JButton("7");
		no7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no7.getText();
				display.setText(display.getText()+no7.getText());
			}
		});
		no7.setBounds(0, 113, 49, 32);
		frame.getContentPane().add(no7);
		
		JButton no4 = new JButton("4");
		no4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no4.getText();
				display.setText(display.getText()+no4.getText());
			}
		});
		no4.setBounds(0, 151, 49, 32);
		frame.getContentPane().add(no4);
		
		JButton no1 = new JButton("1");
		no1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+no1.getText();
				display.setText(display.getText()+no1.getText());
			}
		});
		no1.setBounds(0, 186, 49, 32);
		frame.getContentPane().add(no1);
		
		JButton no8 = new JButton("8");
		no8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no8.getText();
				display.setText(display.getText()+no8.getText());
			}
		});
		no8.setBounds(51, 113, 49, 32);
		frame.getContentPane().add(no8);
		
		JButton no5 = new JButton("5");
		no5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no5.getText();
				display.setText(display.getText()+no5.getText());
			}
		});
		no5.setBounds(51, 151, 49, 32);
		frame.getContentPane().add(no5);
		
		JButton no2 = new JButton("2");
		no2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no2.getText();
				display.setText(display.getText()+no2.getText());
			}
		});
		no2.setBounds(51, 186, 49, 32);
		frame.getContentPane().add(no2);
		
		JButton no9 = new JButton("9");
		no9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no9.getText();
				display.setText(display.getText()+no9.getText());
			}
		});
		no9.setBounds(104, 113, 49, 32);
		frame.getContentPane().add(no9);
		
		JButton no6 = new JButton("6");
		no6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no6.getText();
				display.setText(display.getText()+no6.getText());
			}
		});
		no6.setBounds(104, 151, 49, 32);
		frame.getContentPane().add(no6);
		
		JButton no3 = new JButton("3");
		no3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no3.getText();
				display.setText(display.getText()+no3.getText());
			}
		});
		no3.setBounds(104, 186, 49, 32);
		frame.getContentPane().add(no3);
		
		JButton div = new JButton("/");
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+div.getText());
				op='d';
			}
		});
		div.setBounds(158, 113, 49, 32);
		frame.getContentPane().add(div);
		
		JButton str = new JButton("*");
		str.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+str.getText());
				op='s';
			}
		});
		str.setBounds(158, 151, 49, 32);
		frame.getContentPane().add(str);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+minus.getText());
				op='m';
			}
		});
		minus.setBounds(158, 186, 49, 32);
		frame.getContentPane().add(minus);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+plus.getText());
				op='p';
			}
		});
		plus.setBounds(158, 219, 49, 41);
		frame.getContentPane().add(plus);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+dot.getText());
			}
		});
		dot.setBounds(104, 219, 49, 41);
		frame.getContentPane().add(dot);
		
		JButton no0 = new JButton("0");
		no0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=strg+ no0.getText();
				display.setText(display.getText()+no0.getText());
			}
		});
		no0.setBounds(0, 219, 100, 41);
		frame.getContentPane().add(no0);
		
		JButton sqt = new JButton("Sqrt");
		sqt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sq=Double.parseDouble(display.getText());
				sq=Math.sqrt(sq);
				display.setText(String.valueOf(sq));
			}
		});
		sqt.setBounds(212, 76, 59, 32);
		frame.getContentPane().add(sqt);
		
		JButton perse = new JButton("%");
		perse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+perse.getText());
				op='r';
			}
		});
		perse.setBounds(212, 113, 59, 32);
		frame.getContentPane().add(perse);
		
		JButton oneby = new JButton("1/x");
		oneby.setBounds(212, 151, 59, 32);
		frame.getContentPane().add(oneby);
		
		JButton equa = new JButton("=");
		equa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(op) {
				case 'p':
					double res=result+Double.parseDouble(strg);
					display.setText(String.valueOf(res));
					break;
					
				case 'm':
					double res2=result-Double.parseDouble(strg);
					display.setText(String.valueOf(res2));
					break;
					
				case 'd':
					double res3=result/Double.parseDouble(strg);
					display.setText(String.valueOf(res3));
					break;
					
				case 's':
					double res4=result*Double.parseDouble(strg);
					display.setText(String.valueOf(res4));
					break;
					
				case 'r':
					double res5=result%Double.parseDouble(strg);
					display.setText(String.valueOf(res5));
					break;
					
				case 'n':
					double res6=Math.sin(Double.parseDouble(strg));
					display.setText(String.valueOf(res6));
					break;
					
				case 'o':
					double res7=Math.cos(Double.parseDouble(strg));
					display.setText(String.valueOf(res7));
					break;
					
				case 't':
					double res8=Math.tan(Double.parseDouble(strg));
					display.setText(String.valueOf(res8));
					break;
					
				case 'S':
					double res9=Math.sinh(Double.parseDouble(strg));
					display.setText(String.valueOf(res9));
					break;
					
				case 'C':
					double res10=Math.cosh(Double.parseDouble(strg));
					display.setText(String.valueOf(res10));
					break;
					
				case 'T':
					double res11=Math.tanh(Double.parseDouble(strg));
					display.setText(String.valueOf(res11));
					break;
				case 'w':
					double res12=Math.pow(result,Double.parseDouble(strg));
					display.setText(String.valueOf(res12));
					break;	
				
				}
			}
		});
		equa.setBounds(212, 186, 59, 74);
		frame.getContentPane().add(equa);
		
		JButton btnNewButton_1_4 = new JButton("L");
		btnNewButton_1_4.setBounds(272, 76, 59, 32);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Sin");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conve.setText("sin");
				op='n';
			}
		});
		btnNewButton_1_5.setBounds(332, 76, 59, 32);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Pi");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"3.14");
				strg="3.14";
			}
		});
		btnNewButton_1_6.setBounds(272, 113, 59, 32);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("x^y");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				result=Double.parseDouble(display.getText());
				strg="";
				display.setText(display.getText()+"^");
				op='w';
			}
		});
		btnNewButton_1_7.setBounds(272, 151, 59, 32);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("x^2");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sq=Double.parseDouble(strg)*Double.parseDouble(strg);
				display.setText(String.valueOf(sq));
				strg=String.valueOf(sq);
			}
		});
		btnNewButton_1_8.setBounds(272, 186, 59, 32);
		frame.getContentPane().add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("x^3");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double sq=Double.parseDouble(strg)*Double.parseDouble(strg)*Double.parseDouble(strg);
				display.setText(String.valueOf(sq));
				strg=String.valueOf(sq);
			}
		});
		btnNewButton_1_9.setBounds(272, 223, 59, 32);
		frame.getContentPane().add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("Cos");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText("cos");
				op='o';
			}
		});
		btnNewButton_1_10.setBounds(332, 113, 59, 32);
		frame.getContentPane().add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("tan");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText("tan");
				op='t';
			}
		});
		btnNewButton_1_11.setBounds(332, 151, 59, 32);
		frame.getContentPane().add(btnNewButton_1_11);
		
		JButton btnNewButton_1_12 = new JButton("Cbr");
		btnNewButton_1_12.setBounds(332, 186, 59, 32);
		frame.getContentPane().add(btnNewButton_1_12);
		
		JButton btnNewButton_1_13 = new JButton("Bin");
		btnNewButton_1_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b=Integer.toBinaryString(Integer.parseInt(strg));
				display.setText(b);
			}
		});
		btnNewButton_1_13.setBounds(332, 223, 59, 32);
		frame.getContentPane().add(btnNewButton_1_13);
		
		JButton btnNewButton_1_14 = new JButton("Sinh");
		btnNewButton_1_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText("sinh");
				op='S';
			}
		});
		btnNewButton_1_14.setBounds(392, 76, 59, 32);
		frame.getContentPane().add(btnNewButton_1_14);
		
		JButton btnNewButton_1_15 = new JButton("Cosh");
		btnNewButton_1_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText("cosh");
				op='C';
			}
		});
		btnNewButton_1_15.setBounds(392, 113, 59, 32);
		frame.getContentPane().add(btnNewButton_1_15);
		
		JButton btnNewButton_1_16 = new JButton("tanh");
		btnNewButton_1_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				conve.setText("tanh");
				op='T';
			}
		});
		btnNewButton_1_16.setBounds(392, 151, 59, 32);
		frame.getContentPane().add(btnNewButton_1_16);
		
		JButton btnNewButton_1_17 = new JButton("Rund");
		btnNewButton_1_17.setBounds(392, 186, 59, 32);
		frame.getContentPane().add(btnNewButton_1_17);
		
		JButton btnNewButton_1_18 = new JButton("Hex");
		btnNewButton_1_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=Integer.toHexString(Integer.parseInt(strg));
				display.setText(b);
			}
		});
		btnNewButton_1_18.setBounds(392, 223, 59, 32);
		frame.getContentPane().add(btnNewButton_1_18);
		
		JButton btnNewButton_1_19 = new JButton("Mod");
		btnNewButton_1_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				strg=String.valueOf(Math.abs(Integer.parseInt(strg)));
				display.setText(strg);
			}
		});
		btnNewButton_1_19.setBounds(451, 76, 59, 32);
		frame.getContentPane().add(btnNewButton_1_19);
		
		JButton btnNewButton_1_20 = new JButton("Inx");
		btnNewButton_1_20.setBounds(451, 113, 59, 32);
		frame.getContentPane().add(btnNewButton_1_20);
		
		JButton btnNewButton_1_21 = new JButton("C");
		btnNewButton_1_21.setBounds(451, 151, 59, 32);
		frame.getContentPane().add(btnNewButton_1_21);
		
		JButton btnNewButton_1_22 = new JButton("2pi");
		btnNewButton_1_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"2Pi");
				strg="6.28";
			}
		});
		btnNewButton_1_22.setBounds(451, 186, 59, 32);
		frame.getContentPane().add(btnNewButton_1_22);
		
		JButton btnNewButton_1_23 = new JButton("Oct");
		btnNewButton_1_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=Integer.toOctalString(Integer.parseInt(strg));
				display.setText(b);
			}
		});
		btnNewButton_1_23.setBounds(451, 223, 59, 32);
		frame.getContentPane().add(btnNewButton_1_23);
		
		display = new JTextField();
		display.setBounds(0, 10, 506, 56);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("casio");
		lblNewLabel.setBounds(0, 0, 56, 13);
		frame.getContentPane().add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(516, 10, 319, 245);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		conv = new JTextField();
		conv.setBounds(31, 86, 259, 34);
		panel.add(conv);
		conv.setColumns(10);
		
		JComboBox sel = new JComboBox();
		sel.setModel(new DefaultComboBoxModel(new String[] {"USA", "England", "Australia"}));
		sel.setMaximumRowCount(3);
		sel.setBounds(96, 32, 125, 21);
		panel.add(sel);
		
		Label rup = new Label("");
		rup.setForeground(new Color(255, 255, 255));
		rup.setBounds(132, 138, 59, 21);
		panel.add(rup);
		
		JButton btnNewButton_2 = new JButton("Convert");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ss=sel.getSelectedItem().toString();
				switch(ss) {
				case "USA":
					double aa=Double.parseDouble(conv.getText())*81.66;
					rup.setText(String.valueOf(aa));
					break;
					
				case "England":
					double ab=Double.parseDouble(conv.getText())*94.53;
					rup.setText(String.valueOf(ab));
					break;
					
				case "Australia":
					double ad=Double.parseDouble(conv.getText())*53.63;
					rup.setText(String.valueOf(ad));
					break;
				}
			}
		});
		btnNewButton_2.setBounds(31, 165, 102, 41);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Clear");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rup.setText("");
			}
		});
		btnNewButton_2_1.setBounds(188, 165, 102, 41);
		panel.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Converter");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(122, 10, 119, 13);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		
		
		
		
		
		conve = new JTextField();
		conve.setBounds(0, 10, 96, 19);
		frame.getContentPane().add(conve);
		conve.setColumns(10);
	}
}
