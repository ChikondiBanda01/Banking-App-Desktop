import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class OpenCloseAccount {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		openAcc();

	}

	public static void openAcc() {
		JFrame frame = new JFrame("AddCustomer");
		frame.setBounds(100,100,498,325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter New Customer's details");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(80, 11, 297, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer ID");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(28, 69, 72, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Account Type");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(28, 96, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Initial Balance");
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(28, 121, 89, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Current Account", "Savings Account"}));
		comboBox.setBounds(147, 92, 125, 22);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		textField.setBounds(147, 66, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		btnNewButton.setBounds(158, 185, 154, 46);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		textField_1.setBounds(147, 118, 125, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnCloseAccount = new JButton("Close Account");
		btnCloseAccount.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		btnCloseAccount.setBounds(158, 231, 154, 46);
		frame.getContentPane().add(btnCloseAccount);
		
	}
}
