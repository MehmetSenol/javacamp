package com.ödev4_2son.Concrete;

import com.ödev4_2son.Abstracts.CampaignService;
import com.ödev4_2son.Entities.Campaign;


public class CampaignManacer implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName()+"adlı kampanya eklenmiştir");
    }

    @Override
    public void remove(Campaign campaign) {
        System.out.println(campaign.getName()+"adlı kampanya silinmiştir");

    }

    @Override
    public void uptade(Campaign campaign) {
        System.out.println(campaign.getName()+" adlı kampanya düzenlenmiştir");

    }
}
