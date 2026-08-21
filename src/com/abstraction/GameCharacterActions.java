package com.abstraction;

abstract class GameCharacter{
	abstract void attack();

	String name ;
	int level ;
	int healthPoints;

	public GameCharacter(String name, int level, int healthPoints) {
		super();
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}

	public void chooseTarget() {
		System.out.println("Target Selected ..");
	}

	public void animateAttack() {
		System.out.println("Attack animation played.");
	}
}

class Warrior extends GameCharacter{
	
	String weaponType;

	public Warrior(String name, int level, int healthPoints, String weaponType) {
		super(name, level, healthPoints);
		this.weaponType = weaponType;
	}

	@Override
	void attack() {
		System.out.println("\n\nPerforming melee attack with Sword.");
		
	}
}

class Mage extends GameCharacter{
	
	String spellType;

	public Mage(String name, int level, int healthPoints, String spellType) {
		super(name, level, healthPoints);
		this.spellType = spellType;
	}

	@Override
	void attack() {
		System.out.println("\n\nCasting spell : "+spellType);
		
	}
}

class Archer extends GameCharacter{
	
	String arrowType;

	public Archer(String name, int level, int healthPoints, String arrowType) {
		super(name, level, healthPoints);
		this.arrowType = arrowType;
	}

	@Override
	void attack() {
		System.out.println("\n\nShooting arrow : "+arrowType);		
	}
}

public class GameCharacterActions {

	public static void main(String[] args) {
		
		Warrior w=new Warrior("Conan", 5, 100, "Sword");
		w.attack();
		w.chooseTarget();
		w.animateAttack();
		
		Mage m=new Mage("Gandalf", 7, 120, "Fireball");
		m.attack();
		m.chooseTarget();
		m.animateAttack();
		
		Archer a=new Archer("Legolas", 8, 110, "Elven Arrow");
		a.attack();
		a.chooseTarget();
		a.animateAttack();
	}

}
