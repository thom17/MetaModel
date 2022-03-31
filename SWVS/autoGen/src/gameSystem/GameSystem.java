package gameSystem;

import gameSystem.Dice;
import gameSystem.Map;

	/**	Rq1:The player plays a dice-based game.
	Rq2:The player checks the score.
	Rq3:The player sets up the map.
MainSys
	Rq1:The player plays a dice-based game.
	Rq2:The player checks the score.
	Rq3:The player sets up the map.
	*/
public class GameSystem
{
	Player[] playerList;
	Dice[] diceList;
	Map map;

	/**UC01_FL01
	Players enter their name and start the game.
	@return Game Start
	*/
	public void playGame(String name)
	{
	}

	/**UC01_FL02
	The system prepares two dice.
	@return Returns/initializes the set two dice.
	*/
	public void diceSetting()
	{
	}

	/**UC01_FL03
	Repeat the details until the game is over.
	@return End of the game.
	*/
	public void main()
	{
		//The player selects a die and rolls it.		UC01_FL03_01
		GameSystem.diceRoll(dice);

		//The player moves by the value of the die.		UC01_FL03_02
		GameSystem.move(dice,player);

	}

	/**UC01_FL04
	The system announces the winner and records the player's score.
	@return Record game scores and print results.
	*/
	public void gameEnd()
	{
	}

	/**UC01_FL03_01
	The player selects a die and rolls it.
	@return Returns the result of the dice.
	*/
	public void diceRoll(Dice dice)
	{
		//Roll the selected die.		UC01_FL03_01_01
		Dice.roll();

	}

	/**UC01_FL03_02
	The player moves by the value of the die.
	@return The player's piece moves by that value.
	*/
	public void move(Dice dice, Player player)
	{
	}

	/**UC02
	Players use the system to show scores.
	*/
	public null printScore()
	{
		//Read the log file.		UC02_FL01
		GameSystem.readRecord();

		//Print the contents of the record.		UC02_FL01
		GameSystem.printRecord();

	}

}

