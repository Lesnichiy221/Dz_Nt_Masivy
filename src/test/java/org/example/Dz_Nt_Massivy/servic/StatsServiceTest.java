package org.example.Dz_Nt_Massivy.servic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void statisticSaleSum() {
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.statisticSaleSum(sale);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleAverageMonth(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = (double) service.statisticSaleAverageMonth(sale);
        double expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMax(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.statisticSaleMax(sale);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMin(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.statisticSaleMin(sale);
        long expected = 9;

        assertEquals(expected, actual);
    }
    @Test
    void statisticMonthUnderAverage(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.statisticMonthUnderAverage(sale);
        long expected = 5;

        assertEquals(expected, actual);
    }
    @Test
    void statisticMonthOverAverage(){
        StatsService service = new StatsService();

        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) service.statisticMonthOverAverage(sale);
        long expected = 5;

        assertEquals(expected, actual);
    }
}
