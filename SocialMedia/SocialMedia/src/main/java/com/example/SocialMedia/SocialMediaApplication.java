package com.example.SocialMedia;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext applicationcontext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);
		User User = (User)applicationcontext.getBean("user");
		System.out.println("Enter your user name: : \n ");
		String username = sc.next();
		User.setUserName(username);

		PostList postlist = (PostList)applicationcontext.getBean("postList");
		while(true)
		{

	
		System.out.println("choose from below \n1 . create a post \n2.see All the post\n3. Exit ");

		int userselect = sc.nextInt();

		switch (userselect) 
		{

			case 1:{
			Post Post = (Post)	applicationcontext.getBean("post");
			sc.next();
			String msg = sc.nextLine();
			Post.setMessage(msg);
			postlist.setPost(Post);
			User.setPostList(postlist);
				break;
			}
			case 2 :
			{
				postlist.getAllPost().forEach(item -> System.out.println(item.getMessage()));
				break;
			}
			case 3: {
				applicationcontext.close()
			}
		
			default:
				break;
		}
		
		//SpringApplication.run(SocialMediaApplication.class, args);
		}
	}

}
