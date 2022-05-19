package Five_Java_High_Level_Language_features;


enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    private final int value;

    Coin(int value) {
        this.value = value;
    }


    public int value() {
        return value;
    }
}

enum CoinColor {COPPER, NICKEL, SILVER}

public class P94_CoinColor {
    //   Coin c= new Coin(2);
    public static void main(String[] args) {
        System.out.println(Coin.PENNY);

        for (Coin c : Coin.values()) {
            System.out.print(c + ": " + c.value() + ", ");
            switch (c) {
                case PENNY -> System.out.println(CoinColor.COPPER);
                case NICKEL -> System.out.println(CoinColor.NICKEL);
                case DIME, QUARTER -> System.out.println(CoinColor.SILVER);
            }
        }
        System.out.println(Coin.PENNY.equals(CoinColor.COPPER));
    }
}
