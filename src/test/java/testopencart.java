import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class testopencart {
    private WebDriver chromeDriver;

    @Test
    public void hacer_una_busqueda() {
        // encontrar el archivo exe de chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hermosa\\Downloads\\opencart\\opencart\\src\\test\\resources\\chromedriver.exe");

        // creamos opciones sobre nuestro driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-extensions");
        options.addArguments("--no-sandbox");

        // nueva instancia de chrome driver
        chromeDriver = new ChromeDriver(options);

        // definimos un tiempo de espera hasta que aceptemos un timeout

        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Abrir una url
        chromeDriver.get("http://opencart.abstracta.us/");

        // Encontrar e interactuar con elementos
        // Ingresar texto en el buscador
        chromeDriver.findElement(By.name("search")).sendKeys("Mac");


        chromeDriver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(),'MacBook Pro')]")).click();
        chromeDriver.findElement(By.id("button-cart")).click();
        chromeDriver.findElement(By.name("search")).clear();
        chromeDriver.findElement(By.name("search")).sendKeys("Iphone");
        chromeDriver.findElement(By.xpath("//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")).click();
        chromeDriver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
        chromeDriver.findElement(By.xpath("//button[@id='button-cart']")).click();
        chromeDriver.findElement(By.xpath("//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[5]/a[1]")).click();
        chromeDriver.findElement(By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")).click();
        chromeDriver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("loismind1024@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("12345678");
        chromeDriver.findElement(By.xpath("//input[@id='button-account']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("Luis");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("Medina");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-email']")).sendKeys("loismind1024@gmail.com");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-telephone']")).sendKeys("593998679280");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("Mena2");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Quito");
        chromeDriver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("593");
        WebElement countryDropdown = chromeDriver.findElement(By.xpath("//select[@id='input-payment-country']"));
        // Crea un objeto Select
        Select select = new Select(countryDropdown);
        select.selectByValue("62");

        WebElement countryDropdownzone = chromeDriver.findElement(By.xpath("//select[@id='input-payment-zone']"));
        // Crea un objeto Select
        Select select2 = new Select(countryDropdownzone);
        select2.selectByValue("997");
        JavascriptExecutor js = (JavascriptExecutor) chromeDriver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");


        // Espera explícita para el botón "Continuar como invitado"
        WebDriverWait wait = new WebDriverWait(chromeDriver, 10);
        WebElement buttonGuest = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='button-guest']")));

        // Simular clic utilizando acciones
        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(buttonGuest).click().perform();

        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        chromeDriver.findElement(By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/p[4]/textarea[1]")).sendKeys("12345678");
        chromeDriver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
        chromeDriver.findElement(By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[3]/div[1]/input[1]")).click();
        chromeDriver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
        JavascriptExecutor js2 = (JavascriptExecutor) chromeDriver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        chromeDriver.findElement(By.xpath("//input[@id='button-confirm']")).click();

        //chromeDriver.quit();

}
}
