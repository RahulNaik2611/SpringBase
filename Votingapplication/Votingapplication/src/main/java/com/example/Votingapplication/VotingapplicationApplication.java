package com.example.Votingapplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

//@SpringBootApplication
public class VotingapplicationApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.Votingapplication");

		AuthorityCounter authorityCounter = (AuthorityCounter) context.getBean("simpleautoritycounter");

		while (true) {
			System.out.println("Welcome User:");

			Scanner sc = new Scanner(System.in);
			System.out.println("Choose from Below:\n1. I wanna vote\n2. See All votes (ADMIN)");
			int userinput = sc.nextInt();
			sc.nextLine(); // Consume leftover newline

			String Beanid = "";

			switch (userinput) {
				case 1: {
					System.out.println("Enter your UserName:");
					String UserName = sc.nextLine();

					Users user = (Users) context.getBean("user");
					user.setUserName(UserName);

					System.out.println("Choose the Party you want to vote for:\n1. Democratic\n2. Independent\n3. Republic");
					int party = sc.nextInt();
					sc.nextLine(); // Consume newline

					switch (party) {
						case 1 -> Beanid = "democratic";
						case 2 -> Beanid = "independent";
						case 3 -> Beanid = "republic";
						default -> {
							System.out.println("Invalid party choice.");
							continue;
						}
					}

					PoliticalParty politicalParty = (PoliticalParty) context.getBean(Beanid);
					user.setPoliticalparty(politicalParty);

					Userlist userlist = (Userlist) context.getBean("userlist");
					userlist.addUser(user);

					System.out.println("Thank you for voting!");
					break;
				}
				case 2: {
					authorityCounter.getUserList().getUserList()
							.forEach(item ->
									System.out.println(item.getUserName() + " voted for: " +
											item.getPoliticalparty().getPartName()));
					context.close();
					break;
				}
				default: {
					System.out.println("Invalid choice.");
				}
			}

			System.out.println("Do you want to continue? (yes/no)");
			String cont = sc.nextLine();
			if (cont.equalsIgnoreCase("no")) {
				System.out.println("Exiting the voting app. Goodbye!");
				break;
			}
		}
	}
}
