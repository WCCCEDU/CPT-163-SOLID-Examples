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
public class I {
  public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
	SingleValueShape circ = (SingleValueShape) new ShapeArea("isp.Circle").getShape();
	SingleValueShape squ = (SingleValueShape) new ShapeArea("isp.Square").getShape();
	SingleValueShape tri = (SingleValueShape) new ShapeArea("isp.EquilateralTriangle").getShape();
	DoubleValueShape rect = (DoubleValueShape) new ShapeArea("isp.Rectangle").getShape();
	
	System.out.println(circ.area(10));
	System.out.println(squ.area(10));
	System.out.println(tri.area(10));
	System.out.println(rect.area(10, 20));
  }
}
