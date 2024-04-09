package practice;

import abstractclass.Club;

public class Student6 {
    
    //クラブの情報を扱う
    
    private String name;
    private Club club;
    
//    引数に使いたいクラスをパスできる
    public Student6(String name, Club club) {
        this.name = name;
        this.club = club;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        club.display();
    }
    
    public void practice() {
        club.practice();
    }

}
