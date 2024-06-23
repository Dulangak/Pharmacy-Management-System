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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Addmedicine extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addmedicine frame = new Addmedicine();
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
					p2.setBounds(30, 70, 720, 650);
					p2.setBackground(Color.WHITE);
					p2.setLayout(null);
					p1.add(p2);
					
					JPanel p3= new JPanel();
					p3.setBounds(790, 70, 720, 650);
					p3.setBackground(Color.WHITE);
					p3.setLayout(null);
					p1.add(p3);
					

					JLabel L1=new JLabel("ADD New MEDICINE");
					L1.setBounds(200, 40, 600, 40);
					L1.setFont(new Font("Times New Roman",Font.BOLD,35));
					Color darkGreen=new Color(60,176,67);
					L1.setForeground(darkGreen);
					p2.add(L1);
					
					JLabel L2=new JLabel("Medicine ID");
					L2.setBounds(40, 200, 100, 40);
					L2.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L2.setForeground(darkGreen);
					p3.add(L2);
					
					
					
					JLabel L3=new JLabel("Medicine Name");
					L3.setBounds(165, 200, 200, 40);
					L3.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L3.setForeground(darkGreen);
					p3.add(L3);
					
					
					
					JLabel L4=new JLabel("Price");
					L4.setBounds(350, 200, 100, 40);
					L4.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L4.setForeground(darkGreen);
					p3.add(L4);
					
										
					JLabel L5=new JLabel("Quantity");
					L5.setBounds(500, 200, 100, 40);
					L5.setFont(new Font("Times New Roman",Font.PLAIN,18));
					L5.setForeground(darkGreen);
					p3.add(L5);
					
					
					
					
					
					JButton btnadd=new JButton("Add");
					btnadd.setBounds(200, 400, 150, 40);
					btnadd.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnadd.setForeground(Color.WHITE);
					btnadd.setBackground(darkGreen);
					p2.add(btnadd);

					JButton btnupdate=new JButton("Update");
					btnupdate.setBounds(100, 400, 150, 40);
					btnupdate.setFont(new Font("Times New Roman",Font.PLAIN,20));
					btnupdate.setForeground(Color.WHITE);
					btnupdate.setBackground(darkGreen);
					p3.add(btnupdate);
					
					
					JButton btndelete=new JButton("Delete");
					btndelete.setBounds(300, 400, 150, 40);
					btndelete.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btndelete.setForeground(Color.WHITE);
					btndelete.setBackground(darkGreen);
					p3.add(btndelete);
					 
					
					JButton btnback=new JButton("Back");
					btnback.setBounds(500, 400, 150, 40);
					btnback.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnback.setForeground(Color.WHITE);
					btnback.setBackground(darkGreen);
					p3.add(btnback);
					 
					
					btnback.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Menu.main(new String[] {});
							frame.dispose();
							
						}
					});

					
					
					
					JTextField txtmed=new JTextField();
					txtmed.setBounds(40,230,100,40);
					txtmed.setFont(new Font("Calibri",Font.PLAIN,18));
					p3.add(txtmed);
					L1.setVisible(true);
					 
					JComboBox<String>combo=new JComboBox<>();
					combo.setBounds(160,230,120,40);
					combo.setFont(new Font("Calibri",Font.PLAIN,18));
					p3.add(combo);
					
					 
					JTextField txtpri=new JTextField();
					txtpri.setBounds(350,230,100,40);
					txtpri.setFont(new Font("Calibri",Font.PLAIN,18));
					p3.add(txtpri);
					L1.setVisible(true);
					
					JTextField txtquan=new JTextField();
					txtquan.setBounds(500,230,100,40);
					txtquan.setFont(new Font("Calibri",Font.PLAIN,18));
					p3.add(txtquan);
					L1.setVisible(true);
					
					
					  
					JLabel L11=new JLabel("UPDATE MEDICINE");
					L11.setBounds(200, 40, 600, 40);
					L11.setFont(new Font("Times New Roman",Font.BOLD,35));
					Color Greenn=new Color(60,176,67);
					L11.setForeground(darkGreen);
					p3.add(L11);
					
					JLabel Lmedi=new JLabel("Medicine ID");
					Lmedi.setBounds(50, 150, 100, 40);
					Lmedi.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lmedi.setForeground(darkGreen);
					p2.add(Lmedi);
					
					JTextField txtId=new JTextField();
					txtId.setBounds(180,160,300,30);
					txtId.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtId);
					L1.setVisible(true);
					
					
					JLabel Lnewmedi=new JLabel("Add new medicine name");
					Lnewmedi.setBounds(0, 200, 200, 40);
					Lnewmedi.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lnewmedi.setForeground(darkGreen);
					p2.add(Lnewmedi);
					
					JTextField txtname=new JTextField();
					txtname.setBounds(180,210,300,30);
					txtname.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtname);
					L1.setVisible(true);
					
					
					JLabel Lquan=new JLabel("Quantity");
					Lquan.setBounds(50, 250, 100, 40);
					Lquan.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lquan.setForeground(darkGreen);
					p2.add(Lquan);
					
					JTextField txtuser2=new JTextField();
					txtuser2.setBounds(180,260,300,30);
					txtuser2.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtuser2);
					L1.setVisible(true);
					
					JLabel Lprice=new JLabel("Price");
					Lprice.setBounds(50, 300, 100, 40);
					Lprice.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lprice.setForeground(darkGreen);
					p2.add(Lprice);
					
					JTextField txtcon=new JTextField();
					txtcon.setBounds(180,310,300,30);
					txtcon.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtcon);

					
					btnadd.addActionListener(new ActionListener() {

                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String Id = txtId.getText();
                            String name = txtname.getText();
                            String quantity = txtuser2.getText();
                            String price = txtcon.getText();
                            
							 if (Id.isEmpty() || name.isEmpty() || quantity.isEmpty() || price.isEmpty() ) {
						            JOptionPane.showMessageDialog(btnadd, "All fields must be filled", "Error", JOptionPane.ERROR_MESSAGE);
						            return;
						        }

                            
                            

                            String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
                            String username1 = "root";
                            String password1 = "Sathiranga@123";

                            try {
                                Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
                                java.sql.Statement statement = connection.createStatement();

                                String insertQuery = "INSERT INTO medicine1 (MedicineId, Name, Qty, Price) VALUES (?, ?, ?, ?)";
                                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

                                insertStatement.setString(1, Id);
                                insertStatement.setString(2, name);
                                insertStatement.setString(3, quantity);
                                insertStatement.setString(4, price);

                                int ret = insertStatement.executeUpdate();
                                JOptionPane.showMessageDialog(btnadd, ret, "New record added", ret);

                                // Add medicine name to combo box
                               // combo.addItem(name);

                                

//                                resultSet.close();
//                                preparedStatement.close();
//                                connection.close();
                                
                                
                                // Clear text fields after adding
                                txtId.setText("");
                                txtname.setText("");
                                txtuser2.setText("");
                                txtcon.setText("");

                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
					 String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
                     String username1 = "root";
                     String password1 = "Sathiranga@123";
                     
                     try {
                    	 Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
                         java.sql.Statement statement = connection.createStatement();

                    	 String query = "SELECT Name FROM medicine1"; // Adjust table and column names
                         PreparedStatement preparedStatement = connection.prepareStatement(query);
                         ResultSet resultSet = preparedStatement.executeQuery();

                         while (resultSet.next()) {
                             String itemName = resultSet.getString("name"); 
                             combo.addItem(itemName);
                         }
     					

						
					} catch (Exception e) {
						// TODO: handle exception
					}

					
					
                    // Add action listener to combo box to populate ID and Price
                    combo.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String selectedMedicine = (String) combo.getSelectedItem();
                            String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
                            String username1 = "root";
                            String password1 = "Sathiranga@123";

                            if (selectedMedicine != null) {
                                try {
                                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
                                    String query = "SELECT MedicineId, Price FROM medicine1 WHERE Name=?";
                                    PreparedStatement preparedStatement = connection.prepareStatement(query);
                                    preparedStatement.setString(1, selectedMedicine);
                                    ResultSet resultSet = preparedStatement.executeQuery();

                                    if (resultSet.next()) {
                                        txtmed.setText(resultSet.getString("MedicineId"));
                                        txtpri.setText(resultSet.getString("Price"));
                                    }
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                            }
                        }
                    });
                    
                    btnupdate.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

							String Id=txtmed.getText();
							String name=(String)combo.getSelectedItem();
							String price= txtpri.getText();
							String quan=txtquan.getText();
							


							String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
							String username1="root";
							String password1= "Sathiranga@123";
			                

			                
			                try {
			                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
			                    String updateQuery = "UPDATE medicine1 SET Name=?,Qty=?,Price=? WHERE MedicineId=?";
			                    PreparedStatement updateStatement = connection.prepareStatement(updateQuery);

			                    updateStatement.setString(1, name);
			                    updateStatement.setString(2, quan);
			                    updateStatement.setString(3, price);
			                    updateStatement.setString(4, Id);
			                    
			                    int rowsUpdated = updateStatement.executeUpdate(); 

			                    updateStatement.close();
			                    connection.close();
			                    
			                    connection.close();

		                    if (rowsUpdated > 0) {
			                        // Data updated successfully, show a message box
			                        JOptionPane.showMessageDialog(btnupdate, "Data Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
			                    } else {
			                        JOptionPane.showMessageDialog(btnupdate, "No data updated. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
		                    }
			                txtmed.setText("");
			                txtpri.setText("");
			                txtquan.setText("");
		                    
							} catch (SQLException e2) {
								// TODO: handle exception
								e2.printStackTrace();
								
							}
                        }
                         
                        
                    });
                    
                    btndelete.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							String Id=txtmed.getText();
							
								    String jdbcUrl="jdbc:mysql://localhost:3306/pharmacy1";
									String username1="root";
									String password1= "Sathiranga@123";
								
									try {
					                    Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
					                    String deleteQuery = "DELETE FROM medicine1 where MedicineId=?";
					                    PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);

					                    deleteStatement.setString(1, Id);

					                    int rowsDeleted= deleteStatement.executeUpdate();

					                    deleteStatement.close();
					                    connection.close();

					                    if (rowsDeleted > 0) {
					                         
					                        JOptionPane.showMessageDialog(btndelete, "Data Deleted Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
					                        
					                        
					                    } else {
					                        JOptionPane.showMessageDialog(btndelete, "No data deleted. Product code not found.", "Error", JOptionPane.ERROR_MESSAGE);
					                    }
					                    
					                    txtmed.setText("");
						                txtpri.setText("");
						                txtquan.setText("");
									
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
