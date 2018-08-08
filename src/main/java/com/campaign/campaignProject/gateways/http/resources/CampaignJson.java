package com.campaign.campaignProject.gateways.http.resources;

import com.campaign.campaignProject.domains.Campaign;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class CampaignJson {

    @NonNull
    private String name;
    @NonNull
    private String teamId;

    public Campaign toDomain() {
        Campaign campaign = new Campaign();
        campaign.setName(this.name);
        campaign.setTeamId(this.teamId);
        return campaign;
    }
}
