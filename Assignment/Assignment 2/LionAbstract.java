package edu.neu.csye6200.assignment2;

public class LionAbstract extends ZooAbstractAnimals{
	
	@Override
	public void zooAbstractAnimals() {
		System.out.println("\nI am a Lion [** Abstract Class Extended **] !!!");
	}
	
	@Override
	public String toString() {
		return "\n\tZooAbstractAnimals [Hi, I am " + getName() + ", and I " + getSound() + " when I am hungry!]";
	}

}
