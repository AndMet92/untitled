import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Startsystem {
    {
        Configuration.baseUrl = "https://expkeeper.intexsoft.by";
    }

    SelenideElement form = $x("//body/app[1]/div[1]/div[1]/ng-component[1]/div[1]/form[1]");
    SelenideElement usernam = $x("//input[@id='username']");
    SelenideElement password = $x("//input[@id='password']");
    SelenideElement login = $x("//button[contains(text(),'Log in')]");
    SelenideElement link = $x("//app-header/div[1]/div[1]/a[1]");
    SelenideElement menu = $x("//app-header/nav[1]/icon[1]/span[1]");


    public void enter() { // Проверка возможности авторизации
        usernam.append("name");
        password.append("pasword");
        login.hover().doubleClick();
    }

    public void buttonlogin() { //Проверка работы кнопки
        login.isEnabled();

    }

    public void valid() { // Проверка наличия валидационного сообщения при неверном логине или пароле
        usernam.setValue("nme");
        password.setValue("asword");
        login.hover().doubleClick();
        form.findElement(By.xpath("//div[contains(text(),'Invalid login')]"));

    }

    public void linkhead() {

        $(byText("v3.11.3")).shouldBe(visible);
        link.shouldHave(href("https://expkeeper.intexsoft.by"));

        link.hover().click();

    }

    public void menuclic() {
        $(By.xpath("//app-header[1]/nav[1]/icon[@class='menu-btn icon icon--medium menu-btn-opened']"));
        menu.click();
        $(By.xpath("//app-header[1]/nav[1]/icon[@class='menu-btn icon icon--medium']"));

    }

}

