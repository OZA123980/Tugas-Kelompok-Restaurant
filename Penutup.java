package project;

public class Penutup extends Minuman {
    public String Dessert;
    public String Dessert2;

    public Penutup() {
        super();
        Dessert = "Es krim";
        Dessert2 = "Pudding";
    }

    // Constructor Parameter
    public Penutup(String D, String D2) {
        this.Dessert = D;
        this.Dessert2 = D2;

    }

    public void print() {
        super.print();
        System.out.println("======== Es Krim Dan Pudding ========");
        System.out.println("Makanan penutup: " + this.Dessert);
        System.out.println("Makanan penutup 2: " + this.Dessert2);
    }
}
