package edu.neu.csye6200.assignment2;

public class ZooAnimals {
	
	private String name;
	private String sound;
	
	
	
	public ZooAnimals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZooAnimals(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	@Override
	public String toString() {
		return "\n\tZooAnimals [Hi, I am " + name + ", and I " + sound + " when I am hungry!]";
	}

	public void zooAnimals() {
		System.out.println("\nI am an Animal [** Concrete Class **]");
	}
	
	public static void demo() {
		
		ZooAnimals zoo = new ZooAnimals();
		zoo.zooAnimals();
		
		ZooAnimals lion = new Lion();
		lion.zooAnimals();
		
		ZooAnimals horse = new Horse();
		horse.zooAnimals();
		
		ZooAnimals zootoString = new ZooAnimals();
		zootoString.setName("an Animal in the zoo");
		zootoString.setSound("make noise");
		System.out.println(zootoString.toString());
		
		ZooAnimals liontoString = new Lion();
		liontoString.setName("Mufasa, the lion");
		liontoString.setSound("roar");
		System.out.println(liontoString.toString());
		
		ZooAnimals horsetoString = new Horse();
		horsetoString.setName("Pascal, the horse");
		horsetoString.setSound("neigh");
		System.out.println(horsetoString.toString());
		
	}

}
