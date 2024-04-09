package java_quiz;

public class Hamster {
    
    public String name;
    private int age;
    
    static String classInstance; 
    
    
    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
        
    }
    
    
    public Hamster() {
        this("kengenbei", 0);
          
    }
    
     public void  show(){
        System.out.printf("%s %d years old ", this.name, this.age);
//        return name + " " + age; 
        
    }
     

    
    

}


