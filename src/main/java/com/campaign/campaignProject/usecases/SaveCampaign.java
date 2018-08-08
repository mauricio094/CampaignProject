package com.campaign.campaignProject.usecases;

import com.campaign.campaignProject.domains.Campaign;
import com.campaign.campaignProject.gateways.CampaignGateway;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class SaveCampaign {

    private CampaignGateway campaignGateway;

    public void execute(final Campaign campaign) {
        log.info("saving campaign with name: {}", campaign.getName());
        campaignGateway.save(campaign);
    }

}
