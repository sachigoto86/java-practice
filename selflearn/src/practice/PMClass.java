package practice;

public class PMClass {
    
    
    public static String getBmi(double weight, double height) {
        
        var heightInM = height/100;
        
        var myBMI = weight/ (Math.pow(heightInM,2));
        return String.format("%.2f", myBMI);
        
        
        
    }

}