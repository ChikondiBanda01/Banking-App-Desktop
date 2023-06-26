import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class SelfPay {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		openSelfPay();

	}

	public static void openSelfPay() {
		JFrame frame = new JFrame("SelfPay");
		frame.setBounds(100,100,369,305);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please confirm the following");
		lblNewLabel.setBounds(83, 23, 240, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Account No.:");
		lblNewLabel_1.setBounds(39, 64, 105, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Account Type:");
		lblNewLabel_2.setBounds(39, 96, 69, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Transfer Amount:");
		lblNewLabel_3.setBounds(39, 121, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(136, 61, 115, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Current Account", "Savings Account"}));
		comboBox.setBounds(136, 89, 115, 22);
		frame.getContentPane().add(comboBox);
		
		textField_1 = new JTextField();
		textField_1.setBounds(136, 118, 115, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Transfer");
		btnNewButton.setBounds(105, 210, 115, 35);
		frame.getContentPane().add(btnNewButton);
	}

}
