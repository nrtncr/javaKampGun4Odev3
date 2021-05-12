package gun4Odev3.dataAccess.abstracts;

import gun4Odev3.entities.concretes.Game;

public interface GameDao {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
