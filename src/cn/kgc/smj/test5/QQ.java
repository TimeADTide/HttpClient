package cn.kgc.smj.test5;

public class QQ extends Pet {

	public QQ() {
		super();

	}

	public QQ(String nickName, int love, int health) {
		super(nickName, love, health);

	}

	public void eat() {
		if(getHealth()>=100) {
			System.out.println("==���"+getNickName()+"�Ѿ��Ա��ˣ���Ҫι����");
		}else {
			setHealth(getHealth()+5);
			System.out.println("==�����"+getNickName()+"ιʳ�ɹ�������");
		}
		
		
	}
	
	public void swimming() {
		System.out.println("==���"+getNickName()+"������Ӿ����");
		setHealth(getHealth()-7);
		setLove(getLove()+10);
	}
}
