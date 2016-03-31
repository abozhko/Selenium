/**
 * Created by Papko on 31.03.2016.
 */
public interface WebDriver {

    void get(String url);
    void sendKeys(String text);
    void click();
    void findElement(String xpath);
    void close();
    void quite();

}
