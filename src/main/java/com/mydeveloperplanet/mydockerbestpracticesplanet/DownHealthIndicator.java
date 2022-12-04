package com.mydeveloperplanet.mydockerbestpracticesplanet;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DownHealthIndicator implements HealthIndicator {

    private int counter;

    @Override
    public Health health() {
        counter++;
        Health.Builder status = Health.up();
        if (counter == 5) {
            status = Health.down();
            counter = 0;
        }
        return status.build();
    }
}
