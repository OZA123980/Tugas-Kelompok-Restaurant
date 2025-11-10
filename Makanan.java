package project;

public class Makanan extends Menu {
    public String Makanan;
    public String VariantSaos;

    public Makanan() {
        super();
        Makanan = "Nasgor goreng";
        VariantSaos = "kecap manis";
    }

    // Constructor Parameter
    public Makanan(String M, String S) {
        this.Makanan = M;
        this.VariantSaos = S;
    }

    public void print() {
        super.print();
        System.out.println("======== Makanan ========");
        System.out.println("Makanan: " + this.Makanan);
        System.out.println("Saos: " + this.VariantSaos);
    }
}
