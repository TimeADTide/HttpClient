package cn.kgc.smj.test4;

public class Master {
	public Pet getPet(int no) {
		Pet pet = null;
		if(no == 1 ) {
			pet = new QQ();
			System.out.print("Æó¶ì");
		}else if(no==2) {
			pet = new Dog();
			System.out.print("¹·¹·");
		}
		return pet;
	}
	
	public void feed(Pet pet) {
		pet.eat();
		
	}
	public void game(Pet pet) {
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
			dog.fly();
		}else if(pet instanceof QQ) {
			QQ qq = (QQ)pet;
			qq.swimming();
		}
	}
	
}	
