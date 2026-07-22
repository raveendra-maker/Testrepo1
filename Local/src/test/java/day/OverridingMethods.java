package day;

public class OverridingMethods {

	public static void main(String[] args) {
		AnimalClass a = new AnimalClass();
		a.sound();
		AnimalClass d= new DogClass();
		d.sound();
		AnimalClass c= new Cat();
		c.sound();
		AnimalClass d1= new DogClass();
		d1.sound();
		AnimalClass cow= new Cow();
		cow.sound();
		
		
		
	}

}
