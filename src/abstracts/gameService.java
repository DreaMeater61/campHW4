package abstracts;

import entities.Game;

public interface gameService {
	void sellGame(Game game);
	void addGame(Game game);
	void update(Game game);
}
