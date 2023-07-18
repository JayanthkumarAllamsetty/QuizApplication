import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	UserDao userdata = new UserDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 516, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Quiz");
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 40));
		lblNewLabel.setBounds(199, 37, 176, 69);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(60, 222, 400, 51);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel(" ID");
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(215, 142, 229, 82);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(60, 366, 384, 51);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 26));
		lblNewLabel_1_1.setBounds(199, 287, 229, 82);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int id = Integer.parseInt(textField.getText());
				String name = textField_1.getText();
				UserDao.user.setId(id);
				UserDao.user.setName(name);
				frame.dispose();
				Welcome welcomepage = new Welcome();
				welcomepage.lblNewLabel_1.setText(name);
				welcomepage.setVisible(true);
				}
				catch(Exception e1) {
					e1.printStackTrace();
					JLabel label = new JLabel("Id must be a number");
					label.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
					JOptionPane.showMessageDialog(null,label,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 26));
		btnNewButton.setBounds(179, 448, 133, 51);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(60, 130, 400, 17);
		frame.getContentPane().add(separator);
	}
	
}
