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
public class FligtlessBird extends Bird{

  public FligtlessBird(String name) {
	super(name);
  }

  @Override
  public void eat() {
	System.out.println("\teating");
  }

  @Override
  public void fly() {
	throw new UnsupportedOperationException("Doesn't Fly");
  }
  
}
