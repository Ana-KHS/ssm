package com.study.ssm.user.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "user_basic")
@NoArgsConstructor
public class UserBasicEntity {
    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_number")
    private String userNumber;
    @Column(name = "user_dept")
    private String userDept;
}
