package ability;

import hero.lord;
import hero.person;
import hero.*;
public class Pepega extends person{



        String jutsuName;
        double bonus;

        public Pepega(String name, double damage, double health) {
            super(name, damage, health);
            this.jutsuName = "Pepega";
            this.bonus = 500;
            super.damage = super.damage + this.bonus;
        }

        public void battle(lord boss) {
            System.out.println("Attack with " + this.jutsuName + " !!!\n");
            super.ngadu(boss);
        }
    }


