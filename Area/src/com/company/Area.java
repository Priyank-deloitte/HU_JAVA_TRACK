package com.company;


public class Area {

    public static void main(String[] args) {

        Circle cir = new Circle();
        cir.area(15.0F);
        Square sq = new Square();
        sq.area(45);
        Rectangle rec = new Rectangle();
        rec.area(20,10);
        Triangle t=new Triangle();
        t.area(7.0F, 10.0F);


    }
}
class Rectangle{
    void area(int l, int b) {
        System.out.println("The are of rectangle is : " + l * b);
    }
}
class Square{
    void area(int s) {
        System.out.println("The area of the square is : " + s * s);
    }
}
class Triangle{
    void area(float base, float height) {
        System.out.println("The area of the triangle is : " + (base * height) / 2);
    }
}
class Circle{
    void area(float radius) {
        System.out.println("The area of the circle is : " + 3.14 * radius * radius);
    }
}