package abstractclass;

public abstract class Club {
    private String name; 
    
    public Club(String name) {
         this.name = name;
    }
    
    public void display() {
        System.out.println("Club: " + name);
    }
    
    // メソッドの定義のみしかしてないので、abstractをつける
    public abstract void practice();

}
