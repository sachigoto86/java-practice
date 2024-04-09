package practice;

import java.time.LocalDate;

public class personClass {

    public static void main(String[] args) {
        
       var nameAndBirthDate = new Person("Sachi", "Goto", LocalDate.of(1986, 6, 2));
       System.out.println(nameAndBirthDate.name); 
       System.out.println(nameAndBirthDate.age);
       System.out.println(nameAndBirthDate.updated);
       
    }

}
