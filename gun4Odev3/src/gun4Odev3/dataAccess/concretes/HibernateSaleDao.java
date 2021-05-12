package gun4Odev3.dataAccess.concretes;

import gun4Odev3.dataAccess.abstracts.SaleDao;
import gun4Odev3.entities.concretes.Campaign;
import gun4Odev3.entities.concretes.Game;
import gun4Odev3.entities.concretes.Gamer;

public class HibernateSaleDao implements SaleDao{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Oyun satýþý gerçekleþtirildi: Oyuncu:"+gamer.getFirstName()+" Oyun:"+game.getGameName()+" Kampanya:"+campaign.getCampaignName());
	}

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println("Oyun satýþý gerçekleþtirildi: Oyuncu:"+gamer.getFirstName()+" Oyun:"+game.getGameName());

	}

}
