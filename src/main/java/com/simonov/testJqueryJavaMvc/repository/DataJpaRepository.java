package com.simonov.testJqueryJavaMvc.repository;

import com.simonov.testJqueryJavaMvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DataJpaRepository extends JpaRepository<User, String> {

    @Override
    User findOne(String login);

}
