import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;

public class ast extends Startsystem {
    Startsystem startsystem = new Startsystem();

    @BeforeClass
    public static void keeper() {
        //URL удаленного веб-драйвера
        Configuration.remote = "http://selenoid.intexsoft.by:4444/wd/hub/";

        //Определяем какой браузер использовать
        Configuration.browser = "chrome";
        //Размер окна браузера
        Configuration.browserSize = "1920x1080";
        //Создаём объект класса DesiredCapabilities, используются как настройка вашей конфигурации с помощью пары ключ-значение.
        DesiredCapabilities capabilities = new DesiredCapabilities();
        // Включить поддержку отображения экрана браузера во время выполнения теста
        capabilities.setCapability("enableVNC", true);
        //Включение записи видео в процессе выполнения тестов
        capabilities.setCapability("enableVideo", true);
        //Переопределяем Browser capabilities
        capabilities.setCapability("enableLog", true);
        Configuration.browserCapabilities = capabilities;
        //Property baseurl, которое находится в классе Configuration и будет являтся базовым url
        baseUrl = "https://expkeeper.intexsoft.by";
        open("/");
    }

    @Before
    public void befor() {
        open("/");
        System.out.println("START TEST");
    }


    @Test
    public void enter() {
        startsystem.enter();

    }

    @Test
    public void testvalid() {
        startsystem.valid();
    }

    @Test
    public void testlogin() {
        startsystem.buttonlogin();
    }

    @Test
    public void testlink() {
        startsystem.linkhead();

    }

    @Test
    public void testmenu() {
        startsystem.menuclic();
    }
}
