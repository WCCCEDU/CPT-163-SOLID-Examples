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
public class Bird {
  private String name;

  public Bird(String name) {
	this.name = name;
  }

  public String getName() {
	return name;
  }
  
  public void eat(){};
  public void fly(){};
}
