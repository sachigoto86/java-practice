package day4;

public class Sample401 {

    public static void main(String[] args) {
        for(int i =1; i<=10; i+=2) {
//            System.out.println(i + "");
        }
        
//        System.out.println("終了");
        
        for(int i = 1;i <= 2;i++){
            for(int j = 1; j <=3 ; j++){
                int k = i + j;
//                System.out.print(i+"+" + j +  "=" + k +" ");
            }
//            System.out.println();
        }
        
        int i = 20;
        while(i <= 5){
//            System.out.print(i+" ");
            i++;
        }
//        System.out.println();
        
        
        int m = 10;
        do{
            System.out.print(m+" ");
            m++;
        }while(m <= 5);
        System.out.println();
        
        
        // while, do while のちがい
        
        
        int k,num;
        num = 1;
        //  whileループで実行
        System.out.print("whileで実行:");
        k = 1;
        while(i < num){
            System.out.print("*");
            k++;
        }
        System.out.println();
        //  do～whileループで実行
        System.out.print("do～whileで実行:");
        k = 1;
        do{
            System.out.print("*");
            k++;
        }while(k < num);
        
        
        System.out.println("6が出たら終了");
        //  無限ループ
        while(true){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if(dice == 6){
                break;      //  while ループから抜ける
            }
        }
        System.out.println("終了");
        
        

    }

}
