import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    @Test
    public void addTest() {

        //Given
        Calc calc = new Calc();
        double expected = 10.0;
        double unexpected = 8.0;
        //When or Act
        double actual = calc.add(5.0, 5.0);


        //Then or Assert
        Assertions.assertEquals(expected, actual, "this method should add two numbers together");
        assertNotEquals(unexpected, actual, "should not equals 8.0");



        }
    @Test
    public void checkIfParameterIsNull() {
        //given
        Calc calc = new Calc();
         //when
        Double actual = calc.checkIfParameterIsNull(null);
         //then
        assertNull(actual, "this is the null Text");

    }
    @Test
    public void isGreaterThanTest() {
        //given
        Calc calc = new Calc();

        //when
        boolean actual = calc.isGreater(100, 17);
        //the
        assertTrue(actual, "should be greater than");
    }
    @Test
    public void multiplyArrayElementsByNumberGiven() {
        //given
        Calc calc = new Calc();
        int[] array = {10,2,3,10,1,0,2,3,16,0,2};
        int[] expected=new int[]{100, 20 ,30,100,10,0,20,30,160,0,20};

        //when
        int[] actual = calc.multiplyArrayElementsByNumberGiven(array, 10);
        //then
        assertArrayEquals(expected, actual);
    }
}