package com.campaign.campaignProject.gateways.mongo;

import com.campaign.campaignProject.domains.Campaign;
import com.campaign.campaignProject.gateways.CampaignGateway;
import com.campaign.campaignProject.gateways.mongo.repositories.CampaignRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CampaignGatewayImpl implements CampaignGateway {

    private CampaignRepository campaignRepository;

    @Override
    public void save(final Campaign campaign) {
        campaignRepository.save(campaign);
    }
}
