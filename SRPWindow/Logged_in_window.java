package SRPWindow;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Logged_in_window extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Logged_in_window frame = new Logged_in_window();
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
	public Logged_in_window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 624);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION PORTAL");
		lblNewLabel.setForeground(new Color(102, 255, 51));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(10, 11, 667, 66);
		contentPane.add(lblNewLabel);
		
		JButton Reg_button = new JButton("REGISTER");
		Reg_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Logged_in_window frame = new Logged_in_window();
				frame.dispose();
				Registration_Form r = new Registration_Form();
				r.setVisible(true);
				
			}
		});
		Reg_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Reg_button.setForeground(Color.BLACK);
		Reg_button.setBackground(Color.WHITE);
		Reg_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		Reg_button.setBounds(240, 88, 182, 59);
		contentPane.add(Reg_button);
		
		JButton Show_button = new JButton("SHOW RECORD");
		Show_button.setForeground(Color.BLACK);
		Show_button.setFont(new Font("Tahoma", Font.BOLD, 20));
		Show_button.setBackground(Color.WHITE);
		Show_button.setBounds(240, 175, 193, 59);
		contentPane.add(Show_button);
		
		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(240, 268, 182, 59);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("SEARCH");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(240, 364, 182, 59);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("LOGOUT");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(240, 460, 182, 59);
		contentPane.add(btnNewButton_4);
	}
}
