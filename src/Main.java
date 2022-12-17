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
        task9();
        task10();
    }
    public static void task1(){
        System.out.println("Задача1");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
    }
    public static void task2(){
        System.out.println("\nЗадача2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3(){
        System.out.println("\nЗадача3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
    }
    public static void task4() {
        System.out.println("\nЗадача4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task5(){
        System.out.println("\nЗадача5");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println("Високосный год " + i);
        }
    }
    public static void task6() {
        System.out.println("\nЗадача6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
    }
    public static void task7() {
        System.out.println("\nЗадача7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
    }
    public static void task8(){
        System.out.println("\nЗадача8");
        int adding = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings + adding;
            System.out.println("Месяц " + (i + 1) +": " + savings);
        }
    }
    public static void task9(){
        System.out.println("\nЗадача9");
        int adding = 29000;
        double savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings * 1.01;
            savings = savings + adding;
            System.out.println("Месяц " + (i + 1) +": " + savings);
        }
    }
    public static void task10() {
        System.out.println("\nЗадача10");
        for (int i = 1; i < 11; i = i + 1) {
            int p = 2 * i;
            System.out.println("2 * " + i + " = " + p);
        }
    }
}