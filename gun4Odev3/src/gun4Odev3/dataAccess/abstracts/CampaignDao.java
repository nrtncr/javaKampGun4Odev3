package gun4Odev3.dataAccess.abstracts;

import gun4Odev3.entities.concretes.Campaign;

public interface CampaignDao {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
