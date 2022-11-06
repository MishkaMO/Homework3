public class Main {
    public static void main(String[] args) {
  float weightwatermelon = 27.12f;
  System.out.println(weightwatermelon);
  long bytesInFiles = 987678965549L;
        System.out.println(bytesInFiles);
        double coinWeight = 2.786;
        System.out.println(coinWeight);
        boolean winter = false;
        System.out.println(winter);
        short works = 569;
        System.out.println(works);
        int underground = - 159;
        System.out.println(underground);
        short units = 27897;
        System.out.println(units);
        byte yearsOld = 67;
        System.out.println(yearsOld);

byte ludmilaPavlovna = 23;
System.out.println("В классе Людмилы Павловны " + ludmilaPavlovna + " человек");
        byte annaSergeevna = 27;
        System.out.println("В классе Анны Сергеевны " + annaSergeevna + " человек");
        byte ekateriniAndreevni = 30;
        System.out.println("В классе Екатерины Андреевны " + ekateriniAndreevni + " человек");
        int totalStudents = ludmilaPavlovna + annaSergeevna + ekateriniAndreevni;
        System.out.println("Общее количество учеников " + totalStudents );
        short boughtPaper = 480;
        System.out.println("Закупили бумаги " + boughtPaper + " листов");
                int shareEveryone = boughtPaper/totalStudents;
        System.out.println( "На каждого ученика рассчитано " + shareEveryone + " листов бумаги");

        byte bottles = 16;
        byte timeMinutes = 2;
        System.out.println("За " + timeMinutes + " минуты машина произвела бутылок " + bottles + " штук");
        int performanceMinute = bottles / timeMinutes;
        byte firstTime = 20;
        int totalTime20 = bottles / timeMinutes * firstTime;
        System.out.println("За " + firstTime + " минут машина произвела бутылок " + totalTime20 + " штук");
        byte secondTime = 1;
        byte dayHours = 24;
        byte hoursMinutes = 60;
        int totalTime2 = dayHours * hoursMinutes * performanceMinute;
        System.out.println("За " + secondTime + " сутки машина произвела бутылок " + totalTime2 + " штук");
        byte thirdTime = 3;
        int minutesDay3 = thirdTime * dayHours * hoursMinutes ;
        int totalTime3 = minutesDay3 * performanceMinute;
        System.out.println("За " + thirdTime + " суток машина произвела бутылок " + totalTime3 + " штук");
        byte fourthTime = 1;
        int monthDays = 30;
        int totalTime4 = fourthTime * monthDays * totalTime2;
        System.out.println("За " + fourthTime + " месяц машина произвела бутылок " + totalTime4 + " штук");

        byte totalCans = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int cansTotalClassroom = whiteColor + brownColor;
        int totalClassroom = totalCans / cansTotalClassroom;
        int totalWhiteColor = totalClassroom * whiteColor;
        int totalBrownColor = totalClassroom * brownColor;
        System.out.println("В школе, где " + totalClassroom + " классов, нужно " + totalWhiteColor + " банок белой краски и " + totalBrownColor + " банок коричневой краски");
    }
}
