package entities;

public class Bill {
    public final double beerPrice = 5.0;
    public final double softDrinkPrice = 3.0;
    public final double barbecuePrice = 7.0;

    public char gender;
    public int beer;
    public int barbecue;
    public int softDrink;

    public double couvert() {
        if (feeding() >= 30) {
            return 0;
        } else {
            return 4.0;
        }
    }

    public double feeding() {
        return (beer * beerPrice) + (barbecue * barbecuePrice) + (softDrink * softDrinkPrice);
    }

    public double ticket() {
        double value = 0;
        if (gender == 'f' || gender == 'F') {
            value = 8.0;
        } else if (gender == 'm' || gender == 'M'){
            value = 10.0;
        }
        return value;
    }

    public double total() {
        return ticket() + feeding() + couvert();
    }

}
