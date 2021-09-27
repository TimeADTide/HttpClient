package cn.kgc.smj.test5;

public class Master {
	public Pet getPet(int no) {
		Pet pet = null;
		if (no == 1) {
			pet = new Dog();

		} else if (no == 2) {
			pet = new QQ();

		}
		return pet;

	}

	public void feed(Pet pet) {
		pet.eat();
	}
	public void game(Pet pet) {
		if(pet instanceof Dog) {
			Dog d = (Dog)pet;
			d.fly();
		}else if(pet instanceof QQ) {
			QQ q = (QQ)pet;
			q.swimming();
		}
	}
	
}
