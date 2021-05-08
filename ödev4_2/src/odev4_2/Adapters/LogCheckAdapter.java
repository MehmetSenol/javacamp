package odev4_2.Adapters;

import odev4_2.Entities.Gamer;

public class LogCheckAdapter implements BaseLogCheckService {
    private Gamer gamer;

    public LogCheckAdapter(Gamer gamer) {
        this.gamer = gamer;
    }


    @Override
    public void log(Gamer gamer) {
        if (this.gamer.getEmail().equals(gamer.getEmail()) && this.gamer.getPassword().equals(gamer.getPassword())){
            System.out.println("Giriş Başarılı: "+gamer.getFirstName());
        }else{
            System.out.println("Giriş Başarısız...");
        }

    }
}
