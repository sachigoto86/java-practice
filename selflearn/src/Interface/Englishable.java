package Interface;

// Since the word interface is added to the class, it automatically add fial to const and methods become abstract methods. 
public interface Englishable {
    String LANGUAGE = "English";
    void displayEng();
    default void helloWorld() {
        System.out.println("Hello world");
    }
    
 
    
    
}
