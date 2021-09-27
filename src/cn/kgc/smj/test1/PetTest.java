package cn.kgc.smj.test1;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=======欢迎来到宠物店=======");
		System.out.print("===1.请输入要领养宠物的名字？");
		String nickName = input.next();
		System.out.print("===2.请选择要领养的宠物类型(1.狗狗/2.企鹅)");
		int no = input.nextInt();
		Master master = new Master();
		Pet pet = master.getPet(no);
		if (pet == null) {
			System.out.println("领养失败！");
			return;
		} else {
			System.out.println("领养成功！");
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
				System.out.println("===还要继续喂吗？(y/n)");
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
