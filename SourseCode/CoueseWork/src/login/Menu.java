package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
					
					JButton btnEmployee=new JButton("Employee Registration");
					btnEmployee.setBounds(100, 100, 300, 100);
					btnEmployee.setFont(new Font("Times New Roman",Font.BOLD,25));
					btnEmployee.setForeground(Color.WHITE);
					btnEmployee.setBackground(Green);
					p2.add(btnEmployee);
					
										
					JButton btnSupplier=new JButton("Supplier Registration");
					btnSupplier.setBounds(100, 400, 300, 100);
					btnSupplier.setFont(new Font("Times New Roman",Font.BOLD,25));
					btnSupplier.setForeground(Color.WHITE);
					btnSupplier.setBackground(Green);
					p2.add(btnSupplier);
					
					JButton btnmedicine=new JButton("Add Medicine");
					btnmedicine.setBounds(550, 100, 250, 100);
					btnmedicine.setFont(new Font("Times New Roman",Font.BOLD,25));
					btnmedicine.setForeground(Color.WHITE);
					btnmedicine.setBackground(Green);
					p2.add(btnmedicine);
					
					
					
					JButton btninvoice=new JButton("Invoice");
					btninvoice.setBounds(1000, 100, 250, 100);
					btninvoice.setFont(new Font("Times New Roman",Font.BOLD,25));
					btninvoice.setForeground(Color.WHITE);
					btninvoice.setBackground(Green);
					p2.add(btninvoice);
					
					JButton btnexit=new JButton("Exit");
					btnexit.setBounds(550, 400, 250, 100);
					btnexit.setFont(new Font("Times New Roman",Font.BOLD,25));
					btnexit.setForeground(Color.WHITE);
					btnexit.setBackground(Green);
					p2.add(btnexit);
					
					btnEmployee.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Employee_Registration.main(new String[] {});
							frame.dispose();
							
						}
					});
					
					btnSupplier.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							Supplier.main(new String[] {});
							frame.dispose();

							
						}
					});
					
					btnmedicine.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						Addmedicine	.main(new String[] {});
							frame.dispose();


							
						}
					});
					
					btninvoice.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							invoice	.main(new String[] {});
							frame.dispose();


							
						}
					});
					
					btnexit.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							
							Login	.main(new String[] {});
							frame.dispose();

						}
					});
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
