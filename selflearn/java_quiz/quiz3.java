package java_quiz;

public class quiz3 {

    public static void main(String[] args) {
        int testNum1 = 100, testNum2 = 1000, testNum3 = 10;
        System.out.print(ketaSuu(testNum1));//3桁と出力
        System.out.print(ketaSuu(testNum2));//4桁と出力
        System.out.print(ketaSuu(testNum3));//2桁と出力   
        
        
       
        

    }

    public static String ketaSuu(int a) {
        int digits = String.valueOf(a).length();
        //        String result =    

//                switch (digits) {
//                case 3:
//                    return  "3桁";
//                case 4:
//                    return  "4桁";
//                case 2:
//                    return  "2桁";
//                    
//                default:
//                    return  "";
//        
//                }

        if (digits == 3) {
            return "3桁";
        } else if (digits == 4) {
            return "4桁";
        } else if (digits == 2) {
            return "2桁";

        }else {
            return "";
        }

    }
    

 
    
}
