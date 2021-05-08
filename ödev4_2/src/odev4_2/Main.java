package odev4_2;

import odev4_2.Adapters.EdevletCheckManager;
import odev4_2.Adapters.LogCheckAdapter;
import odev4_2.Adapters.LogCheckAdapterService;
import odev4_2.Adapters.LogCheckManager;
import odev4_2.Entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"Mehmet","Senol","12345678910","2001","12345","adada");
        Gamer gamer1=new Gamer(1,"Mehmet","Senol","12345678910","2001","12345","adsada");
        LogCheckAdapterService logCheckAdapterService=new LogCheckManager(new LogCheckAdapter(gamer1));
        logCheckAdapterService.log(gamer);
        LogCheckAdapterService logCheckEdevlet=new EdevletCheckManager(gamer);
        logCheckEdevlet.log(gamer1);


    }


}
