package Backend.Utils;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        try {
            takeScreenshot();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Attachment(value = "Screenshot",type = "image/png")
    public byte[] takeScreenshot() throws IOException{
        File screenshot = Screenshots.getLastScreenshot();
        return screenshot == null ? null: Files.toByteArray(screenshot);
    }
}
