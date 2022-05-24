import java.util.Scanner;

public class PrintPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name =  input.next();
        System.out.println("Hello " + name + "!");
    }

}
