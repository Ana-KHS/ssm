package com.study.ssm.user.repository;

import com.study.ssm.user.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserInfoEntity, String> {
    @Query("SELECT u FROM UserInfoEntity u WHERE u.userId = :userId AND u.userPassword = :userPassword")
    UserInfoEntity findUser(@Param("userId") String userId, @Param("userPassword") String userPassword);
}
