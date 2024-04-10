package java1;

import java.util.Arrays;
import java.util.Objects;

public class Sample101 {

    public static void main(String[] args) {
          System.out.println("Hello, World");
          int i1 = 108;
          int i2 = 108;
          
          System.out.println(i1== i2);
          
          int j1 = 2556;
          int j2 = 2556;
          System.out.println(j1 == j2);
          
          var age = 18;
          System.out.println(age >= 20 ? "おとな":"こども");
          
          
          String value = "34";
          
          System.out.println(value == null ? "値なし": value);
          
          // true
          System.out.println("123".equals("123")); 
          
          // エラー
//          System.out.println("123" == 123);
          
          // false
          System.out.println(new StringBuilder("あいう") == new StringBuilder("あいう"));
          
          //true
          System.out.println(Arrays.equals(new int[] {1,2,3}, new int[]{1,2,3}));
          
          String str = null;
          System.out.println(Objects.isNull(str));
          
          var x = 6;
          var y = x;
          y -= 2;
          
          System.out.println(y);
          
          
          var builder1 = new StringBuilder("いろは");
          var builder2 = builder1;
          builder1.append("にほへと");
          System.out.println(builder1);
          System.out.println(builder2);
          
           String str2 = null;


          if(str2.endsWith(".java")) {
              System.out.println("拡張子は.javaです");
              
              
              
              
              
          }
          
          
          
          
          
          
          
          
          
//          System.out.println(age >= 20　?　"おとな"：”こども”);
        // TODO 自動生成されたメソッド・スタブ

    }

}
