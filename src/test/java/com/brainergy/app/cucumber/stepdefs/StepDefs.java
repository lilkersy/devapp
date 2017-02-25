package com.brainergy.app.cucumber.stepdefs;

import com.brainergy.app.DevappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = DevappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
