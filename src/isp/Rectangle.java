/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp;

/**
 *
 * @author samuraipanzer
 */
public class Rectangle implements DoubleValueShape{

  @Override
  public double area(double length, double width) {
	return length * width;
  }
  
}
