package us.riftmc.htgan.bgconfig;

import us.riftmc.htgan.bgconfig.camerasettings.APNSettings;
import us.riftmc.htgan.bgconfig.camerasettings.APNSettings.Provider;
import us.riftmc.htgan.bgconfig.camerasettings.SMTPSettings;
import us.riftmc.htgan.bgconfig.camerasettings.SMTPSettings.SMTPProvider;

public class Camera {
	private String model;
	private Provider provider;
	private String phoneNumber;
	private String emailAddress;
	
	public Camera(String model, Provider provider, String phoneNumber, String emailAddress) {
		super();
		this.model = model;
		this.provider = provider;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	private APNSettings wapSetting = new APNSettings(Provider.TELSTRA);
	private SMTPSettings smtpSetting = new SMTPSettings(SMTPProvider.GMAIL);
	
}
