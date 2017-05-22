package com.simonov.testJqueryJavaMvc.repository;

import com.simonov.testJqueryJavaMvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private DataJpaRepository repository;

    public User get(String login) {
        return repository.findOne(login);
    }
}
