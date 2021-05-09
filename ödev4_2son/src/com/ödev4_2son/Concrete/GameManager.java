package com.ödev4_2son.Concrete;

import com.ödev4_2son.Abstracts.GameService;
import com.ödev4_2son.Entities.Campaign;
import com.ödev4_2son.Entities.Game;
import com.ödev4_2son.Entities.Gamer;

public class GameManager implements GameService {
    @Override
    public void add(Game game, Gamer gamer, Campaign campaign) {
        System.out.println(game.getName()+" adlı oyunu "+gamer.getFirstName()+" adlı oyuncu almıştır "+campaign.getName()+" kanpanyadan yararlanmıştır");
    }

    @Override
    public void remove(Game game) {

    }

    @Override
    public void uptade(Game game) {

    }
}
