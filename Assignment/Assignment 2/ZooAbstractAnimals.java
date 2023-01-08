package edu.neu.csye6200.assignment2;

public abstract class ZooAbstractAnimals {
	
	private String name;
	private String sound;
	
	public ZooAbstractAnimals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ZooAbstractAnimals(String name, String sound) {
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
		return "ZooAbstractAnimals [Hi, I am \" + name + \", and I \" + sound + \" when I am hungry!]";
	}

	public abstract void zooAbstractAnimals();

public static void demo() {
		
		ZooAbstractAnimals lionAbstract = new LionAbstract();
		lionAbstract.zooAbstractAnimals();
		
		ZooAbstractAnimals horseAbstract = new HorseAbstract();
		horseAbstract.zooAbstractAnimals();
		
		ZooAbstractAnimals lionAbstracttoString = new LionAbstract();
		lionAbstracttoString.setName("Mufasa, the (abstract) lion");
		lionAbstracttoString.setSound("roar");
		System.out.println(lionAbstracttoString.toString());
		
		ZooAbstractAnimals horseAbstracttoString = new HorseAbstract();
		horseAbstracttoString.setName("Pascal, the (abstract) horse");
		horseAbstracttoString.setSound("neigh");
		System.out.println(horseAbstracttoString.toString());
	}
}
