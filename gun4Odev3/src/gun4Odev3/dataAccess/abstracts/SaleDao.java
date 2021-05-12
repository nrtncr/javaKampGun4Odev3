package gun4Odev3.dataAccess.abstracts;

import gun4Odev3.entities.concretes.Campaign;
import gun4Odev3.entities.concretes.Game;
import gun4Odev3.entities.concretes.Gamer;

public interface SaleDao {
	void sale(Gamer gamer,Game game,Campaign campaign);
	void sale(Gamer gamer,Game game);

}
