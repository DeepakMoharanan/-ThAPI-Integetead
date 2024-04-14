package com.ThreadPartApi.ThreadPartApi.controller;

import com.ThreadPartApi.ThreadPartApi.service.PostServive;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostController {
    private PostServive postServive;
    public PostController(PostServive postServive) {
        this.postServive = postServive;
    }
    //http://localhost:8080/api/getAllPost
    @GetMapping("/getAllPost")
    List<Map<String,Object>>getAllPost(){
        return postServive.getPost();
    }
    //http://localhost:8080/api/getPostById/{id}
    @GetMapping("/getPostById/{id}")
    Map<String,Object>getPostById(@PathVariable int id){
        return postServive. getPostById(id);
    }
    //http://localhost:8080/api/createPost
    @PostMapping("/createPost")
    Map<String,Object>createPost(@RequestBody Map<String,Object>payload){
        return postServive.createPost(payload);
    }
    //http://localhost:8080/api/updatePostById/{id}
    @PutMapping("/updatePostById/{id}")
    Map<String,Object>updatePostById(@RequestBody Map<String,Object>payload,@PathVariable int id){
        return postServive.updatePost(payload,id);
    }
    //http://localhost:8080/api/deletedById/{id}
    @DeleteMapping("/deletedById/{id}")
    Map<String,Object>deletedById(@PathVariable int id){
        return postServive.deletedPostById(id);
    }


}
