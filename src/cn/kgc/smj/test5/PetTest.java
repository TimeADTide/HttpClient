package cn.kgc.smj.test5;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===��ӭ���������===");
		System.out.println("==������������������֣�");
		String nickName = input.next();
		System.out.println("==�������������������(1.����/2.���)");
		int no = input.nextInt();
		Master m = new Master();
		Pet pet = m.getPet(no);
		if(pet == null) {
			System.out.println("����ʧ�ܣ�����");
			return;
		}else {
			System.out.println("�����ɹ�������");
			pet.setHealth(92);
			pet.setLove(22);
			pet.setNickName(nickName);
			System.out.println(pet.getNickName()+pet.toString());
		}
		System.out.println("=========================");
		m.feed(pet);
		System.out.println(pet.getNickName()+pet.toString());
		System.out.println("=========================");
		m.game(pet);
		System.out.println(pet.getNickName()+pet.toString());
		
		

	}
}
