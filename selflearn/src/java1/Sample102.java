package java1;

public class Sample102 {

         public static void main(String[] args) {
                //  数値の表示
                System.out.print(123);
                System.out.println(456);
                //  文字列の表示
                System.out.print("ABC");
                System.out.println("DEF");
//                日本語で表示
                System.out.print("日本語を");
                System.out.println("表示");
        // TODO 自動生成されたメソッド・スタブ
//                var result = "";
//                for(var i =0; i<10000; i++) {
//                    result += "いろは";
//                }
//  System.out.println(result);
  
 
  var i = 3;
  var j = i++;
  System.out.println(i);
  
  System.out.println(3d/4d);
  
  var test_value = 5d/0;
      System.out.println(test_value); 
  
      var x = 10;
      x <<= 2;
      System.out.println(x);
  
//     final  String str = "hello";
//     str = "Changed";
//     System.out.println(str);
//     
      
      var builder1 = new StringBuilder("あいう");
      var builder2 = new StringBuilder("あいう");
      
      System.out.println(builder1.toString().equals(builder2.toString()));
     
     System.out.println(builder1.toString() == builder2.toString());
     
     System.out.println(5/10);
     
  
    }
         
         
            

}
