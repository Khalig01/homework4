public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
      int age=20 ;
      if (age >= 18); {
            System.out.println("Если возраст человека равен"+age+"то он совершеннолетний");
        }
        int ageTwo=16;
        if (ageTwo <18);{

            System.out.println("Если возраст человека равен"+ageTwo+"то он не достиг совершеннолетия,нужно немного подождать");
        }
        System.out.println("Задача 2");
        int tempereture=4 ;
        if(tempereture<5);{
        System.out.println("На улице"+tempereture+"градусов нужно надеть шапку");
        }
        int temperetureTwo=6 ;
        if(tempereture>5);{
            System.out.println("На улице"+temperetureTwo+"градусов можно идти без шапки");
        }
        System.out.println("Задача 3");
        int speed= 70;
        if(speed>60);{
            System.out.println("Если скорость"+speed+"то придеться заплатить штраф");
        }
        int speedTwo= 50;
        if(speedTwo<60);{
            System.out.println("Если скорость"+speedTwo+"то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int year= 3;
        if (year>=2 && year<=6){
            System.out.println("Если возраст человека равен"+year+"то ему нужно идти в садик");
        } else {
            System.out.println("Если возраст человека равен"+year+"то ему не нужно идти в садик");
        }
        int year2= 13;
        if (year2>=7 && year2<=17){
            System.out.println("Если возраст человека равен"+year2+"то ему нужно идти в школу");
        } else {
            System.out.println("Если возраст человека равен"+year2+"то ему не нужно идти в школу");
        }
        int year3= 20;
        if (year3>=18 && year3<=24){
            System.out.println("Если возраст человека равен"+year3+"то ему  нужно идти в университет");
        } else {
            System.out.println("Если возраст человека равен"+year3+"то ему не нужно идти в университет");
        }
        int year4= 25;
        if (year4>24){
            System.out.println("Если возраст человека равен"+year4+"то ему  нужно идти на работу");
        }else {
            System.out.println("Если возраст человека равен"+year4+"то ему не нужно идти на работу");
        }
        System.out.println("Задача 5");
        int children= 4;
        if (children>5){
            System.out.println("Если возраст рабенка равен"+children+"то ему можно кататься");
        } else {
            System.out.println("Если возраст рабенка равен"+children+"то ему нельзя кататься");
        }
        int children2= 7;
        if (children2>5 && children2<14){
            System.out.println("Если возраст рабенка равен"+children2+"то ему можно кататься в сопровождении");
        } else {
            System.out.println("Если возраст рабенка равен"+children2+"то ему можно кататься в без сопровождения");
        }
            int children3= 15;

            if (children3>14){
                System.out.println("Если возраст рабенка равен"+children3+"то ему можно кататься без сопровождения");
        } else {
                System.out.println("Если возраст рабенка равен"+children3+"то ему можно кататься в сопровождении");
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