package com.study.ssm.user.service;

import com.study.ssm.user.entity.UserBasicEntity;
import com.study.ssm.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean login(String userId, String userPassword) {
        UserBasicEntity userBasicEntity = userRepository.findUser(userId, userPassword);

        return userBasicEntity != null;
    }
}
