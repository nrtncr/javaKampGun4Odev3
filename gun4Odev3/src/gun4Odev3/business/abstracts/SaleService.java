package gun4Odev3.business.abstracts;

import gun4Odev3.entities.concretes.Campaign;
import gun4Odev3.entities.concretes.Game;
import gun4Odev3.entities.concretes.Gamer;

public interface SaleService {
	void sale(Gamer gamer,Game game,Campaign campaign);
	void sale(Gamer gamer,Game game);

}
