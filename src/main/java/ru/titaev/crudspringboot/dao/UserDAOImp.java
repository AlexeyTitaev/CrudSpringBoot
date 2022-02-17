package ru.titaev.crudspringboot.dao;

import org.springframework.stereotype.Repository;
import ru.titaev.crudspringboot.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public List<User> allUsers() {
        return manager.createQuery("select u from User u",User.class).getResultList();
    }

    @Override
    public void createUser(User user) {
        manager.persist(user);
    }

    @Override
    public User readUser(Long id) {
        return manager.find(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        manager.merge(user);
    }

    @Override
    public void deleteUser(Long id) {
        manager.remove(readUser(id));
    }
}
