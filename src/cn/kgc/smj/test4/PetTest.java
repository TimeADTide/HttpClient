package cn.kgc.smj.test4;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===��ӭ���������===");
		System.out.println("==������Ҫ������������֣�");
		String nickName = input.next();
		System.out.println("==������Ҫ�������������(1.���/2.����)");
		int no = input.nextInt();
		Master m = new Master();
		Pet pet = m.getPet(no);
		if(pet==null) {
			System.out.println("����ʧ�ܣ�����");
			return;
		}else {
			System.out.println("�����ɹ�������");
			pet.setHealth(90);
			pet.setLove(20);
			pet.setNickName(nickName);
		}
		
		System.out.println(pet.getNickName()+pet.toString());
		m.feed(pet);
		System.out.println(pet.getNickName()+pet.toString());
		System.out.println("===================");
		m.game(pet);
		System.out.println(pet.getNickName()+pet.toString());
		
		
		
	}
}
