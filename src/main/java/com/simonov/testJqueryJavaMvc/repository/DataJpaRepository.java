package com.simonov.testJqueryJavaMvc.repository;

import com.simonov.testJqueryJavaMvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
public interface DataJpaRepository extends JpaRepository<User, String> {

    @Override
    List<User> findAll();

    @Override
    User findOne(String login);

    User findByLogin(String login);

}
