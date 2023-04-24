package com.study.ssm.user.service;

import com.study.ssm.common.repository.CommRepository;
import com.study.ssm.user.entity.UserInfoEntity;
import com.study.ssm.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public boolean login(String userId, String userPassword) {
        UserInfoEntity userInfoEntity = userRepository.findUser(userId, userPassword);

        return userInfoEntity != null;
    }
}
