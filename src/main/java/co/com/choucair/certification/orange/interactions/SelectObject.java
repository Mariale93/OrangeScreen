package co.com.choucair.certification.orange.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class SelectObject implements Interaction {
    public Target list;
    public String option;

    public SelectObject(Target list, String option) {
        this.list=list;
        this.option=option;
    }

    public static SelectObject fromOptions(Target list, String option){
        return new SelectObject(list,option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObject = list.resolveAllFor(actor);
        listObject.size();
        for (int i=0; i<listObject.size(); i++) {
            if (listObject.get(i).getText().trim().equals(option)) {
                listObject.get(i).click();
                break;
            }
        }
    }
}

