package kunal_OOP;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));
        //Student kunal = new Student("ece", 13, 98);
        //System.out.println(kunal.mark);
        //Student random = new Student(kunal);
        //System.out.println("random infos:");
        //System.out.println(random.name);


        //System.out.println(kunal.mark);
        //String s;
        //System.out.println(s);

        Student student = new Student();
        final Student student5 = new Student();
        student5.name = "melis";
        //student5 = student;
    }


}

class Student {
    //final int a; you can not do this
    int rnum = 13;
    double mark = 74.9;
    String name = "selin";

    Student() {

        //this is how you call a constructor from a constructor
        //this("default name", 15, 90.0);


        this.name = "kunal";
        this.rnum = 45;
        //this.mark = 79.9;


    }

    Student(String name, int rnum, double mark) { //öncelik daima local variable'in
        name = name;
        rnum = rnum;
        mark = mark;
    }

    Student(Student other) {
        this.name = other.name;
        this.mark = other.mark;
        this.rnum = other.rnum;
    }

}
