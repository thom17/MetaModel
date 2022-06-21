package default;


	/**	RQ-19:RQ-19's desc.
	RQ-33:RQ-33's desc.
	RQ-39:RQ-39's desc.
	RQ-45:RQ-45's desc.
	*/
public class System-deemo
{

	/**play
	UC-1's desc
	*/
	public void playPiano()
	{
		// Actor-1 use flow1() on Sys11		play-FL-1
		System-deemo.flow1();

		// Sys11 do Flow2.		play-FL-2
		System-deemo.flow2();

		// Sys11 do Flow3.		play-FL-3
		System-deemo.flow3();

		// Sys11 do Flow4.		play-FL-4
		System-deemo.flow4();

		// Sys11 do Flow5.		play-FL-5
		System-deemo.flow5();

		// Sys11 do Flow6.		play-FL-6
		System-deemo.flow6();

		// Sys11 do Flow7.		play-FL-7
		System-deemo.flow7();

	}

	/**play-FL-1
	 Actor-1 use flow1() on Sys11
	*/
	public void flow1()
	{
	}

	/**play-FL-2
	 Sys11 do Flow2.
	*/
	public void flow2()
	{
	}

	/**play-FL-3
	 Sys11 do Flow3.
	*/
	public void flow3()
	{
		// Sys11 do Flow3.1		play-FL-3-1
		System-deemo.flow31();

		// E-sd		play-FL-3-2
		System-deemo.flow32();

		// Sys11 do Flow3.3		play-FL-3-3
		System-deemo.flow33();

	}

	/**play-FL-4
	 Sys11 do Flow4.
	*/
	public void flow4()
	{
	}

	/**play-FL-5
	 Sys11 do Flow5.
	@return B
	*/
	public void flow5()
	{
		// Sys11 do Flow5.1		play-FL-5-1
		System-deemo.flow51();

		// Sys11 do Flow5.2		play-FL-5-2
		System-deemo.flow52();

	}

	/**play-FL-6
	 Sys11 do Flow6.
	*/
	public void flow6()
	{
	}

	/**play-FL-7
	 Sys11 do Flow7.
	*/
	public void flow7()
	{
	}

}

