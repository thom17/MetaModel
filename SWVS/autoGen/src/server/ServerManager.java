package server;

	/**SM
	RqSM-1:An administrator can open the server only through SM.
	RqSM-1-1:CS can only be run through SM when the server is open.
	RqSM-2:The SM program has a monitoring function.
	RqSM-3:The server supports the update function.
	RqSM-4:When the server is running, the parameters of the server are set through the setting file.
	RqSM-5:Server reset is supported when the server is shut down.
	RqSM-MS-1:The MS logs the status value of the monitoring system to SM log file.
	*/
public class ServerManager
{
	File updateFile;
	File settingFile;
	Flie log;
	MonitoringSystem ms;

	/**UC01
	Server On. If has patch, then Update.
	*/
	public void serverOn()
	{
		//Load the start file. Start file has setting file path and update file path. 		UC01-FL-1
		load(file);

		//Check there is update file.		UC01-FL-2
		checkUpdate();

		// Executes the server based on the setting value.		UC01-FL-3
		launch(file);

		// Run UC01-I1		UC01-FL-4
		ms.runGui(log);

	}

	/**UC01-FL-2
	Load the start file. Start file has setting file path and update file path. 
	@return Initialize Server Manager files.
	*/
	public void loadFile(File file)
	{
	}

}

