package com.ödev4_2son.Abstracts;

import com.ödev4_2son.Entities.Campaign;
import com.ödev4_2son.Entities.Game;
import com.ödev4_2son.Entities.Gamer;

public interface GameService {
    void add(Game game, Gamer gamer, Campaign campaign);
    void remove(Game game);
    void uptade(Game game);
}
