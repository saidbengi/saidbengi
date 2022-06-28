package day37_inheritance;

import day36_inheritance.Parent;

public class Child extends Parent {
    // bir class'i child class yaptigimizda
    // parent class'daki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifier'i uygun bir modifeir yapilmalidir



    Child(){
        super();
        System.out.println("Child class parametresiz constructor");
    }
    Child(int s){
        // Child class'da tum constructor'larin ilk satirina
        // Java'nin yerlestirdigi constructor PARAMETRESİZ dir yani super();

        System.out.println("Child class parametreli constructor");
    }
    Child(int s,int s2){
        // Eger parent class'dan parametresiz constructor'i degil de
        // baska bir constructor'i calistirmak isterseniz
        // bunu Child class'daki constructor'in ILK SATIRINA yazmalisiniz
        super(s,s2);
        System.out.println("İki parametreli constructor calisti");
    }

    public static void main(String[] args) {

        Child child= new Child(5,8);

    }
}
