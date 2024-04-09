package Interface;

public class Baseball implements Englishable{
      public void display() {
          System.out.println("キャッチボール");
          
      }
      
      public void displayEng() {
          System.out.println(Englishable.LANGUAGE);
          System.out.println("Catch ball");
      }

}
