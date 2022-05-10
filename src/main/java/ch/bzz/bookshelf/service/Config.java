package ch.bzz.bookshelf.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * configure the web services and properties
 */

@ApplicationPath("/resource")

public class Config extends Application {

    Properties properties;

    @Override
    public Set<Class<?>> getClasses() {
        HashSet providers = new HashSet<Class<?>>();
        providers.add(TestService.class);
        return providers;
    }
}