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
public class Circle extends Shape{
  private double radius;

  public Circle(double radius) {
	this.radius = radius;
  }

  public double getRadius() {
	return radius;
  }

  /**
   * Area is (PI)r^2
   * @return 
   */
  @Override
  public double Area() {
	return (this.radius * this.radius) * Math.PI;
  }
}
