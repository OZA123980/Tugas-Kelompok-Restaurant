package project;

public class Minuman extends Menu {
    public String Minuman;
    public String Shot;

    public Minuman() {
        super();
        Minuman = "Cappucino";
        Shot = "2 shots";
    }

    // Constructor Parameter
    public Minuman(String M, String S) {
        this.Minuman = M;
        this.Shot = S;
    }

    public void print() {
        super.print();
        System.out.println("======== Minuman =========");
        System.out.println("Minuman: " + this.Minuman);
        System.out.println("Shots: " + this.Shot);
    }
}
