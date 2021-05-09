package com.ödev4_2son;

import com.ödev4_2son.Adapters.EdevletCheckManager;
import com.ödev4_2son.Adapters.LogCheckAdapterService;
import com.ödev4_2son.Adapters.LogCheckAdaptor;
import com.ödev4_2son.Adapters.LogCheckManager;
import com.ödev4_2son.Entities.Gamer;

public class Main {

    public static void main(String[] args) {
        Gamer gamer=new Gamer(1,"Mehmet","Senol","12345678910","2001","12345","abca");
        Gamer gamer1=new Gamer(1,"Mehmet","Senol","12345678910","2001","12345","abca");
        LogCheckAdapterService logCheckAdapterService=new LogCheckManager(new LogCheckAdaptor(gamer));
        logCheckAdapterService.log(gamer1);
        LogCheckAdapterService logCheckAdapterService1=new EdevletCheckManager(gamer);
        logCheckAdapterService1.log(gamer1);


    }
}
