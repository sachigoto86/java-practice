package java_quiz;

import java.util.Date;

public class GetPerson {

    public static void main(String[] args) {
         
       var birth = new Date();
       
       var p = new Person("Taro", 30, birth);
       System.out.println(p.getBirth());
     
       
       birth.setDate(15);
       
       System.out.println(p.getBirth());
       

    }

}