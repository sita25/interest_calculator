package com.spring.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculateInterest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateInterest frame = new CalculateInterest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateInterest() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Principal:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(50, 34, 80, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Time:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(50, 81, 80, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblRate = new JLabel("Rate:");
		lblRate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRate.setBounds(50, 128, 80, 36);
		contentPane.add(lblRate);
		
		textField = new JTextField();
		textField.setForeground(Color.LIGHT_GRAY);
		textField.setBounds(140, 44, 132, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setForeground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		textField_1.setBounds(140, 138, 132, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setForeground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		textField_2.setBounds(140, 91, 132, 26);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("invalid number !");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(150, 69, 80, 14);
		lblNewLabel_2.setVisible(false);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("invalid number !");
		lblNewLabel_2_1.setForeground(Color.RED);
		lblNewLabel_2_1.setBounds(159, 115, 80, 14);
		lblNewLabel_2_1.setVisible(false);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("invalid number !");
		lblNewLabel_2_2.setForeground(Color.RED);
		lblNewLabel_2_2.setBounds(161, 163, 80, 14);
		lblNewLabel_2_2.setVisible(false);
		contentPane.add(lblNewLabel_2_2);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				lblNewLabel_2.setVisible(true);
				
				//checking valid integer using regex

				String p1=textField.getText();
				String t1=textField_2.getText();
				String r1=textField_1.getText();
				if(!p1.matches("[0-9]+")) {
					lblNewLabel_2.setVisible(true);
				}
				else {
					lblNewLabel_2.setVisible(false);
				}
				if(!t1.matches("[0-9]+")) {
					lblNewLabel_2_1.setVisible(true);
				}
				else {
					lblNewLabel_2_1.setVisible(false);
				}
				if(!r1.matches("[0-9]+")) {
					lblNewLabel_2_2.setVisible(true);
				}
				else {
					lblNewLabel_2_2.setVisible(false);
				}
				if(p1.matches("[0-9]+") && t1.matches("[0-9]+") && r1.matches("[0-9]+")) {
					int p=Integer.parseInt(textField.getText());
					int t=Integer.parseInt(textField_2.getText());
					int r=Integer.parseInt(textField_1.getText());
					int si=(p*t*r)/100;
					int a=p+si;
					textField_3.setText(Integer.toString(si));
					textField_4.setText(Integer.toString(a));
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(140, 192, 140, 26);
		contentPane.add(btnNewButton);
		
		JLabel lblSimpleInterest = new JLabel("Simple Interest:");
		lblSimpleInterest.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSimpleInterest.setBounds(30, 231, 119, 36);
		contentPane.add(lblSimpleInterest);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAmount.setBounds(30, 279, 80, 36);
		contentPane.add(lblAmount);
		
		textField_3 = new JTextField();
		textField_3.setForeground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		textField_3.setBounds(159, 241, 132, 26);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setForeground(Color.LIGHT_GRAY);
		textField_4.setColumns(10);
		textField_4.setBounds(159, 289, 132, 26);
		contentPane.add(textField_4);
		

	}
}
