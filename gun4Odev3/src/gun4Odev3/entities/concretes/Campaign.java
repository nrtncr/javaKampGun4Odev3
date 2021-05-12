package gun4Odev3.entities.concretes;

import gun4Odev3.entities.abstracts.Entitiy;

public class Campaign implements Entitiy {
		private int campaignId;
		private int campaignDuration;
		private int percentOfCampaign;
		private String campaignName;
		
		public Campaign() {}

		public Campaign(int campaignId, int campaignDuration, int percentOfCampaign,String campaignName) {
			this.campaignId = campaignId;
			this.campaignDuration = campaignDuration;
			this.percentOfCampaign = percentOfCampaign;
			this.campaignName=campaignName;
		}

		public int getCampaignId() {
			return campaignId;
		}

		public void setCampaignId(int campaignId) {
			this.campaignId = campaignId;
		}

		public int getCampaignDuration() {
			return campaignDuration;
		}

		public void setCampaignDuration(int campaignDuration) {
			this.campaignDuration = campaignDuration;
		}

		public int getPercentOfCampaign() {
			return percentOfCampaign;
		}

		public void setPercentOfCampaign(int percentOfCampaign) {
			this.percentOfCampaign = percentOfCampaign;
		}

		public String getCampaignName() {
			return campaignName;
		}

		public void setCampaignName(String campaignName) {
			this.campaignName = campaignName;
		}
		
}
