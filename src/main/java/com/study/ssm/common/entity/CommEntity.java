package com.study.ssm.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "common_cd")
public class CommEntity {
    @Id
    @Column(name = "cd_id")
    private String cdId;

    @Column(name = "cd_name")
    private String cdName;
    @Column(name = "cd_group")
    private String cdGroup;
    @Column(name = "use_yn")
    private String useYn;
}
