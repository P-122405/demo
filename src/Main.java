import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year % 4 == 0 )
            System.out.println("leap year");
        else
            System.out.println("not leap year");
    }
}