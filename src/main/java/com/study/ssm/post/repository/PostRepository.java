package com.study.ssm.post.repository;

import com.study.ssm.post.entity.PostBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostBasicEntity, Long> {
}
