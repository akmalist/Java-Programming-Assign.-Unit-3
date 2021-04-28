package cs1120;

import javax.swing.JOptionPane;

//main method
public class Quiz {
	// two static member variables
	static int nQuestions = 0;
	static int nCorrect = 0;

	public static void main(String[] args) {
		
		//list of questions  
		String question = "When programming language Java was created?\n";
		question += "A. 1995 \n";
		question += "B. 2001 \n";
		question += "C. 1991 \n";
		question += "D. 1967 \n";
		question += "E. 1987 \n";	
			
			
		String question2 = "When the Bitcoin was invented?\n";
		question2 += "A. 2005 \n";
		question2 += "B. 2009 \n";
		question2 += "C. 2015 \n";
		question2 += "D. 2019 \n";
		question2 += "E. 2010 \n";	
		
			
		String question3 = "What is the biggest plannet in solar system? \n";
		question3 += "A. Mercur \n";
		question3 += "B. Earth \n";
		question3 += "C. Mars \n";
		question3 += "D. Saturn \n";
		question3 += "E. Jupiter \n";
		
		
		//running check method to display question 		
		check(question, "C");
		check(question2, "B");		
		check(question3, "E");
		
		
		// show the number of questions and correct answers
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions ");

	}
	//check for valid answer 
	private static boolean isValidAnswer(String answer) {
		if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")) {
			return true;
		}
		return false;
	}
	
	// ask method that takes a question and return answer in upper case 
	static String ask(String question) {
		String answer = JOptionPane.showInputDialog(question).toUpperCase();
		while(!isValidAnswer(answer)) {
					JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
			answer = ask(question);
		}
		return answer;
	}
	
	// method check that take question and check the correct answer
	static void check(String question, String correctAnswer) {
		// increment questions each time 
		nQuestions ++; 
		String answer = ask(question);		
		if (answer.equals(correctAnswer)) {
			 // increment correct answers for correct answers
			nCorrect ++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+ correctAnswer);
		}
		
	}
	

}
