package co.com.choucair.certification.orange.stepdefinitions;

import co.com.choucair.certification.orange.model.GoAllOver;
import co.com.choucair.certification.orange.questions.Answer;
import co.com.choucair.certification.orange.task.OpenThe;
import co.com.choucair.certification.orange.task.Unfold;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class OrangeStepsDefinitions {

    @Given("^that (.*) needs to create an employee at the OrageHR$")
    public void thatJuanNeedsToCreateAnEmployeeAtTheOrageHR(String juan) {
       theActorCalled(juan).wasAbleTo(OpenThe.website());

    }

    @When("^he makes the registration entry in the application$")
    public void heMakesTheRegistrationEntryInTheApplication(List<GoAllOver> goAllOvers) {
        theActorInTheSpotlight().attemptsTo(Unfold.parameter(goAllOvers));
    }

    @Then("^he visualizes the (.*) of a new employee in the application$")
    public void heVisualizesTheIdOfANewEmployeeInTheApplication(String id)  {
        theActorInTheSpotlight().should(seeThat(Answer.toMyQuestion(id)));
    }


}
