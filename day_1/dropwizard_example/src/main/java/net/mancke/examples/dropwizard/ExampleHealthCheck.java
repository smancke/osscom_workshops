package net.mancke.examples.dropwizard;

import com.codahale.metrics.health.HealthCheck;

/**
 * Simple demo health check
 *
 * @author smancke
 */
public class ExampleHealthCheck extends HealthCheck {

    @Override
    protected Result check() {
	return Result.healthy("I'm ok ..");
	//return Result.unhealthy("error accessing Osiam");
    }
}
