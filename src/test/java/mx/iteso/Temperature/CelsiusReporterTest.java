package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lily on 05/11/2015.
 */
public class CelsiusReporterTest {
    CelsiusReporter CR;
    @Before
    public void setUp(){
        CR= new CelsiusReporter();
    }
    @Test
    public void setTemperatureInCelsiusTest(){
        CR.setTemperatureInCelsius(30.0);
        assertEquals(CR.getTemperatureInCelsius(),30.0);
    }
}
