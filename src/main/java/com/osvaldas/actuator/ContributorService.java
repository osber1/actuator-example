package com.osvaldas.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class ContributorService implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("Info", Collections.singletonMap("Custom key", "Custom value"));
    }
}
