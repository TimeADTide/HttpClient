package cn.kgc.smj.test2;

public class Dog extends Pet {
	public Dog() {
		super();
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
	}

	/**
	 * 不同宠物吃的东西不一样：Dog(吃狗粮)、企鹅(吃鱼)
	 *  不同宠物恢复后体力值不一样：Dog(健康值+3)、企鹅(健康值+5)
	 */
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println(super.getNickName()+"吃饱了，不用再喂了！！！");
		}else {
			super.setHealth(super.getHealth()+3);
			System.out.println(super.getNickName()+"吃完了！！！");
		}
	}
	
	public void game(Pet pet) {
		System.out.println("狗狗"+super.getNickName()+"，正在接飞盘！！！");
		super.setHealth(super.getHealth()-10);
		super.setLove(super.getLove()+5);
	}
	
}
