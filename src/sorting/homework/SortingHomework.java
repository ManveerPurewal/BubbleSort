package sorting.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingHomework {

    static void sort(ArrayList<Integer> numbers) {
        int length = numbers.size();

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < (length - i); j++) {
                if (numbers.get(j - 1) > numbers.get(j)) {
                    int temp = numbers.get(j - 1);
                    numbers.set(j - 1, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter a number then press enter \n if you want to stop adding numbers to the list type 'stop' \n you must enter a minimum of 10 numbers");
        System.out.println("");
        int stop = 0;
        boolean end = false;
        while (end == false) {
            String StrNumber = input.next();

            if (!"stop".equals(StrNumber)) {
                int number = Integer.parseInt(StrNumber);
                numbers.add(number);
                stop = stop + 1;
            } else if ("stop".equals(StrNumber) && stop >= 9) {
                end = true;
            } else {
                System.out.println("You need minimum ten numbers");
            }

        }
        
        System.out.println("");
        System.out.println("the list unsorted is: ");

        int arrayLength = numbers.size();
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        sort(numbers);
        
        System.out.println("the list sorted is: ");
        System.out.println("");
        
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(numbers.get(i) + " ");
        }

    }

}
