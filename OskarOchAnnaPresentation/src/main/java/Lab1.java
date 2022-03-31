public class Lab1 {

    public static double diceAverage(int amountOfRepeats) {

        double sum = 0;
        for (int i = 0; i < amountOfRepeats; i++) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            sum += (dice1 + dice2);
        }

        return sum / amountOfRepeats;
    }
}
