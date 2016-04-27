package us.riftmc.htgan.bgconfig.camerasettings;

public class SMTPSettings {

	public enum SMTPProvider {
		GMAIL, HOTMAIL, BIGPOND
	}

	private String emailServer;
	private String emailPort;
	private String emailAccount;
	private String emailPassword;
	private boolean ssl;

	public SMTPSettings(SMTPProvider smtpProvider) {
		switch (smtpProvider) {
		default:
			emailServer ="smtp.gmail.com";
			emailPort = "465";
			emailAccount = "MG983G30Test@gmail.com";
			emailPassword = "Welcome11111";
			ssl = true;
			break;
		case GMAIL:
			emailServer ="smtp.gmail.com";
			emailPort = "465";
			emailAccount = "MG983G30Test@gmail.com";
			emailPassword = "Welcome11111";
			ssl = true;
			break;
		case HOTMAIL:
			break;
		case BIGPOND:
			break;
		}
	}

	public String getEmailServer() {
		return emailServer;
	}

	public String getEmailPort() {
		return emailPort;
	}

	public String getEmailAccount() {
		return emailAccount;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public boolean isSsl() {
		return ssl;
	}
	
	
}
