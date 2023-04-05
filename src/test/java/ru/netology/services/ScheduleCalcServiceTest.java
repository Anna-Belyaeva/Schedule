package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class ScheduleCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/parameters.csv")
    public void shouldCalc(int expected, int income, int expenses, int threshold) {

        ScheduleCalcService service = new ScheduleCalcService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }
}