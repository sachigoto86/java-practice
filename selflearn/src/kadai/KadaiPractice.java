package kadai;

public class KadaiPractice {

    public static void main(String[] args) {
        
      class Results{
          static int wins =0;
          int loses =0;
          int draws =0;
      }
      
      
       int wins = Results.wins;
       wins += 1;
       
       System.out.print(wins);
    }

}
