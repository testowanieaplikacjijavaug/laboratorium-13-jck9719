package t1.steps;

import jdk.jfr.Name;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import t1.QuadraticFunction;
import static org.junit.jupiter.api.Assertions.*;


public class QuadraticFunctionSteps extends Steps {
    private QuadraticFunction quadraticFunction;

    @Given("Quadratic equation")
    public void givenQuadraticEquation() {
        quadraticFunction = new QuadraticFunction();
    }



    @Then("Got 2 solutions $x1 and $2")
    public void thenGot2Solutions(@Named("x1") double x1, @Named("x2") double x2) {
        quadraticFunction.calc();
        assertAll(
                () -> assertEquals(Math.min(x1, x2), Math.min(quadraticFunction.getX1(), quadraticFunction.getX2()), 0.01),
                () -> assertEquals(Math.max(x1, x2), Math.max(quadraticFunction.getX1(), quadraticFunction.getX2()), 0.01)

        );
    }

    @Then("Got 1 solution $x")
    public void thenGot1Solution(@Named("x") double x) {
        quadraticFunction.calc();
        assertAll(
                () -> assertEquals(x, quadraticFunction.getX1(), 0.01),
                () -> assertEquals(x, quadraticFunction.getX2(), 0.01)
        );
    }

    @Then("Got exception")
    public void thenGotException() {
        assertThrows(Exception.class, () -> quadraticFunction.calc());
    }

    @When("Set values a = $a, b = $b, c = $c")
    public void whenSetValues(@Named("a") double a, @Named("b") double b, @Named("c") double c) {
        quadraticFunction.setA(a);
        quadraticFunction.setB(b);
        quadraticFunction.setC(c);
    }

}
