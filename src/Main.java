public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
      int age=20 ;
      if (age >= 18) {
            System.out.println("Если возраст человека равен"+age+"то он совершеннолетний");
        } else {
          System.out.println("Если возраст человека равен"+age+"то он не достиг совершеннолетия,нужно немного подождать");
        }
        System.out.println("Задача 2");
        int tempereture=6 ;
        if(tempereture<5) {
        System.out.println("На улице"+tempereture+"градусов нужно надеть шапку");
        } else {
            System.out.println("На улице"+tempereture+"градусов можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed= 70;
        if(speed>60){
            System.out.println("Если скорость"+speed+"то придеться заплатить штраф");
        } else {
            System.out.println("Если скорость"+speed+"то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int year= 15;
        if (year>=2 && year<=6) {
            System.out.println("Если возраст человека равен"+year+"то ему нужно идти в садик");
        }
        if (year>=7 && year<17);{
            System.out.println("Если возраст человека равен"+year+"то ему нужно идти в школу");
        }
        if (year>=18 && year<=24) {
            System.out.println("Если возраст человека равен"+year+"то ему  нужно идти в университет");
        }
        if (year>24) {
            System.out.println("Если возраст человека равен"+year+"то ему  нужно идти на работу");
        }
        System.out.println("Задача 5");
        int children= 6;
        if (children<5){
            System.out.println("Если возраст рабенка равен"+children+"то ему нельзя кататься");
        }
        if (children>5 && children<14){
            System.out.println("Если возраст рабенка равен"+children+"то ему можно кататься в сопровождении");
        }
            if (children>14){
                System.out.println("Если возраст рабенка равен"+children+"то ему можно кататься без сопровождения");
        }

        System.out.println("Задача 6");
        int total= 102;
        int seats= 60;
        int place= 70;
if (place>total){
    System.out.println("Мест нет");
} else {
    if (place<seats){
        System.out.println("Есть сидячие места");
    } else {
        System.out.println("Есть стоячие места");
    }
}
        System.out.println("Задача 7");
        int one=3;
        int two=5;
        int three=7;
         int max;
         if (one>two){
         max= one;
         } else {
         max= two ;
         }
        if (max>three){
            System.out.println(max);
        } else{
            System.out.println("Самое большое число"+three);
        }



    }
        }