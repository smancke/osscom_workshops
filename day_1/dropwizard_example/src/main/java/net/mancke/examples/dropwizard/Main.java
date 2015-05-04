package net.mancke.examples.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Main class of the example service.
 */
public class Main extends Application<ServiceConfiguration> {

    @Override
    public String getName() {
        return "Example Service";
    }

    /**
     * startup with the parameter java -jar serice.jar server config.yaml.
     *
     * @param args the commandline args
     */
    public static void main(final String[] args) {
        try {
            new Main().run(args);
        } catch (final Exception e) {
            System.out.println("Error while startup");
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Initialisation of the service.
     *
     * @param bootstrap The Dropwizard Bootstrap Instance
     */
    @Override
    public void initialize(final Bootstrap<ServiceConfiguration> bootstrap) {
	// here is the place for loading extension bundles
	
    }

    /**
     * The run method does the essential service configuration. Here we add all
     * Resources, Management Classes and HealthChecks.
     *
     * @param configuration the configuration
     * @param environment   the dropwizard environment
     */
    @Override
    public void run(final ServiceConfiguration configuration,
                    final Environment environment) throws Exception {

        environment.healthChecks().register("Demo Health check", new ExampleHealthCheck());
        environment.jersey().register(new ExampleResource(configuration));
    }
}
