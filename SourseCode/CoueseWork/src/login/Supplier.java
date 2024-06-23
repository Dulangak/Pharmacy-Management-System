package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Supplier extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Supplier frame = new Supplier();
					frame.setVisible(true);
					frame.setLayout(null);
					frame.setBounds(0, 1, 1550, 820);
					frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
					frame.setTitle("PHARMACY MANAGEMENT SYSTEM");
					
					
					JPanel p1= new JPanel();
					p1.setBounds(0, 1, 1550, 820);
					Color Green=new Color(60,176,67);
					p1.setBackground(Green);
					p1.setLayout(null);
					frame.add(p1);
					
					JPanel p2= new JPanel();
					p2.setBounds(70, 70, 1400, 650);
					p2.setBackground(Color.WHITE);
					p2.setLayout(null);
					p1.add(p2);
					

					JLabel L1=new JLabel("SUPPLIER REGISTRATION");
					L1.setBounds(450, 40, 600, 40);
					L1.setFont(new Font("Times New Roman",Font.BOLD,35));
					Color darkGreen=new Color(60,176,67);
					L1.setForeground(darkGreen);
					p2.add(L1);
					
					JLabel L2=new JLabel("Supplier ID");
					L2.setBounds(50, 150, 100, 40);
					L2.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L2.setForeground(darkGreen);
					p2.add(L2);
					
					JTextField txtId=new JTextField();
					txtId.setBounds(180,160,300,30);
					txtId.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtId);
					L1.setVisible(true);
					
					
					JLabel L3=new JLabel("Name");
					L3.setBounds(50, 200, 100, 40);
					L3.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L3.setForeground(darkGreen);
					p2.add(L3);
					
					JTextField txtname=new JTextField();
					txtname.setBounds(180,210,300,30);
					txtname.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtname);
					L1.setVisible(true);
					
					
					JLabel L4=new JLabel("Address");
					L4.setBounds(50, 250, 100, 40);
					L4.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L4.setForeground(darkGreen);
					p2.add(L4);
					
					JTextField txtuser2=new JTextField();
					txtuser2.setBounds(180,260,300,30);
					txtuser2.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtuser2);
					L1.setVisible(true);
					
					JLabel L5=new JLabel("Contact No");
					L5.setBounds(50, 300, 100, 40);
					L5.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L5.setForeground(darkGreen);
					p2.add(L5);
					
					JTextField txtcon=new JTextField();
					txtcon.setBounds(180,310,300,30);
					txtcon.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtcon);
					
					
					
					JLabel L7=new JLabel("Company");
					L7.setBounds(750, 150, 100, 40);
					L7.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L7.setForeground(darkGreen);
					p2.add(L7);
					
					JTextField txtuser=new JTextField();
					txtuser.setBounds(850,160,300,30);
					txtuser.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtuser);
					L1.setVisible(true);
					
					
					JLabel L8=new JLabel("Company Address");
					L8.setBounds(700, 200, 150, 40);
					L8.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L8.setForeground(darkGreen);
					p2.add(L8);
					
					JTextField txtpass=new JTextField();
					txtpass.setBounds(850,210,300,30);
					txtpass.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtpass);
					L1.setVisible(true);
					
					JButton btnemployee1=new JButton("Submit");
					btnemployee1.setBounds(130, 500, 150, 40);
					btnemployee1.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnemployee1.setForeground(Color.WHITE);
					btnemployee1.setBackground(darkGreen);
					p2.add(btnemployee1);

					JButton btnemployee2=new JButton("Update");
					btnemployee2.setBounds(350, 500, 150, 40);
					btnemployee2.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnemployee2.setForeground(Color.WHITE);
					btnemployee2.setBackground(darkGreen);
					p2.add(btnemployee2);
					
					
					JButton btnemployee3=new JButton("Delete");
					btnemployee3.setBounds(580, 500, 150, 40);
					btnemployee3.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnemployee3.setForeground(Color.WHITE);
					btnemployee3.setBackground(darkGreen);
					p2.add(btnemployee3);
					
					JButton btnback=new JButton("Back");
					btnback.setBounds(800, 500, 150, 40);
					btnback.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnback.setForeground(Color.WHITE);
					btnback.setBackground(darkGreen);
					p2.add(btnback);
					
					btnback.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Menu.main(new String[] {});
							frame.dispose();
							
						}
					});
					

					
					
					JLabel L9=new JLabel("Supplier ID");
					L9.setBounds(750, 310, 100, 40);
					L9.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L9.setForeground(darkGreen);
					p2.add(L9);
					
					JTextField txt=new JTextField();
					txt.setBounds(850,310,300,40);
					txt.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txt);
					
					JButton btnemployee4=new JButton("Search");
					btnemployee4.setBounds(1150, 310, 150, 40);
					btnemployee4.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnemployee4.setForeground(Color.WHITE);
					btnemployee4.setBackground(darkGreen);
					p2.add(btnemployee4);
					
					btnemployee1.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String Id=txtId.getText();
							String name=txtname.getText();
							String address= txtuser2.getText();
							String contact=txtcon.getText();
							String company=txtuser.getText();
							String companyadd=txtpass.getText();
							int len=contact.length();
							
							 if (Id.isEmpty() || name.isEmpty() || address.isEmpty() || contact.isEmpty() || company.isEmpty()||companyadd.isEmpty()) {
						            JOptionPane.showMessageDialog(btnemployee1, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
						            return;
						            
							 }


							
							
							if(len!=10) {
								JOptionPane.showMessageDialog(btnemployee1," Enter valid mobile number");
								
							}
							
							
							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
							
							try {
								
								Connection connection=DriverManager.getConnection(jdbcUrl, username1, password1);
								java.sql.Statement  statement= connection.createStatement();
								
								String insertQuary="INSERT INTo supplier(idsupplier,Name,Address,Contactno,Company,Companyaddress)VALUES(?,?,?,?,?,?)";
								PreparedStatement insertStatement= connection.prepareStatement(insertQuary);
								
							
								insertStatement.setString(1,Id);
								insertStatement.setString(2,name);
								insertStatement.setString(3,address);
								insertStatement.setString(4,contact);
								insertStatement.setString(5,company);
								insertStatement.setString(6,companyadd);
								int ret=insertStatement.executeUpdate();
								JOptionPane.showMessageDialog(btnemployee1, ret + " New record added", "Success", JOptionPane.INFORMATION_MESSAGE);
								
								txtId.setText(""); // Clear the text field
								txtname.setText(""); 
								txtuser2.setText(""); 
								txtcon.setText("");
								txtuser.setText("");
								txtpass.setText("");
								



 
								
								

					
				


								
							} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
							}
							
						}
					});
					
					btnemployee4.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String id=txt.getText();
							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
							//String Id=txtId.getText;ext();
							//String name=txtname.getText();
							
							

							try {
								Connection connection=DriverManager.getConnection(jdbcUrl, username1, password1);
								java.sql.Statement  statement= connection.createStatement();
								
								String searchQuery="SELECT * FROM supplier WHERE idsupplier=? ";
								PreparedStatement searchStatement=connection.prepareStatement(searchQuery);
								searchStatement.setString(1,id );
								
								
								
								ResultSet ret=searchStatement.executeQuery();
								
								if(ret.next()) {
									txtId.setText(ret.getString("idsupplier"));
					                txtname.setText(ret.getString("Name"));
					                txtuser2.setText(ret.getString("Address"));
					                txtcon.setText(ret.getString("Contactno"));
					                txtuser.setText(ret.getString("Company"));
					                txtpass.setText(ret.getString("Companyaddress"));
					                
					                
								}
								else {
									JOptionPane.showMessageDialog(null, "Incorrect Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
								}

								System.out.println("ResultSet is empty: " + !ret.next());
								
								txt.setText("");

								
							} catch (Exception e2) {
								// TODO: handle exception
								e2.printStackTrace();
							}
							

							
						}
					});
					
					btnemployee2.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							String Id=txtId.getText();
							String name=txtname.getText();
							String address= txtuser2.getText();
							String contact=txtcon.getText();
							String company=txtuser.getText();
							String companyadd=txtpass.getText();


							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
			                

			                
			                try {
			                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
			                    String updateQuery = "UPDATE supplier SET Name=?, Address=?,Contactno=?,Company=?,Companyaddress=?WHERE idsupplier=?";
			                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);

			                    
			                    updateStatement.setString(1, name);
			                    updateStatement.setString(2, address);
			                    updateStatement.setString(3, contact);
			                    updateStatement.setString(4, company);
			                    updateStatement.setString(5, companyadd);
			                    updateStatement.setString(6, Id);





			                    int rowsUpdated =updateStatement.executeUpdate();

			                    		       
			                    		
			                    updateStatement.close();
			                    connection.close();

		                    if (rowsUpdated > 0) {
			                       // Data updated successfully, show a message box
			                        JOptionPane.showMessageDialog(btnemployee2, "Data Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
			                   } else {
			                       JOptionPane.showMessageDialog(btnemployee2, "No data updated. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
		                   }
		                    
		                    txtId.setText("");
		                    txtname.setText("");
		                    txtuser2.setText("");
		                    txtcon.setText("");
		                    txtuser.setText("");
		                    txtpass.setText("");

			                	
							} catch (SQLException e2) {
								// TODO: handle exception
								e2.printStackTrace();
								
							}

							
							
							
							
							
						}
					});
					
					btnemployee3.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String Id=txtId.getText();
					 
									String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
									String username1="root";
									String password1= "Sathiranga@123";
								
									try {
					                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
					                    String deleteQuery = "DELETE FROM supplier where idsupplier=?";
					                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);

					                    deleteStatement.setString(1, Id);
					                    int rowsDeleted = deleteStatement.executeUpdate();

					                    deleteStatement.close();
					                    connection.close();

					                    if (rowsDeleted > 0) {
					                       
					                        JOptionPane.showMessageDialog(btnemployee3, "Data Deleted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
					                        
					                    } else {
					                        JOptionPane.showMessageDialog(btnemployee3, "No data deleted. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
					                    }
					                    
					                    txtId.setText("");
					                    txtname.setText("");
					                    txtuser2.setText("");
					                    txtcon.setText("");
					                    txtuser.setText("");
					                    txtpass.setText("");
//										
									} catch (Exception e2) {
										// TODO: handle exception
										e2.printStackTrace();
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
