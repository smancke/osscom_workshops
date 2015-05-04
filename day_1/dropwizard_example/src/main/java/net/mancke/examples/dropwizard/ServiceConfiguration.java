package net.mancke.examples.dropwizard;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

/**
 * Dropwizard main configuration of the service.
 */
public class ServiceConfiguration extends Configuration {

    @JsonProperty
    private int answer;

    public int getAnswer() {
	return answer;
    }
    
    public void setAnswer(int answer) {
	this.answer = answer;
    }    
}
