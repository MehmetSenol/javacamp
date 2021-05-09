package com.ödev4_2son.Concrete;

import com.ödev4_2son.Abstracts.GamerService;
import com.ödev4_2son.Entities.Gamer;

public class GamerManager implements GamerService {
    @Override
    public void add(Gamer gamer) {
        System.out.println(gamer.getFirstName()+"adlı oyuncu sisteme eklenmiştir");
    }

    @Override
    public void remove(Gamer gamer) {
        System.out.println(gamer.getFirstName()+"adlı oyuncu sistemden silinmiştir");

    }

    @Override
    public void uptade(Gamer gamer) {
        System.out.println(gamer.getFirstName()+"adlı oyuncu bilgilerini güncellemiştir");

    }
}
