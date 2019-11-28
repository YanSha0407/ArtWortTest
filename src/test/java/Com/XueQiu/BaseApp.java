package Com.XueQiu;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseApp{
    public static AndroidDriver driver;
      public void setUp(){
           DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
           desiredCapabilities.setCapability("deviceName","2PFNW19117022357");
           desiredCapabilities.setCapability("platformName","android");
           desiredCapabilities.setCapability("appPackage","com.meishuquanyunxiao.artworld");
           desiredCapabilities.setCapability("appActivity","com.cloudschool.teacher.phone.activity.SignInActivity");
//           desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"");  // 设置automationName
//           desiredCapabilities.setCapability("unicodeKeyboard","ture");
           URL remoteUrl = null;
          try {
              remoteUrl = new URL("http://localhost:4723/wd/hub");
          } catch (MalformedURLException e) {
              e.printStackTrace();
          }
          driver = new AndroidDriver(remoteUrl,desiredCapabilities);

      }
}
