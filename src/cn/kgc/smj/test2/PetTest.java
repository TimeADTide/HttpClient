package cn.kgc.smj.test2;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----��ӭ���������-------");
		System.out.println("---1.������Ҫ�����ĳ������֣�");
		String nickName = input.next();
		System.out.println("---2.������Ҫ�����ĳ�������(1.����/2.���)");
		int no = input.nextInt();

		Master master = new Master();
		Pet pet = master.getPet(no);
		if (pet == null) {
			System.out.println("����ʧ��");
			return;
		} else {
			System.out.println("�����ɹ�");
			pet.setNickName(nickName);
			pet.setHealth(80);
			pet.setLove(20);
		}
		System.out.println("ιʳǰ��"+pet.toString());
		master.feed(pet);
		System.out.println("ιʳ��"+pet.toString());
		System.out.println("===============");
		master.game(pet);
		System.out.println("��ˣ��"+pet.toString());
		
		
	}
}
