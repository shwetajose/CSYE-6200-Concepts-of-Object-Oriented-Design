package edu.neu.csye6200.assignment2;

public interface ZooAnamalisticAnimals {
	
	public void zooAnamalisticAnimals();

    public static void demo() {
		
    	ZooAnamalisticAnimals lionInterface = new LionInterface();
    	lionInterface.zooAnamalisticAnimals();
		
    	ZooAnamalisticAnimals horseInterface = new HorseInterface();
    	horseInterface.zooAnamalisticAnimals();
	}
}