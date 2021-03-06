package ru.titaev.crudspringboot.service;

import ru.titaev.crudspringboot.entities.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void createUser(User user);
    User readUser(int id);
    void updateUser(User user);
    void deleteUser(int id);
}
