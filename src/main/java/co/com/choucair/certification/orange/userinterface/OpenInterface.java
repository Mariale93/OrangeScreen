package co.com.choucair.certification.orange.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class OpenInterface extends PageObject {
    public static final Target BOTON_SUBMIT = Target.the("Boton submit")
            .located(By.xpath("//input[@type='submit']"));
}
