package com.study.ssm.post.entity;

import com.study.ssm.user.entity.UserInfoEntity;
import lombok.Builder;
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
@Table(name = "post_basic")
@NoArgsConstructor
@DynamicInsert
public class PostBasicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_no") // 게시글 번호
    private Long postNo;

    @Column(name = "post_title") // 게시글 제목
    private String postTitle;
    @Column(name = "post_content") // 게시글 내용
    private String postContent;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "post_writer_number")
    //@Column(name = "post_writer_number") // 게시글 작성자 사번
    //private UserInfoEntity userInfoEntity;
    //private String postWriterNumber;
    @Column(name = "post_writer_name") // 게시글 작성자 이름
    private String postWriterName;
    @Column(name = "post_writer_dept") // 게시글 작성자 부서
    private String postWriterDept;
    @Column(name = "post_view") // 게시글 조회수
    private int postView;
    @CreationTimestamp
    @Column(name = "create_date") // 등록일
    private LocalDateTime createDate;
    @UpdateTimestamp
    @Column(name = "modify_date") // 수정일
    private LocalDateTime modifyDate;
    @Column(name = "del_yn") // 삭제여부 default: "N"
    private String delYn;


    @Builder
    public PostBasicEntity(Long postNo, String postTitle, String postContent, String postWriterName, String postWriterDept, int postView, LocalDateTime createDate, LocalDateTime modifyDate, String delYn) {
        this.postNo = postNo;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postWriterName = postWriterName;
        this.postWriterDept = postWriterDept;
        this.postView = postView;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.delYn = delYn;
    }
}
