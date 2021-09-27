package cn.kgc.smj.test6;

public class Master {
	public Pet  getPet(int num) {
		Pet pet = null;
		if(num==1) {
			pet = new Dog();
		}else if(num==2) {
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
		}else if(pet instanceof QQ){
			QQ q = (QQ)pet;
			q.swimming();
		}
	}
	
	
}
