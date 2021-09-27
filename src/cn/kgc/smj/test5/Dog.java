package cn.kgc.smj.test5;

public class Dog extends Pet {

	public Dog() {
		super();
		
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
		
	}
	
	public void eat() {
		if(getHealth()>=100) {
			System.out.println("==狗狗"+getNickName()+"已经吃饱了，不要喂我了");
		}else {
			setHealth(getHealth()+3);
			System.out.println("==给狗狗"+getNickName()+"喂食成功！！！");
		}
		
		
	}
	
	public void fly() {
		System.out.println("==狗狗"+getNickName()+"正在玩飞碟");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
	}
	
	
}
