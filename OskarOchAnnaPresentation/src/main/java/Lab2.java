public class Lab2 {

    public static double canCost(int amountOfCans, double pricePerCan) {

        double cost = 0;

        if (amountOfCans % 3 == 0) {
            cost = (amountOfCans * pricePerCan) * 2/3;
        }
        return cost;
    }
}
