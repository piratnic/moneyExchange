import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        start();

    }

    static double start () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес");
        int weight = scanner.nextInt();
        System.out.println("Введите рост в см");
        double height = scanner.nextInt();
        height = height/100;

        double result = calculation(weight, height);
        System.out.println(result);
        System.out.println(interpretation(result));

        start();

        return height;
    }

    static double calculation(int weight, double height) {
        while (weight > 0 && height > 0) {
            return weight / (height * height);
        }
        System.out.println("Введите корретные значения");


        return start();
    }

    static String interpretation(double result) {
        if ( result < 16) {
            String strongDeficit = "выраженный дефицит";
            return strongDeficit;
        }
        else if (result > 16 && result < 18.5) {
            String deficit = "недостаточная масса";
            return deficit;
        }
        else if (result > 18.5 && result < 25) {
            String normal = "норма";
            return normal;

        }
        else if (result > 25 && result < 30) {
            String overweight = "избыточная масса";
            return overweight;
        }


        return "неправильно";
    }








}
