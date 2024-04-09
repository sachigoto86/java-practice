package practice;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class practice101 {

    public static void main(String[] args) throws IOException, InterruptedException {
        var client = HttpClient.newHttpClient();
        var req = HttpRequest.newBuilder()
                .uri(URI.create("https://codezine.jp/"))
                 .build();
        
 
//        var res = client.send(req,HttpResponse.BodyHandlers.ofString());

        
        
        var res = client.send(req, HttpResponse.BodyHandlers.ofString());
      
        System.out.println(res.body());      
        
        

        
        
        
        // Quiz 1
        
        // 整数型intValueに１０の値を入れて定義してくださいs
        // 浮動小数点型doubleValueに3.14と値を入れて定義してください
        // 文字列型stringValueに"Hello, World!"という値で定義してください
        // 真偽値型booleanValueを真の値を入れて定義してください
        
        ///////////////////////////////////////////////////////////////////////


        int intValue = 10;
        double doubleValue = 3.14;
        String stringValue = "Hello, World!";
        boolean booleanValue = true;

        Test(intValue, doubleValue, stringValue, booleanValue);
        
        
//        Quiz2
        
        int firstNum = 10;
        int secondNum = 20;
        int total = calSum(firstNum , secondNum);
        System.out.println("Sum: " + total);
        System.out.println(calSub(firstNum, secondNum));
        System.out.println(calMulti(firstNum, secondNum));
        System.out.println(calDiv(firstNum, secondNum));
    }
    
    
    public static void Test(int a, double b, String c, boolean d){
        int testScore = 0;
        testScore += (a == 10)?25:0;
        testScore += (b == 3.14)?25:0;
        testScore += (c == "Hello, World!")?25:0;
        testScore += (d)?25:0;
    
   
    
    }
    


    
    
    //Quiz2
    
    
    //上記までを参考に、引き算を行う関数・掛け算を行う関数・割り算を行う関数を作成してみてください
      
      public static int calSum(int a, int b){
          return a + b;//aとbの合計値を返す
          
          

}
      public static int calSub(int a, int b){
          return a - b;//aとbの合計値を返す
          
          

}
      public static int calMulti(int a, int b){
          return a * b;//aとbの合計値を返す
          
          

}
      
      public static double calDiv(int a, int b){
          return (double)a / b;//aとbの合計値を返す
          
          
          


      }
  
      
}
