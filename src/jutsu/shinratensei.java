package jutsu;

import hero.*;

public class shinratensei extends person {
    String jutsuName;
    double bonus;

    public shinratensei(String name, double damage, double health) {
        super(name, damage, health);
        this.jutsuName = "Shinra Tensei";
        this.bonus = 3000;
        super.damage=super.damage+this.bonus;
    }

    public void ngadu(lord boss) {
        System.out.println("Menyerang dengan "+ this.jutsuName + " !!!\n");
        super.ngadu(boss);
    }
}