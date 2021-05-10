package com.Odev5.business.concretes;

import com.Odev5.JGoogleLog.GoogleLogin;
import com.Odev5.business.abstarcts.UserCheckService;
import com.Odev5.business.abstarcts.UserService;
import com.Odev5.core.abstracts.GoogleService;
import com.Odev5.dataAccess.abstracts.UserDao;
import com.Odev5.entities.concretes.User;



import java.util.ArrayList;
import java.util.List;


public class UserManager implements UserService {
    private UserDao userDao;
    private UserCheckService userCheckService;
    private GoogleService googleService;
    List<User> users= new ArrayList<User>();

    public UserManager(UserDao userDao, UserCheckService userCheckService, GoogleService googleService, GoogleLogin googleLogin) {
        this.userDao = userDao;
        this.userCheckService = userCheckService;
        this.googleService = googleService;
    }

    @Override
    public void login(User user) {
        if (!userCheckService.checkEmail(user.getEmail(),userDao) || user.getEmail()==null){
            System.out.println("Geçerli bir mail giriniz");
        }else if(!userCheckService.checkFirstName(user.getFirstName()) || user.getFirstName()==null){
            System.out.println("İsim 2 karakterden az olamaz");
        }else if(!userCheckService.checkPassword(user.getPassword()) || user.getPassword()==null){
            System.out.println("Parola en az 6 karakterden oluşmalı");
        }else if(!userCheckService.checkPassword(user.getPassword()) || user.getPassword()==null){
            System.out.println("Bu mail kullanılmaktadır");
        }else{
            userDao.add(user);
            System.out.println("Kayıt Başarılı");
            sendVerificationEmail(user.getEmail());
        }

    }

    @Override
    public void loginWithGoogle(String email, String password) {
        googleService.googleLoginToSystem(email,password);

    }

    @Override
    public void sendVerificationEmail(String email) {
        int verifyingCode=2323;
        System.out.println("Doğrulama Kodu Gönderildi");
        System.out.println("Doğrulama kodu: "+verifyingCode);
        verifyEmail(verifyingCode);

    }

    @Override
    public void verifyEmail(int id) {





    }
}
