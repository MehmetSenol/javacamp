package odev4_2.Edevlet;

import odev4_2.Entities.Gamer;

public class EdevletCheck {
    private Gamer gamer;
    public EdevletCheck(Gamer gamer) {
        this.gamer = gamer;
    }


    public void log(Gamer gamer){

        if (this.gamer.getFirstName().equals(gamer.getFirstName())
                && this.gamer.getnationaltyID().equals(gamer.getnationaltyID())){
            System.out.println("Edevlet ile giriş başarılı...");

        }
        else {
            System.out.println("sg");
        }

    }

}
