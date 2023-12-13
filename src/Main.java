public class Main {
    public static void main(String[] args) {
        //Задача 1
        boolean clientIOS =false;
        if(clientIOS){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Задача 2
        int yearRelease = 2014;
        if(yearRelease>=2015 && clientIOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (yearRelease>=2015 && !clientIOS){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if(yearRelease<2015 && clientIOS) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else{
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //Задача 3
        int year = 1200;
        if(year%400==0 && year>=1584)
        {
            System.out.println(year + " год является високосным");
        }
        else if((year%100==0 || year%4!=0) ||  year<1584){
            System.out.println(year + " год не является високосным");
        }
        else{
            System.out.println(year + " год является високосным");
        }

        //Задача 4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if(deliveryDistance<=20){
            System.out.println("При расстоянии "+deliveryDistance+" км потребуется дней: "+deliveryTime);
        }
        else if(deliveryDistance>20 && deliveryDistance<=60){
            System.out.println("При расстоянии "+deliveryDistance+" км потребуется дней: "+(++deliveryTime));
        }
        else if(deliveryDistance>60 && deliveryDistance<=100)
        {
            System.out.println("При расстоянии "+deliveryDistance+" км потребуется дней: "+(deliveryTime+2));
        }
        else{
            System.out.println("При расстоянии "+deliveryDistance+" км доставки нет");
        }

        //Задача 5
        int monthNumber = 12;
        switch(monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber+" месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+" месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+" месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+" месяц принадлежит к сезону весна.");
                break;
            default:
                System.out.println("Месяца с номером "+monthNumber+" не существует.");
        }
    }
}