package cn.kgc.smj.test5;

public abstract class Pet {
	private String nickName;
	private int love;
	private int health;
	
	
	public abstract void eat();
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
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
		return "Pet [nickName=" + nickName + ", love=" + love + ", health=" + health + "]";
	}

	public Pet() {
		
		
	}
	public Pet(String nickName, int love, int health) {
		
		this.nickName = nickName;
		this.love = love;
		this.health = health;
	}
	
	
}
