package gun4Odev3;

import gun4Odev3.business.concretes.CampaignManager;
import gun4Odev3.business.concretes.GameManager;
import gun4Odev3.business.concretes.GamerManager;
import gun4Odev3.business.concretes.SaleManager;
import gun4Odev3.entities.concretes.Campaign;
import gun4Odev3.entities.concretes.Game;
import gun4Odev3.entities.concretes.Gamer;
import gun4Odev3.dataAccess.concretes.HibernateCampaignDao;
import gun4Odev3.dataAccess.concretes.HibernateGameDao;
import gun4Odev3.dataAccess.concretes.HibernateGamerDao;
import gun4Odev3.dataAccess.concretes.HibernateSaleDao;


public class Main {

	public static void main(String[] args) {
			Game game1=new Game("Araba Park Etme",1,55);
			GameManager gameManager=new GameManager(new HibernateGameDao());
			gameManager.add(game1);
			
			Gamer gamer1=new Gamer(11,1788,"11111111112",1999,"Can","Kan","abc@gmail.com",113.5);
			GamerManager gamerManager=new GamerManager(new HibernateGamerDao());
			gamerManager.add(gamer1);
			
			Campaign campaign1=new Campaign(100,10,50,"Süper Fýrsat");
			CampaignManager campaignManager= new CampaignManager(new HibernateCampaignDao());	
			campaignManager.add(campaign1);
			
			SaleManager saleManager=new SaleManager(new HibernateSaleDao());
			saleManager.sale(gamer1, game1, campaign1);
			
			gameManager.update(game1);
			gamerManager.update(gamer1);
			campaignManager.update(campaign1);
			
			gameManager.delete(game1);
			gamerManager.delete(gamer1);
			campaignManager.delete(campaign1);
	}

}
