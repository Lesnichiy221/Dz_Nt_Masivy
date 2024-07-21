package org.example.Dz_Nt_Massivy.servic;

public class StatsService {
    public long statisticSaleSum(int[] sale) {
        long sum = 0;
        for (long purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public double statisticSaleAverageMonth(int[] sale) {
        int numberSale = sale.length;
        double sum = statisticSaleSum(sale);
        double averageMonth = sum / numberSale;
        return averageMonth;
    }

    public double statisticSaleMax(int[] sale) {
        int saleMax = sale[0];

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;
    }

    public double statisticSaleMin(int[] sale) {
        int saleMin = 0;

        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public int statisticMonthUnderAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int numberUnderAverage = 0;


        for (int i = 0; i < sale.length; i++) {

            if (sale[i] < averageSum) {
                numberUnderAverage = numberUnderAverage + 1;
            }
        }
        return numberUnderAverage;
    }

    public int statisticMonthOverAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int numberOverAverage = 0;


        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                numberOverAverage = numberOverAverage + 1;
            }
        }
        return numberOverAverage;
    }

}