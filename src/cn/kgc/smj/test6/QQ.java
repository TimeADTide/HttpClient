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
			System.out.println("���"+super.getNickNake()+"�Ѿ��Ա��ˣ���Ҫι���ˣ�����");
		}else {
			super.setHealth(getHealth()+5);
			System.out.println("�ҳ���һ��С���~~~");
		}
	}
	
	public void swimming() {
		System.out.println("��������Ӿ~~~"+"--"+super.getNickNake());
		super.setHealth(getHealth()-7);
		super.setLove(getLove()+10);
	
	}

}
