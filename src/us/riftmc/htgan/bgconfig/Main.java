package us.riftmc.htgan.bgconfig;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Main {
	private static String phoneNumber;
	private static String emailAddress;
	
	public static void main(String[] args) {
		boolean success = (new File("GSM")).mkdir();
		if (!success) {
		    return;
		}
		phoneNumber = (String)JOptionPane.showInputDialog(null, "Enter Mobile Number:\n"
				+ "example > 0415678910", "MMS Recipient",
				JOptionPane.PLAIN_MESSAGE, null, null, "");
		emailAddress = (String)JOptionPane.showInputDialog(null, "Enter Email:", "GPRS Email Recipient",
				JOptionPane.PLAIN_MESSAGE, null, null, "");
		
		try (FileWriter fw = new FileWriter("./GSM/MG983G-30M.TXT", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {

			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(System.currentTimeMillis());
			out.println("[BMCFileMark]");
			out.println("Model=MG983G-30M");
			out.println("[Via WAP Settings]");
			out.println("URL=http://mmsc.telstra.com:8002");
			out.println("APN=telstra.mms");
			out.println("IP=10.1.1.180");
			out.println("Port=80");
			out.println("Account=");
			out.println("Password=");
			out.println("[Via Internet Settings]");
			out.println("GPRSAPN=telstra.internet");
			out.println("GPRSAccount=guest");
			out.println("GPRSPassword=guest");
			out.println("SendEmailServer=smtp.gmail.com");
			out.println("SendEmailPort=465");
			out.println("SendEmailAddr=MG983G30Test@gmail.com");
			out.println("SendEmailPassword=Welcome11111");
			out.println("SMTP SSL=1");
			out.println("[Receive number and receive email]");
			out.println("AdministratorNum=" + phoneNumber);
			out.println("PhoneNum2=" + phoneNumber);
			out.println("PhoneNum3=");
			out.println("PhoneNum4=");
			out.println("ReceiveEmail1=" + emailAddress);
			out.println("ReceiveEmail2=");
			out.println("ReceiveEmail3=");
			out.println("ReceiveEmail4=");
			out.println("[Camera Setting]");
			out.println("Language=0");
			out.println("Camera Mode=0");
			out.println("Security Mode=0");
			out.println("Camera Position=0");
			out.println("Time Lapse=0");
			out.println("PIR Trigger=1");
			out.println("PIR Interval=2");
			out.println("SMS Control=1");
			out.println("Photo Size=0");
			out.println("Photo Burst=0");
			out.println("Video Size=0");
			out.println("Video Length=0");
			out.println("Game Call=0");
			out.println("GameCall Hour=0");
			out.println("GameCall Minute=0");
			out.println("GameCall PlayTime=-1");
			out.println("Clock Year=" + calendar.get(Calendar.YEAR));
			out.println("Clock Month=" + calendar.get(Calendar.MONTH));
			out.println("Clock Day=" + calendar.get(Calendar.DATE));
			out.println("Clock Hour=" + calendar.get(Calendar.HOUR));
			out.println("Clock Minute=" + calendar.get(Calendar.MINUTE));
			out.println("Clock Second=" + calendar.get(Calendar.SECOND));
			out.println("Work Hour=0");
			out.println("Work Hour StartH=0");
			out.println("Work Hour StartM=0");
			out.println("Work Hour StopH=0");
			out.println("Work Hour StopM=0");
			out.println("Work Day=127");
			out.println("Send To=0");
			out.println("Send Mode=2");
			out.println("Max Number=30");
			out.println("DR Time H=0");
			out.println("DR Time M=0");
		} catch (IOException e) {
			// exception handling left as an exercise for the reader
		}

		
		
	}
	
//    static public String ExportResource(String resourceName) throws Exception {
//        InputStream stream = null;
//        OutputStream resStreamOut = null;
//        String jarFolder;
//        try {
//            stream = Main.class.getResourceAsStream(resourceName);//note that each / is a directory down in the "jar tree" been the jar the root of the tree
//            if(stream == null) {
//                throw new Exception("Cannot get resource \"" + resourceName + "\" from Jar file.");
//            }
//
//            int readBytes;
//            byte[] buffer = new byte[4096];
//            jarFolder = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
//            resStreamOut = new FileOutputStream(jarFolder + resourceName);
//            while ((readBytes = stream.read(buffer)) > 0) {
//                resStreamOut.write(buffer, 0, readBytes);
//            }
//        } catch (Exception ex) {
//            throw ex;
//        } finally {
//            stream.close();
//            resStreamOut.close();
//        }
//
//        return jarFolder + resourceName;
//    }
}
