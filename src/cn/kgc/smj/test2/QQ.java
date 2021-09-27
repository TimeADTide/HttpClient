package cn.kgc.smj.test2;

public class QQ extends Pet {

	public QQ() {
		super();

	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);
	}

	public void eat() {
		if (super.getHealth() >= 100) {
			System.out.println(super.getNickName() + "吃饱了，不用再喂了！！！");
		} else {
			super.setHealth(super.getHealth() + 3);
			System.out.println(super.getNickName() + "吃完了！！！");
		}
	}
	
	public void swimming(Pet pet) {
		System.out.println("企鹅"+super.getNickName()+"，正在游泳！！！");
		super.setHealth(super.getHealth()-7);
		super.setLove(super.getLove()+10);
	}

}
