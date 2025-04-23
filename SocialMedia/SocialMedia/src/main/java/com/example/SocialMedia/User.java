package com.example.SocialMedia;

import java.util.List;

public interface User
{

    void setUserName(String userName);
    String getUserName();
    void setPostList(PostList postList); // ✅ change from List to PostList
    PostList getPostList();

}
