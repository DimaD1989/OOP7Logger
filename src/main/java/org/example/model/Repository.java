package org.example.model;

import java.util.List;

public interface Repositiry {
    List<User> getAllUsers();
    String createUsers(User user);
    void updateUsers(User user);
    void  deleteById(String inputId);

}
