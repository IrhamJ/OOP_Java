package ability;

import hero.lord;
import hero.person;
import hero.*;
public class WAAAGH extends person {
        String jutsuName;
        double bonus;

        public WAAAGH(String name, double damage, double health) {
            super(name, damage, health);
            this.jutsuName = "WAAAGH";
            this.bonus = 400;
            super.damage = super.damage + this.bonus;
        }

        public void battle(lord boss) {
            System.out.println("Attack with " + this.jutsuName + " !!!\n");
            super.ngadu(boss);
        }
    }
