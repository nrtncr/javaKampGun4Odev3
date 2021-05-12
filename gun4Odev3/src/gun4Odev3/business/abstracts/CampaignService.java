package gun4Odev3.business.abstracts;

import gun4Odev3.entities.concretes.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);

}
