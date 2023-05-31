package ru.netology.stats;

public class StatsService {

    // сумма всех продаж
    public int getSumSales(int[] yearlyData) {
        int sumSales = 0;
        for (int i : yearlyData) {
            sumSales += i;
        }
        return sumSales;
    }

    // средняя сумма продаж в месяц
    public double getAverageSumSales(int[] yearlyData) {
        int sumSales = getSumSales(yearlyData);
        return (double) sumSales / yearlyData.length;
    }

    // Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public int getMonthMaxSales(int[] yearlyData) {
        int maxSales = 0;
        int numMonth = 0;

        for (int i = 0; i < yearlyData.length; i++) {
            if(yearlyData[i] >= maxSales) {
                maxSales = yearlyData[i];
                numMonth = i;
            }
        }
        return ++numMonth;
    }

    // Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public int getMonthMinSales(int[] yearlyData) {
        int minSales = yearlyData[0];
        int numMonth = 0;

        for (int i = 0; i < yearlyData.length; i++) {
            if(yearlyData[i] <= minSales) {
                minSales = yearlyData[i];
                numMonth = i;
            }
        }
        return ++numMonth;
    }

    // Количество месяцев, в которых продажи были ниже среднего
    public int getCountMonthSalesLessMiddle(int[] yearlyData) {
        double middleSumSales = getAverageSumSales(yearlyData);
        int countMonth = 0;

        for (int month : yearlyData) {
            if (month < middleSumSales){
                countMonth++;
            }
        }

        return countMonth;
    }

    // Количество месяцев, в которых продажи были выше среднего
    public int getCountMonthSalesMoreMiddle(int[] yearlyData) {
        double middleSumSales = getAverageSumSales(yearlyData);
        int countMonth = 0;

        for (int month : yearlyData) {
            if (month > middleSumSales){
                countMonth++;
            }
        }

        return countMonth;
    }
}
