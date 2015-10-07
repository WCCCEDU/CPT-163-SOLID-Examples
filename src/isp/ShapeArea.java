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
public class ShapeArea {
  private Class shapeClass;
  ShapeArea(String shape) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	this.shapeClass = Class.forName(shape);
  }
  public Object getShape() throws InstantiationException, IllegalAccessException{
	return this.shapeClass.newInstance();
  }
 
}
