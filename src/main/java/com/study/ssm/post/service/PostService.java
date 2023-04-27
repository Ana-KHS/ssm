package com.study.ssm.post.service;

//import com.study.ssm.post.dto.PostDto;
import com.study.ssm.post.entity.PostBasicEntity;
import com.study.ssm.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public void insertPost(PostBasicEntity postBasicEntity, HttpSession session) {
        postBasicEntity.setPostWriterName((String) session.getAttribute("userName"));
        postBasicEntity.setPostWriterDept((String) session.getAttribute("userDept"));
        postRepository.save(postBasicEntity);
    }

    public PostBasicEntity postDetail(Long postNo) {
        return postRepository.findById(postNo).get();
    }

    /*public List<PostBasicEntity> postList() {
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "postNo"));
    }*/

    public List<PostBasicEntity> postList() {
        return postRepository.findByDelYnOrderByPostNoDesc("N");
    }

    public void updateDelYn(Long postNo) {
        postRepository.updateDelYn(postNo);
    }
}
