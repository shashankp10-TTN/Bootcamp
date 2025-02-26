/*
    Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)
 */
enum House {
    OneBHK("OneBHK", 2000000),
    TwoBHK("TwoBHK", 3000000),
    ThreeBHK("ThreeBHK", 4000000),
    Villa("Villa", 9000000),
    Bungalow("Bungalow", 30000000),
    Mansion("Mansion", 500000000);

    private final String name;
    private final int price;

    House(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
public class Question1 {
    public static void main(String[] args) {
        System.out.println("Pricing of houses");
        for(House house : House.values())
            System.out.println(house.getName() + " --> ₹" + house.getPrice());
    }
}
