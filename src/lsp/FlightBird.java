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
public class FlightBird extends Bird{
  public FlightBird(String name) {
	super(name);
  }

  @Override
  public void eat() {
	System.out.println("\teating");
  }

  @Override
  public void fly() {
	System.out.println("\tflying");
  }
  
}
