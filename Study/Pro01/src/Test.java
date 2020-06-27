
public class Test {
	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = (Dog)a;
//		d.seeDoor();
	}
}



class Animal{
	public void shout() {
		System.out.println("shout!");
	}
}

class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("wang!");
	}
	
	public void seeDoor() {
		System.out.println("seeDoor!");
	}
	
}