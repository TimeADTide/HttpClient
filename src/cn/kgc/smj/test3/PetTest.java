package cn.kgc.smj.test3;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=====��ӭ���������=====");
		System.out.println("==������������������֣�");
		String nickName = input.next();
		System.out.println("==������Ҫ�����ĳ�������(1.����/2.���)");
		int no = input.nextInt();
		Master ma =new Master();
		Pet pet = ma.getPet(no);
		if(pet==null) {
			System.out.println("����ʧ�ܣ�");
			return;
		}else {
			System.out.println("�����ɹ���");
			pet.setHealth(90);
			pet.setLove(20);
			pet.setNickName(nickName);
			System.out.println(pet.toString());
		}
		System.out.println("ιʳǰ��"+pet.toString());
		ma.feed(pet);
		System.out.println("ιʳ��"+pet.toString());
		System.out.println("======================");
		ma.game(pet);
		System.out.println("��ˣ��"+pet.toString());
		
		
	}
}
