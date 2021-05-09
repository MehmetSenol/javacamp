package com.ödev4_2son.Edevlet;

import com.ödev4_2son.Entities.Gamer;

public class EdevletCheck {
    private Gamer gamer;

    public EdevletCheck(Gamer gamer) {
        this.gamer = gamer;
    }
    public void log(Gamer gamer){
        if (this.gamer.getnationaltyID().equals(gamer.getnationaltyID()) && this.gamer.getDateOfBirth().equals(gamer.getDateOfBirth())){
            System.out.println("Edevlet ile doğrulandı");
        }else{
            System.out.println("Doğrulanamadı");
        }
    }
}
