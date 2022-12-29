package jutsu;

import hero.*;

public class rasengan extends person {
    String jutsuName;
    double bonus;

    public rasengan(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Rasengan";
        this.bonus = 4000;
        super.damage=super.damage+this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan "+ this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}