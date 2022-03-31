package default;


	/**	RQ-3-1:Rq3.1 Context・
	RQ-2:Rq2 Context・
	RQ-3:Rq3 Context・
	RQ-1:Rq1 Context・
	*/
public class TypingSystem
{

	/**UC01
	Players practice typing
	*/
	public null TypingSystem
	{
		// Execute the target file.		UC01-FL-1
		TypingSystem.playTyping();

		// Load the target file		UC01-FL-2
		TypingSystem.loadTarget();

		// Waiting for player's name to start the program.		UC01-FL-3
		TypingSystem.inputName();

		// Time measurement starts when the player's name is entered.		UC01-FL-4
		TypingSystem.checkTime(name);

		// Repeat finding the next non-blank line until the file is typed.		UC01-FL-5
		TypingSystem.typing();

		// Measurement of input keys per minute after measuring the end time.		UC01-FL-6
		TypingSystem.checkTime();

		//Run UC01-1		UC01-FL-7
		TypingSystem.finish();

	}

	/**UC01-FL-1
	 Execute the target file.
	@return 
	*/
	public void playTyping()
	{
		// If there is no parameter, UC01E1 is executed.		UC01-FL-1-1
		TypingSystem.parameterSet();

	}

	/**UC01-FL-2
	 Load the target file
	@return 
	*/
	public void loadTarget()
	{
	}

	/**UC01-FL-3
	 Waiting for player's name to start the program.
	@return 
	*/
	public void inputName()
	{
	}

	/**UC01-FL-4
	 Time measurement starts when the player's name is entered.
	@return 
	*/
	public void checkTime(name)
	{
	}

	/**UC01-FL-5
	 Repeat finding the next non-blank line until the file is typed.
	@return 
	*/
	public void typing()
	{
		// When you have entered all the files, go to the next step.		UC01-FL-5-1
		TypingSystem.checkEnd();

		// If a line is found, it prints it and waits for it to be entered.		UC01-FL-5-2
		TypingSystem.inputLine();

		// Checks for incorrect characters and the number of characters entered while typing.		UC01-FL-5-3
		TypingSystem.checkAns();

		// Find next line.		UC01-FL-5-4
		TypingSystem.getNextLine();

	}

	/**UC01-FL-6
	 Measurement of input keys per minute after measuring the end time.
	@return 
	*/
	public void checkTime()
	{
	}

	/**UC01-FL-7
	Run UC01-1
	@return 
	*/
	public void finish()
	{
	}

}

