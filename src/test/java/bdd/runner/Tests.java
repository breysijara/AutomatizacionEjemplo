package bdd.runner;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.logging.Logger;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {},
        features = "src/test/resources",
        glue = "bdd",
        tags = "@tabla"

)
public class Tests {
    @Test
    public void unnecessaryTest() {
        Logger.getLogger("Tests").info("Is everything ok or not?");
    }

}

