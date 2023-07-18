import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Welcome extends JFrame {

	private JPanel contentPane;
	JLabel lblNewLabel_1;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 45));
		lblNewLabel.setBounds(129, 54, 191, 54);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(148, 175, 331, 61);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton = new JButton("Start ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Question1 q1 = new Question1();
				q1.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 30));
		btnNewButton.setBounds(117, 384, 235, 54);
		contentPane.add(btnNewButton);
		
	}
	public Welcome(User user){
		UserDao.user = user;
		lblNewLabel_1.setText(user.getName());
	}

}
