package com.Odev5.business.abstarcts;

import com.Odev5.dataAccess.abstracts.UserDao;

public interface UserCheckService {
    boolean checkFirstName(String firstName);
    boolean checkLastName(String lastName);
    boolean checkEmail(String email, UserDao userDao);
    boolean checkPassword(String password);
    boolean checkEmailUsed(String email);
}
