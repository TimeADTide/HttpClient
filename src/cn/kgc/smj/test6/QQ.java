package cn.kgc.smj.test6;


public class QQ extends Pet {

	public QQ() {
		super();
	}

	public QQ(String nickNake, int love, int health) {
		super(nickNake, love, health);
	}
		
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println("企鹅"+super.getNickNake()+"已经吃饱了，不要喂我了！！！");
		}else {
			super.setHealth(getHealth()+5);
			System.out.println("我吃了一把小鱼干~~~");
		}
	}
	
	public void swimming() {
		System.out.println("我正在游泳~~~"+"--"+super.getNickNake());
		super.setHealth(getHealth()-7);
		super.setLove(getLove()+10);
	
	}

}
