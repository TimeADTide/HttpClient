package cn.kgc.smj.test3;

public class Dog extends Pet {

	public Dog() {
		super();
		
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
		
	}
	
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println(super.getNickName()+"�Ա��ˣ���Ҫ��ι�ˣ�����");
		}else{
			super.setHealth(super.getHealth()+3);
			System.out.println("ιʳ�ɹ���");
		}
	}
	public void fly() {
		System.out.println("����"+super.getNickName()+"���ڽӷ��̣�����");
		super.setLove(getLove()+5);
		super.setHealth(getHealth()-10);
	}
	
	
	
}
