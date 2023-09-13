package assistedPracticeProject1;

import java.util.*;
public class typeCasting {

	public static void main(String[] args) {

        int a = 100;
        double b = a; // Implicit casting from int to double
        System.out.println("Implicit Casting :");
        System.out.println("int value: " + a);
        System.out.println("double value: " + b);

        double c = 123.456;
        int d = (int) c; // Explicit casting from double to int
        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + c);
        System.out.println("int value: " + d);

    }
}