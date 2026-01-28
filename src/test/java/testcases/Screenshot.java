package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Screenshot {


        WebDriver driver;

        @BeforeTest
        @Parameters({"browser"})
        void setup(String br)
        {
            switch (br)
            {
                case "chrome":driver=new ChromeDriver();break;
                case "edge":driver=new EdgeDriver();break;
            }



    }
}
