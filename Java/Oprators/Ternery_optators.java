package Oprators;

import java.sql.SQLOutput;

public class Ternery_optators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String ans = a > b ? "yes it is greater!" : (a < b ? "nahh that's too low" : "they are equal");
        //String ans = a > b:"yes it is greather!":a < b:"nahh that's too low";
        System.out.println(ans);
    }
}
