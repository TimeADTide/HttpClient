package cn.kgc.smj.test6;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===��ӭ���������===");
		System.out.println("==��������������������֣�");
		String nickName = input.next();
		System.out.println("==�������������������(1.����/2.���)");
		int a = input.nextInt();
		Master m = new Master();
		Pet pet= m.getPet(a);
		if(pet==null) {
			System.out.println("����ʧ�ܣ�����");
			return;
		}else {
			System.out.println("�����ɹ�������");
			pet.setHealth(95);
			pet.setLove(25);
			pet.setNickNake(nickName);
			System.out.println(pet.getNickNake()+pet.toString());
		}
		System.out.println("==================");
		m.feed(pet);
		System.out.println("ι����"+pet.getNickNake()+pet.toString());
		System.out.println("==================");
		m.game(pet);
		Dog dd = new Dog();
		System.out.println(dd.toString());
		System.out.println("��ˣ��"+pet.getNickNake()+pet.toString());
		
		
		
	}
}
