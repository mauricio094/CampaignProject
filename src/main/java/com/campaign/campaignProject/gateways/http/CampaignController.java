package com.campaign.campaignProject.gateways.http;

import com.campaign.campaignProject.gateways.http.resources.CampaignJson;
import com.campaign.campaignProject.usecases.SaveCampaign;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/campaign")
@AllArgsConstructor
public class CampaignController {

    private SaveCampaign saveCampaign;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createCampaign(@RequestBody final CampaignJson campaignJson) {
        saveCampaign.execute(campaignJson.toDomain());
    }
}
