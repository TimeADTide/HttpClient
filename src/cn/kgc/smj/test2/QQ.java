package cn.kgc.smj.test2;

public class QQ extends Pet {

	public QQ() {
		super();

	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);
	}

	public void eat() {
		if (super.getHealth() >= 100) {
			System.out.println(super.getNickName() + "�Ա��ˣ�������ι�ˣ�����");
		} else {
			super.setHealth(super.getHealth() + 3);
			System.out.println(super.getNickName() + "�����ˣ�����");
		}
	}
	
	public void swimming(Pet pet) {
		System.out.println("���"+super.getNickName()+"��������Ӿ������");
		super.setHealth(super.getHealth()-7);
		super.setLove(super.getLove()+10);
	}

}
