package us.riftmc.htgan.bgconfig;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
//	private int phoneNumber;
//	private String emailAddress;
	
	public static void main(String[] args) {
		try {
			String fullPath = ExportResource("/MG983G-30M.TXT");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static ArrayList<String> getClock() {
		ArrayList<String> clock = new ArrayList<String>();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		
		clock.add("Clock Year=" + calendar.get(Calendar.YEAR)+ "\n");
		clock.add("Clock Month=" + calendar.get(Calendar.MONTH)+ "\n");
		clock.add("Clock Day=" + calendar.get(Calendar.DATE)+ "\n");
		clock.add("Clock Hour=" + calendar.get(Calendar.HOUR)+ "\n");
		clock.add("Clock Minute=" + calendar.get(Calendar.MINUTE)+ "\n");
		clock.add("Clock Second=" + calendar.get(Calendar.SECOND)+ "\n");
		
		return clock;
	}
	
    static public String ExportResource(String resourceName) throws Exception {
        InputStream stream = null;
        OutputStream resStreamOut = null;
        String jarFolder;
        try {
            stream = Main.class.getResourceAsStream(resourceName);//note that each / is a directory down in the "jar tree" been the jar the root of the tree
            if(stream == null) {
                throw new Exception("Cannot get resource \"" + resourceName + "\" from Jar file.");
            }

            int readBytes;
            byte[] buffer = new byte[4096];
            jarFolder = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
            resStreamOut = new FileOutputStream(jarFolder + resourceName);
            while ((readBytes = stream.read(buffer)) > 0) {
                resStreamOut.write(buffer, 0, readBytes);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            stream.close();
            resStreamOut.close();
        }

        return jarFolder + resourceName;
    }
}
