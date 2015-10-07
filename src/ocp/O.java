/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocp;

import java.util.ArrayList;

/**
 *
 * @author samuraipanzer
 */
public class O {
  public static void main(String[] args){
	Triangle tri = new Triangle(10, 20, 30);
	Circle cir = new Circle(10);
	Square sqr = new Square(10);
	
	ArrayList<Shape> shapes = new ArrayList<>();
	shapes.add(tri);
	shapes.add(cir);
	shapes.add(sqr);
	
	for(Shape s : shapes){
	  System.out.println(s.Area());
	}
  }
}
