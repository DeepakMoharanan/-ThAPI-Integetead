package com.ThreadPartApi.ThreadPartApi.service;

import java.util.List;
import java.util.Map;

public interface PostServive {
    List<Map<String,Object>> getPost();
    Map<String,Object>getPostById(int id);
    Map<String,Object>createPost(Map<String,Object> payload);
    Map<String,Object>updatePost(Map<String,Object> payload, int id);
    Map<String,Object>deletedPostById(int id);





}
