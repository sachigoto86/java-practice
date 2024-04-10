package problems;

public class Problemex1_2 {
    public static void main(String[] args) {
        int a = 0;
        //        int a = (int) (Math.random() * 10) + 1; //  1～10の乱数を発生
        int b = (int) (Math.random() * 10) + 1; //  1～10の乱数を発生
        int c = (int) (Math.random() * 10) + 1; //  1～10の乱数を発生
        int result = mul(a, b, c); //  二つの数の積を求める
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " * " + b + " * " + c + " = " + result);
        System.out.println(square(a, b));
    }

    //  掛け算
    static int mul(int a, int b, int c) {
        return a * b * c;
    }

    static StringBuilder square(int a, int b) {

        StringBuilder result = new StringBuilder();
        if (a != 0 || b != 0) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {					//    				result += " ■ ";
                    result.append(" ■ ");
                }

                result.append("\n");

            }
        } else {
            return null;
        }

        return result;
    }

}
