package hero;
import jutsu.*;

public class person implements personchara {
    lord boss = new lord();
    private String name;
    public double damage;
    public double health;
    public int round=1;
    public void person (String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }
    public person(String name, double damage, double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public void ngadu(lord boss) {
        while (this.health >= 0 && boss.health >= 0) {
            this.health = this.health - boss.damage;
            boss.health = boss.health - this.damage;
//            if (boss.health<0){
//                boss.health=0;
//            }
            System.out.println("Round : " + round);
            System.out.println("Lord blood now is : " + boss.health);
            System.out.println("Your blood now is : " + this.health);
            round = round +1;
        }
        if (this.health > boss.health) {
            System.out.println("After " +round +" Round Elapsed You Win");
            System.out.println("EZ WIN\n");
            System.out.print("You Have Defeated "); boss.use();
        } else {
            System.out.println("After " +round +" Round Elapsed You Lose");
            System.out.println("LOSE LUL\n");
            System.out.print("You Have Been Killed by "); boss.use();
        }
    }

    public void showHero() {
        System.out.println("Name of Hero : " + this.name + "\nDamage : " + this.damage + "\nHealth : " + this.health);
    }

}
