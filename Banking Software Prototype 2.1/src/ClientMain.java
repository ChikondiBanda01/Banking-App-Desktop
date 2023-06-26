
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class ClientMain {
	private static JTable table;

	public static void main(String[] args) {
		openClientMain();

	}

	public static void openClientMain() {
		JFrame frame = new JFrame("ClientMain");
		frame.setBounds(100,100,837,481);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome, ");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 24, 358, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Your current balance is ");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 61, 240, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Previous Transactions");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(295, 99, 226, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Withdraw");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_2.setBounds(22, 283, 173, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Self-to-Self Transfer");
		btnNewButton_3.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_3.setBounds(22, 142, 173, 36);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Payee");
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_4.setBounds(22, 189, 173, 36);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Make Payment");
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_5.setBounds(22, 236, 173, 36);
		frame.getContentPane().add(btnNewButton_5);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(295, 136, 407, 167);
		frame.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Date", "Time", "Transaction Type", "Amount Involved (ZMK)"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Float.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JButton btnNewButton_2_1 = new JButton("Log Out");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(625, 385, 173, 36);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("Deposit");
		btnNewButton_2_2.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_2_2.setBounds(22, 330, 173, 36);
		frame.getContentPane().add(btnNewButton_2_2);
		table.getColumnModel().getColumn(2).setPreferredWidth(129);
		table.getColumnModel().getColumn(3).setPreferredWidth(127);
	}
}
