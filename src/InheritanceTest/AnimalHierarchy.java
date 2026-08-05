package InheritanceTest;

class Animal{
	String name;
	String habitat;
	public Animal(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	}
	
	public void displayHabitat() {
		System.out.println("\n\nName : "+name);
		System.out.println("Habitat : "+habitat);
	}
}

class Mammal extends Animal{
	boolean isWarmBlooded;

	public Mammal(String name, String habitat, boolean isWarmBlooded) {
		super(name, habitat);
		this.isWarmBlooded = isWarmBlooded;
	}
	public void displayMammalInfo() {
		System.out.println("Is Warm Blooded : "+isWarmBlooded);
	}
}

class Bird extends Animal{
	boolean canFly;

	public Bird(String name, String habitat, boolean canFly) {
		super(name, habitat);
		this.canFly = canFly;
	}
	
	public void displayBirdInfo() {
		System.out.println("Can Fly : "+canFly);
	}
}

class Reptile extends Animal{
	boolean isColdBlooded;

	public Reptile(String name, String habitat, boolean isColdBlooded) {
		super(name, habitat);
		this.isColdBlooded = isColdBlooded;
	}
	
	public void displayReptileInfo() {
		System.out.println("Is Cold Blooded : "+isColdBlooded);
	}
}


public class AnimalHierarchy {

	public static void main(String[] args) {
		
		 Mammal m= new Mammal("Lion", "Savannah", true);
		 m.displayHabitat();
		 m.displayMammalInfo();
		 
		 Bird b= new Bird("Eagle", "Forest", true);
		 b.displayHabitat();
		 b.displayBirdInfo();
		 
		 Reptile r= new Reptile("Snake", "Desert", true);
		 r.displayHabitat();
		 r.displayReptileInfo();
		 
	}

}
