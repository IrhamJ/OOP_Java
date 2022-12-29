package jutsu;

import hero.*;

public class kamui extends person {
    String jutsuName;
    double bonus;

    public kamui(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Kamui";
        this.bonus = 500;
        super.damage=super.damage+this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan "+ this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}