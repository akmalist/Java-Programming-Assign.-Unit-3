package cs1120;

//main method
public class Quiz {
	// two static member variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	public static void main(String[] args) {		
		MultipleChoiceQuestion question = new MultipleChoiceQuestion(
				"Which of these countries was NEVER part of the British Empire??",
				"New Zealand",
				"Kenya", 
				"Thailand", 
				"Ireland", 
				"Moscow", 
				"a");

		 
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
				"Which of these U.S. states does NOT border Canada?",
				"Alaska",
				"Maine", 
				"Indiana", 
				"Minnesota", 
				"Washington", 
				"d");

		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(
				"Which of these countries was NOT a part of the Soviet Union?",
				"Ukraine",
				"Georgia", 
				"Usbekistan", 
				"Poland", 
				"Belarus", 
				"d");
		
	 
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(
				"Which of these cities is NOT a national capital?",
				"Sydney",
				"Bankgkok", 
				"New York", 
				"Prague", 
				"Cairo", 
				"a");
	
 
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
				"Which of these cities DOESN'T border the Mediterranean Sea??",
				"Barcelona",
				"Alexandria", 
				"Monaco", 
				"Prague", 
				"Lisbon", 
				"e");
		
		question.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		MultipleChoiceQuestion.showResults();
		
	}
	

}

