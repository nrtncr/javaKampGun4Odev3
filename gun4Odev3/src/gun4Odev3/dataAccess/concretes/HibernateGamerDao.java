package gun4Odev3.dataAccess.concretes;

import gun4Odev3.dataAccess.abstracts.GamerDao;
import gun4Odev3.entities.concretes.Gamer;

public class HibernateGamerDao implements GamerDao{

	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Eklendi: " + gamer.getFirstName()+ " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Bilgileri Güncellendi: " + gamer.getFirstName()+ " " + gamer.getLastName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu Silindi.");		
	}

}
