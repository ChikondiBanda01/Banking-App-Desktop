import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	public static void main(String[] args) {
		openWelcome();

	}
	
	public static void openWelcome() {
		JFrame frame = new JFrame("Welcome");
		frame.setBounds(100,100,493,277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BANKING SYSTEM");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 20));
		lblNewLabel.setBounds(136, 11, 201, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please tell us who you are logging in as");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(100, 63, 279, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("CLIENT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				LogIn logIn = new LogIn();
				logIn.openLogIn();
			}
		});
		btnNewButton.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		btnNewButton.setBounds(179, 126, 118, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADMIN");
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		btnNewButton_1.setBounds(179, 169, 118, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		
		frame.setVisible(true);
		
	}

}
