package target.system;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("INSERT A WORD: ");
        String word = input.nextLine();
        for (int i = word.length() - 1; i > -1; i--) {
            System.out.print((word.charAt(i)));
        }
    }
}
