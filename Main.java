import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n==========================================");
            System.out.println("  ЛАБОРАТОРНАЯ РАБОТА №2 — ВАРИАНТ №1");
            System.out.println("==========================================");
            System.out.println("1. Задание 1.1 и 4.1: Создание точек");
            System.out.println("2. Задание 2.1: Линия (с Point1)");
            System.out.println("3. Задание 3.1: Студенты и копирование оценок");
            System.out.println("4. Задание 4.2: Линия (с Point4_1 и 2 конструкторами)");
            System.out.println("5. Задание 5.3: Длина линии");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт меню: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    testPoints();
                    break;
                case 2:
                    testTask2_1();
                    break;
                case 3:
                    testStudent();
                    break;
                case 4:
                    testTask4_2();
                    break;
                case 5:
                    testTask5_3();
                    break;
                case 0:
                    System.out.println("Завершение работы программы.");
                    return;
                default:
                    System.out.println("Неверный пункт! Попробуйте снова.");
            }
        }
    }

    private static int readInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void testPoints() {
        System.out.println("\n--- Задание 1.1 (Point1) ---");
        Point1 p1_1 = new Point1(1, 2);
        System.out.println("Точка из 1.1: " + p1_1);

        System.out.println("\n--- Задание 4.1 (Point4_1) ---");
        Point4_1 p1 = new Point4_1(3, 5);
        Point4_1 p2 = new Point4_1(25, 6);
        Point4_1 p3 = new Point4_1(7, 8);

        System.out.println("Точка 1: " + p1);
        System.out.println("Точка 2: " + p2);
        System.out.println("Точка 3: " + p3);
    }

    private static void testTask2_1() {
        System.out.println("\n--- Задание 2.1 (Line2_1) ---");
        Point1 p1 = new Point1(1, 3);
        Point1 p2 = new Point1(23, 8);
        Line2_1 l1 = new Line2_1(p1, p2);

        Point1 p3 = new Point1(5, 10);
        Point1 p4 = new Point1(25, 10);
        Line2_1 l2 = new Line2_1(p3, p4);

        Line2_1 l3 = new Line2_1(l1.getStart(), l2.getEnd());

        System.out.println("Линия 1: " + l1);
        System.out.println("Линия 2: " + l2);
        System.out.println("Линия 3: " + l3);

        l1.getStart().setX(10);
        System.out.println("\nПосле изменения начальной точки Линии 1:");
        System.out.println("Линия 1: " + l1);
        System.out.println("Линия 3: " + l3);

        l1.setStart(new Point1(99, 99));
        System.out.println("\nПосле присвоения Линии 1 новой точки начала:");
        System.out.println("Линия 1: " + l1);
        System.out.println("Линия 3: " + l3);
    }

    private static void testStudent() {
        System.out.println("\n--- Задание 3.1 (Студент) ---");
        
        Student vasya = new Student("Вася", new int[]{3, 4, 5});
        
        Student petya = new Student("Петя", null);
        petya.setGrades(vasya.getGrades());
        petya.getGrades()[0] = 5;

        System.out.println("Вася: " + vasya);
        System.out.println("Петя: " + petya);
        System.out.println("Объяснение: Изменение оценки Пети повлияло на Васю, так как оба ссылаются на один массив.");

        Student andrey = new Student("Андрей", null);
        andrey.setGradesCopy(vasya.getGrades());
        vasya.getGrades()[0] = 2;

        System.out.println("\nПосле изменения оценки Васи на 2:");
        System.out.println("Вася: " + vasya);
        System.out.println("Андрей: " + andrey);
        System.out.println("Объяснение: Оценки Андрея не изменились, так как была создана копия массива.");
    }

    private static void testTask4_2() {
        System.out.println("\n--- Задание 4.2 (Line4_2) ---");
        Line4_2 l1 = new Line4_2(new Point4_1(1, 3), new Point4_1(23, 8));
        Line4_2 l2 = new Line4_2(5, 10, 25, 10);
        Line4_2 l3 = new Line4_2(l1.getStart(), l2.getEnd());

        System.out.println("Линия 1 (создана через Point4_1): " + l1);
        System.out.println("Линия 2 (создана через 4 числа): " + l2);
        System.out.println("Линия 3 (связанные точки): " + l3);
    }

    private static void testTask5_3() {
        System.out.println("\n--- Задание 5.3 (Line5_3 и Длина) ---");
        Line5_3 l4 = new Line5_3(new Point4_1(1, 1), new Point4_1(10, 15));
        System.out.println(l4);
        System.out.println("Длина линии: " + l4.getLength());
    }
}