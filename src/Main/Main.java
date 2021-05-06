package Main;

import concretes.campaignManager;
import concretes.gameManager;
import concretes.saleManager;
import concretes.userManager;
import entities.campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(44446628,"Ahmet olgun","ÖZAD","2006");
		userManager userManager = new userManager();
		userManager.signIn(user);
		userManager.updateAccount(user);
		userManager.deleteAccount(user);
		
		campaign campaign = new campaign("YeniYýl",15,1);
		campaignManager campaignManager = new campaignManager();
		campaignManager.addCampaign(campaign);
		campaignManager.deleteCampaign(campaign);
		
		
		Game game = new Game(1,"Grand Theft Auto V",40);
		gameManager gameManager = new gameManager();
		gameManager.addGame(game);
		gameManager.update(game);
		gameManager.sellGame(game);
		
		Sale sale = new Sale(1,"Kredi Kartý","2021");
		saleManager saleManager = new saleManager();
		saleManager.selling(user, game, campaign, sale);
		

	}

}

