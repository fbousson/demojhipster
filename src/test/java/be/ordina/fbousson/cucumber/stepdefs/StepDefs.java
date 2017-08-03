package be.ordina.fbousson.cucumber.stepdefs;

import be.ordina.fbousson.FreddydemoApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = FreddydemoApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
