package cn.kgc.smj.test6;

public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String nickNake, int love, int health) {
		super(nickNake, love, health);
	}
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println("狗狗"+super.getNickNake()+"已经吃饱了，不要喂我了！！！");
		}else {
			super.setHealth(getHealth()+3);
			System.out.println("我吃了一把狗粮~~~");
		}
	}
	
	public void fly() {
		System.out.println("我正在玩飞碟哟~~~"+"--"+super.getNickNake());
		super.setHealth(getHealth()-10);
		super.setLove(getLove()+5);
	
	}
	
}
