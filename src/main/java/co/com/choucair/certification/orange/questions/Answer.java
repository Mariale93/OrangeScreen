package co.com.choucair.certification.orange.questions;

import co.com.choucair.certification.orange.interactions.TiempoDeEspera;

import static co.com.choucair.certification.orange.userinterface.UnfoldMenu.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.orange.userinterface.UnfoldMenu.EMPLOYEE_ID_PAGE;

public class Answer implements Question<Boolean> {
    private String id;

    public Answer(String id) {
        this.id = id;
    }

    public static Answer toMyQuestion(String id) {
        return new Answer(id);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;

        actor.attemptsTo(
                TiempoDeEspera.aMoment(),
                Click.on(PIM),
                Click.on(PIM),
                Click.on(EMPLOYEE_LIST),
                Enter.theValue(id).into(SEEK),
                Click.on(SEARCH)
        );
        String EMPLOYEE_ID = Text.of(EMPLOYEE_ID_PAGE).viewedBy(actor).asString();

        return (id.equals(EMPLOYEE_ID));
    }
}
