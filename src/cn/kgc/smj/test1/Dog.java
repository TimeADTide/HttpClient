package cn.kgc.smj.test1;

public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);

	}

	public void eat() {
		if (super.getHealth() >= 100) {
			System.out.println(getNickName() + "吃饱了，不需要再喂了！");
		} else {
			super.setHealth(super.getHealth() + 3);
			System.out.println(super.getNickName() + "正在吃饭");
		}

	}

	public void catchingDlyDisc() {
		System.out.println("狗狗" + super.getNickName() + "正在玩飞盘！！!");
		super.setHealth(super.getHealth() - 10);
		super.setLove(getLove() + 5);
		System.out.println(super.toString());
	}

}
