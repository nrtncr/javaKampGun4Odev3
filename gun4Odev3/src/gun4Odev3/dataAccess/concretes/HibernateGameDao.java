package gun4Odev3.dataAccess.concretes;

import gun4Odev3.dataAccess.abstracts.GameDao;
import gun4Odev3.entities.concretes.Game;

public class HibernateGameDao implements GameDao {

	@Override
	public void add(Game game) {
		System.out.println("Oyun Eklendi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun Güncellendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi.");
		
	}

}
