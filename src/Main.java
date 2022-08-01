public class Main {
    public static void main(String[] args) {
        //задача 1
        byte point1=10;
        short point2=-40;
        int point3=500;
        long point4=5000L;
        float point5=-5.5f;
        double point6=6.4095890d;
        char point7='A';
        boolean condition=true;
        //задача 2
        float boxer1=78.2f;
        float boxer2=82.7f;
        float summa=boxer1+boxer2;
        float difference=boxer2-boxer1;
        System.out.println("Общий вес спортсменов = "+summa+" кг");
        System.out.println("Разница в весе составляет = "+difference+ " кг");
        // задача 3
        int weightBanans=5*80;
        int weightMilk=2*105;
        int weightIceCrem=2*100;
        int weightEgg=4*70;
        float SummaWeight=weightBanans+weightMilk+weightIceCrem+weightEgg;
        float SummaWeightKG=SummaWeight/1000;
        System.out.println("Общий вес завтрака = "+SummaWeightKG+ " кг");
        //задача 4
        int excessweight=7;
        float norma1=0.25f;
        float norma2=0.5f;
        float quantityDey1=excessweight/norma1;
        float quantityDey2=excessweight/norma2;
        System.out.println("количество дней при норме сброса 250 гр  = "+quantityDey1);
        System.out.println("количество дней при норме сброса 500 гр  = "+quantityDey2);
        //Задача 5
        int salaryMasha=67760;
        float differenceMasha= (float) (salaryMasha*1.1*12-salaryMasha*12);
        int salaryDen=83690;
        float differenceDen= (float) (salaryDen*1.1*12-salaryDen*12);
        int salaryKrist=76230;
        float differenceKrist= (float) (salaryKrist*1.1*12-salaryKrist*12);
        System.out.println ("Маша теперь получает "+salaryMasha*1.1+" рублей.  Годовой доход вырос на "+differenceMasha+" рублей");
        System.out.println ("Денис теперь получает "+salaryMasha*1.1+" рублей. Годовой доход вырос на "+differenceDen+" рублей");
        System.out.println ("Кристина теперь получает "+salaryMasha*1.1+" рублей. Годовой доход вырос на "+differenceKrist+" рублей");
    }
}