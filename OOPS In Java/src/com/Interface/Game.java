/*
 * Task3>>
Write a Java program to create an interface Playable with a method play()
 that takes no arguments 
and returns void. 
Create three classes Football, Volleyball, and Basketball that implement 
the Playable interface 
and override the play() method to play the respective sports.


 */
package com.Interface;

interface Playable {
	void play();
	 default void show()
	{
		System.out.println("show");
	}
}

class Football implements Playable {

	@Override
	public void play() {
		System.out.println("play method in Football");
	}

}

class Volleyball implements Playable {

	@Override
	public void play() {
		System.out.println("play method in Volleyball");
	}

}

class Basketball implements Playable {

	@Override
	public void play() {
		System.out.println("play method in Basketball");
	}

}

public class Game {

	public static void main(String[] args) {

		Playable p;
		p = new Football();
		p.play();
		p = new Volleyball();
		p.play();
		p = new Basketball();
		p.play();
		p.show();
	}

}
