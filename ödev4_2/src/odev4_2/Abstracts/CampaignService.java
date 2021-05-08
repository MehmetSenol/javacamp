package odev4_2.Abstracts;

import odev4_2.Entities.Campaign;

public interface CampaignService {
    void discount(Campaign campaign);
    void add(Campaign campaign);
    void remove(Campaign campaign);
}
