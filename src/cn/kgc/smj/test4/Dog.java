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
			System.out.println("����"+super.getNickName()+"�Ѿ��Ա��ˣ���Ҫ��ι�ˣ�����");
		}else {
			super.setHealth(getHealth()+3);
			System.out.println("ιʳ�ɹ�������");
		}
	}
	public void fly() {
		System.out.println("����"+super.getNickName()+"������ɵ�������");
		super.setLove(getLove()+5);
		super.setHealth(getHealth()-10);
		
	}
}
