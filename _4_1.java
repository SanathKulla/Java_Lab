import java.util.*;

public class _4_1{
        public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
        
          while(true){
          System.out.println("To use the methods of a circle enter circle");
          System.out.println("To use the methods of a square enter square");
          System.out.println("To use the methods of a rectangle enter rectangle");
          System.out.println("To exit the application enter exit");          
          String s = sc.next();
          s = s.toLowerCase();
          if(s.equals("circle")){
               double r;
                  System.out.println("Enter the radius of the circle"); 
                  r = sc.nextDouble();      
                  Circle c = new Circle(r);
                  while(true){
                  System.out.println("If you need area enter area else if you need perimeter enter perimeter and if you dont want anything enter exit"); 
                  String know = sc.next();   
                  if(know.equalsIgnoreCase("area")){
                    System.out.println("The area of the circle is " + c.getArea()); 
                    break;
                  }else if(know.equalsIgnoreCase("perimeter")){
                    System.out.println("The perimeter of the circle is " + c.getPerimeter()); 
                    break;
                  }else if(know.equalsIgnoreCase("exit")){
                      break;
                  }else{
                      continue;
                  }    
                  }              
          }
          if(s.equals("square")){
             double ss;
                  System.out.println("Enter the side of the square");  
                  ss = sc.nextDouble();     
                  Square S = new Square(ss);
                  while(true){
                  System.out.println("If you need area enter area else if you need perimeter enter perimeter and if you dont want anything enter exit"); 
                  String know = sc.next();   
                  if(know.equalsIgnoreCase("area")){
                    System.out.println("The area of the square is " + S.getArea()); 
                    break;
                  }else if(know.equalsIgnoreCase("perimeter")){
                    System.out.println("The perimeter of the square is " + S.getPerimeter());
                    break;
                  }else if(know.equalsIgnoreCase("exit")){
                      break;
                  }else{
                      continue;
                  }
                  }
          }
          if(s.equals("rectangle")){
             double l,b;
                  System.out.println("Enter the length and breadth of the rectangle");  
                  l = sc.nextDouble();     
                  b = sc.nextDouble();  
                  Rectangle r = new Rectangle(l,b);
                  while(true){
                  System.out.println("If you need area enter area else if you need perimeter enter perimeter and if you dont want anything enter exit"); 
                  String know = sc.next();   
                  if(know.equalsIgnoreCase("area")){
                    System.out.println("The area of the rectangle is " + r.getArea()); 
                    break;
                  }else if(know.equalsIgnoreCase("perimeter")){
                    System.out.println("The perimeter of the rectangle is " + r.getPerimeter()); 
                    break;
                  }else if(know.equalsIgnoreCase("exit")){
                      break;
                  }else{
                      continue;
                  }
                  }
          }
          if(s.equals("exit")){
                  System.out.println("Application exited");
                  break;  
          }
        }
        }
  

  
}

abstract class Shape{
    abstract double getArea();
    abstract double getPerimeter();
}

class Rectangle extends Shape{

      double l , b;
      
      Rectangle(double l , double b){
          this.l = l;
          this.b = b;
      }
      
      Rectangle(){
         this(0,0);
      }

      double getArea(){
         return l*b;
      }
      
      double getPerimeter(){
         return 2*l + 2*b;
      }


}

class Square extends Shape{

      double s;
      
      Square(double s){
          this.s = s;
      }
      
      Square(){
         this(0.0);
      }

      double getArea(){
         return s*s;
      }
      
      double getPerimeter(){
         return 4*s;
      }

}

class Circle extends Shape{

      double r;
      
      Circle(double r){
          this.r = r;
      }
      
      Circle(){
         this(0.0);
      }

      double getArea(){
         return 3.14*r*r;
      }
      
      double getPerimeter(){
         return 2*3.14*r;
      }

}
