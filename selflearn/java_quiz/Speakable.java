package java_quiz;

public interface Speakable {
       default void speak(String content) {
            System.out.println(content);
            
        }

}
