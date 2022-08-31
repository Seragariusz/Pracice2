public class Factorial {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6);
        int res = 1;
        for(int i = 1; i <= num; i++){
            res *= i;
        }
        System.out.println(res);
    }
}
