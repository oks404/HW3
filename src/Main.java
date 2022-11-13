public class Main {
    public static void main(String[] args) {
//  Задание 1
        int apple = 1;
        byte melon = 2;
        short cucumber = 3;
        float watermelon = 4;
        double pear = 5;
        System.out.println("Значение переменной apple с типом int равно " + apple);
        System.out.println("Значение переменной melon с типом byte равно " + melon);
        System.out.println("Значение переменной banana с типом short равно " + cucumber);
        System.out.println("Значение переменной watermelon с типом float равно " + watermelon);
        System.out.println("Значение переменной pear с типом double равно " + pear);
//  Задание 2
        float dog = 27.12f;
        long cat = 987678965549L;
        double elefant = 2.786;
        boolean snake = false;
        short horse = 569;
        short duck = -159;
        short goose = 27897;
        byte chicken = 67;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(elefant);
        System.out.println(snake);
        System.out.println(horse);
        System.out.println(duck);
        System.out.println(goose);
        System.out.println(chicken);
//  Задание 3
        byte pupilsLudmilaPavlovna = 23;
        byte pupilsAnnaSergeevna = 27;
        byte pupilsEkaterinaAndreevna = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (pupilsLudmilaPavlovna + pupilsAnnaSergeevna + pupilsEkaterinaAndreevna) + " листов бумаги");
//  Задание 4
        byte machineProducesIn2Minutes = 16;
        short machinepPoducesIn20Minutes = (short) (machineProducesIn2Minutes / 2 * 20);
        short machineProducesIn3Days = (short) (machineProducesIn2Minutes / 2 * 3 * 24);
        short machineProducesIn1Mounth = (short) (machineProducesIn2Minutes / 2 * 30 *24);
        System.out.println("За 20 минут машина произвела бутылок " + machinepPoducesIn20Minutes + " штук ");
        System.out.println("За 3 дня машина произвела бутылок " + machineProducesIn3Days + " штук ");
        System.out.println("За 1 месяц машина произвела бутылок " + machineProducesIn1Mounth + " штук ");
//  Задание 5
        byte allPaint = 120;
        byte allRoom = (byte) (allPaint / 6);
        byte whitePaint = (byte) (allRoom * 2);
        byte brownPaint = (byte) (allRoom * 4);
        System.out.println("В школе, где " + allRoom + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
//  Задание 6
        int weightOneBanana = 80;
        int weight100MlMilk = 105;
        int weightOneBriquetteIceCream = 100;
        int weightOneEgg = 70;
        int weightBreakfastMg = weightOneBanana * 5 + weight100MlMilk * 2 + weightOneBriquetteIceCream * 2 + weightOneEgg * 4;
        float weightBreakfastKg = weightBreakfastMg / 1000f;
        System.out.println("Вес завтрака спортсмена в граммах - " + weightBreakfastMg);
        System.out.println("Вес завтрака спортсмена в килограммах - " + weightBreakfastKg);
//  Задание 7
       byte goalLoseWeightKg = 7;
       int minimalLoseWeightMg = 250;
       int maxLoseWeightMg = 500;
       int maxDaysLoseWeight = goalLoseWeightKg * 1000 / minimalLoseWeightMg;
       int minDaysLoseWeight = goalLoseWeightKg * 1000 / maxLoseWeightMg;
       System.out.println("Если сбрасывать в день по " + minimalLoseWeightMg + "мг в день, то спортсмен сбросит " + goalLoseWeightKg + "кг через " + maxDaysLoseWeight + " дней.");
       System.out.println("Если сбрасывать в день по " + maxLoseWeightMg + "мг в день, то спортсмен сбросит " + goalLoseWeightKg + "кг через " + minDaysLoseWeight + " дней.");
//  Задание 8
        int salaryMashaMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryKristinaMonth = 76230;
        double salaryIncreaseMasha = salaryMashaMonth + (salaryMashaMonth * 0.10);
        double salaryIncreaseDenis = salaryDenisMonth + (salaryDenisMonth * 0.10);
        double salaryIncreaseKristina = salaryKristinaMonth + (salaryKristinaMonth * 0.10);
        System.out.println("Маша теперь получает " + salaryIncreaseMasha + " рублей. Годовой доход вырос на " + (salaryIncreaseMasha - salaryMashaMonth) + " рублей");
        System.out.println("Денис теперь получает " + salaryIncreaseDenis + " рублей. Годовой доход вырос на " + (salaryIncreaseDenis - salaryDenisMonth) + " рублей");
        System.out.println("Кристина теперь получает " + salaryIncreaseKristina + " рублей. Годовой доход вырос на " + (salaryIncreaseKristina - salaryKristinaMonth) + " рублей");
    }
}