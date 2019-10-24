package co.com.choucair.certification.orange.task;

import co.com.choucair.certification.orange.interactions.SelectObject;
import co.com.choucair.certification.orange.model.GoAllOver;
import co.com.choucair.certification.orange.util.Variables;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;

import static co.com.choucair.certification.orange.userinterface.UnfoldMenu.*;
import static co.com.choucair.certification.orange.util.Variables.MY_LIST;

public class Unfold implements Task {

    private final List<GoAllOver> goAllOverList;

    public Unfold(List<GoAllOver> goAllOverList) {
        this.goAllOverList = goAllOverList;
    }

    public static Unfold parameter(List<GoAllOver> goAllOvers){
        return Tasks.instrumented(Unfold.class,goAllOvers);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PIM),
                Click.on(ADD_EMPLOYEE),
                Enter.theValue(goAllOverList.get(MY_LIST).getFirst_name()).into(FIRST_NAME),
                Enter.theValue(goAllOverList.get(MY_LIST).getMiddle_name()).into(MIDLE_NAME),
                Enter.theValue(goAllOverList.get(MY_LIST).getLast_name()).into(LAST_NAME),
                Enter.theValue(goAllOverList.get(MY_LIST).getId()).into(ID_USER),
                Click.on(LOCATION),
                SelectObject.fromOptions(SELECT_LOCATION,goAllOverList.get(MY_LIST).getLocation()),
                Click.on(NEXT),
                Enter.theValue(goAllOverList.get(MY_LIST).getOther_id()).into(OTHER_ID),
                Enter.theValue(goAllOverList.get(MY_LIST).getDate_of_birth()).into(DATE_BIRTH),
                Click.on(MARITAL_STATUS),
                SelectObject.fromOptions(STATUS,goAllOverList.get(MY_LIST).getMarital_status()),

                Check.whether(goAllOverList.get(MY_LIST).getGender().trim().equals(Variables.MALE))
                        .andIfSo(Click.on(GENDER_MALE))
                        .otherwise(Click.on(GENDER_FEMALE)),

                Click.on(NATIONALITY),
                SelectObject.fromOptions(SELECT_NATIONALITY,goAllOverList.get(MY_LIST).getNationality()),
                Enter.theValue(goAllOverList.get(MY_LIST).getDrives_license_number()).into(DRIVER_ID),
                Enter.theValue(goAllOverList.get(MY_LIST).getLicense_expiry_date()).into(EXPIRY_DATE),
                Enter.theValue(goAllOverList.get(MY_LIST).getNick_name()).into(NICK_NAME),
                Enter.theValue(goAllOverList.get(MY_LIST).getMilitary_service()).into(MILITAR_SERVICE),

                Check.whether(goAllOverList.get(MY_LIST).getSmoker().trim().equals(Variables.YES))
                        .andIfSo(Click.on(SMOKER)),

                Click.on(SELECT_BLOOD_GROUP),
                SelectObject.fromOptions(BLOOD_GROUP,goAllOverList.get(MY_LIST).getBlood_group()),
                Enter.theValue(goAllOverList.get(MY_LIST).getHobbies()).into(HOBBIES),
                Click.on(NEXT_WINDOW),
                Scroll.to(SCROLL_PAGE),
                Click.on(REGION),
                SelectObject.fromOptions(REGION_SELECTION,goAllOverList.get(MY_LIST).getRegion()),
                Click.on(FTE),
                SelectObject.fromOptions(FTE_SELECTION,goAllOverList.get(MY_LIST).getFte()),
                Click.on(DEPARTMENT),
                SelectObject.fromOptions(DEPARTMENT_SELECTION,goAllOverList.get(MY_LIST).getTemporary_department()),
                Click.on(SAVE)
                );


    }
}
