package com.Odev5.business.concretes;

import com.Odev5.business.abstarcts.UserCheckService;
import com.Odev5.dataAccess.abstracts.UserDao;
import com.Odev5.entities.concretes.User;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCheckManager implements UserCheckService {
    private  UserDao userDao;





    @Override
    public boolean checkFirstName(String firstName) {
        if (firstName.length()>=2){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkLastName(String lastName) {
        if (lastName.length()>=2){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkEmail(String email, UserDao userDao) {
        String regrex="^(.+)@(.+)$";
        Pattern pattern=Pattern.compile(regrex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public boolean checkPassword(String password) {
        if (password.length()>=6){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkEmailUsed(String email) {
        List<User>users=userDao.getAll();
        for (User user:users){
            if (user.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }
}
