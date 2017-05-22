package com.simonov.testJqueryJavaMvc.service;

import com.simonov.testJqueryJavaMvc.model.User;
import com.simonov.testJqueryJavaMvc.repository.UserRepository;
import com.simonov.testJqueryJavaMvc.exception.UsernameNotFoundException;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserRepository repository;

    public User loadUser(String login, String psw) throws UsernameNotFoundException {
        User u = repository.get(login);
        String sha1HexPsw = DigestUtils.sha1Hex(psw);

        if (u == null || !u.getPassword().equals(sha1HexPsw)) {
            throw new UsernameNotFoundException("User: " + login + " password: " + psw + " is not found");
        }
        return u;
    }

}
