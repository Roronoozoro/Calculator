import java.util.Scanner;

public class Main {

    static int result;
    static String res;

    public static void main(String[] args) {

        System.out.print("Пожалуйста введите пример(с пробелами между символами): ");
        Scanner console = new Scanner(System.in);
        String inputText = console.nextLine();

        if (new Validation().numbersCheck(inputText)) {

            RimNums rim = new RimNums();
            res = rim.rimNumbers(inputText);
            System.out.println("Результат: " + res);

        } else {

            ArNums ar = new ArNums();
            result = ar.arabicNumbers(inputText);
            System.out.println("Результат: " + result);

        }
    }

}
