package abstractclass;

public class Football extends Club {
    
//	コンストラクターの定義
    public Football(String name) {
        super(name);
    }
    
    public void practice() {
        System.out.println("Practice dribble");
    }
 
}
