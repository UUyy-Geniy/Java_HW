public class HW5 {
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы командной строки
        if (args.length == 0) {
            System.out.println("Nothing");
        } else {
            System.out.println("Args:");
            // Выводим каждый аргумент на экран
            for (int i = 0; i < args.length; i++) {
                System.out.println("Arg " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
