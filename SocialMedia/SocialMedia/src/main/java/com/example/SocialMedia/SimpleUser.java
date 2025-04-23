package com.example.SocialMedia;

public class SimpleUser implements User
{

    private String userName;
    private PostList postList;

    public void init(){
        System.out.println("DB Connection success");
    }

    public void destroy(){
        System.out.println("Closed ALL the resources");
    }

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
