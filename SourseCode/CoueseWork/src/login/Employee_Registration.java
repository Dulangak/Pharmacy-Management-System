package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.xml.crypto.Data;

public class Employee_Registration extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_Registration frame = new Employee_Registration();
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
					

					JLabel L1=new JLabel("EMPLOYEE REGISTRATION");
					L1.setBounds(450, 40, 600, 40);
					L1.setFont(new Font("Times New Roman",Font.BOLD,35));
					Color darkGreen=new Color(60,176,67);
					L1.setForeground(darkGreen);
					p2.add(L1);
					
					JLabel L2=new JLabel("Employee ID");
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
					
					JLabel L6=new JLabel("Gender");
					L6.setBounds(50, 360, 100, 40);
					L6.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L6.setForeground(darkGreen);
					p2.add(L6);
					
					JRadioButton radmale = new JRadioButton("Male");
					JRadioButton radfemale = new JRadioButton("Female");
					p2.add(radmale);
					p2.add(radfemale);
					radmale.setBounds(180,360,100,40);
					radmale.setFont(new Font("Times New Roman",Font.PLAIN,18));
					radmale.setForeground(darkGreen);
					
					radfemale.setBounds(280,360,100,40);
					radfemale.setFont(new Font("Times New Roman",Font.PLAIN,18));
					radfemale.setForeground(darkGreen);
					
					JLabel L7=new JLabel("Username");
					L7.setBounds(750, 150, 100, 40);
					L7.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L7.setForeground(darkGreen);
					p2.add(L7);
					
					JTextField txtuser=new JTextField();
					txtuser.setBounds(850,160,300,30);
					txtuser.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtuser);
					L1.setVisible(true);
					
					
					JLabel L8=new JLabel("Password");
					L8.setBounds(750, 200, 100, 40);
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

					JButton btnupdate=new JButton("Update");
					btnupdate.setBounds(350, 500, 150, 40);
					btnupdate.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnupdate.setForeground(Color.WHITE);
					btnupdate.setBackground(darkGreen);
					p2.add(btnupdate);
					
					
					JButton btndelete=new JButton("Delete");
					btndelete.setBounds(580, 500, 150, 40);
					btndelete.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btndelete.setForeground(Color.WHITE);
					btndelete.setBackground(darkGreen);
					p2.add(btndelete);
					
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
					} );
					

					  
					
					
					JLabel L9=new JLabel("Employee ID");
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
							String username= txtuser.getText();
							String password=txtpass.getText();
							int len=contact.length();
							String gender = null;
							
							 if (Id.isEmpty() || name.isEmpty() || address.isEmpty() || username.isEmpty() || password.isEmpty()) {
						            JOptionPane.showMessageDialog(btnemployee1, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
						            return;
						        }

						        if (radmale.isSelected()) {
						            gender = "Male";
						        } else if (radfemale.isSelected()) {
						            gender = "Female";
						        }

						        if (len != 10) {
						            JOptionPane.showMessageDialog(btnemployee1, "Enter a valid 10-digit mobile number", "Error", JOptionPane.ERROR_MESSAGE);
						            return;
						        }

						        String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
						        String username1 = "root";
						        String password1 = "Sathiranga@123";
					       
							try {
								
								Connection connection=DriverManager.getConnection(jdbcUrl, username1, password1);
								java.sql.Statement  statement= connection.createStatement();
								
								String insertQuary="INSERT INTo employee(idemployee,Name,Address,ContactNo,Gender,Username,Password)VALUES(?,?,?,?,?,?,?)";
								PreparedStatement insertStatement= connection.prepareStatement(insertQuary);
								
							
					
								insertStatement.setString(1,Id);
								insertStatement.setString(2,name);
								insertStatement.setString(3,address);
								insertStatement.setString(4,contact);
								insertStatement.setString(5,gender);
								insertStatement.setString(6,username);
								insertStatement.setString(7,password);
								int ret=insertStatement.executeUpdate();
								
								JOptionPane.showMessageDialog(btnemployee1, ret + " New record added", "Success", JOptionPane.INFORMATION_MESSAGE);
								
								txtId.setText("");
								txtname.setText("");
								txtuser.setText("");
								txtcon.setText("");
								txtuser2.setText("");
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
					        String id = txt.getText();
					        String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
					        String username1 = "root";
					        String password1 = "Sathiranga@123";
					        System.out.println("Searching for ID: " + id);
					        System.out.println("actionPerformed called");

					        

					        try {
					            Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
					            String selectQuery = "SELECT * FROM employee WHERE idemployee=?";
					            PreparedStatement selectStatement = connection.prepareStatement(selectQuery);

					            selectStatement.setString(1, id);

					            ResultSet resultSet = selectStatement.executeQuery();

					            if (resultSet.next()) {
					                txtId.setText(resultSet.getString("idemployee"));
					                txtname.setText(resultSet.getString("Name"));
					                txtuser2.setText(resultSet.getString("Address"));
					                txtcon.setText(resultSet.getString("ContactNo"));

					                String gender = resultSet.getString("Gender");
				                if ("Male".equals(gender)) {
					                    radmale.setSelected(true);
					                } else if ("Female".equals(gender)) {
					                    radfemale.setSelected(true);
					                }

					                txtuser.setText(resultSet.getString("Username"));
					                txtpass.setText(resultSet.getString("Password"));
					               
					            } else {
					                JOptionPane.showMessageDialog(btnemployee4, "No matching records found for ID: " + id);
					              
					            }
					           // txtId.setText("");

					            resultSet.close();
					            selectStatement.close();
					            connection.close();
					            
					            txt.setText("");
					            
					            
					        } catch (Exception e2) {
					            e2.printStackTrace();
					           JOptionPane.showMessageDialog(btnemployee4, "Error: " + e2.getMessage());
					        }
					    }
					});
					
					btnupdate.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String Id=txtId.getText();
							String name=txtname.getText();
							String address= txtuser2.getText();
							String contact=txtcon.getText();
							String username= txtuser.getText();
							String password=txtpass.getText();
							int len=contact.length();
							String gender = null;
							
							if(radmale.isSelected()) {
								gender="Male";
							}
							else if(radfemale.isSelected()) {
								gender="Female";
							}
							
							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
							
							try {
			                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
			                    String updateQuery = "UPDATE employee SET Name=?, Address=?,ContactNo=?,Gender=?,Username=?,Password=? WHERE idemployee=?";
			                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);
					            

			                    
			                    updateStatement.setString(1, name);
			                    updateStatement.setString(2, address);
			                    updateStatement.setString(3, contact);
			                    updateStatement.setString(4, gender);
			                    updateStatement.setString(5, username);
			                    updateStatement.setString(6, password);
			                    updateStatement.setString(7, Id);





			                    int rowsUpdated = 
			                    		updateStatement.executeUpdate();

			                    updateStatement.close();
			                    connection.close();

			                    if (rowsUpdated > 0) {
			                         //Data updated successfully, show a message box
			                        JOptionPane.showMessageDialog(btnupdate, "Data Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
			                    } else {
			                        JOptionPane.showMessageDialog(btnupdate, "No data updated. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
			                    }
			                    
			                    txtId.setText("");
			                    txtname.setText("");
			                    txtpass.setText("");
			                    txtcon.setText("");
			                    txtuser.setText("");
			                    txtpass.setText("");
			                    txtuser2.setText("");

								
								
							} catch (Exception e3) {
								// TODO: handle exception
								e3.printStackTrace();
							}
			                 
							
							
						}
					});

					btndelete.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							String Id=txtId.getText();
							
							
							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
							
							
							try {
								
			                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
			                    String deleteQuery = "DELETE FROM employee WHERE idemployee=?";
			                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);

			                    deleteStatement.setString(1, Id);
			                    
			                  int rowsDeleted = deleteStatement.executeUpdate();

			                    deleteStatement.close();
			                    connection.close();

			                    if (rowsDeleted > 0) {
			                        // Data deleted successfully, show a message box
			                        JOptionPane.showMessageDialog(btndelete, "Data Deleted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
			                        
			                    } else {
			                        JOptionPane.showMessageDialog(btndelete, "No data deleted. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
			                    }
			                    
			                    txtcon.setText("");
			                    txtId.setText("");
			                    txtname.setText("");
			                    txtpass.setText("");
			                    txtuser.setText("");
			                    txtuser2.setText("");
			                    

								
								
							} catch (Exception e2) {
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
