package concretes;

import java.util.Scanner;
import abstracts.campaignService;
import entities.campaign;

public class campaignManager implements campaignService{

	@Override
	public void addCampaign(campaign campaign) {
		System.out.println(campaign.getName()+" Yeni kampanya eklendi.\nCampaign number : "+campaign.getId()+"\nDiscount percent : "+campaign.getDiscount());
		
	}

	@Override
	public void deleteCampaign(campaign campaign) {
		System.out.println(campaign.getName()+" Kampanyasý sone erdi.");
		
	}

	@Override
	public void updateCampaign(campaign campaign) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		campaign.setName(name);
		scanner.close();
		System.out.println("Kampanya güncellendi: "+campaign.getName());
		
	}

}