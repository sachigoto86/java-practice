package day3;

public class Sample301 {

    public static void main(String[] args) {
         //標準出力
        int a = 5; //  整数値（いろいろ変えてみましょう）
        System.out.println("a="+a);
        //  入力した値が、正の数かどうかを調べる
        if(a > 0){
            System.out.println("aは正の数です。");  //  正の数だった場合に実行
        }else {
            System.out.println("aは負の数です。");
        }
        
        System.out.println(a>0);
        System.out.println(a<0);
        
        
        
        int num = 50;                    //  整数値（いろいろ変えてみましょう）
        if(num == 1){
            System.out.println("one");    //  numが1だった場合の処理
        }else if(num == 2){
            System.out.println("two");    //  numが2だった場合の処理
        }else if(num == 3){
            System.out.println("three");  //  numが3だった場合の処理
        }else{
            System.out.println("不適切な値です。"); //  それ以外の値が入力された場合の処理
        }
        
        
        
        int dice = (int)(Math.random()*7)+1;    //  1から7までの乱数を発生させる
        //  サイコロの目を入力
        System.out.println("さいころの目:"+dice);
        //  値が、サイコロの目の範囲内かどうかを調べる
        if(1 <= dice && dice <= 6){
            //  さいころの目が、偶数か、奇数かで、処理を分ける。
            if(dice == 2 || dice == 4 || dice == 6){
                System.out.println("丁（チョウ）です。");  //  偶数ならば丁（チョウ）
            }else{
                System.out.println("半（ハン）です。");   //  奇数ならば半（ハン）
            }
        }else{
            System.out.println("範囲外の数値です。");
        }
        
        
        
        //標準出力
        int num1 = 3;                        //  整数値（いろいろ変えてみましょう）
        switch(num1){
        case 1:
            System.out.println("one");    //  numが1だった場合の処理
            break;
        case 2:
            System.out.println("two");    //  numが2だった場合の処理
            break;
        case 3:
            System.out.println("three");  //  numが3だった場合の処理
            break;
        default:
            System.out.println("不適切な値です。"); //  それ以外の値が入力された場合の処理
        }

    }

}
