package target.system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("FIBONACCI SEQUENCE");
            System.out.println();
            System.out.print("ENTER THE AMOUNT OF VALUES DISPLAYED IN THE CONSOLE: ");
            int quantity = input.nextInt();
            fibonacciSequence(quantity);
        }catch (InputMismatchException error){
            System.out.println("ERROR: INSERT AN INTEGER VALUE. ");
            System.out.println("TYPE ERROR: " + error);
        }

    }
    static void fibonacciSequence(int value) {
        int x = 1;
        int y = 0;
        int aux;
        for (int i = 0; i < value; i++) {
            System.out.print(x + " ");
            aux = x;
            x += y;
            y = aux;
        }
    }

}

