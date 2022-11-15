package stdmng;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.TextField;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Label;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SMapp {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SMapp window = new SMapp();
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
	public SMapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 961, 623);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 10, 438, 386);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TextField stdid = new TextField();
		stdid.setBounds(94, 64, 91, 21);
		panel.add(stdid);
		
		TextField maths = new TextField();
		maths.setBounds(337, 45, 91, 21);
		panel.add(maths);
		
		TextField fname = new TextField();
		fname.setBounds(94, 107, 91, 21);
		panel.add(fname);
		
		TextField lname = new TextField();
		lname.setBounds(94, 151, 91, 21);
		panel.add(lname);
		
		TextField rank = new TextField();
		rank.setBounds(94, 355, 91, 21);
		panel.add(rank);
		
		TextField avgscore = new TextField();
		avgscore.setBounds(94, 316, 91, 21);
		panel.add(avgscore);
		
		TextField tlscore = new TextField();
		tlscore.setBounds(94, 270, 91, 21);
		panel.add(tlscore);
		
		TextField english = new TextField();
		english.setBounds(337, 89, 91, 21);
		panel.add(english);
		
		TextField biology = new TextField();
		biology.setBounds(337, 132, 91, 21);
		panel.add(biology);
		
		TextField computer = new TextField();
		computer.setBounds(337, 176, 91, 21);
		panel.add(computer);
		
		TextField chemistry = new TextField();
		chemistry.setBounds(337, 222, 91, 21);
		panel.add(chemistry);
		
		TextField hindi = new TextField();
		hindi.setBounds(337, 316, 91, 21);
		panel.add(hindi);
		
		TextField malayalam = new TextField();
		malayalam.setBounds(337, 355, 91, 21);
		panel.add(malayalam);
		
		TextField physics = new TextField();
		physics.setBounds(337, 270, 91, 21);
		panel.add(physics);
		
		JComboBox course = new JComboBox();
		course.setModel(new DefaultComboBoxModel(new String[] {"Select", "ME", "CSE", "EEE", "ECE"}));
		course.setBounds(94, 190, 91, 21);
		panel.add(course);
		
		JLabel lblNewLabel = new JLabel("Student_ID");
		lblNewLabel.setBounds(0, 64, 88, 21);
		panel.add(lblNewLabel);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setBounds(0, 107, 88, 21);
		panel.add(lblFirstName);
		
		JLabel lblSurname = new JLabel("Last Name");
		lblSurname.setBounds(0, 151, 88, 21);
		panel.add(lblSurname);
		
		JLabel lblCourse = new JLabel("Course ");
		lblCourse.setBounds(0, 190, 88, 21);
		panel.add(lblCourse);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setBounds(0, 270, 88, 21);
		panel.add(lblTotalScore);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setBounds(0, 316, 88, 21);
		panel.add(lblAverage);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setBounds(0, 355, 88, 21);
		panel.add(lblRanking);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setBounds(229, 45, 88, 21);
		panel.add(lblMaths);
		
		JLabel lblEnglish = new JLabel("English");
		lblEnglish.setBounds(229, 89, 88, 21);
		panel.add(lblEnglish);
		
		JLabel lblNewLabel_8_1 = new JLabel("Biology");
		lblNewLabel_8_1.setBounds(229, 132, 88, 21);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_2 = new JLabel("Computer");
		lblNewLabel_8_2.setBounds(229, 176, 88, 21);
		panel.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("Chemistry");
		lblNewLabel_8_3.setBounds(229, 222, 88, 21);
		panel.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_4 = new JLabel("Physics");
		lblNewLabel_8_4.setBounds(229, 270, 88, 21);
		panel.add(lblNewLabel_8_4);
		
		JLabel lblNewLabel_8_5 = new JLabel("Hindi");
		lblNewLabel_8_5.setBounds(229, 316, 88, 21);
		panel.add(lblNewLabel_8_5);
		
		JLabel lblNewLabel_8_6 = new JLabel("Malayalam");
		lblNewLabel_8_6.setBounds(229, 355, 88, 21);
		panel.add(lblNewLabel_8_6);
		
		JLabel lblNewLabel_8_7 = new JLabel("Student Details");
		lblNewLabel_8_7.setForeground(new Color(0, 0, 255));
		lblNewLabel_8_7.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblNewLabel_8_7.setBounds(0, 10, 114, 27);
		panel.add(lblNewLabel_8_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 128, 255));
		panel_1.setBounds(451, 10, 438, 386);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel report = new JPanel();
		report.setBounds(24, 46, 388, 292);
		panel_1.add(report);
		report.setLayout(null);
		
		JTextPane shw = new JTextPane();
		shw.setBackground(new Color(255, 255, 255));
		shw.setBounds(0, 0, 388, 292);
		report.add(shw);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shw.setText(null);
			}
		});
		clear.setBounds(177, 348, 98, 27);
		panel_1.add(clear);
		clear.setBackground(new Color(0, 0, 0));
		clear.setForeground(new Color(255, 255, 255));
		
		Label label = new Label("Student Report");
		label.setBounds(24, 10, 98, 21);
		panel_1.add(label);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Student_id", "Course", "Maths", "English", "Biology", "Computer", "Chemistry", "Physics", "Hindi", "Malayalam", "Total_Score", "Ranking"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setFillsViewportHeight(true);
		table.setToolTipText("\r\n");
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(10, 403, 879, 64);
		frame.getContentPane().add(table);
		
		Button add = new Button("Add Report");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=stdid.getText();
				String crs=course.getSelectedItem().toString();
				double math=Double.parseDouble(maths.getText());
				double eng=Double.parseDouble(english.getText());
				double bio=Double.parseDouble(biology.getText());
				double com=Double.parseDouble(computer.getText());
				double che=Double.parseDouble(chemistry.getText());
				double phy=Double.parseDouble(physics.getText());
				double hin=Double.parseDouble(hindi.getText());
				double mal=Double.parseDouble(malayalam.getText());
				double totscr=math+eng+bio+com+che+phy+hin+mal;
				double pavg=totscr/8;
				avgscore.setText(String.valueOf(pavg));
				tlscore.setText(String.valueOf(totscr));
				String rk="";
				if(totscr>700) {
					rk="OS";
				}
				else if(totscr>600) {
					rk="A";
				}
				else if(totscr>500) {
					rk="B";
				}
				else if(totscr>400) {
					rk="C";
				}
				else if(totscr>300) {
					rk="D";
				}
				else {
					rk="F";
				}
				rank.setText(rk);
				Object[] row = { sid, crs, maths.getText(),english.getText(),biology.getText(),computer.getText(), chemistry.getText(), physics.getText(),hindi.getText(),malayalam.getText(),String.valueOf(totscr),rk };
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(row);
			}
		});
		add.setFont(new Font("Arial", Font.PLAIN, 10));
		add.setBounds(25, 517, 85, 21);
		frame.getContentPane().add(add);
		
		Button delete = new Button("Delete");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel)table.getModel();
				dm.removeRow(1);
			}
		});
		delete.setBounds(199, 517, 97, 21);
		frame.getContentPane().add(delete);
		
		Button show = new Button("Show Report");
		show.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sid=stdid.getText();
				String fnm=fname.getText();
				String lnm=lname.getText();
				String crs=course.getSelectedItem().toString();
				String math=maths.getText();
				String eng=english.getText();
				String bio=biology.getText();
				String com=computer.getText();
				String che=chemistry.getText();
				String phy=physics.getText();
				String hin=hindi.getText();
				String mal=malayalam.getText();
				String ts=tlscore.getText();
				String avg=avgscore.getText();
				String rnk=rank.getText();
				shw.setText(" ID : \t"+sid+"\n Name : \t"+fnm+lnm+"\n Course : \t"+crs+"\n Maths : \t"+math+"\n English : \t"+eng+"\n Biology : \t"+bio+"\n Computer : \t"+com+"\n Chemistry : \t"+che+"\n Physics : \t"+phy+"\n Hindi : \t"+hin+"\n Malayalam : \t"+mal+"\n Total Score : \t"+ts+"\n Average : "+avg+"\n Rank : \t"+rnk);
			}
		});
		show.setBounds(382, 517, 85, 21);
		frame.getContentPane().add(show);
		
		Button exit = new Button("Exit");
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"Confirm","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		exit.setBounds(581, 517, 85, 21);
		frame.getContentPane().add(exit);
		
		Button reset = new Button("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stdid.setText(null);
				fname.setText(null);
				lname.setText(null);
				tlscore.setText(null);
				rank.setText(null);
				avgscore.setText(null);
				maths.setText(null);
				english.setText(null);
				biology.setText(null);
				computer.setText(null);
				chemistry.setText(null);
				physics.setText(null);
				hindi.setText(null);
				malayalam.setText(null);
				course.setSelectedItem("Select");
			}
		});
		reset.setBounds(804, 517, 85, 21);
		frame.getContentPane().add(reset);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
