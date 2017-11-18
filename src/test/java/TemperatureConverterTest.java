import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class TemperatureConverterTest {

    TemperatureConverter tc;

    @Parameterized.Parameter()
    public double celsius;
    @Parameterized.Parameter(1)
    public double fahrenheit ;
    @Parameterized.Parameter(2)
    public double kelvin;


    @Parameterized.Parameters()
    public static Collection<Object[]> getTestData() {
        return Arrays.asList(new Object[][]{

                { 0, 32,273.2},
                { 40,104, 313.2},
                { 100,212, 373.2},
                {65.5, 149.9, 338.7},
        });
    }


    @Before
    public void initialize() {
        tc = new TemperatureConverter();
    }


    @Test
    public void convertFtoC()  {
        assertEquals(celsius, tc.convertFtoC(fahrenheit), 2);
    }

    @Test
    public void convertCtoF()  {
        assertEquals(fahrenheit, tc.convertCtoF(celsius), 2);
    }

    @Test
    public void convertCtoK()  {
        assertEquals(kelvin, tc.convertCtoK(celsius), 2);
    }

    @Test
    public void convertKtoC()  {
        assertEquals(celsius, tc.convertKtoC(kelvin),2);
    }

    @Test
    public void convertFtoK()  {
        assertEquals(kelvin, tc.convertFtoK(fahrenheit), 2);
    }

    @Test
    public void convertKtoF()  {
        assertEquals(fahrenheit, tc.convertKtoF(kelvin), 2);
    }

}