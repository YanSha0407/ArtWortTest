package Com.XueQiu;

import org.junit.BeforeClass;
import org.junit.Test;

public class test extends BaseApp{
    @BeforeClass
    public static void beforeClass(){
        BaseApp app = new BaseApp();
        app.setUp();
    }
    @Test
    public void test(){
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.RelativeLayout[4]/android.widget.ImageView").click();
         driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.TextView[1]").click();
         driver.findElementById("com.xueqiu.android:id/login_account").sendKeys("1224894560@qq.com");
         driver.findElementById("com.xueqiu.android:id/login_password").sendKeys("123456");

    }
}
