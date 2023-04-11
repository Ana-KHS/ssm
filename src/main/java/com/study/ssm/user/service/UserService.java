package com.study.ssm.user.service;

import com.study.ssm.common.entity.CommEntity;
import com.study.ssm.common.repository.CommRepository;
import com.study.ssm.user.entity.UserBasicEntity;
import com.study.ssm.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CommRepository commRepository;

    public boolean login(String userId, String userPassword) {
        UserBasicEntity userBasicEntity = userRepository.findUser(userId, userPassword);

        return userBasicEntity != null;
    }
}
