package Com.XueQiu;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseApp{
    @BeforeClass
    public static void beforeClass(){
        BaseApp app = new BaseApp();
        app.setUp();
    }
    @Test
    public void login() throws InterruptedException {
          driver.manage().timeouts().implicitlyWait (5, TimeUnit.SECONDS);
          driver.findElementById("com.meishuquanyunxiao.artworld:id/sign_in_with_student").click();
          driver.findElementById("com.meishuquanyunxiao.artworld:id/sign_in_with_sms").click();
          driver.findElementById("com.meishuquanyunxiao.artworld:id/sign_in_phone_et").sendKeys("13001277186");
          driver.findElementById("com.meishuquanyunxiao.artworld:id/sign_in_sms_et").sendKeys("415278");
          driver.findElementById("com.meishuquanyunxiao.artworld:id/sign_in_with_sms_btn").click();
          driver.findElementById("android:id/button1").click();
          driver.findElementById("adCloseBtn").click();
          List<MobileElement> list = driver.findElementsById("com.meishuquanyunxiao.artworld:id/recyclerView");
          list.get(0).click();
          Thread.sleep(3000);
          for (int i =0 ;i< 20;i++){
               swipe(0.5,0.8,0.4,0.4);
          }
//        System.out.println("电量信息------"+ driver.getBatteryInfo()); // 未测试成功
          driver.openNotifications();// 打开通知栏
//          driver.rotate(ScreenOrientation.LANDSCAPE);// 横竖屏切换
//          driver.rotate(ScreenOrientation.PORTRAIT);// 横竖屏切换
          Thread.sleep(3000);
          driver.navigate().back();
          driver.findElementById("com.meishuquanyunxiao.artworld:id/main_home").click();
          driver.findElementByXPath("//*[contains(@text,'\uE412')]").click();
          driver.findElementByXPath("//*[@text='这一刻的想法...']").sendKeys("111111111111111");
          driver.findElementByXPath("//*[@text='\uE163']").click();
//          driver.findElementByXPath("//*[contains(@resource-id,'com.meishuquanyunxiao.artworld:id/main_fragment_container')]/android.widget.ImageView").click();

       /*
       雪球代码
        */
        //   driver.findElementById("cancle").click()
        //    driver.findElementByXPath("//*[contains(@resource-id,'tip_close_left')]");
        //   List<MobileElement> list = driver.findElementsById("com.xueqiu.android:id/tabs");
//          System.out.println("-------------list "+list);
//          MobileElement mobileElement =  list.get(list.size()-1);
//          System.out.println("---------mobileElement "+mobileElement);
//          mobileElement.click();
//          driver.findElementByXPath("//*[contains(@text,'我的')]").click();
//          driver.findElementByXPath("//*[@text='我的']").click();
//          driver.findElementByXPath("//*[@text='登录雪球']").click();
//          driver.findElementById("com.xueqiu.android:id/login_account").sendKeys("1224894560@qq.com");
//          driver.findElementById("com.xueqiu.android:id/login_password").sendKeys("123456");
    }
          public void swipe(Double stratX ,Double startY,Double endX,Double endY) throws InterruptedException {
            TouchAction action =  new TouchAction(driver);
            int scrHeight = driver.manage().window().getSize().getHeight();
            int scrWidth = driver.manage().window().getSize().getWidth();
            Point  point1 = new Point((int)(scrWidth*stratX), (int)(scrHeight*startY));
            Point  point2 = new Point((int)(scrWidth*endX), (int)(scrHeight*endY));
            action.press(PointOption.point(point1)).moveTo(PointOption.point(point2)).release().perform();
            Thread.sleep(1000);
          }

          @Test
          public void testLogs(){
              System.out.println(driver.manage().logs().getAvailableLogTypes());
              for (Object l : driver.manage().logs().get("logcat").getAll().toArray()){
                  System.out.println(l);
              }
          }

    @AfterClass
    public static void afterClass(){
//        driver.quit();
    }
}
