package co.com.choucair.certification.orange.task;


import co.com.choucair.certification.orange.userinterface.OpenInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.certification.orange.userinterface.OpenInterface.BOTON_SUBMIT;

public class OpenThe implements Task {
    private OpenInterface openInterface;

    public static Performable website() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(openInterface),
                Click.on(BOTON_SUBMIT)
                );
    }
}
