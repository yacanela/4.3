import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import func.*;
import func2.*;
import intetfaces.*;

class FunctionTests {
    private static final double EPS = 1e-6;

    @Test
    void testLinearFunction() {
        LinearFunction f = new LinearFunction(2, 3, 0, 10);
        assertEquals(3, f.calculate(0), EPS);
        assertEquals(13, f.calculate(5), EPS);
        assertEquals(0, f.getStart());
        assertEquals(10, f.getEnd());
    }

    @Test
    void testSinFunction() {
        SinFunction f = new SinFunction(1, Math.PI, 0, 1);
        assertEquals(0, f.calculate(0), EPS);
        assertEquals(1, f.calculate(0.5), EPS);
        assertEquals(0, f.calculate(1), EPS);
    }

    @Test
    void testRationalFunction() {
        RationalFunction f = new RationalFunction(1, 0, 1, 0, 1, 5);
        assertEquals(1, f.calculate(2), EPS);
    }

    @Test
    void testExpFunction() {
        ExpFunction f = new ExpFunction(1, 0, 0, 1);
        assertEquals(1, f.calculate(0), EPS);
        assertEquals(Math.E, f.calculate(1), EPS);
    }

    @Test
    void testSumFunctional() {
        LinearFunction f = new LinearFunction(2, 0, 0, 2);
        SumEndPointsAndMid<LinearFunction> functional = new SumEndPointsAndMid<>();
        assertEquals(6.0, functional.calculate(f), EPS);
    }

    @Test
    void testIntegralFunctional() {
        LinearFunction f = new LinearFunction(2, 0, 0, 2);
        IntegralFunctional<LinearFunction> integral = new IntegralFunctional<>(0, 2);
        assertEquals(4.0, integral.calculate(f), 1e-3);
    }
}