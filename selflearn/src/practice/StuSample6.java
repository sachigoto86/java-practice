package practice;

import abstractclass.Football;

public class StuSample6 {

    public static void main(String[] args) {
        TandF taf = new TandF("Track and Fiedl club");
        Football fb = new Football("Football club");

        Student6 stu1 = new Student6("Suga", taf);
        stu1.display();
        stu1.practice();

        Student6 stu2 = new Student6("Sakurai", fb);
        stu2.display();
        stu2.practice();

    }

}
