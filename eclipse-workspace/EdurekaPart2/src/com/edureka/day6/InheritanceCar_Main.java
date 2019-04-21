package com.edureka.day6;

public class InheritanceCar_Main {

	public static void main(String[] args) {
		
		InheritanceMachine mac=new InheritanceMachine();
		System.out.println("-------------------------");
		mac.start();
		mac.stop();
		
		System.out.println("-------------------------");
		InheritanceCar car =new InheritanceCar();
		car.accelerate();
		
		System.out.println("-------------------------");
		InheritanceMachine mac1=new InheritanceCar();
		mac1.start();
		mac1.stop();
		
	}

}
