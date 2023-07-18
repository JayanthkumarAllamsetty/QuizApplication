
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

@SuppressWarnings("serial")
public class FinalScore extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalScore frame = new FinalScore();
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
	public FinalScore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 597);		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Final Score");
		lblNewLabel.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 40));
		lblNewLabel.setBounds(138, 86, 273, 60);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(""+CalcFinalScore() +"/"+ (UserDao.user.getMarks_per_question()*5));
		lblNewLabel_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(180, 187, 184, 172);
		contentPane.add(lblNewLabel_1);
	

	}

	int CalcFinalScore() {
		String[] arr = UserDao.user.getAnswers();
		int sum = 0; // initialize sum 
        int i; 
        int marks_per_question = UserDao.user.getMarks_per_question();
        int[] correct_answers = UserDao.user.getCorrect_answers();
        // Iterate through all elements and add them to sum 
        for (i = 0; i < arr.length; i++) {
        	if(correct_answers[i]==Integer.parseInt(arr[i])) {
        		sum += 1;
        	}
        }
        return sum * marks_per_question;
	}
	
}
