package abstracts;

import entities.campaign;

public interface campaignService {
	void addCampaign(campaign campaign);
	void deleteCampaign(campaign campaign);
	void updateCampaign(campaign campaign);
}
