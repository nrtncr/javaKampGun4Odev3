package gun4Odev3.business.abstracts;

import gun4Odev3.entities.concretes.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
