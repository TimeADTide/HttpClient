package cn.kgc.smj.test2;

public class Dog extends Pet {
	public Dog() {
		super();
	}

	public Dog(String nickName, int love, int health) {
		super(nickName, love, health);
	}

	/**
	 * ��ͬ����ԵĶ�����һ����Dog(�Թ���)�����(����)
	 *  ��ͬ����ָ�������ֵ��һ����Dog(����ֵ+3)�����(����ֵ+5)
	 */
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println(super.getNickName()+"�Ա��ˣ�������ι�ˣ�����");
		}else {
			super.setHealth(super.getHealth()+3);
			System.out.println(super.getNickName()+"�����ˣ�����");
		}
	}
	
	public void game(Pet pet) {
		System.out.println("����"+super.getNickName()+"�����ڽӷ��̣�����");
		super.setHealth(super.getHealth()-10);
		super.setLove(super.getLove()+5);
	}
	
}
