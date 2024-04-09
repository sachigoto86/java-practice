package abstractclass;

public class Animal {
    private String name;
    private int age;

    public Animal() {

       this("no name", 0);

    }
    
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // accesser method

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    public void setAge(int age) {
        if (age < 0) {
            age = 0;
        } else {

            this.age = age;
        }

    }

    public int getAge() {

        return this.age;
    }

    

    public String intro() {
        return String.format("my name is $s. $d years old,", this.name, this.age);
    }

}
