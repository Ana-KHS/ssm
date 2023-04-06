package com.study.ssm.user.entity;

import org.hibernate.annotations.DynamicInsert;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_info")
@DynamicInsert
public class UserInfoEntity {
    @Id
    @Column(name = "user_Id") // 사용자 아이디
    private String userId;

    @Column(name = "user_number") // 사용자 사번
    private String userNumber;
    @Column(name = "user_name") // 사용자 이름
    private String userName;
    @Column(name = "user_email") // 사용자 이메일
    private String userEmail;
    @Column(name = "user_password") // 사용자 비밀번호
    private String userPassword;
    @Column(name = "user_phone") // 사용자 전화번호
    private String userPhone;
    @Column(name = "user_dept") // 사용자 부서
    private String userDept;
    @Column(name = "user_team") // 사용자 팀
    private String userTeam;
    @Column(name = "user_position") // 사용자 직급
    private String userPosition;
    @Column(name = "user_role") // 사용자 역할
    private String userRole;
    @Column(name = "user_join") // 사용자 입사일
    private String userJoin;
    @Column(name = "user_resign") // 사용자 퇴사일, default: "N"
    private String userResign;
}
