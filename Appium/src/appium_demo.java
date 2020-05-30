import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class appium_demo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f = new File("src");// create an object of file class with src file name
		File fs = new File(f,"app-debug.apk");// pass that object to new file object with apk name(apk of app for testing)
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "virtual");
	
	dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());//pass fs object to give the location of the app we want to test
	AndroidDriver <AndroidElement> adriver = new AndroidDriver<> (new URL("http://127.0.0.1:4723/wd/hub"),dc);
	
	
	}

}
