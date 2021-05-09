package com.ödev4_2son.Adapters;

import com.ödev4_2son.Entities.Gamer;

public class LogCheckAdaptor implements BaseLogService{
    private Gamer gamer;

    public LogCheckAdaptor(Gamer gamer) {
        this.gamer = gamer;
    }

    @Override
    public void log(Gamer gamer) {
        if (this.gamer.getEmail().equals(gamer.getEmail()) && this.gamer.getPassword().equals(gamer.getPassword())){
            System.out.println(this.gamer.getFirstName()+"Sisteme Giriş Başarılı");
        }else{
            System.out.println("Lütfen Bilgilerinizi Kontrol Ediniz");
        }
    }
}
