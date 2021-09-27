package cn.kgc.smj.test2;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("-----欢迎来到宠物店-------");
		System.out.println("---1.请输入要领养的宠物名字？");
		String nickName = input.next();
		System.out.println("---2.请输入要领养的宠物类型(1.狗狗/2.企鹅)");
		int no = input.nextInt();

		Master master = new Master();
		Pet pet = master.getPet(no);
		if (pet == null) {
			System.out.println("领养失败");
			return;
		} else {
			System.out.println("领养成功");
			pet.setNickName(nickName);
			pet.setHealth(80);
			pet.setLove(20);
		}
		System.out.println("喂食前，"+pet.toString());
		master.feed(pet);
		System.out.println("喂食后，"+pet.toString());
		System.out.println("===============");
		master.game(pet);
		System.out.println("玩耍后，"+pet.toString());
		
		
	}
}
