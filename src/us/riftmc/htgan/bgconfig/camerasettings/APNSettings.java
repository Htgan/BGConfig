package us.riftmc.htgan.bgconfig.camerasettings;

public class APNSettings {
	
	public enum Provider {
		TELSTRA,
		OPTUS,
		ALDIMOBILE,
		BOOST,
		AMAYSIM,
		VODAFONE
	}
	
	private String wapURL;
	private String wapAPN;
	private String wapIP;
	private int wapPort;
	private String wapAccount;
	private String wapPassword;
	private String gprsAPN;
	private String gprsAccount;
	private String gprsPassword;
	
	public APNSettings(Provider provider) {
		switch(provider) {
			default:
				wapURL = "http://mmsc.telstra.com:8002";
				wapAPN = "telstra.mms";
				wapIP = "10.1.1.180";
				wapPort = 80;
				wapAccount = "";
				wapPassword = "";
				gprsAPN = "telstra.internet";
				gprsAccount = "guest";
				gprsPassword = "guest";
				break;
			case TELSTRA:
				wapURL = "http://mmsc.telstra.com:8002";
				wapAPN = "telstra.mms";
				wapIP = "10.1.1.180";
				wapPort = 80;
				wapAccount = "";
				wapPassword = "";
				gprsAPN = "telstra.internet";
				gprsAccount = "guest";
				gprsPassword = "guest";
				break;
			case OPTUS:
				wapURL = "http://mmsc.optus.com:8002";
				wapAPN = "mms";
				wapIP = "61.88.190.10";
				wapPort = 8070;
				wapAccount = "";
				wapPassword = "";
				gprsAPN = "internet";
				gprsAccount = "";
				gprsPassword = "";
				break;
			case ALDIMOBILE:
				wapURL = "http://mmsc.mdata.net.au:8003";
				wapAPN = "mdata.net.au";
				wapIP = "10.1.1.180";
				wapPort = 80;
				wapAccount = "";
				wapPassword = "";
				gprsAPN = "mdata.net.au";
				gprsAccount = "";
				gprsPassword = "";
				break;
		}
	}

	public String getWapURL() {
		return wapURL;
	}

	public String getWapAPN() {
		return wapAPN;
	}

	public String getWapIP() {
		return wapIP;
	}

	public int getWapPort() {
		return wapPort;
	}

	public String getWapAccount() {
		return wapAccount;
	}

	public String getWapPassword() {
		return wapPassword;
	}

	public String getGprsAPN() {
		return gprsAPN;
	}

	public String getGprsAccount() {
		return gprsAccount;
	}

	public String getGprsPassword() {
		return gprsPassword;
	}
	
	
	
}
