package com.study.ssm.user.repository;

import com.study.ssm.user.entity.UserBasicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserBasicEntity, String> {
    @Query("SELECT u FROM UserBasicEntity u WHERE u.userId = :userId AND u.userPassword = :userPassword")
    UserBasicEntity findUser(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
