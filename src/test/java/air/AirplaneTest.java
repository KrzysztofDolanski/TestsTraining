package air;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirplaneTest {

    Airplane airplane;

    @BeforeEach
    public void set(){
        airplane = new Airplane();
        airplane.setHeight(5);
    }

    @Test
    void ascent() {
        airplane.ascent(5);
        assertEquals(10, airplane.getHeight());
    }

    @Test
    void descent() {
        airplane.descent(5);
        assertEquals(0, airplane.getHeight());
    }
}
