package stepsDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;


import static pageObjects.BasePage.getDriver;
import static pageObjects.BasePage.tearDown;

public class Base_Steps {

    @BeforeAll
    public static void setUp() {
        getDriver();
    }

    @AfterAll
    public static void cleanUp() {
        tearDown();
    }
}
