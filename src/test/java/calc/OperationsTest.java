package calc;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    Operations operations = new Operations();


    double x = 2;
    double y = 4;


    @Test
    void sum() {
        double summary = operations.sum(2, 4);
        Assert.assertTrue(6==summary);
    }

    @Test
    void subtraction() {
        double sub = operations.subtraction(2, 4);
        Assert.assertTrue(-2==sub);
    }

    @Test
    void multiplication() {
        double mult = operations.multiplication(2, 4);
        Assert.assertTrue(8==mult);
    }

    @Test
    void division() {
        double div = operations.division(2, 4);
        Assert.assertTrue(0.5==div);
    }
}
