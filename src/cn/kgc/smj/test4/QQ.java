package cn.kgc.smj.test4;

public class QQ extends Pet {

	public QQ() {
		super();
		
	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);
	}
	public void eat() {
		if(super.getHealth()>=100) {
			System.out.println("���"+super.getNickName()+"�Ѿ��Ա��ˣ���Ҫ��ι�ˣ�����");
		}else {
			super.setHealth(getHealth()+5);
			System.out.println("ιʳ�ɹ�������");
		}
	}
	public void swimming() {
		System.out.println("���"+super.getNickName()+"������Ӿ������");
		super.setLove(getLove()+10);
		super.setHealth(getHealth()-7);
		
	}
	
	
}

