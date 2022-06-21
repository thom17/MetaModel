package default;


	/**	*/
public class MOBILE
{

	/**UC-P2P-SEND-EMAIL
	"An e-mail is composed by a mobile worker.  
Upon selecting to send the e-mail, it is immediately securely sent from the e-mail 
server of the user (and not another server, e.g., operator provided SMTP server).  
A mobile user composes a mobile e-mail.  
The composition of an e-mail can include editing desired messages, attaching 
various files, re-editing any saved drafts, and so forth.  
After choosing to send the e-mail, it is uploaded on the e-mail server of the user and 
immediately and securely sent from the server. 
(and not another server, e.g., operator provided SMTP server)."
	*/
	public void "P2P/CORP,Sendinge-mailsonthego"()
	{
		// User completes composition of an e-mail on mobile client, which includes:		UC-P2P-SEND-EMAIL-FL-1
		completeComposition();

		// User selects to send the e-mail		UC-P2P-SEND-EMAIL-FL-2
		sendEmail(target : Addr);

		// Client connects with e-mail server and uploads the e-mail		UC-P2P-SEND-EMAIL-FL-3
		MOBILE."upLoadEmail(mail : EMail  , target : Addr)";

		// E-mail is sent from e-mail server.		UC-P2P-SEND-EMAIL-FL-4
		MOBILE.sendEmail(target : Addr);

		// Sent e-mail in sent folder is reflected in e-mail sent folder as in 5 (based on 
preference of user or behaviour/settings of e-mail server). 		UC-P2P-SEND-EMAIL-FL-5
		MOBILE.save(mail : EMail);

		// UC-P2P-FILTERING-EMAIL. Other flows may be considered.		UC-P2P-SEND-EMAIL-FL-6
		fiterEmail(mail : EMai);

	}

	/**UC-P2P-SEND-EMAIL-FL-1
	 User completes composition of an e-mail on mobile client, which includes:
	*/
	public void completeComposition()
	{
		// Editing a new desired message.		UC-P2P-SEND-EMAIL-FL-1-1
		MOBILE.editMsg();

		// Attaching various files (document files, media files, 
fully or not fully downloaded files, etc.)		UC-P2P-SEND-EMAIL-FL-1-2
		MOBILE.attachFile(file : File);

		// Re-editing the saved draft		UC-P2P-SEND-EMAIL-FL-1-3
		MOBILE.reEdit();

	}

	/**UC-P2P-SEND-EMAIL-FL-2
	 User selects to send the e-mail
	*/
	public void sendEmail(target : Addr)
	{
	}

	/**UC-P2P-SEND-EMAIL-FL-3
	 Client connects with e-mail server and uploads the e-mail
	*/
	public void "upLoadEmail(mail : EMail  , target : Addr)"
	{
		// Base on settings or preference the e-mail can be queued and sent as soon that 
the connectivity is re-established or the user may be prompted to confirm desire to send them.		UC-P2P-SEND-EMAIL-FL-3-1
		MOBILE.while(!connection());

	}

	/**UC-P2P-SEND-EMAIL-FL-4
	 E-mail is sent from e-mail server.
	*/
	public void sendEmail(target : Addr)
	{
		// E-mail may be saved in a sent folder (based on preference of user or 
behaviour/settings of e-mail server)		UC-P2P-SEND-EMAIL-FL-4-1
		MOBILE.save(mail : EMail);

	}

	/**UC-P2P-SEND-EMAIL-FL-5
	 Sent e-mail in sent folder is reflected in e-mail sent folder as in 5 (based on 
preference of user or behaviour/settings of e-mail server). 
	*/
	public void save(mail : EMail)
	{
	}

	/**UC-P2P-SEND-EMAIL-FL-6
	 UC-P2P-FILTERING-EMAIL. Other flows may be considered.
	@return "Do use case  
UC-P2P-FILTERING-EMAIL."
	*/
	public void fiterEmail(mail : EMai)
	{
	}

}

