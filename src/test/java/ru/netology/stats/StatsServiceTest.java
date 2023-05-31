package ru.netology.stats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service;
    int[] sales;

    @BeforeEach
    void init() {
        service = new StatsService();
        sales = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    }

    @Test
    void getSumSales() {
        int expected = 180;
        int actual = service.getSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getMiddleSumSales() {
        double expected = 15;
        double actual = service.getAverageSumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getMonthMaxSales() {
        int expected = 8;
        int actual = service.getMonthMaxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getMonthMinSales() {
        int expected = 9;
        int actual = service.getMonthMinSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getCountMonthSalesLessMiddle() {
        int expected = 5;
        int actual = service.getCountMonthSalesLessMiddle(sales);

        assertEquals(expected, actual);
    }

    @Test
    void getCountMonthSalesMoreMiddle() {
        int expected = 5;
        int actual = service.getCountMonthSalesMoreMiddle(sales);

        assertEquals(expected, actual);
    }

}