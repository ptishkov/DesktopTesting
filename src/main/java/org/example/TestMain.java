package org.example;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class TestMain {
    public static void main(String[] args) throws MalformedURLException {
        DesktopOptions option = new DesktopOptions();
        option.setApplicationPath("C:/APK/DEVOPS-TESTVM-48/ApkClient master/Client.exe");
        WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);

        driver.quit();
    }
}
