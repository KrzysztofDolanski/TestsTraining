package calc;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    Operations operations;

    @BeforeEach
            public void init(){
        operations = new Operations();
    }

    double x = 2;
    double y = 4;


    @Test
    void sum() {
        assertEquals(6,operations.sum(2,4));
        assertThat(operations.sum(2, 8)).isEqualTo(10);

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
