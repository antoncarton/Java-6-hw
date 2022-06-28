package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumOfSales(long[] sales) {
        int totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        return totalSum;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        int totalSum = sumOfSales(sales);
        average = (average + totalSum) / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int averageSale = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count++;
    }

    public int salesAboveAverage(long[] sales) {
        int averageSale = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count++;
    }
}