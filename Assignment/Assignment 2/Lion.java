package edu.neu.csye6200.assignment2;

public class Lion extends ZooAnimals{

	@Override
	public void zooAnimals() {
		System.out.println("\nI am a Lion [** Concrete Class Extended **] !!!");
	}

	@Override
	public String toString() {
		return "\n\tZooAnimals [Hi, I am " + getName() + ", and I " + getSound() + " when I am hungry!]";
	}
}
