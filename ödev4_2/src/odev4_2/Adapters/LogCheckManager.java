package odev4_2.Adapters;

import odev4_2.Entities.Gamer;

public class LogCheckManager implements LogCheckAdapterService {
    private BaseLogCheckService baseLogCheckService;

    public LogCheckManager(BaseLogCheckService baseLogCheckService) {
        this.baseLogCheckService = baseLogCheckService;
    }


    @Override
    public void log(Gamer gamer){
        baseLogCheckService.log(gamer);
    }

}
