package practice;

public class BusinessInheritanceClass extends InheritanceClass{
   
     public String show() {
         
           return String.format("office worker %s is %d years old", this.name, this.age);
         
     }
     
     
      public String work(){
          return String.format("%d years old %s works", this.age, this.name);
          
      }
    

}
