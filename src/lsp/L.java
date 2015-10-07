/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lsp;

/**
 *
 * @author samuraipanzer
 */
public class L {
  public static void main(String[] args){
	Bird bird = new Bird("Osterich");
	FlightBird flightBird = new FlightBird("Eagle");
	FligtlessBird fligtlessBird = new FligtlessBird("Cow");
	
	describeBird(bird);
	describeBird(flightBird);
	describeBird(fligtlessBird);
  }
  
  public static void describeBird(Bird bird){
	System.out.println(bird.getName());
	bird.fly();
	bird.eat();
  }
}
