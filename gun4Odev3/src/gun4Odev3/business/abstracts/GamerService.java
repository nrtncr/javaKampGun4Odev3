package gun4Odev3.business.abstracts;

import gun4Odev3.entities.concretes.Gamer;

public interface GamerService {
	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
