package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month<=0 || month>=13){
            System.out.println("wrong number!");
        }else if(month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12 || month ==31){
            System.out.println(31);
        }else if(month ==4 || month == 6 || month == 9 || month ==11){
            System.out.println(30);
        }else {
            System.out.println(28);
        }
        //1 3 5 7 8 10 12 31
        //4 6 9 11 30
        //2 28 29

    }
}
