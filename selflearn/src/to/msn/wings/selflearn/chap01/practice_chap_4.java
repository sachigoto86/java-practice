package to.msn.wings.selflearn.chap01;

public class practice_chap_4 {

    public static void main(String[] args) {
        
        
        for(var value:args) {
            var i = Integer.parseInt(value);
            System.out.println(i*1.5);
        }
        
        
        var test = 0;
        var sum =0;
        
        while(test<=100) {
               sum++;
            if(sum >1000) {
               break;
            };
          test++;
            
        }
        
        System.out.println("sum is " + sum);
        
        
        
        for(var z = 100; z>=100 && z <=200; z++){
            if(z%2 != 0) {
                System.out.print(" "+z);
            }
            
//            System.out.println();
        }
        
        
        System.out.println();
        
        
        var language = "Scala";
        
        switch(language) {
        case "Scala":
        case "Kotline":
        case "Groovy":
            System.out.println("JVM言語");
            break;
        case "C#":
        case "Visual Basic":
        case "F#":
            System.out.println(".NET言語");
            break;
        default :
            System.out.println("不明");
            break;
          
        }
        
        
        if ("Scala".equals(language) || "Kotlin".equals(language) || "Groovy".equals(language)) {
              System.out.println("JVM言語");
            // Code block to execute if language is Scala, Kotlin, or Groovy
        }else if( "C#".equals(language) || "Visual Basic".equals(language) || "F#".equals(language) ){
            
            System.out.println(".NET言語");
            
        }else {
            System.out.println("不明");
        }

        
        
        
        
        // 90点以上　優
        //７０点以上　良　５０点以上　可　それ以下の場合は　不可
        
        int var = 910;
        
        if(var > 90) {
            System.out.println("優");
            
        }else if(var >70) {
            System.out.println("良");
        }else if(var > 50) {
            System.out.println("可");
        }else {
            System.out.println("不可");
        }
        
        
        var m = 6;
        while(m < 6) {
            System.out.println(m + "番目のループです。");
            m++;
        }
        
        
        var n = 6;
        do {
            System.out.println(n + "番目のループです。");
            n++;
        }while(n <6);
        
        
        var data = new String[] {
                "うめ", "さくら", "もも"
        };
        
        for(var value:data) {
            System.out.println(value);
        }
        
        
        for(var x= 1 ; x <= 9; x++) {
            for(var y=1 ; y <= 9; y++) {
                System.out.print(" " + x*y);
            }
            
            System.out.println("\n");
        }
        
        limit:
            for(var i =1; i<10; i++) {
                for(var j=1; j<10; j++){
                    var result = i * j;
                    if(result > 50) {
                        break limit;
                    }
//                    System.out.printf("%2d", result);
                }
            }
        
        
        
         
    }
    

        
    

}
