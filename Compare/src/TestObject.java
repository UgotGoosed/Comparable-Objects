/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gansc
 */
public class TestObject {
    public static void main(String[] args) {

        GeometricObject rect1 = new Rectangle(1, 1, "Red", true);
        GeometricObject rect2 = new Rectangle(2, 2, "Blue", false);
        System.out.println("The first Rectangle area is: " + rect1.getArea());
        System.out.println("The second Rectangle area is: " + rect2.getArea());
        Rectangle.max(rect1, rect2);
    }
}
