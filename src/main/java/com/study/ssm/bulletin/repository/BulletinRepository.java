package com.study.ssm.bulletin.repository;

import com.study.ssm.bulletin.entity.BulletinBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BulletinRepository extends JpaRepository<BulletinBasicEntity, Long> {
}
