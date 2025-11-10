package project;

public class Gelasdanpiring extends Minuman {
    public String Piring;
    public String Gelas;

    public Gelasdanpiring() {
        super();
        Piring = "Medium";
        Gelas = "Large Tall glass";
    }

    // Constructor Parameter
    public Gelasdanpiring(String P, String G) {
        this.Piring = P;
        this.Gelas = G;
    }

    public void print() {
        super.print();
        System.out.println("======== Gelas dan Piring ========");
        System.out.println("Size piring: " + this.Piring);
        System.out.println("Size gelas: " + this.Gelas);
    }
}
