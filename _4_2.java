import java.util.*;

class _4_2{
        public static void main(String [] args){
          Scanner sc = new Scanner(System.in);
          Student s = new Student("Sanath" , "Karimnagar");
          s.addCourseGrade("OOPS" , 3);
          s.addCourseGrade("DBMS" , 4);       
          s.addCourseGrade("DSA" , 3);
          s.addCourseGrade("DAA" , 2);     
          s.printGrades();
          System.out.println("Average grade of student is " + s.getAverageGrade());
          System.out.println(s); 
          Teacher t = new Teacher("xyz" , "abc");
          System.out.println(t.addCourse("OOPS"));
          System.out.println(t.addCourse("OOPS"));    
          System.out.println(t.addCourse("DBMS"));    
          System.out.println(t.addCourse("DSA"));      
          System.out.println(t.removeCourse("DSA"));                                       
          System.out.println(t.removeCourse("DAA"));
          System.out.println(t);                                                                                               
}
}

class Pair{
  String course;
  int grade;
  Pair(String course , int grade){
     this.course = course;
     this.grade = grade;
  }

}


class Person{
    String name,address;
    Person(String _name , String _address){
       name = _name;
       address = _address;
    }
    String getName(){
        return name;
    }
    String getAddress(){
        return address;
    }
    void setAddress(String a){
       address = a;
    } 
   
    public String toString(){
       return this.name + "(" + this.address + ")";
    }   
}

class Student extends Person{
     int numCourses = 0;
     double sum = 0;
     ArrayList<Pair> cng = new ArrayList<>();
    Student(String _name , String _address){
       super(_name , _address);
       name = _name;
       address = _address;
    }
    void addCourseGrade(String course, int grade){
        Pair p = new Pair(course,grade);
        cng.add(p);
        sum += grade;
        ++numCourses;
    }
    void printGrades(){
       for(Pair p : cng){
           System.out.println(p.course + "--> " + p.grade);
       }
    }
    
    double getAverageGrade(){
       if(numCourses == 0)return 0.0;
       return sum / numCourses;
    }
    @Override
    public String toString(){
       return "Student: " + this.name + "(" + this.address + ")";
    }       
}

class Teacher extends Person{
     int numCourses = 0;
     HashSet<String> set = new HashSet<>();
     
    Teacher(String _name , String _address){
       super(_name , _address);
       name = _name;
       address = _address;
    }
    boolean addCourse(String course){
       if(set.contains(course))return false;
       set.add(course);
       ++numCourses;   
       return true;
    }
    
    boolean removeCourse(String course){
       if(set.contains(course)){
           set.remove(course);
           --numCourses;
           return true;
       }
     
       return false;
    }
    @Override
    public String toString(){
       return "Teacher: " + this.name + "(" + this.address + ")";
    }       
}

