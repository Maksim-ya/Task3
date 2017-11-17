import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class ConvertCtoFTest {

    TemperatureConverter tc;

    @Parameterized.Parameter()
    public double expected;
    @Parameterized.Parameter(1)
    public double value;

    @Parameterized.Parameters(name = "{index}:expected{0} value {1}")
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{

                { 32,0},
                { 104, 40},
                { 212, 100},
                {56, 13.333d},
        });
    }


    @Before
    public void initialize() {
        tc = new TemperatureConverter();
    }


    @Test
    public void convertFtoC() {
        assertEquals(expected, tc.convertCtoF(value), 3);

    }
}