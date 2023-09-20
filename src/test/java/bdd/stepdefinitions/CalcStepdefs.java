package bdd.stepdefinitions;

import bdd.step.CalculadoraStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CalcStepdefs {
    @Steps
    private CalculadoraStep calculadoraStep;

   
    @Given("que me encuentro en la página de testsheepn")
    public void queMeEncuentroEnLaPáginaDeTestsheepn() throws InterruptedException {
        calculadoraStep.cargarPagina();
    }




    @When("^se ingresa el primer valor First number \"([^\"]*)\" y Second number \"([^\"]*)\" y \"([^\"]*)\"$")
    public void seIngresaElPrimerValorFirstNumberYSecondNumberY(String arg0, String arg1, String arg2) throws Throwable {
        calculadoraStep.tabla(arg0, arg1,arg2);
    }



    @Then("^se valida el resultado \"([^\"]*)\"$")
    public void seValidaElResultado(String arg0) {
        calculadoraStep.validarResultado(arg0);
    }


}
