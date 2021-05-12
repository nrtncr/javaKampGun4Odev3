package gun4Odev3.dataAccess.abstracts;

import gun4Odev3.entities.concretes.Gamer;

public interface GamerDao {
	 void add(Gamer gamer);
	 void update(Gamer gamer);
	 void delete(Gamer gamer);
}
