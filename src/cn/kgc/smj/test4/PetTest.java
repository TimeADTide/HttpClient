package cn.kgc.smj.test4;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===欢迎来到宠物店===");
		System.out.println("==请输入要领养宠物的名字？");
		String nickName = input.next();
		System.out.println("==请输入要领养宠物的类型(1.企鹅/2.狗狗)");
		int no = input.nextInt();
		Master m = new Master();
		Pet pet = m.getPet(no);
		if(pet==null) {
			System.out.println("领养失败！！！");
			return;
		}else {
			System.out.println("领养成功！！！");
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
