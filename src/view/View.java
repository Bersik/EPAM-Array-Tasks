package view;

import java.util.Arrays;

/**
 * View class
 *
 * @author Serhii Kisilchuk
 */
public class View {
    public static final String MAIN_MENU = "\tMenu:\n" +
            "1. Set array\n2. Sum of the array\n3. Index of the maximum element\n" +
            "4. Maximum element\n5. Index of the minimum element\n6. Minimum element\n" +
            "7. Average value\n8. Number same elements, like \"n\"\n" +
            "9. Number zero elements\n10. Number of elements is greater zero\n" +
            "11. Multiply array by the number\n12. Add indexes for array elements\n" +
            "13. Set zero for even elements\n14. Set zero for odd elements\n" +
            "15. Search firs positive elements\n16. Search last negative element\n" +
            "17. Search indexes of same elements like \"n\"\n" +
            "18. Check asc\n19. Check desc\n20. Circle shift right\n" +
            "21. Search same elements in array\n22. Search elements greater average element\n" +
            "23. Search different elements\n24. Search different elements between arrays\n" +
            "25. Number of elements same first element\n26. Sort 2 arrays in 1\n" +
            "27. Change firsts positive elements and lasts negative elements\n" +
            "28. Exit";
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String INPUT_ARRAY = "Input array (like \"1 2 3 4 5\":";
    public static final String INPUT_ERROR = "Input error";

    public static final String HELLO_MESSAGE = "Hello!";
    public static final String WRONG_MENU_ITEM = "Wrong menu item!";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printNumber(int number) {
        System.out.println(number);
    }

    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public void printDouble(double value) {
        System.out.println(value);
    }

    public void printBoolean(boolean value) {
        System.out.println(value);
    }
}
