public class HW1 {
    public static void main(String[] args)
    {

        // Метод concat(): объединение строк
        String str1 = "Hello";
        String str2 = " World";
        String concatenated = str1.concat(str2);
        System.out.println("concatenated: " + concatenated);

        // Метод valueOf(): преобразование объекта в строку
        int number = 42;
        String strFromNumber = String.valueOf(number);
        System.out.println("strFromNumber: " + strFromNumber);

        // Метод join(): соединение строк с учетом разделителя
        String[] words = {"Java", "is", "awesome"};
        String joinedString = String.join(" ", words);
        System.out.println("joinedString: " + joinedString);

        // Метод compareTo(): сравнение двух строк
        String str3 = "apple";
        String str4 = "banana";
        int comparisonResult = str3.compareTo(str4);
        System.out.println("comparisonResult: " + comparisonResult);

        // Метод charAt(): возвращает символ строки по индексу
        char character = str1.charAt(0);
        System.out.println("character: " + character);

        // Метод equals(): сравнение строк с учетом регистра
        boolean areEqual = str1.equals(str2);
        System.out.println("areEqual: " + areEqual);

        // Метод equalsIgnoreCase(): сравнение строк без учета регистра
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");
        System.out.println("areEqualIgnoreCase: " + areEqualIgnoreCase);

        // Метод regionMatches(): сравнение подстрок в строках
        boolean regionMatches = str1.regionMatches(0, "HeLLo", 0, 5);
        System.out.println("regionMatches: " + regionMatches);

        // Метод indexOf(): находит индекс первого вхождения подстроки
        int indexOfSubstring = str2.indexOf("o");
        System.out.println("indexOfSubstring: " + indexOfSubstring);

        // Метод lastIndexOf(): находит индекс последнего вхождения подстроки
        int lastIndexOfSubstring = str2.lastIndexOf("o");
        System.out.println("lastIndexOfSubstring: " + lastIndexOfSubstring);

        // Метод startsWith(): определяет, начинается ли строка с подстроки
        boolean startsWith = str1.startsWith("He");
        System.out.println("startsWith: " + startsWith);

        // Метод endsWith(): определяет, заканчивается ли строка на подстроку
        boolean endsWith = str1.endsWith("lo");
        System.out.println("endsWith: " + endsWith);

        // Метод replace(): заменяет в строке одну подстроку на другую
        String replacedString = str1.replace("Hello", "Hi");
        System.out.println("replacedString: " + replacedString);

        // Метод trim(): удаляет начальные и конечные пробелы
        String stringWithSpaces = "  Java Programming  ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("trimmedString: " + trimmedString);

        // Метод substring(): возвращает подстроку
        String originalString = "Hello, World!";
        String subString = originalString.substring(7);
        System.out.println("subString: " + subString);

        // Метод toLowerCase(): переводит все символы строки в нижний регистр
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("lowerCaseString: " + lowerCaseString);

        // Метод toUpperCase(): переводит все символы строки в верхний регистр
        String upperCaseString = originalString.toUpperCase();
        System.out.println("upperCaseString: " + upperCaseString);

    }
}