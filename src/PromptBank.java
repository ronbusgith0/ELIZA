//https://youtu.be/I0cb8qXeUIA
//Source for StringBuffer use: https://www.youtube.com/watch?v=loOxCQL4cJc

public class PromptBank {

	String [] questions;
	String [] statements;
	
	public PromptBank()
	{
		
		questions = new String [5];
		statements = new String [5];
	}

	public void populateStatementsArray()
	{
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "Let us discuss more about BLANK1 and BLANK2.";
		statements[4] = "BLANK1 looks like it is bothering you, as well as BLANK2. Kindly tell me why.";
	
	}
	
	public void populateQuestionsArray()
	{
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "Would you like to talk about BLANK 1 and BLANK2 some more?";
		questions[4] = "Why does BLANK1 and BLANK2 make you feel that way?";
	}
	
	public String getRandomStatementTrunk() 
	{
		int randomStat = (int) (Math.random() * statements.length - 1);
		return statements [randomStat];
		
	}
	public String getRandomQuestionTrunk() 
	{
		int randomQues = (int) (Math.random() * questions.length - 1);
		return questions [randomQues];
		
	}
	
	
}