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
			System.out.println("����"+super.getNickNake()+"�Ѿ��Ա��ˣ���Ҫι���ˣ�����");
		}else {
			super.setHealth(getHealth()+3);
			System.out.println("�ҳ���һ�ѹ���~~~");
		}
	}
	
	public void fly() {
		System.out.println("��������ɵ�Ӵ~~~"+"--"+super.getNickNake());
		super.setHealth(getHealth()-10);
		super.setLove(getLove()+5);
	
	}
	
}
