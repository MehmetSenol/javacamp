package com.ödev4_2son.Adapters;

import com.ödev4_2son.Entities.Campaign;
import com.ödev4_2son.Entities.Gamer;

public class LogCheckManager implements LogCheckAdapterService{
    private BaseLogService baseLogService;

    public LogCheckManager(BaseLogService baseLogService) {
        this.baseLogService = baseLogService;
    }

    @Override
    public void log(Gamer gamer) {
        baseLogService.log(gamer);

    }


}
