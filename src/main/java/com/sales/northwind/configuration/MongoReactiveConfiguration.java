package com.sales.northwind.configuration;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public class MongoReactiveConfiguration extends AbstractReactiveMongoConfiguration {


    @Value("${spring.data.mongodb.database}")
    private String mongoDatabase;


    @Bean
    public MongoClient mongoClient() {


        return MongoClients.create();
    }

    @Override
    protected String getDatabaseName() {

        return mongoDatabase;
    }

}
