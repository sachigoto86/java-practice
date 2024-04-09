package java_quiz;

import java.util.Date;

public class Person {
 
        private final String name;
        private final int age;
        
        private final Date birth;
        
        public Person(String name, int age, Date birth) {
            this.name = name;
            this.age = age;
            this.birth = birth;
        }
        
        
        public String getName() {
            return this.name;
        }
        
        public int getAge() {
            return this.age;
        }
        
        public Date getBirth() {
            return this.birth;
        }
    
}
