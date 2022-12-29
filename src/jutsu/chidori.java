package jutsu;

import hero.*;

public class chidori extends person {
    String jutsuName;
    double bonus;

    public chidori(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Chidori";
        this.bonus = 4000;
        super.damage=super.damage+this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan "+ this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}