package Loops;
import java.util.Scanner;
/*
public class While_Loop_xex1 {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }while(i<0);
        }
    }
 */
//small example of while loop

public class While_Loop_xex1 {
    class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kindly enter your character");
            char ch = scanner.next().toLowerCase().charAt(0);
            if (ch == 'a') {
                System.out.println("yes this is an vowel");
            } else if (ch == 'e') {
                System.out.println("yes this is an vowel");
            } else if (ch == 'i') {
                System.out.println("yes this is an vowel");
            } else if (ch == 'o') {
                System.out.println("yes this is an vowel");
            } else {
                System.out.println(ch + "this is an consonent");
            }
        }
    }
}