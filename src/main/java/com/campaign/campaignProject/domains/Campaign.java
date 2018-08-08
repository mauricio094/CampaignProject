package com.campaign.campaignProject.domains;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "campaigns")
@TypeAlias("Campaigns")
public class Campaign {
    @Id
    @Indexed
    private String name;
    private String teamId;
}
