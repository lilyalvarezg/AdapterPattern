package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 04/11/2015.
 */
public class TemperatureObjectReporterTest {
    TemperatureObjectReporter tOReporter;
    @Before
    public void setUp(){
        tOReporter= new TemperatureObjectReporter();
    }
    @Test
    public void fTocTest(){
        tOReporter.setTemperatureInFahrenheit(200.0);
        assertEquals(tOReporter.getTemperatureInCelsius(), 93.33333333333333);
    }
    @Test
    public void cTofTest(){
        tOReporter.setTemperatureInCelsius(100.0);
        assertEquals(tOReporter.getTemperatureInFahrenheit(), 212.0);
    }
}
