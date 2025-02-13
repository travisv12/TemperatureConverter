import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureConverter.fahrenheitToCelsius(32), 0.1);
        assertEquals(100.0, TemperatureConverter.fahrenheitToCelsius(212), 0.1);
        assertEquals(-40.0, TemperatureConverter.fahrenheitToCelsius(-40), 0.1);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureConverter.celsiusToFahrenheit(0), 0.1);
        assertEquals(212.0, TemperatureConverter.celsiusToFahrenheit(100), 0.1);
        assertEquals(-40.0, TemperatureConverter.celsiusToFahrenheit(-40), 0.1);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(TemperatureConverter.isExtremeTemperature(-50));
        assertTrue(TemperatureConverter.isExtremeTemperature(55));
        assertFalse(TemperatureConverter.isExtremeTemperature(25));
    }
}