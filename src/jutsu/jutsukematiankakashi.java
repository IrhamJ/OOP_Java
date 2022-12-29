package jutsu;

import hero.*;

public class jutsukematiankakashi extends person {
    String jutsuName;
    double bonus;

    public jutsukematiankakashi(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Jutsu Kematian Kakashi";
        this.bonus = 9000;
        super.damage=super.damage+this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan "+ this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}