package Java_Basics;

import java.util.Scanner;
/*
class Java_Basics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you number");
        int x =scanner.nextInt();

        if(x%2 == 0){
            System.out.println("number is even");
        } else{
            System.out.println("number is odd");
        }


    }
}


*/
import java.util.Scanner;
class Java_Basics{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you number");
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        if (a==b){
            System.out.println("a is equal");
        } else if(a>=b){
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }
    }
}

/*
//even number code
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    System.out.println("enter your desire number");
    int x = scanner.nextInt();
    if (x%2==0){
        System.out.println("even");
    for(int i=0; i<=10; i++){
        System.out.print((x + i * 2) + " ");
        }}else{
    System.out.println("odd one");
         }
       }
    }
 */