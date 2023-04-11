package com.study.ssm.common.service;

import com.study.ssm.common.entity.CommEntity;
import com.study.ssm.common.repository.CommRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommService {
    @Autowired
    private CommRepository commRepository;

    public List<CommEntity> getCodeList() {
        return commRepository.findAll();
    }
}
