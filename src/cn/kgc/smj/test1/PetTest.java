package cn.kgc.smj.test1;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=======��ӭ���������=======");
		System.out.print("===1.������Ҫ������������֣�");
		String nickName = input.next();
		System.out.print("===2.��ѡ��Ҫ�����ĳ�������(1.����/2.���)");
		int no = input.nextInt();
		Master master = new Master();
		Pet pet = master.getPet(no);
		if (pet == null) {
			System.out.println("����ʧ�ܣ�");
			return;
		} else {
			System.out.println("�����ɹ���");
			pet.setHealth(90);
			pet.setLove(60);
			pet.setNickName(nickName);
			System.out.println(pet.toString());
			int a = pet.getHealth();
		}
		do {
			master.feed(pet);
			System.out.println(pet.toString());
			int b = pet.getHealth();
			if (b < 100) {
				System.out.println("===��Ҫ����ι��(y/n)");
				String in = input.next();
				if (in.equals("n")) {
					break;
				}
			} else {
				break;
			}

		} while (true);
		
		master.game(pet);
		
	}
}
