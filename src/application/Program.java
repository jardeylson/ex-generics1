package application;

import services.PrintServices;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PrintServices<Integer> ps = new PrintServices<>();

        System.out.print("how many values: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++){
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.print("First: " + x);
    }
}
