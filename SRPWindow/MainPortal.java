package SRPWindow;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

public class MainPortal {

	private JFrame frame;
	JTextField txtUsername;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPortal window = new MainPortal();
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
	public MainPortal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 927, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setForeground(new Color(96, 224, 224));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(340, 42, 195, 54);
		frame.getContentPane().add(lblNewLabel);

		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBounds(274, 147, 320, 20);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);

		passwordField = new JPasswordField(10);
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					String Uname = txtUsername.getText();
					char[] Pass = passwordField.getPassword();

					if (Uname.equals("Aditya") && isPasswordCorrect(Pass)) {
						// JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!!");

						frame.dispose();
						Logged_in_window l = new Logged_in_window();
						l.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(passwordField, "INVALID", "", 0);
					}
				}
			}
		});
		passwordField.setBounds(274, 193, 320, 20);
		frame.getContentPane().add(passwordField);

		JButton Login_Button = new JButton("Login");
		Login_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Uname = txtUsername.getText();
				char[] Pass = passwordField.getPassword();

				if (Uname.equals("Aditya") && isPasswordCorrect(Pass)) {
					// JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!!");

					frame.dispose();
					Logged_in_window l = new Logged_in_window();
					l.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(Login_Button, "INVALID", "", 0);
				}

			}
		});

//		passwordField.addKeyListener(new KeyAdapter() {
//			@Override
//			public void keyPressed(KeyEvent e) {
//
//				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//					
//					String Uname = txtUsername.getText();
//					char[] Pass = passwordField.getPassword();
//					
//					if (Uname.equals("Aditya") && isPasswordCorrect(Pass)) {
//						// JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFUL!!!");
//
//						frame.dispose();
//						Logged_in_window l = new Logged_in_window();
//						l.setVisible(true);
//					}
//				} else {
//					JOptionPane.showMessageDialog(Login_Button, "INVALID", "", 0);
//				}
//			}
//		});

		Login_Button.setBackground(UIManager.getColor("Button.darkShadow"));
		Login_Button.setFont(new Font("Tahoma", Font.BOLD, 18));
		Login_Button.setBounds(357, 263, 145, 54);
		frame.getContentPane().add(Login_Button);

	}

	protected boolean isPasswordCorrect(char[] pass) {
		boolean isCorrect = true;
		char[] correctPassword = { '1', '2', '3', '4' };

		if (pass.length != correctPassword.length) {
			isCorrect = false;
		} else {
			isCorrect = Arrays.equals(pass, correctPassword);
		}

		// Zero out the password.
		Arrays.fill(correctPassword, '0');

		return isCorrect;
	}
}
