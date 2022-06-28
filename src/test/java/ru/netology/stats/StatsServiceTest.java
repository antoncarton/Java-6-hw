package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void checkMonthOfMinimalSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonth = 9;
        int actualNumberOfMonth = service.minSales(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);


    }

    @Test
    public void countSumOfSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumOfSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void countAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedValue = 15;
        int actualValue = service.averageSales(sales);

        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void checkMonthOfMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedNumberOfMonth = 8;
        int actualNumberOfMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedNumberOfMonth, actualNumberOfMonth);
    }

    @Test
    public void checkMonthsOfSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountOfMonths = 5;
        int actualAmountOfMonths = service.salesBelowAverage(sales);

        Assertions.assertEquals(expectedAmountOfMonths, actualAmountOfMonths);
    }

    @Test
    public void checkMonthsOfSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountOfMonths = 5;
        int actualAmountOfMonths = service.salesAboveAverage(sales);

        Assertions.assertEquals(expectedAmountOfMonths, actualAmountOfMonths);
    }
}
