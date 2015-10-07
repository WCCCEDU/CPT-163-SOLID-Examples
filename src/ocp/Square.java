/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

/**
 *
 * @author samuraipanzer
 */
public class Square extends Shape{
  private double height;

  public Square(double height) {
	this.height = height;
  }

  public double getHeight() {
	return height;
  }
 
  @Override
  public double Area() {
	return this.height * this.height;
  }

}
