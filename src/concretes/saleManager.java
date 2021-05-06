package concretes;

import abstracts.saleService;
import entities.campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public class saleManager implements saleService{

	@Override
	public void selling(User user, Game game, campaign campaign, Sale sale) {
		
		System.out.println(user.getName()+" has bought the "+game.getname() +" with the "+ campaign.getName()+" campaign.");
		System.out.println("Total price : "+ game.getPrice());
		System.out.println("After the discount : "+(game.getPrice()-((game.getPrice()*campaign.getDiscount())/100)));
		
	}
	
}