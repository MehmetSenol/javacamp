package odev4_2.Adapters;

import odev4_2.Edevlet.EdevletCheck;
import odev4_2.Entities.Gamer;

public class EdevletCheckManager implements LogCheckAdapterService {
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
