package com.josh;

public class Main {

    public static void main(String[] args) {
	Cycle cycle = new Cycle();
        cycle.printInfo();
        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.weight);
        System.out.println(bicycle.brand);
        
    }
}
