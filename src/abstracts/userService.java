package abstracts;

import entities.User;

public interface userService {
	void signIn(User user);
	void deleteAccount(User user);
	void updateAccount(User user);

}
