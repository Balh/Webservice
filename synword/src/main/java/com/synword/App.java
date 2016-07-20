package com.synword;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import synword.resources.WordsResources;
import org.skife.jdbi.v2.DBI;
import io.dropwizard.jdbi.DBIFactory;



public class App extends Application<SynwordConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void initialize(Bootstrap<SynwordConfiguration> b) {
    }

    @Override
    public void run(SynwordConfiguration c, Environment e) throws Exception {
        LOGGER.info("Method App#run() called");
        // Create a DBI factory and build a JDBI instance
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory
                .build(e, c.getDataSourceFactory(), "mysql");
        // Add the resource to the environment
        e.jersey().register(new WordsResources(jdbi));

    }

}
