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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class invoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					invoice frame = new invoice();
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
					
					JLabel L11=new JLabel("INVOICE");
					L11.setBounds(550, 50, 600, 40);
					L11.setFont(new Font("Times New Roman",Font.BOLD,35));
					Color Greenn=new Color(60,176,67);
					L11.setForeground(Green);
					p2.add(L11);
					
					JLabel Ldate=new JLabel("Date");
					Ldate.setBounds(10, 100, 100, 40);
					Ldate.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Ldate.setForeground(Green);
					p2.add(Ldate);

					JLabel Ltime=new JLabel("Time");
					Ltime.setBounds(10, 150, 100, 40);
					Ltime.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Ltime.setForeground(Green);
					p2.add(Ltime);
					JLabel Lmedid=new JLabel("Medicine Id");
					Lmedid.setBounds(400, 225, 150, 40);
					Lmedid.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lmedid.setForeground(Green);
					p2.add(Lmedid);

					
					JLabel Lmen=new JLabel("Medicine name");
					Lmen.setBounds(600, 225, 150, 40);
					Lmen.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lmen.setForeground(Green);
					p2.add(Lmen);
					
					JLabel Lmedi=new JLabel("Quanty");
					Lmedi.setBounds(1000, 225, 100, 40);
					Lmedi.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lmedi.setForeground(Green);
					p2.add(Lmedi); 
					
					
					JLabel Lunite=new JLabel("Unite price");
					Lunite.setBounds(800, 225, 100, 40);
					Lunite.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lunite.setForeground(Green);
					p2.add(Lunite);
					
					JLabel Ltot=new JLabel("Total");
					Ltot.setBounds(1150, 400, 100, 40);
					Ltot.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Ltot.setForeground(Green);
					p2.add(Ltot);
					
					JLabel Lsubtot=new JLabel("Sub Total");
					Lsubtot.setBounds(1150, 450, 100, 40);
					Lsubtot.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lsubtot.setForeground(Green);
					p2.add(Lsubtot);
					
					JLabel Ldiscount=new JLabel("Discount");
					Ldiscount.setBounds(1150, 500, 100, 40);
					Ldiscount.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Ldiscount.setForeground(Green);
					p2.add(Ldiscount);
					
					JTextField txtdate=new JTextField();
					txtdate.setBounds(95,110,100,30);
					txtdate.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtdate);
					
					JTextField txttime=new JTextField();
					txttime.setBounds(95,160,100,30);
					txttime.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txttime);
					
							
					JComboBox<String>combo=new JComboBox<>();
					combo.setBounds(600,250,150,30);
					combo.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(combo);
					
					JTextField txtquat=new JTextField();
					txtquat.setBounds(1000,250,150,30);
					txtquat.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtquat);
					
					JTextField txtunitpri=new JTextField();
					txtunitpri.setBounds(800,250,150,30);
					txtunitpri.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtunitpri);
					
					JTextField txtmediid=new JTextField();
					txtmediid.setBounds(400,250,150,30);
					txtmediid.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtmediid);
					  
					JButton btnadd=new JButton("Add");
					btnadd.setBounds(1200, 250, 150, 40);
					btnadd.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnadd.setForeground(Color.WHITE);
					btnadd.setBackground(Green);
					p2.add(btnadd);
					
					JButton btnprint=new JButton("Print");
					btnprint.setBounds(500, 450, 150, 40);
					btnprint.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnprint.setForeground(Color.WHITE);
					btnprint.setBackground(Green);
					p2.add(btnprint);
					
					JButton btnexit=new JButton("Exit");
					btnexit.setBounds(700, 450, 150, 40);
					btnexit.setFont(new Font("Times New Roman",Font.PLAIN,25));
					btnexit.setForeground(Color.WHITE);
					btnexit.setBackground(Green);
					p2.add(btnexit);
					
					btnexit.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Login.main(new String[] {});
							frame.dispose();

							
						}
					});
					
					

					
					JTextField txttot=new JTextField();
					txttot.setBounds(1225,410,150,30);
					txttot.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txttot);
					
					JTextField txtsubtot=new JTextField();
					txtsubtot.setBounds(1225,450,150,30);
					txtsubtot.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtsubtot);
					
					JTextField txtdis=new JTextField();
					txtdis.setBounds(1225,500,150,30);
					txtdis.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtdis);
					
					JTextField txtnet=new JTextField();
					txtnet.setBounds(1225,550,150,30);
					txtnet.setFont(new Font("Calibri",Font.PLAIN,18));
					p2.add(txtnet);
					
					JLabel Lnettot=new JLabel("Net Total");
					Lnettot.setBounds(1150, 550, 100, 40);
					Lnettot.setFont(new Font("Times New Roman",Font.PLAIN,18));
					Lnettot.setForeground(Green);
					p2.add(Lnettot);
					
					Date currentDate = new Date();
					 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					 txtdate.setText(dateFormat.format(currentDate));
					 
					 Date currentTime = new Date();
					 SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");
					 txttime.setText(timeFormat.format(currentTime));
					 
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
                             String itemName = resultSet.getString("name"); // Adjust column name
                             combo.addItem(itemName);
                         }
     					

						
					} catch (Exception e) {
						// TODO: handle exception
					}

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
                                         txtmediid.setText(resultSet.getString("MedicineId"));
                                         txtunitpri.setText(resultSet.getString("Price"));
                                     }
                                 } catch (Exception ex) {
                                     ex.printStackTrace();
                                 }
                             }
                         }
                     });
                     
                     
                     btnprint.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
						}
					});
                     
                     btnadd.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							Double price=Double.parseDouble(txtunitpri.getText());
							int qty=Integer.parseInt(txtquat.getText());
							double sub = 0;
							
							
							Double Total=price*qty;
							   sub=sub+Total;
							  double dis;
							 if(sub>10000) {
								 dis=sub*0.05;
							 }
							 else {
								 dis=0.00;
							 }
							 Double net=sub-dis;
							 
							 txttot.setText(Double.toString(Total));
							 txtsubtot.setText(Double.toString(sub));
							 txtdis.setText(Double.toString(dis));
							 txtnet.setText(Double.toString(net));
							
														
							
                            String date = txtdate.getText();
                            String time = txttime.getText();
                            String medId = txtmediid.getText();
                            String name = (String)combo.getSelectedItem();
                            int Qty = Integer.parseInt(txtquat.getText());
                            double Price = Double.parseDouble(txtunitpri.getText());
                            double Tot = Double.parseDouble(txttot.getText());
                            double Sub = Double.parseDouble(txtsubtot.getText());
                            double Dis = Double.parseDouble(txtdis.getText());
                            double Net = Double.parseDouble(txtnet.getText());

                            String jdbcUrl = "jdbc:mysql://localhost:3306/pharmacy1";
                            String username1 = "root";
                            String password1 = "Sathiranga@123";

                            try {
                                Connection connection = DriverManager.getConnection(jdbcUrl, username1, password1);
                                java.sql.Statement statement = connection.createStatement();

                                String insertQuery = "INSERT INTO Invoice (Date,Time,MedicineId,Name,Qty,Unitprice,Total,SubTotal,Discount,NetTotal) VALUES (?, ?, ?, ?,?,?,?,?,?,?)";
                                PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

                                
                                insertStatement.setString(1, date);
                                insertStatement.setString(2, time);
                                insertStatement.setString(3, medId);
                                insertStatement.setString(4, name);
                                insertStatement.setString(5, String.valueOf(Qty));
                                insertStatement.setString(6, String.valueOf(Price));
                                insertStatement.setString(7, String.valueOf(Tot));
                                insertStatement.setString(8, String.valueOf(Sub));
                                insertStatement.setString(9,String.valueOf(Dis));
                                insertStatement.setString(10,String.valueOf(Net));

                                 insertStatement.executeUpdate();
       
                                txtmediid.setText("");
                                txtquat.setText("");
                                txttot.setText("");
                                txtunitpri.setText("");
                                
                                

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
