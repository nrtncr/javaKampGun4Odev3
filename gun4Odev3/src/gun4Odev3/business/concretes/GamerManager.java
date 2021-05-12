package gun4Odev3.business.concretes;

import gun4Odev3.business.abstracts.GamerService;
import gun4Odev3.dataAccess.abstracts.GamerDao;
import gun4Odev3.entities.concretes.Gamer;

public class GamerManager implements GamerService {

	private GamerDao gamerDao;
	
	public GamerManager(GamerDao gamerDao) {
		super();
		this.gamerDao = gamerDao;
	}


	@Override
	public void add(Gamer gamer) {
		if(gamer.getFirstName()!=null || gamer.getLastName()!=null || gamer.getTc() !="0" || gamer.getYearOfBirth() !=0) {
		System.out.println("Oyuncu Bilgileri E-Devletten Doðrulandý: "+ gamer.getTc()+" "+ gamer.getFirstName()+ " " + gamer.getLastName()+ " "+gamer.getYearOfBirth());
	    this.gamerDao.add(gamer);
	    return;
		}
		System.out.println("Oyuncu Bilgileri E-Devletten Doðrulanamadý.");

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu Bilgileri E-Devletten Güncellendi: " 
	             + gamer.getTc()+" "+ gamer.getFirstName()+ " " + gamer.getLastName()+ " "+gamer.getYearOfBirth());
		this.gamerDao.update(gamer);

	}


	@Override
	public void delete(Gamer gamer) {
		this.gamerDao.delete(gamer);
	}

}
