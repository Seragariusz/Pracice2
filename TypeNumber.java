public class TypeNumber {
    public static void main(String[] args) {
        int i = 1;
        do{
            if(i%5 == 0){
                System.out.println(i);
                i++;
            }
            else {
                i++;
                continue;
            }
        }
        while(i < 101);
    }
}
