import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    @Test
    public void firstTest() {
        open("https://smartacademy.ge/");
        $(byId("search")).setValue("ტესტირების ავტომატიზაციის საფუძვლები").pressEnter();
        sleep(5000);






    }
}
