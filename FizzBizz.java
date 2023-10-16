import java.util.*;
public class FizzBizz {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n;

        System.out.println("How many numbers do you want to print?");
        n = console.nextInt();

        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                System.out.println("Fizz");
            } else if(i%3==0){
                System.out.println("Bizz");
            } else if(i%5==0){
                System.out.println("FizzBizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
