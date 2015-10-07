/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip;

/**
 *
 * @author samuraipanzer
 */
public class Square implements PrimitiveShape{

  @Override
  public double area(double singleMeasure) {
	return singleMeasure * singleMeasure;
  }
  
}
