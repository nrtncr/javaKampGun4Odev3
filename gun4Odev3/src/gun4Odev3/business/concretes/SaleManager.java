package gun4Odev3.business.concretes;

import gun4Odev3.business.abstracts.SaleService;
import gun4Odev3.dataAccess.abstracts.SaleDao;
import gun4Odev3.entities.concretes.Campaign;
import gun4Odev3.entities.concretes.Game;
import gun4Odev3.entities.concretes.Gamer;

public class SaleManager implements SaleService{

	private SaleDao saleDao;
	
	
	
	public SaleManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}



	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		if(gamer.getMoney()!=0) {
			this.saleDao.sale(gamer, game, campaign);
			return;
		}
		System.out.println("Satýþ gerçekleþtirilemedi.Hesabýnýzda para bulunmamaktadýr.");
	}



	@Override
	public void sale(Gamer gamer, Game game) {
		if(gamer.getMoney()!=0) {
			this.saleDao.sale(gamer, game);
			return;
		}
		System.out.println("Satýþ gerçekleþtirilemedi.Hesabýnýzda para bulunmamaktadýr.");
	
	}
	

}
