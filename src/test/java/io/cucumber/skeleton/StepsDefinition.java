package io.cucumber.skeleton;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sun.jvm.hotspot.ci.ciConstant;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepsDefinition {

    private Consultant consultant;
    private String whereIsConsultant;
    private String isAMemberYet;
    private String logonConsultantPlease;
    private String answer;
    private String validation;

    @Given("Consultant can enter on web {string}")
    public void user_can_enter_on_web(String whereIsConsultant) {

        consultant = new Consultant();
        consultant.consultantIsOn(whereIsConsultant);
        System.out.println("Consultant is on" + whereIsConsultant);

    }

    @When("Consultant completes the formulary system should show the {string} message")
    public void user_completes_the_formulary_system_should_show_the_message(String isAMemberYet) {


        consultant = new Consultant();
        consultant.consultantIsOn(isAMemberYet);
        System.out.println("Consultant is on" + isAMemberYet);

        assertEquals(asList(isAMemberYet),consultant.didConsultantRegister());
    }

    @Then("Consultant is redirected to {string}")
    public void user_is_redirected_to(String logonConsultantPlease) {

        consultant.canConsultantLogon(logonConsultantPlease);
        System.out.println("Consultant is on " + logonConsultantPlease + "and now can login !");
    }

    @When("Consultant completes the Survey and enters it's {string}")
    public void consultant_completes_the_survey_and_enters_it_s(String answer) {

        answer = "It does apply";
        System.out.println(answer);

    }

    @Then("System return {string}")
    public void system_return(String validation) {

        validation = "Your answer is Valid";
        System.out.println(validation);

    }

}
