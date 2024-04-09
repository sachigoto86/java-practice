package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Person {
    public String name;
    public int age;
    public LocalDateTime updated;

    //初期化ブロック
    {
        this.updated = LocalDateTime.now();
    }

    public Person(String firstName, String lastName, LocalDate birth){
    this.name = lastName + "" + "" + firstName;
    this.age = Period.between(birth, LocalDate.now()).getYears();
    
    }

}
   