package cn.kgc.smj.test2;

public class Master {
	//ÁìÑø
	public Pet getPet(int no) {
		Pet pet = null;
		if (no == 1) {
			pet = new Dog();
		} else if (no == 2) {
			pet = new QQ();
		}else {
			
		}
		return pet;
	}
	
	public void feed(Pet pet) {
		pet.eat();
	}
	
	public void game(Pet pet) {
		if(pet instanceof Dog) {
			Dog dog = (Dog)pet;
			dog.game(pet);
		}else if(pet instanceof QQ){
			QQ qq = (QQ)pet;
			qq.swimming(pet);
		}
	}
	
}
