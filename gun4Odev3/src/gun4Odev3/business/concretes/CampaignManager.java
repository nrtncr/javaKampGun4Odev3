package gun4Odev3.business.concretes;

import gun4Odev3.business.abstracts.CampaignService;
import gun4Odev3.dataAccess.abstracts.CampaignDao;
import gun4Odev3.entities.concretes.Campaign;

public class CampaignManager implements CampaignService {
	
	private CampaignDao campaignDao;

	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		if(campaign.getCampaignId()!=0) {
			this.campaignDao.add(campaign);
		}
	}

	@Override
	public void update(Campaign campaign) {
		if(campaign.getCampaignId()!=0) {
			this.campaignDao.update(campaign);
		}
	}

	@Override
	public void delete(Campaign campaign) {
		this.campaignDao.delete(campaign);

	}

}
