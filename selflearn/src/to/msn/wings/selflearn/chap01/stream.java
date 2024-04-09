package to.msn.wings.selflearn.chap01;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class stream {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
    
        int value = 10;
        
        String s = Integer.toBinaryString(value);
        
        
        
        Integer bnum =3;
        int num = bnum;
        
        String test = "123";
        System.out.println( Integer.parseInt(test));
        
        int wrapperNum = 255;
       
        System.out.println(Integer.toString(wrapperNum, 16));
        
        var str = "叱る";
                //指定した文字列のはじめと終わりをいれる。
        System.out.println(str.codePointCount(0, str.length()));
        System.out.println(str.length());
        
        var compstr1 = "あいう";
        var compstr2 = "あいう";
        
        System.out.println(compstr1 == compstr2);
        
        StringBuilder valA = new StringBuilder("あいう");
        StringBuilder valB = new StringBuilder("あいう");
        System.out.println(valA.toString().equals(valB.toString()));
        System.out.println(valA == valB);
        
        
        var compString = "hello";
        
        System.out.println(compString.compareTo("hey"));
        
        var stringtest = "def";
        System.out.println(stringtest.compareTo("abc"));
        
        
        var str5 = "Wings";
        System.out.println(str5.equals("WINGS"));
        System.out.println(str5.equalsIgnoreCase("WINGS"));
        
        
        var str6 = "";
        System.out.println(str6.isEmpty());
        System.out.println(str6.isBlank());
        

        var empty = "     ";
        System.out.println(empty.isBlank());
        System.out.println(empty.isEmpty());
        
        
        var stripSpace = "　　こんにちは　　";
        var stripSpace2 = "  こんにちは  ";
        
        System.out.println(stripSpace.stripLeading());
        System.out.println(stripSpace2.stripLeading());
        System.out.println(stripSpace.trim());
        System.out.println(stripSpace2.trim());
        
        var containsString = "  WINGS プロジェクト";
        
        System.out.println(containsString.startsWith("WINGS",2));
        
        var str10 = "WINGSプロジェクト";

        System.out.println(str10.substring(5,7));
        

        System.out.println(str10.substring(5));
        
        var mailAddress = "yamada@example.com";
        System.out.println(mailAddress.substring(mailAddress.lastIndexOf("@")));
        
        var character = "叱る";
        
        System.out.println(character.charAt(1));
        
        
        String str11 = "white,green,blue,red,,";
        String[] colors = str11.split(",", 3);
        
        System.out.println(Arrays.toString(colors));
     
        for (int i = 0; i < colors.length; i++) {
          System.out.println(colors[i]);
        }
        
        var arrayString = "うめ、もも、さくら";
        
        
        System.out.println((arrayString).length());
        var string2 = "うめ、もも、さくらと、たけ,ま";
        var result2 = string2.split("[,けう]");
        
        System.out.println(Arrays.toString(result2));
        
       
        var stringPractice = "プログラミング言語";
        
        System.out.println(stringPractice.substring(0,7));
        
        var stringPractice2 = "鈴木\t太郎\t男\t50歳\t広島県";
        
        System.out.println(Arrays.toString(stringPractice2.split("[￥t]")));
        var string199 = stringPractice2.split("[￥t]");
        System.out.println(string199);
        
        System.out.println(String.join("", string199));
        
        
        
        
        
        var tel = new String[] {"080-0000-0000", "084-000-0000", "184-0000"};


        var rx = "\\d{2,4}-\\d{2,4}-\\d{4}"; 

        for(var t:tel){
           System.out.println(Pattern.matches(rx,t)?t:"unmatch");
           }
        
        System.out.println(LocalDateTime.now());
        
        var todaydate = LocalDateTime.now();
        
        var ptn = Pattern.compile("(\\d{4}) -? (\\d{2}) -? (\\d{2}) "); 
        
        
        
       var testSplit = "Hello, world, !";
       System.out.println(Arrays.toString(testSplit.split(",", 2)));
        
     
        System.out.println(String.format("%10s is a %s, %d years old.", "Sakura", "girl", 100));
       
        
        
        
        var testSTring  = "鈴木\t太郎¥t男\t５０際¥t広島県";
        
        testSTring.split("¥t");
        System.out.println(String.join("&", testSTring));
        
//        Pattern pattern = Pattern.compile("[A-Z].[fk]e");
     // the pattern checks if it's got firtst character in capital letter, 
     //followed by any single character 
     // followed by a character which has either f or k
     // and end with an e

//     Matcher matcher = pattern.matcher("Like");
//
//     boolean matches = matcher.matches();
//     System.out.println(matches);
        
     
//     Pattern pattern = Pattern.compile("[A-Z][a-z]");
//     Matcher matcher = pattern.matcher("GeEKIfic");
//     for(int i =0; i<5; i++){
//        boolean match = matcher.find();
//        System.out.println(match);
//        }
//                
//     Pattern pattern = Pattern.compile("([a-zA-Z]{4})(.*)([a-zA-Z]{9})");
//     Matcher matcher = pattern.matcher("LikeAndSubscribe");
//     if(matcher.matches()){
//        System.out.println(matcher.group(1));
//     }
//        
//        
//     String dummyText = "住所は　〒160-0000　新宿南町0-0-0です。\n　あなたの住所は〒210-9999　川崎市北町1-1-1ですね";
//     Pattern postalCode = Pattern.compile("(\\d{3})-(\\d{4})");
//     Matcher findPostalCode = postalCode.matcher(dummyText);
//     System.out.println(findPostalCode);
//     while(findPostalCode.find()) {
//         System.out.println(findPostalCode.group());
//     }
//     
//     System.out.print(dummyText);
        
//        
//        Pattern pattern = Pattern.compile("Like And Subscribe", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("like and subscribe");
//        System.out.println(matcher.matches());
        
//        Pattern pattern = Pattern.compile("(.*)", Pattern.DOTALL);
//        Matcher matcher = pattern.matcher("like\ngeekific");
//        if(matcher.find()){
//           System.out.println(matcher.group());
//           }
        
        var multi = "10 indians. \n 1st grade ";
        var findDigits = Pattern.compile("\\d+");
        
        var match= findDigits.matcher(multi);
        while(match.find()) {
            System.out.println(match.group());
            
        
        }
        
        List<Integer> nums = Arrays.asList(4,5,6,7,8,9,4);
        
        Stream<Integer> data = nums.stream();
        Stream<Integer> sortedData = data.sorted();
        
        sortedData.forEach(n->System.out.println(n));
   
        
        
        
        
        
        
        
    }

}
