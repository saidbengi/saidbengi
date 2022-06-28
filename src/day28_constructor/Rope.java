package day28_constructor;

public class Rope {

    public static void swing() {
        System.out.print("swing ");
    }

    public void climb() {
        System.out.println("climb ");
    }

    public static void play() {
        swing();
       // climb();
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;
        rope2.play();



        /*
A. The code compiles as is,
B. There is exactly one compiler error in the code.
C.There are exactly two compiler errors in the code.
D.If the lines with compiler errors are removed, the output is climb climb.
E.If the lines with compiler errors are removed, the output is swing swing.
F.If the lines with compile errors are removed, the code throws a NullPointerException

         */
    }
}
