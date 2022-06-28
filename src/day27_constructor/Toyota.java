package day27_constructor;

public class Toyota {
    String marka="Toyota";
    int tekerAdedi=4;
    boolean motorVarMi=true;
    String model;
    String yakit;
    int yil;

    public void maxHiz(){
        if (yakit.equals("Benzin")){
            System.out.println("Benzinli araclar max 240 km hiz yapar");
        }else if (yakit.equals("Dizel")){
            System.out.println("Dİzel araclar max 260 km hiz yapar");
        }
    }

    public void renkTercihleri(){
        if (model.equals("Corolla")){
            System.out.println("Corolla renk secenekleri kirmizi ve beyaz");
        }else if (model.equals("Avensis")){
            System.out.println("Avensis renk secenekleri sari ve lacivert");
        }
    }



}
