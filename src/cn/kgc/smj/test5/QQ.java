package cn.kgc.smj.test5;

public class QQ extends Pet {

	public QQ() {
		super();

	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);

	}

	public void eat() {
		if(getHealth()>=100) {
			System.out.println("==企鹅"+getNickName()+"已经吃饱了，不要喂我了");
		}else {
			setHealth(getHealth()+5);
			System.out.println("==给企鹅"+getNickName()+"喂食成功！！！");
		}
		
		
	}
	
	public void swimming() {
		System.out.println("==企鹅"+getNickName()+"正在游泳！！");
		setHealth(getHealth()-7);
		setLove(getLove()+10);
	}
}
