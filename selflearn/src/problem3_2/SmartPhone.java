package problem3_2;

public class SmartPhone extends Computer {
    
    SmartPhone(){
        super( "スマートフォン");
    };
    
    
    public void input(){
        System.out.println("タッチパネルディスプレイをタップして操作");
    }
    
    public void output(){
        System.out.println("タッチパネルディスプレイに出力");
    }
    
    @Override
    public void communication(){
        System.out.println("インターネットと電話回線で通信");
    }


}
