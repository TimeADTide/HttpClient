package cn.kgc.smj.test5;

import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("===欢迎来到宠物店===");
		System.out.println("==请输入领养宠物的名字？");
		String nickName = input.next();
		System.out.println("==请输入领养宠物的类型(1.狗狗/2.企鹅)");
		int no = input.nextInt();
		Master m = new Master();
		Pet pet = m.getPet(no);
		if(pet == null) {
			System.out.println("领养失败！！！");
			return;
		}else {
			System.out.println("领养成功！！！");
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
