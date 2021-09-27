package cn.kgc.smj.test4;

public class Dog extends Pet {

	public Dog() {
		super();
		
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
		
	}
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println("狗狗"+super.getNickName()+"已经吃饱了，不要再喂了！！！");
		}else {
			super.setHealth(getHealth()+3);
			System.out.println("喂食成功！！！");
		}
	}
	public void fly() {
		System.out.println("狗狗"+super.getNickName()+"正在玩飞碟！！！");
		super.setLove(getLove()+5);
		super.setHealth(getHealth()-10);
		
	}
}
