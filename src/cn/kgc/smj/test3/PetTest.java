package cn.kgc.smj.test3;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=====欢迎来到宠物店=====");
		System.out.println("==请输入领养宠物的名字？");
		String nickName = input.next();
		System.out.println("==请输入要领养的宠物类型(1.狗狗/2.企鹅)");
		int no = input.nextInt();
		Master ma =new Master();
		Pet pet = ma.getPet(no);
		if(pet==null) {
			System.out.println("领养失败！");
			return;
		}else {
			System.out.println("领养成功！");
			pet.setHealth(90);
			pet.setLove(20);
			pet.setNickName(nickName);
			System.out.println(pet.toString());
		}
		System.out.println("喂食前："+pet.toString());
		ma.feed(pet);
		System.out.println("喂食后："+pet.toString());
		System.out.println("======================");
		ma.game(pet);
		System.out.println("玩耍后："+pet.toString());
		
		
	}
}
