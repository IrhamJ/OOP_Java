package hero;

public class lord extends lordchara{
    public double health = 100000;
    double damage = 1000;

    public lord() {
    }
    public void use() {
        System.out.println("The Almighty Lord Boss Gothmog of Hell");
    }
    public void showLordStats() {
        System.out.println("Lord blood now is : " + health);
    }
}
