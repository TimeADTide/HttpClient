package cn.kgc.smj.test3;

public class QQ extends Pet {

	public QQ() {
		super();
	
	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);
		
	}
	
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println(super.getNickName()+"吃饱了，不要再喂了！！！");
		}else{
			super.setHealth(super.getHealth()+5);
			System.out.println("喂食成功！");
		}
	}
	
	public void swimming() {
		System.out.println("企鹅"+super.getNickName()+"正在游泳！！！");
		super.setLove(getLove()+10);
		super.setHealth(getHealth()-7);
	}
	
}
