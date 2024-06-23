package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setBounds(0, 1, 1550, 820);
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
					frame.setTitle("PHARMACY MANAGEMENT SYSTEM");
					
					
					JPanel p1= new JPanel();
					p1.setBounds(5, 5, 700, 800);
					Color darkGreen=new Color(60,176,67);
					p1.setBackground(darkGreen);
					p1.setLayout(null);
					frame.add(p1);
					
					JPanel p2= new JPanel();
				p2.setBounds(850, 140 ,500,500 );
					Color A =new Color(211,211,211);
					p2.setBackground(A);
					
					p2.setLayout(null);
					frame.add(p2);
					
					JLabel L1=new JLabel("LOGIN");
					L1.setBounds(200, 50, 300, 40);
					L1.setFont(new Font("Times New Roman",Font.BOLD,35));
					L1.setForeground(darkGreen);
					p2.add(L1);
					L1.setVisible(true);
					
					JLabel L2=new JLabel("Username");
					L2.setBounds(50, 150, 100, 40);
					L2.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L2.setForeground(darkGreen);
					p2.add(L2);
					
					JTextField txtuser=new JTextField();
					txtuser.setBounds(180,160,200,30);
					txtuser.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtuser);
					
					JLabel L3=new JLabel("Password");
					L3.setBounds(50, 250, 100, 40);
					L3.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L3.setForeground(darkGreen);
					p2.add(L3);
					
					JPasswordField txtpass=new JPasswordField();
					txtpass.setBounds(180,250,200,30);
					txtpass.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtpass);
					
					JButton btn=new JButton("Login");
					btn.setBounds(200, 400, 100, 40);
					btn.setFont(new Font("Times New Roman",Font.BOLD,20));
					btn.setForeground(Color.WHITE);
					btn.setBackground(darkGreen);
					p2.add(btn);
					
					
					JLabel L4=new JLabel("<html>HealthCare <br>Pharmacy </html>");
					L4.setBounds(70, 150, 700, 300);
					L4.setFont(new Font("Times New Roman",Font.BOLD,100));
					L4.setForeground(Color.WHITE);
					p1.add(L4);
					
					JRadioButton rbAdmin=new JRadioButton("Admin");
					rbAdmin.setBounds(250, 500, 150, 40);
					rbAdmin.setFont(new Font("Times New Roman",Font.PLAIN,30));
					rbAdmin.setForeground(Color.WHITE);
					rbAdmin.setBackground(darkGreen);
					p1.add(rbAdmin);
					

					JRadioButton rbEmp=new JRadioButton("Employee");
					rbEmp.setBounds(250, 560, 150, 40);
					rbEmp.setFont(new Font("Times New Roman",Font.PLAIN,30));
					rbEmp.setForeground(Color.WHITE);
					rbEmp.setBackground(darkGreen);
					p1.add(rbEmp);
					 
					btn.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							 String username = txtuser.getText();
				             String password = txtpass.getText();
				             
				             if (rbAdmin.isSelected()) {
				            	 if (username.equals("admin") && password.equals("admin")) {
				            		 Menu.main(new String[] {});
										frame.dispose();
				             }
				            	 else {
				            		 JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
				            	 }
				             }
				             else if(rbEmp.isSelected()) {
				            	 String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
									String username1="root";
									String password1="Sathiranga@123";
									
									try {
										Connection connection=DriverManager.getConnection(jdbcUrl,username1,password1);
										java.sql.Statement statement=connection.createStatement();
										
										String searchQuery="SELECT * FROM employee WHERE Username=? AND Password=?";
										PreparedStatement searchStatement=connection.prepareStatement(searchQuery);
										searchStatement.setString(1,username);
										searchStatement.setString(2,password);
										
										
										ResultSet ret=searchStatement.executeQuery();
										
										if(ret.next()) {
											invoice.main(new String[] {});
											frame.dispose();
										}
										else {
											JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
										}
										
										
										
									} catch (Exception e2) {
										// TODO: handle exception
										e2.printStackTrace();
									}
				             }
				             else {
				            	 JOptionPane.showMessageDialog(null, "Please Select User Type");
				             }
							
						}
					});
					
					
					
				

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
