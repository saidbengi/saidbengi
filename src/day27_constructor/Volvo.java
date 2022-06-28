package day27_constructor;

public class Volvo {

    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    Volvo(){

    }
    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektikliMi=elk;
        yil=yl;
        yakit=ykt;
        maxHiz=maxHizAta();
        otomatikPilot=otomatikPilotSorgusu();


    }

    public int maxHizAta() {
        int maxHiz=0;
        if (elektikliMi){
            maxHiz=160;
        }else {
            maxHiz=240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {
        if (elektikliMi){
            otomatikPilot=true;
        }else {
            otomatikPilot=false;
        }
        return otomatikPilot;
    }

    public String toString(){
        String arabaOzellikleri= "Model : "+model+" Yakit : "+yakit+" Max Hiz : "+maxHiz+" Yil : "+ yil;
        return arabaOzellikleri;
    }


}
