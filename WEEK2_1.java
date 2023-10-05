

class Circle{
  double radius;
  static int circle_count = 0;
  Circle(double radius){
     this.radius = radius;
     ++circle_count;
  }
  
  Circle(){
    this(0.0);
  }
  
  double getPerimeter(){
    return 3.14*2*radius;
  }
  
  double getArea(){
     return 3.14*radius*radius;
  }

}

public class WEEK2_1{

    public static void main(String [] args){
    Circle c1 = new Circle(5);
    Circle c2 = new Circle(10);
    Circle c3 = new Circle(15);    
    System.out.println("area of c1 is " + c1.getArea() );    
    System.out.println("perimeter of c2 is " + c2.getPerimeter() );  
    System.out.println("area of c3 is " + c3.getArea() );    
    System.out.println("no of circles are " + Circle.circle_count );           
    }



}
