package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Lily on 04/11/2015.
 */
public class TemperatureClassReporterTest {
    TemperatureClassReporter tcReporter;
    @Before
    public void setUp(){
        tcReporter= new TemperatureClassReporter();
    }

    @Test
    public void FToCTest(){
        tcReporter.setTemperatureInFahrenheit(90.0);
        assertEquals(tcReporter.getTemperatureInCelsius(), 32.22222222222222);
    }
    @Test
    public void CtoFTest(){
        tcReporter.setTemperatureInCelsius(40.0);
        assertEquals(tcReporter.getTemperatureInFahrenheit(), 104.0);
    }
}
