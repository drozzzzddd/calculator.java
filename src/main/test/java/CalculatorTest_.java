import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class CalculatorTest {

        @Test
        public void summa() throws IOException {
            assertEquals(20, Calculator.plus(18,2));
        }

        @Test
        public void subtruction() throws IOException{
            assertEquals(34, Calculator.minus(35,1));
        }


        @Test
        public void multiply() throws IOException{
            assertEquals(48, Calculator.mult(6,8));
        }


        @Test
        public void divide() throws IOException{
            assertEquals(15, Calculator.divide(60,4));
        }
}
