
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;

public class AdminMain {
	private static JTable table;

	public static void main(String[] args) {
		openAdminMain();

	}

	public static void openAdminMain() {
		JFrame frame = new JFrame("AdminMain");
		frame.setBounds(100,100,837,481);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome, ");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 24, 358, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("You do not have any Transactions to process at the moment...");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(22, 61, 696, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Transactions");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(248, 98, 226, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Open Account");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_2.setBounds(22, 241, 173, 36);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Close Account");
		btnNewButton_4.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_4.setBounds(22, 189, 173, 36);
		frame.getContentPane().add(btnNewButton_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(248, 135, 550, 167);
		frame.getContentPane().add(scrollPane_1);
		
		table = new JTable();
		scrollPane_1.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Customer ID", "Transaction Type", "Amount Involved (ZMK)", "Account Balance", "Approve"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Float.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(129);
		table.getColumnModel().getColumn(2).setPreferredWidth(129);
		table.getColumnModel().getColumn(3).setPreferredWidth(127);
		table.getColumnModel().getColumn(4).setPreferredWidth(56);
		
		JButton btnNewButton_2_1 = new JButton("Log Out");
		btnNewButton_2_1.setFont(new Font("Arial", Font.BOLD, 13));
		btnNewButton_2_1.setBounds(625, 385, 173, 36);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_4_1 = new JButton("Add Customer");
		btnNewButton_4_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_4_1.setBounds(22, 138, 173, 36);
		frame.getContentPane().add(btnNewButton_4_1);
	}
}
