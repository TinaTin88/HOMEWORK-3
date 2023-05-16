import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class MyHomeworks {
    @Test
    public void practice_1() {
        // ტესტ მეთოდი #1  - დადებითი მნიშვნელობები:
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Tinatin").shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Iobishvili").shouldNotBe(Condition.empty);
        $(byId("email")).setValue("tiko.iobishvili@gmail.com").shouldNotBe(Condition.empty);
        $(byId("password")).setValue("iobishvilitiko").shouldBe(Condition.visible);
        sleep(5000);
        $(byId("confirmPassword")).setValue("iobishvilitiko").shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.enabled);
        sleep(5000);
    }

    @Test
    public void practice_2() {
        // ტესტ მეთოდი #2 - ნეგატიური მნიშვნელობები:
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        sleep(5000);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        sleep(5000);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("email")).setValue("iobishvilitiko").sendKeys(Keys.ENTER);
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byName("email")).setValue("12345").click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("tiko").click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).setValue("tikot").click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);

    }

    @Test
    public void practice_3() {
        //ტესტ მეთოდი 3
        open("https://ee.ge/");

        $(byClassName("cart-count")).click();
        sleep(5000);
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").sendKeys(Keys.ENTER);
        sleep(5000);
        $(byClassName("fa-shopping-cart")).click();
        sleep(5000);
        $(byClassName("cart-count")).click();
        $(byText("სრული ღირებულება")).shouldBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);
    }

    @Test
    public void practice_4() {
        //ტესტ მეთოდი 4
        open("https://ee.ge/");
        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").sendKeys(Keys.ENTER);
        $(byClassName("fa-shopping-cart")).click();
        $(byClassName("cart-count")).click();
        sleep(5000);
        $(byText("შენახვა")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("ყიდვა")).shouldBe(Condition.visible);
        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);
        $(byText("შენახული ნივთები")).click();
        $(byClassName("fa-times")).click();
        sleep(5000);
        $(byText("ვერ მოიძებნა")).shouldBe(Condition.visible);
    }




}
