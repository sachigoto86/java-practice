package to.msn.wings.selflearn.chap01;

import java.time.LocalDateTime;

public class Hello {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        LocalDateTime time = LocalDateTime.now();
//        System.out.print(time);
        
        char c = 'あ';
        byte b = (byte)c;
//        System.out.print(b);
        
        long m = 10;
        int i = (int)m;
//        System.out.print(i);
        
        int[] list = new int[5];
         list = new int[] {1,2,3,4,5,6,7,8};
        
//        list[6] = 3;
//        System.out.print(list[7]);
        
        var multiArray = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
//        System.out.print(multiArray[1][0]);
        
        
        final double DISCOUNT = 0.9;
        var price = 500;
        var sum = price * DISCOUNT;
        
//        System.out.println((int)sum);
        System.out.print(sum);
        
        
    }
    

}
