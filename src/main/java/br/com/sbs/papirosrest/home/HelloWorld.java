package br.com.sbs.papirosrest.home;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorld {

    @JsonProperty("Message")
    private final String message = "Hello World! Papiros API-Rest application.";

    public HelloWorld() {
    }

}
