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
public class Triangle extends Shape{
  private double side1;
  private double side2;
  private double side3;

  public Triangle(double side1, double side2, double side3) {
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
  }

  public double getSide1() {
	return side1;
  }

  public double getSide2() {
	return side2;
  }

  public double getSide3() {
	return side3;
  }
  
  @Override
  public double Area() {
	return (this.side1 + this.side2 + this.side3) / 2;
  }
  
}
