package gun4Odev3.entities.concretes;

import gun4Odev3.entities.abstracts.Entitiy;

public class Gamer implements Entitiy {
	private int id;
	private int password;
	private String tc;
	private int yearOfBirth;
	private String firstName;
	private String lastName;
	private String email;
	private double money;

	public Gamer() {}

	public Gamer(int id, int password, String tc, int yearOfBirth, String firstName, String lastName, String email,double money) {
		super();
		this.id = id;
		this.password = password;
		this.tc = tc;
		this.yearOfBirth = yearOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.money=money;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
	
	

}
