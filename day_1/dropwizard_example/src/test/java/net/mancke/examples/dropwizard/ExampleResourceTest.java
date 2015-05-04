package net.mancke.examples.dropwizard;


import io.dropwizard.testing.junit.DropwizardAppRule;

import org.springframework.web.client.RestTemplate;
import org.junit.ClassRule;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExampleResourceTest {

    @ClassRule
    public static final DropwizardAppRule<ServiceConfiguration> RULE =
            new DropwizardAppRule<ServiceConfiguration>(Main.class, "config.yaml");
    
    @Test 
    public void sayHello() {
		RestTemplate restTemplate = new RestTemplate();
		Person person =  new Person();
		person.setName("Sebastian");
		String response = restTemplate.postForObject("http://127.0.0.1:8080/hello", person, String.class);
		assertThat(response).isEqualTo("Hello Sebastian");	
    }
}
