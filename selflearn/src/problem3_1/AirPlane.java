package problem3_1;

public abstract class AirPlane {
    
    private String type;

    AirPlane(String type){
        this.type = type;
    }
    
    //  タイプの取得
    public String getType(){
        return type;
    }
    //  飛行する
    public void fly(){
        System.out.println("攻撃に出るために飛行します。");
    }
}
