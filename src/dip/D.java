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
public class D {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	PrimitiveShape circ = new ShapeArea("dip.Circle").getShape();
	PrimitiveShape squ = new ShapeArea("dip.Square").getShape();
	PrimitiveShape tri = new ShapeArea("dip.Triangle").getShape();
	
	System.out.println(circ.area(10));
	System.out.println(squ.area(10));
	System.out.println(tri.area(10));
  }
  
}
