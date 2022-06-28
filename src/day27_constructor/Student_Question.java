package day27_constructor;

public class Student_Question {
    String name = "Emily";
    int age = 20;

    Student_Question(String name, int age) {

        this.name = name;
        this.age = 22;
    }

    public static void main(String[] args) {

        Student_Question st = new Student_Question("Oliver", 21);
        System.out.print(st.name);
        System.out.print(", " + st.age);
    }
}
