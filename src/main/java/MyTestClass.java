/**
 * Created by Papko on 31.03.2016.
 */
public class MyTestClass {
    public static void main(){

    }

    public static void testMail(){
        WebDriver driver = new FirefoxDriver();
        WebDriver driver2 = new ChromeDriver();
        driver.get("https://google.com");
        driver.findElement(".//*[@id='sb_ifc0']");
        driver.sendKeys("a@b.ru");
        driver.close();
    }

}
