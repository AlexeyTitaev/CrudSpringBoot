package ru.titaev.crudspringboot.dao;

import ru.titaev.crudspringboot.entities.User;

import java.util.List;

public interface UserDAO {
    List<User> allUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
