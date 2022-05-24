import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("a:");
        int a = input.nextInt();
        System.out.println("b:");
        int b = input.nextInt();
        System.out.println("c:");
        int c = input.nextInt();
        System.out.println((a + b + c) /3);
    }
}
