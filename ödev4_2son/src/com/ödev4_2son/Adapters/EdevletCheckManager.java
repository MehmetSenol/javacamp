package com.ödev4_2son.Adapters;

import com.ödev4_2son.Edevlet.EdevletCheck;
import com.ödev4_2son.Entities.Gamer;

public class EdevletCheckManager implements LogCheckAdapterService{
   private Gamer gamer;

    public EdevletCheckManager(Gamer gamer) {
        this.gamer = gamer;
    }


    @Override
    public void log(Gamer gamer) {
        EdevletCheck edevletCheck=new EdevletCheck(gamer);
        edevletCheck.log(gamer);

    }
}
