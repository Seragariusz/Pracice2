import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if(num >= 0 && num < 10){
            System.out.println("Позитивне число менше 10 або нуль!");
        }
        else if(num > 10) System.out.println("Позитивне число більше 10 або негативне");
    }

}
