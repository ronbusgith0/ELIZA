//https://youtu.be/I0cb8qXeUIA
//Source for StringBuffer use: https://www.youtube.com/watch?v=loOxCQL4cJc

import java.util.Scanner;

public class ProjectEliza {
	
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			
			PromptBank eliza = new PromptBank();
			eliza.populateQuestionsArray();
			eliza.populateStatementsArray();
			
			String name = "";
			String firstW = "";
			String lastW = "";
			String sentence = "";
			String randomQuest = "";
			String randomState = "";
			
			System.out.println("ELIZA: Hello, my name is Eliza. What is your name? ");
			System.out.print("USER: "); name = keyboard.nextLine();
			
			System.out.println("ELIZA: Hello, " + name + ". Tell me what is on your mind today in one sentence.");
			System.out.print("USER: "); sentence = keyboard.nextLine();
			
			String[] sentenceArr = sentence.split(" ", 0);
			
			if (sentenceArr.length == 1) 
			
			{
				
				firstW = sentenceArr[0];
				lastW = sentenceArr[0];
			}
			
			else 
			{
				firstW = sentenceArr[0];
				lastW = sentenceArr[sentenceArr.length - 1];
			}
			
			randomQuest = eliza.getRandomQuestionTrunk();
			randomQuest = randomQuest.replace("BLANK1", firstW);
			randomQuest = randomQuest.replace("BLANK2", lastW);
			
			System.out.println("ELIZA: " + randomQuest);
			System.out.print("USER: "); sentence = keyboard.nextLine();
			
			while(!sentence.equalsIgnoreCase("EXIT")) {
				
				if (sentence.charAt(sentence.length() - 1) == '?') 
				
				{
						sentenceArr = sentence.split(" ", 0);
				
				
				if (sentenceArr.length == 1) 
				
				{
					firstW = sentenceArr[0];
					lastW = sentenceArr[0];
					
					StringBuffer sbfw = new StringBuffer(firstW);
					sbfw.deleteCharAt(sbfw.length() - 1);
					
					StringBuffer sblw = new StringBuffer(lastW);
					sblw.deleteCharAt(sblw.length() - 1);
					
					randomQuest = eliza.getRandomQuestionTrunk();
					randomQuest = randomQuest.replace("BLANK1", sbfw);
					randomQuest = randomQuest.replace("BLANK2", sblw);
					
				}
				
				else 
				{
					firstW = sentenceArr[0];
					lastW = sentenceArr[sentenceArr.length - 1];
					
					StringBuffer sb = new StringBuffer(lastW);
					sb.deleteCharAt(sb.length() - 1);
					
					randomQuest = eliza.getRandomQuestionTrunk();
					randomQuest = randomQuest.replace("BLANK1", firstW);
					randomQuest = randomQuest.replace("BLANK2", sb);
				}
				
				System.out.println("ELIZA: " + randomQuest);
				System.out.print("USER: "); sentence = keyboard.nextLine();
			}
				
				else if (sentence.charAt(sentence.length() - 1) == '!') 
				
				{
					
						sentenceArr = sentence.split(" ", 0);
			
				if (sentenceArr.length == 1) 
					
				{
					firstW = sentenceArr[0];
					lastW = sentenceArr[0];
					
					StringBuffer sbfw = new StringBuffer(firstW);
					sbfw.deleteCharAt(sbfw.length() - 1);
					
					StringBuffer sblw = new StringBuffer(lastW);
					sblw.deleteCharAt(sblw.length() - 1);
					
					randomState = eliza.getRandomStatementTrunk();
					randomState = randomState.replace("BLANK1", sbfw);
					randomState = randomState.replace("BLANK2", sblw);
					
				}
				
				else 
				{
					firstW = sentenceArr[0];
					lastW = sentenceArr[sentenceArr.length - 1];
					
					StringBuffer sb = new StringBuffer(lastW);
					sb.deleteCharAt(sb.length() - 1);
					
					randomState = eliza.getRandomStatementTrunk();
					randomState = randomState.replace("BLANK1", firstW);
					randomState = randomState.replace("BLANK2", sb);
				}
				
				
				
				System.out.println("Eliza: WOW! DRAMATIC! " + randomState);
				System.out.print("USER: "); sentence = keyboard.nextLine();
		}
		
			else {
		
				sentenceArr = sentence.split(" ", 0);
			
			if (sentenceArr.length == 1) { 
					
				
					firstW = sentenceArr[0];
					lastW = sentenceArr[0];
					
					StringBuffer sbfw = new StringBuffer(firstW);
					sbfw.deleteCharAt(sbfw.length() - 1);
					
					StringBuffer sblw = new StringBuffer(lastW);
					sblw.deleteCharAt(sblw.length() - 1);
					
					randomState = eliza.getRandomStatementTrunk();
					randomState = randomState.replace("BLANK1", sbfw);
					randomState = randomState.replace("BLANK2", sblw);
					
				}
				
				else 
				{
					firstW = sentenceArr[0];
					lastW = sentenceArr[sentenceArr.length - 1];
					
					StringBuffer sb = new StringBuffer(lastW);
					sb.deleteCharAt(sb.length() - 1);
					
					randomState = eliza.getRandomStatementTrunk();
					randomState = randomState.replace("BLANK1", firstW);
					randomState = randomState.replace("BLANK2", sb);
				}
		
				System.out.println("Eliza: " + randomState);
				System.out.print("USER: "); sentence = keyboard.nextLine();
				
		
		}
				
	}
			System.out.println("ELIZA: Do you want to run the session again? ");
			System.out.print("USER: "); String answer = keyboard.nextLine();
			
			if (answer.equalsIgnoreCase("No")) 
			{
				System.out.println("Eliza: Goodbye, until next time");
				System.exit(0);
				
			}
			
		}
	
	}
}



