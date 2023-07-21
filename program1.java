import java.util.Scanner;

public class program1{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        int count=0;
        sc.close();
        while(num!=0){
            num = num/10;
            count++;

        }
        System.out.println("The Given number has the "+count+" digits");
    }
}