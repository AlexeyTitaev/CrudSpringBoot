package ru.titaev.crudspringboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.titaev.crudspringboot.entities.User;

import java.util.List;

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByName(String name);
}
