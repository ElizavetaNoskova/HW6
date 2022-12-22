public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int i = 0;
        int accumulation = 0;
        while (accumulation <= 2_459_000) {
            accumulation = accumulation + 15000;
            i = i + 1;
        }
        System.out.println("Месяц " + i + " , сумма накоплений равна " + accumulation + "  рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i+=1;
        }
        System.out.println();
        for (i=10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population=12_000_000;
        int birthrate=17;
        int mortality=8;
        for(int year=2010; year<=2020; year++)
        {
            population=population+birthrate*population/1000-mortality*population/1000;
            System.out.println("Год "+year+" , численность населения составляет "+population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double depositAmount=15000;
        for (int i=1; depositAmount<=12_000_000; i++){
            depositAmount = depositAmount+depositAmount*0.07;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + depositAmount + "  рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double depositAmount=15000;
        for (int i=1; depositAmount<=12_000_000; i++){
            depositAmount = depositAmount+depositAmount*0.07;
            if (i%6==0){
            System.out.println("Месяц " + i + " , сумма накоплений равна " + depositAmount + "  рублей");
        }}
    }

    public static void task6() {
        System.out.println("Задача 6");
        double depositAmount=15000;
        for (int i=1; i<=108; i++){
            depositAmount = depositAmount+depositAmount*0.07;
            if (i%6==0){
                System.out.println("Месяц " + i + " , сумма накоплений равна " + depositAmount + "  рублей");
            }}
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday=2;
        for (;friday<=31;friday=friday+7 )
        {
            System.out.println("Сегодня пятница," +friday+"-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
       int recentYears=1822;
       int futureYears=2122;
       int cometPeriod=79;
        for (int i = 0;cometPeriod<=futureYears; i++)
        {
            if (cometPeriod>=recentYears&&cometPeriod<=futureYears)
            {
            System.out.println(cometPeriod);
            }
            cometPeriod=cometPeriod+79;
        }
    }
}