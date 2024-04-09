package java_quiz;

import static java.lang.Math.*;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
    
            var opt1 = Optional.of("Sample");
            var opt2 = Optional.ofNullable("Hello");
            
            System.out.println(opt1.isPresent());
            System.out.println(opt1);
            System.out.println(opt2.orElse("the value is null"));
            
            System.out.println(abs(-10));
            
            
            
            
            
            
            
            
    }

}
