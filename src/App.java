import jutsu.*;
import java.util.Scanner;
import hero.*;
import hero.lord;
import ability.*;
public class App {
    public static void main(String[] args) throws Exception {
        String name;
        lord boss = new lord();
        Scanner input = new Scanner(System.in);
        System.out.print("This is Your Battle with : ");
        boss.use();
        System.out.println();
        System.out.println("Choose Your Hero to Defeat Him ");
        System.out.println("Hero : \n 1. Empror of Man\n 2. Mortarion\n");
        System.out.print("Choose Your Hero : ");
        int choice = input.nextInt();
        if (choice == 1) {
            name = "Emperor of Man";
        } else {
            name = "Mortarion";
        }

        clearConsole();
        System.out.println(
                "Ability Choice : \n\n 1. WAAAGH\n 2. Pepega\n 3. Chidori\n 4. Amaterasu\n 5. Kamui\n 6. Rasengan\n 7. Shinra Tensei");
        System.out.print("\nPilih Jutsu : ");
        int jutsu = input.nextInt();

        clearConsole();
        jutsuPerson1(name, jutsu, boss);

    }

    static void jutsuPerson1(String name, int jutsu, lord boss) {
        if (jutsu == 1) {
            WAAAGH player1 = new WAAAGH(name, 1000, 40000);
            player1.battle(boss);
            player1.showHero();
            boss.showLordStats();
        } else if (jutsu == 2) {
            Pepega player1 = new Pepega(name, 1000, 40000);
            player1.battle(boss);
            player1.showHero();
            boss.showLordStats();
       } else if (jutsu == 3) {
            chidori player1 = new chidori(name, 1000, 40000);
            player1.ngadu(boss);
            player1.showHero();
            boss.showLordStats();
        } else if (jutsu == 4) {
            amaterasu player1 = new amaterasu(name, 1000, 40000);
            player1.ngadu(boss);
            player1.showHero();
            boss.showLordStats();
        } else if (jutsu == 5) {
            kamui player1 = new kamui(name, 1000, 40000);
            player1.ngadu(boss);
            player1.showHero();
            boss.showLordStats();
        } else if (jutsu == 6) {
            rasengan player1 = new rasengan(name, 1000, 40000);
            player1.ngadu(boss);
           player1.showHero();
            boss.showLordStats();
        } else if (jutsu == 7) {
            shinratensei player1 = new shinratensei(name, 1000, 40000);
            player1.ngadu(boss);
            player1.showHero();
            boss.showLordStats();
        }
    }

    static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
