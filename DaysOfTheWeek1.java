import java.util.Scanner;

public class DaysOfTheWeek1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int num = scanner.nextInt();

        if (num == 1) {
            System.out.println("Понеділок");
        }
        else if(num == 2){
            System.out.println("Вівторок");
        }
        else if(num == 3){
            System.out.println("Середа");
        }
        else if(num == 4){
            System.out.println("Четвер");
        }
        else if(num == 5){
            System.out.println("П'ятниця");
        }
        else if(num == 6){
            System.out.println("Субота");
        }
        else if(num == 7){
            System.out.println("Неділя");
        }
        else System.out.println("Введено невірне значення!");
    }

}
