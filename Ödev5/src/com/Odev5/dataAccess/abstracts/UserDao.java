package com.Odev5.dataAccess.abstracts;

import com.Odev5.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add (User user);
    void delete(User user);
    void uptade(User user);
    User email(String email);
    List<User> getAll();
}
