package com.study.ssm.post.repository;

import com.study.ssm.post.entity.PostBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostBasicEntity, Long> {
    public List<PostBasicEntity> findByDelYnOrderByPostNoDesc(String delYn);

    @Transactional
    @Modifying
    @Query("UPDATE PostBasicEntity p SET p.delYn = 'Y' WHERE p.postNo = :postNo")
    void updateDelYn(@Param("postNo") Long postNo);
}
