package practice;

public class PCircle {
    
    public double radius;
//    final float pi = (float) 3.14;
    
   public PCircle(double radius){
        this.radius = radius; 
   }

//    public PCircle() {
//        this(1);
//    }
    
    public  void getArea(){
//        float circle = (float)Math.pow(this.radius, 2) * this.pi;
        double circleArea = (double)(Math.pow(this.radius, 2) * Math.PI);

//        System.out.printf("%.2f", circleArea);
        
    }
    
    
    public static void test() {
//        System.out.println("Hello");
    };
    
    public static final String DOG; 
    public static final String CAT; 
    public static final String MOUSE; 

    static {
        DOG = "いぬ";
        CAT =  "ねこ";
        MOUSE = "ねずみ";
        
       }
       
       
    
    
    
    
    

}
