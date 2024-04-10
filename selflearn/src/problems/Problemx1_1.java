package problems;

public class Problemx1_1 {

    public static void main(String[] args) {
        
        int a = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int b = (int)(Math.random() * 10)  + 1;     //  1～10の乱数を発生
        int add = add(a,b);  //  二つの数の和を求める
        int sub = sub(a,b);
//        int calc = calc(a, b, "add");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//        System.out.println(calc);
//   
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " - " + b + " = " + sub);

    }
      static int add(int a,int b){
            return a + b;
        }
      
      static int sub(int a,int b){
          return a - b;
      }
      
//      static int calc(int a, int b, String operator) {
//          if(operator == "add") {
//              return a + b;
//          }else {
//              return a - b;
//          }
//          
//      }

}
