
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Question1 extends JFrame {

	private JPanel contentPane;
	JRadioButton rdbtnNewRadioButton , rdbtnOption , rdbtnOption_1 , rdbtnOption_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Question1 frame = new Question1();
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
	public Question1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 597);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Question 1");
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 40));
		lblNewLabel.setBounds(147, 30, 262, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Turn the city into gold above it we will grow ");
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(30, 141, 768, 31);
		contentPane.add(lblNewLabel_1);
		
		rdbtnNewRadioButton = new JRadioButton("Option - 1");
		rdbtnNewRadioButton.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		rdbtnNewRadioButton.setBounds(51, 254, 384, 39);
		contentPane.add(rdbtnNewRadioButton);
		
		rdbtnOption = new JRadioButton("Option - 2");
		rdbtnOption.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		rdbtnOption.setBounds(51, 318, 384, 39);
		contentPane.add(rdbtnOption);
		
		rdbtnOption_1 = new JRadioButton("Option - 3");
		rdbtnOption_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		rdbtnOption_1.setBounds(51, 380, 384, 39);
		contentPane.add(rdbtnOption_1);
		
		rdbtnOption_2 = new JRadioButton("Option - 4");
		rdbtnOption_2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		rdbtnOption_2.setBounds(51, 443, 384, 39);
		contentPane.add(rdbtnOption_2);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(knowSelected()==null) {
					JLabel label = new JLabel("Select atleast one option");
					label.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
					JOptionPane.showMessageDialog(null,label,"ERROR",JOptionPane.WARNING_MESSAGE);
				}
				else {
				UserDao.user.setAnswers(1,knowSelected());
				
				Question2 q2 = new Question2();
				contentPane.setVisible(false);
				q2.setVisible(true);
				}
			}
		});	
		btnNewButton.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		btnNewButton.setBounds(338, 505, 139, 39);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("until we taller than mountains ?");
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 23));
		lblNewLabel_1_1.setBounds(101, 182, 768, 31);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(51, 108, 417, 10);
		contentPane.add(separator);
		
	}
	public String knowSelected() {
		if(rdbtnNewRadioButton.isSelected()) {
			return "1";
		}
		else if(rdbtnOption.isSelected()) {
			return "2";
		}
		else if(rdbtnOption_1.isSelected()) {
			return "3";
		}
		else if(rdbtnOption_2.isSelected()) {
			return "4";
		}
		return null;
	}
}
