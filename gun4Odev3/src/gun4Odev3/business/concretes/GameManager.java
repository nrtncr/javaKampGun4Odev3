package gun4Odev3.business.concretes;

import gun4Odev3.business.abstracts.GameService;
import gun4Odev3.dataAccess.abstracts.GameDao;
import gun4Odev3.entities.concretes.Game;

public class GameManager implements GameService {

	private GameDao gameDao;
	
	
	
	public GameManager(GameDao gameDao) {
		this.gameDao=gameDao;
	}

	@Override
	public void add(Game game) {
		if(game.getGameId()==0) {
			System.out.println("Id sýfýr olamaz.");
			return;
		}
		this.gameDao.add(game);
	}

	@Override
	public void update(Game game) {
		if(game.getGameId()==0) {
			return;
		}
		this.gameDao.update(game);
	}

	@Override
	public void delete(Game game) {
		this.gameDao.delete(game);
	}

}
