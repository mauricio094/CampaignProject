package com.campaign.campaignProject.gateways.mongo.repositories;

import com.campaign.campaignProject.domains.Campaign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends MongoRepository<Campaign, String> {
}
