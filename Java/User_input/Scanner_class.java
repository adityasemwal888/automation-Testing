package User_input;
import java.util.Scanner;
public class Scanner_class {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("kindly enter your name");
        int age = scanner.nextInt();
        String ans = age>=18 ? "yes dear you can vote" : "No dear you can't vote";
        System.out.println(ans);
    }
}
