package com.study.ssm.bulletin.service;

import com.study.ssm.bulletin.entity.BulletinBasicEntity;
import com.study.ssm.bulletin.repository.BulletinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class BulletinService {
    @Autowired
    private BulletinRepository bulletinRepository;

    public void insertBulletin(BulletinBasicEntity bulletinBasicEntity, HttpSession session) {
        bulletinBasicEntity.setBulletinWriterName((String) session.getAttribute("userName"));
        bulletinBasicEntity.setBulletinWriterDept((String) session.getAttribute("userDept"));
        bulletinRepository.save(bulletinBasicEntity);
    }

    public List<BulletinBasicEntity> bulletinList() {
        return bulletinRepository.findAll(Sort.by(Sort.Direction.DESC, "bulletinNo"));
    }
}
