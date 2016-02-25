package ca.uwo.csd.cs2212.team08;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StepsPanel extends JFrame {

	private JPanel contentPane;
	private static final String backImage = "C:/Users/James/courses/team08/src/main/resources/Placeholder.jpg";

	/**
	 * Create the frame.
	 */
	public StepsPanel() {
		setTitle("team08-Fitbit");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1252, 740);
		this.setLocationRelativeTo(null); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel imgBack = new JLabel();
		imgBack.setIcon(new ImageIcon(backImage));
		imgBack.setSize(50, 50);
		imgBack.setLocation(100, 100);
		contentPane.add(imgBack);
		
		/*
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(5, 5, 84, 41);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainScreen main = new MainScreen();
				main.setVisible(true);
				dispose();
			}
		});
		contentPane.setLayout(null);
		btnBack.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnBack);
		*/

		JLabel lblTitle = new JLabel("STEPS");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblTitle.setBounds(491, 21, 133, 70);
		contentPane.add(lblTitle);
		
	}
}
