import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите '!!'):");

        while (scanner.hasNext()) {
            String word = scanner.next();

            if (word.equalsIgnoreCase("!!")) {
                break; // Выход из цикла при вводе '!!'
            }
            System.out.println("Вы ввели: " + word);
        }

        scanner.close();
    }
}