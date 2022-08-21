package lambda_comparator_sort;
import java.util.ArrayList;
import java.util.List;

public class Student {
    
   String name; 
   int age; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getAge() { 
      return age; 
   } 
   public int getId() { 
      return id; 
   } 
   public Student(String n, int a, int i){ 
      name = n; 
      age = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getAge() +                     
              " Id: "+ this.getId()+"]"); 
   }
}

