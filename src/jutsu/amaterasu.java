package jutsu;

import hero.*;

public class amaterasu extends person {
    String jutsuName;
    double bonus;

    public amaterasu(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Amaterasu";
        this.bonus = 2000;
        super.damage = super.damage + this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan " + this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}