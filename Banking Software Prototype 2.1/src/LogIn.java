import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LogIn {
	private static JTextField textField;
	private static JPasswordField passwordField;

	public static void main(String[] args) {
		openLogIn();

	}

	public static void openLogIn() {
		JFrame frame = new JFrame("LogIn");
		frame.getContentPane().setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel.setBounds(20, 64, 47, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(20, 89, 68, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		textField.setBounds(142, 61, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		passwordField.setBounds(142, 86, 96, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setFont(new Font("Lucida Bright", Font.BOLD, 16));
		btnNewButton.setBounds(101, 117, 111, 41);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100,100,331,251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	

}
