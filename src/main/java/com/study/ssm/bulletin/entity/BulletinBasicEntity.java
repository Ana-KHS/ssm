package com.study.ssm.bulletin.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "bulletin_basic")
@NoArgsConstructor
@DynamicInsert
public class BulletinBasicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bulletin_no")
    private Long bulletinNo;

    @Column(name = "bulletin_title")
    private String bulletinTitle;
    @Column(name = "bulletin_writer_name")
    private String bulletinWriterName;
    @Column(name = "bulletin_writer_dept")
    private String bulletinWriterDept;
    @Column(name = "bulletin_hits")
    private int bulletinHits;
    @CreationTimestamp
    @Column(name = "bulletin_regist")
    private LocalDateTime bulletinRegist;
    @UpdateTimestamp
    @Column(name = "bulletin_modify")
    private LocalDateTime bulletinModify;
    @Column(name = "del_yn")
    private String delYn;
}
