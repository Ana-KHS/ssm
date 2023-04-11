package com.study.ssm.common.repository;

import com.study.ssm.common.entity.CommEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommRepository extends JpaRepository<CommEntity, String> {

}
