import java.util.StringJoiner;

public class User {
		private String name;
		private int id;
		private String[] answers = {null,null,null,null,null};
		private int[] correct_answers = {1,2,3,4,4};
		private int marks_per_question = 5;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String[] getAnswers() {
			return answers;
		}
		public void setAnswers(int number,String answer) {
			this.answers[number-1] = answer;
		}
		
		public String getAnswer() {
			return ArrayToString(getAnswers());
		}
		
		public String ArrayToString(String[] stringArray) {
			StringJoiner joiner = new StringJoiner("");
		      for(int i = 0; i < stringArray.length; i++) {
		         joiner.add(stringArray[i]);
		      }
		    return joiner.toString();
		}
		public int[] getCorrect_answers() {
			return correct_answers;
		}
		public void setCorrect_answers(int[] correct_answers) {
			this.correct_answers = correct_answers;
		}
		public int getMarks_per_question() {
			return marks_per_question;
		}
		public void setMarks_per_question(int marks_per_question) {
			this.marks_per_question = marks_per_question;
		}
}
