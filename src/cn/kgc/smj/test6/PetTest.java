package cn.kgc.smj.test6;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===欢迎来到宠物店===");
		System.out.println("==请输入您领养宠物的名字？");
		String nickName = input.next();
		System.out.println("==请输入领养宠物的类型(1.狗狗/2.企鹅)");
		int a = input.nextInt();
		Master m = new Master();
		Pet pet= m.getPet(a);
		if(pet==null) {
			System.out.println("领养失败！！！");
			return;
		}else {
			System.out.println("领养成功！！！");
			pet.setHealth(95);
			pet.setLove(25);
			pet.setNickNake(nickName);
			System.out.println(pet.getNickNake()+pet.toString());
		}
		System.out.println("==================");
		m.feed(pet);
		System.out.println("喂养后："+pet.getNickNake()+pet.toString());
		System.out.println("==================");
		m.game(pet);
		Dog dd = new Dog();
		System.out.println(dd.toString());
		System.out.println("玩耍后："+pet.getNickNake()+pet.toString());
		
		
		
	}
}
