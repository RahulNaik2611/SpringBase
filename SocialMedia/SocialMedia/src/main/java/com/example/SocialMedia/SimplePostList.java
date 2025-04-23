package com.example.SocialMedia;

import java.util.ArrayList;
import java.util.List;

public class SimplePostList implements PostList
{

     List<Post> listOfPosts;

    public SimplePostList() {
        this.listOfPosts = new ArrayList<>();
    }

    @Override
    public void setPost(Post Post) {
        listOfPosts.add(Post);
    }

    @Override
    public List<Post> getAllPost() {
        return listOfPosts;
    }
}
