import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

public class AddCustomer {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		openAddCustomer();

	}

	public static void openAddCustomer() {
		JFrame frame = new JFrame("AddCustomer");
		frame.setBounds(100,100,498,325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);		
		
		JLabel lblNewLabel = new JLabel("Enter New Customer's details");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(132, 23, 297, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(23, 87, 62, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(23, 112, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("National ID Number:");
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(23, 137, 113, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TPIN:");
		lblNewLabel_4.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(23, 161, 38, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add Customer");
		btnNewButton.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		btnNewButton.setBounds(153, 208, 135, 58);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setText("");
		textField.setBounds(165, 84, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setColumns(10);
		textField_1.setBounds(165, 109, 96, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(165, 134, 96, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setColumns(10);
		textField_3.setBounds(165, 158, 96, 20);
		frame.getContentPane().add(textField_3);
	}

}
