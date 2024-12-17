import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] questions = {"Which data structure uses a \"First In, First Out\" (FIFO) principle?",
							  "What is the capital of Australia?",
							  "What is the boiling point of water at standard atmospheric pressure?",
							  "In which year did World War II end?",
							  "Which programming language is known as the \"mother of all languages\"?"};
		String[][] options = {{"1.Stack", "2.Queue", "3.Array", "4.Hash Table"},
							  {"1.Sydney", "2.Canberra", "3.Melbourne", "4.Brisbane"},
							  {"1.90°C", "2.100°C", "3.120°C", "4.80°C"},
							  {"1.1940", "2.1942", "3.1945", "4.1948"},
							  {"1.C", "2.Python", "3.Java", "4.Assembly"}};
		
		int[] answers = {2, 2, 2, 3, 1};
		int score = 0;
		int guess;
		
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************");
		
		for(int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			
			for(String el : options[i]) {
				System.out.println(el);
			}
			
			System.out.print("Enter your answer: ");
			guess = scanner.nextInt();
			
			if(guess == answers[i]) {
				 System.out.println("********");
	             System.out.println("CORRECT!");
	             System.out.println("********");
	             score++;
			}
			else {
				 System.out.println("********");
	             System.out.println("Wrong!");
	             System.out.println("********");
			}
		}
		
		System.out.println("Your final score is: " + score + " out of " + questions.length);
		
		scanner.close();
	}

}
