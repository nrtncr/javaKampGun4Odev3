package gun4Odev3.entities.concretes;

import gun4Odev3.entities.abstracts.Entitiy;

public class Game implements Entitiy {
		private int gameId;
		private int gamePrice;
		private String gameName;
		
		
		public Game() {}

		public Game(String gameName,int gameId, int gamePrice) {
			super();
			this.gameName= gameName;
			this.gameId = gameId;
			this.gamePrice = gamePrice;
		}

		public int getGameId() {
			return gameId;
		}

		public void setGameId(int gameId) {
			this.gameId = gameId;
		}

		public int getGamePrice() {
			return gamePrice;
		}

		public void setGamePrice(int gamePrice) {
			this.gamePrice = gamePrice;
		}

		public String getGameName() {
			return gameName;
		}

		public void setGameName(String gameName) {
			this.gameName = gameName;
		}

		

		

		
		
}
