package com.Odev5.dataAccess.concretes;

import com.Odev5.dataAccess.abstracts.UserDao;
import com.Odev5.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {
    List<User> users=new ArrayList<User>();


    @Override
    public void add(User user) {
        users.add(user);
        System.out.println(user.getFirstName()+" Sisteme Eklendi");

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName()+" Sistemden Silindi");

    }

    @Override
    public void uptade(User user) {
        System.out.println(user.getFirstName()+" Güncellendi");

    }

    @Override
    public User email(String email) {
        List<User> users=getAll();
        if (users!=null){
            for (User user:users){
                if (user.getEmail().equals(email)){
                    return user;
                }
            }
            return null;

        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
