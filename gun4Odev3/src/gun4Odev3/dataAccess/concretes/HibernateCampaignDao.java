package gun4Odev3.dataAccess.concretes;

import gun4Odev3.dataAccess.abstracts.CampaignDao;
import gun4Odev3.entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Eklendi: Kampanya Adý:" + campaign.getCampaignName()+", Kampanya Id: "+campaign.getCampaignId()+", Kampanya Süresi: "
				+campaign.getCampaignDuration()+" gün, Kampanya yüzdesi: %"+campaign.getPercentOfCampaign());		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName());		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi.");		
		
	}

}
