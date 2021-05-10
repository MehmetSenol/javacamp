package com.Odev5.business.abstarcts;

import com.Odev5.entities.concretes.User;

public interface UserService {
    void login(User user);
    void loginWithGoogle(String email,String password);
    void sendVerificationEmail(String email);
    void verifyEmail(int id);

}
