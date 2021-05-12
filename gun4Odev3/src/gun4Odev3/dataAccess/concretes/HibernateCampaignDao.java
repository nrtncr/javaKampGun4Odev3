package gun4Odev3.dataAccess.concretes;

import gun4Odev3.dataAccess.abstracts.CampaignDao;
import gun4Odev3.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi: Kampanya Ad�:" + campaign.getCampaignName()+", Kampanya Id: "+campaign.getCampaignId()+", Kampanya S�resi: "
				+campaign.getCampaignDuration()+" g�n, Kampanya y�zdesi: %"+campaign.getPercentOfCampaign());		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi: " + campaign.getCampaignName());		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi.");		
		
	}

}
