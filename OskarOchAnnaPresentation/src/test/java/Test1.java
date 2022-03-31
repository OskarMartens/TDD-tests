import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class Test1 {

    @BeforeEach
    public void beforeTest(){
        System.out.println("Nu ska vi testa");
    }


    @RepeatedTest(100)
    public void testDiceAverage(){
        int amountOfThrows = 10000;
        Assertions.assertEquals(7, Lab1.diceAverage(amountOfThrows), 0.5);
    }

    @Test
    public void testThreeForTwo(){
        int amountOfCans = 3;
        double pricePerCan = 9.75;
        double cost = (amountOfCans * pricePerCan) * 2/3;

        Assertions.assertEquals(cost, Lab2.canCost(amountOfCans, pricePerCan), 0);
    }


}
