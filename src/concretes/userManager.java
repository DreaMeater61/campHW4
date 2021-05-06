package concretes;

import abstracts.userService;
import entities.User;

public class userManager implements userService{

	@Override
	public void signIn(User user) {
		System.out.println(user.getName()+" has signed in");
		
	}

	@Override
	public void deleteAccount(User user) {
		System.out.println(user.getName()+" account has been deleted.");
		
	}

	@Override
	public void updateAccount(User user) {
		System.out.println(user.getName()+" account has been updated.");
		
	}
	
}