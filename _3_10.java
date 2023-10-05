/*10. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender,
Emp_designation, Emp_salary, Emp_Address etc., */
import java.util.*;

public class _3_10{
   public static void main(String [] args){
        String ss;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        ss = sc.next();
        ss = ss.toUpperCase();
        System.out.println(ss);    
        ss = ss.toLowerCase();
        System.out.println(ss);        
   
   }
 
  
}

class Employee{
     String name;
     int age;
     String gender;
     String desgnation;
     double salary;
     String address;
   
}
