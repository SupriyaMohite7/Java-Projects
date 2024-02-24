/* Task2> 


Create a class Game having the method rules() and noOfPlayers(). 
Create a class BasketBall, Soccer, Cricket
which are child class of Game. Override the above methods and 
use dynamic method dispatch
to show thw rules and noofPlayers according to the object passe
*/
package com.DynamicMethodDispatch;

class Game
{
	void rules()
	{
		System.out.println("this is rule method of game class");
	}	
	void noOfPlayers()
	{
		System.out.println("this is no of players method of game class");
	}
}
class BasketBall extends Game
{
	void rules()
	{
		System.out.println("No player can touch the basketball "
				+ "while it is traveling downward towards the "
				+ "basket or if it is on the rim. ");
	}	
	void noOfPlayers()
	{
		System.out.println("there are 12 players in basketball");
	}
}
class Soccer extends Game
{
	void rules()
	{
		System.out.println("The game begins with the toss of a coin, "
				+ "and the winning captain decides which goal to defend or "
				+ "to take the first kick off.");
	}	
	void noOfPlayers()
	{
		System.out.println("there are 11 players in soccer");
	}
}
class Cricket extends Game
{
	void rules()
	{
		System.out.println("The match is broken down into separate sections"
				+ " called balls, which is one delivery of the ball bowled"
				+ " by a bowler to a batsman. Six of these balls form an "
				+ "over.");
	}	
	void noOfPlayers()
	{
		System.out.println("there are 11 players in cricket");
	}
}

public class Dynamic_method_dispatch {

	
	
	public static void main(String[] args) {

		Game g;
		g=new Cricket();
		g.rules();
		g.noOfPlayers();
		System.out.println("---------------------------------------------");
		g=new BasketBall();
		g.rules();
		g.noOfPlayers();
		g=new Soccer();
		System.out.println("---------------------------------------------");
		g.rules();
		g.noOfPlayers();
		System.out.println("---------------------------------------------");
		g=new Game();
		g.rules();
		g.noOfPlayers();
	}

}
