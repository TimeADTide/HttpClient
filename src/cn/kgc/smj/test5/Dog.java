package cn.kgc.smj.test5;

public class Dog extends Pet {

	public Dog() {
		super();
		
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
		
	}
	
	public void eat() {
		if(getHealth()>=100) {
			System.out.println("==����"+getNickName()+"�Ѿ��Ա��ˣ���Ҫι����");
		}else {
			setHealth(getHealth()+3);
			System.out.println("==������"+getNickName()+"ιʳ�ɹ�������");
		}
		
		
	}
	
	public void fly() {
		System.out.println("==����"+getNickName()+"������ɵ�");
		setHealth(getHealth()-10);
		setLove(getLove()+5);
	}
	
	
}
