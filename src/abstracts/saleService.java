package abstracts;

import entities.campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public interface saleService {
	void selling(User user,Game game,campaign campaign,Sale sale );
}
