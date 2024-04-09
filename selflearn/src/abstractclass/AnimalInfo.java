package abstractclass;

public class AnimalInfo {

    public static void main(String[] args) {
        Animal animal1 = new Animal(); 
        
        
        animal1.setAge(5);
        System.out.println(animal1.getAge());
        
        animal1.setName("Tiger");
        System.out.println(animal1.getName());
        
    }

}
