package com.campaign.campaignProject.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.campaign.campaignProject.gateways.mongo.repositories"})
@EnableMongoAuditing
public class MongoDbConfiguration {

}
