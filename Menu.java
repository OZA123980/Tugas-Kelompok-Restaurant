package project;

public class Menu {
    public String Restaurant;
    public String Lokasi;

    public Menu() {
        Restaurant = "Warung nasgor goreng";
        Lokasi = "Jakarta";
    }

    // Constructor Parameter
    public Menu(String R, String L) {
        this.Restaurant = R;
        this.Lokasi = L;
    }

    public void print() {
        System.out.println("======== Nama Restaurant ========");
        System.out.println("Restaurant: " + this.Restaurant);
        System.out.println("Lokasi: " + this.Lokasi);

    }

}
