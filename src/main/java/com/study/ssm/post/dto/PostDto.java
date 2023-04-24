/*
package com.study.ssm.post.dto;

import com.study.ssm.post.entity.PostBasicEntity;
import lombok.Builder;
import lombok.Getter;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Getter
public class PostDto {
    private Long postNo;
    private String postTitle;
    private String postContent;
    private String postWriterNumber;
    private String postWriterName;
    private String postWriterDept;
    private int postView;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private String delYn;


    public PostBasicEntity toEntity() {
        return PostBasicEntity.builder()
                .postNo(postNo)
                .postTitle(postTitle)
                .postContent(postContent)
                //.postWriterNumber(postWriterNumber)
                .postWriterName(postWriterName)
                .postWriterDept(postWriterDept)
                .postView(postView)
                .createDate(createDate)
                .modifyDate(modifyDate)
                .delYn(delYn)
                .build();
    }

    @Builder
    public PostDto(PostBasicEntity postBasicEntity, HttpSession session) {
        this.postNo = postBasicEntity.getPostNo();
        this.postTitle = postBasicEntity.getPostTitle();
        this.postContent = postBasicEntity.getPostContent();
        //this.postWriterNumber = postBasicEntity.getUserInfoEntity().getUserNumber();
        this.postWriterName = (String) session.getAttribute("userName");
        this.postWriterDept = (String) session.getAttribute("userDept");
        this.postView = postBasicEntity.getPostView();
        this.createDate = postBasicEntity.getCreateDate();
        this.modifyDate = postBasicEntity.getModifyDate();
        this.delYn = postBasicEntity.getDelYn();
    }
}
*/
