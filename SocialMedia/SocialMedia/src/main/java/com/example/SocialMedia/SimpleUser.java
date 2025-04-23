package com.example.SocialMedia;

public class SimpleUser implements User
{

    private String userName;
    private PostList postList;

    @Override
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PostList getPostList() {
        return postList;
    }

    public void setPostList(PostList postList) {
        this.postList = postList;
    }
}
