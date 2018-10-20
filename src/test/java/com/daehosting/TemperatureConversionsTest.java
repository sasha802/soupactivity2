package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    private TemperatureConversionsSoapType temperatureConversions = new TemperatureConversions().getTemperatureConversionsSoap12();

    @Test
    void getTemperatureConversionsSoap() {

        BigDecimal result = temperatureConversions.fahrenheitToCelsius(BigDecimal.valueOf(32));
        assertEquals(BigDecimal.valueOf(0), result);

    }

    @Test
    void getTemperatureConversionsSoap1() {

        BigDecimal result = temperatureConversions.windChillInCelsius(BigDecimal.valueOf(10), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(11.21), result);
    }

    @Test
    public void getTemperatureConversionsSoap12() {

        BigDecimal result = temperatureConversions.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), result);
    }

    @Test
    void getTemperatureConversionsSoap121() {

        BigDecimal result = temperatureConversions.windChillInFahrenheit(BigDecimal.valueOf(45), BigDecimal.valueOf(20));
        assertEquals(BigDecimal.valueOf(19.184), result);
    }
}