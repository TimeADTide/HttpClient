package cn.kgc.smj.test1;

public class Dog extends Pet {

	public Dog() {
		super();
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);

	}

	public void eat() {
		if (super.getHealth() >= 100) {
			System.out.println(getNickName() + "�Ա��ˣ�����Ҫ��ι�ˣ�");
		} else {
			super.setHealth(super.getHealth() + 3);
			System.out.println(super.getNickName() + "���ڳԷ�");
		}

	}

	public void catchingDlyDisc() {
		System.out.println("����" + super.getNickName() + "��������̣���!");
		super.setHealth(super.getHealth() - 10);
		super.setLove(getLove() + 5);
		System.out.println(super.toString());
	}

}
