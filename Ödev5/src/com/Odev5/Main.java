package com.Odev5;

import com.Odev5.JGoogleLog.GoogleLogin;
import com.Odev5.business.abstarcts.UserService;
import com.Odev5.business.concretes.UserCheckManager;
import com.Odev5.business.concretes.UserManager;
import com.Odev5.core.cocnretes.GoogleLoginManager;
import com.Odev5.dataAccess.concretes.HibernateUserDao;
import com.Odev5.entities.concretes.User;



public class Main {

    public static void main(String[] args) {
        User user= new User("Mehmet","Senol","mehmet.enol23@gmail.com","123456");
        UserService userService=new UserManager(new HibernateUserDao(),new UserCheckManager(),new GoogleLoginManager(),new GoogleLogin());
        userService.login(user);



    }
}
