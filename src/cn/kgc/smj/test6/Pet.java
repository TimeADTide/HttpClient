package cn.kgc.smj.test6;

public abstract class Pet {
	private String nickNake;
	private int love;
	private int health;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pet(String nickNake, int love, int health) {
		super();
		this.nickNake = nickNake;
		this.love = love;
		this.health = health;
	}
	
	
	
	public String getNickNake() {
		return nickNake;
	}
	public void setNickNake(String nickNake) {
		this.nickNake = nickNake;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "Pet [nickNake=" + nickNake + ", love=" + love + ", health=" + health + "]";
	}
	
	public abstract void eat();
	
}
