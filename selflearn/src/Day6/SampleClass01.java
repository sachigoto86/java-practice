package Day6;

public class SampleClass01 {

     
    
        //  フィールド
        int n = 10;
        String s = "field";
        //  メソッド
        int add(int a){
            return this.n + a;
        }
        String add(String s){
            return this.s + s;
        }
        void showNum(){
            System.out.println("n = " + n);
        }

}
