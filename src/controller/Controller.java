package controller;

import model.Model;
import view.View;

import java.util.Scanner;

/**
 * Controller class
 *
 * @author Serhii Kisilchuk
 */
public class Controller {
    private static final String ARRAY_PATTERN = "[ \\d]+";

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        model.setArray(readArray(sc));
        int menuItem;

        view.printMessage(View.HELLO_MESSAGE);
        while (true) {
            view.printMessage(View.MAIN_MENU);
            menuItem = inputIntValueWithScanner(sc);
            switch (menuItem) {
                case 1:
                    model.setArray(readArray(sc));
                    break;
                case 2:
                    view.printNumber(model.sum());
                    break;
                case 3:
                    view.printNumber(model.maxIndex());
                    break;
                case 4:
                    view.printNumber(model.maxValue());
                    break;
                case 5:
                    view.printNumber(model.minIndex());
                    break;
                case 6:
                    view.printNumber(model.minValue());
                    break;
                case 7:
                    view.printDouble(model.average());
                    break;
                case 8:
                    view.printNumber(model.countElement(inputIntValueWithScanner(sc)));
                    break;
                case 9:
                    view.printNumber(model.countZero());
                    break;
                case 10:
                    view.printNumber(model.countMoreZero());
                    break;
                case 11:
                    view.printArray(model.multiply(inputIntValueWithScanner(sc)));
                    break;
                case 12:
                    view.printArray(model.addIndex());
                    break;
                case 13:
                    view.printArray(model.evenZero());
                    break;
                case 14:
                    view.printArray(model.oddZero());
                    break;
                case 15:
                    view.printNumber(model.firstPositive());
                    break;
                case 16:
                    view.printNumber(model.lastNegative());
                    break;
                case 17:
                    view.printArray(model.findEntryIndexes(inputIntValueWithScanner(sc)));
                    break;
                case 18:
                    view.printBoolean(model.checkAsc());
                    break;
                case 19:
                    view.printBoolean(model.checkDesc());
                    break;
                case 20:
                    view.printArray(model.circleShiftRight(inputIntValueWithScanner(sc)));
                    break;
                case 21:
                    view.printArray(model.sameElements());
                    break;
                case 22:
                    view.printArray(model.moreAverage());
                    break;
                case 23:
                    view.printArray(model.differentElements());
                    break;
                case 24:
                    view.printArray(model.differentElements(readArray(sc)));
                    break;
                case 25:
                    view.printNumber(model.countSameFirst());
                    break;
                case 26:
                    view.printArray(model.sort(readArray(sc), readArray(sc)));
                    break;
                case 27:
                    view.printArray(model.changeElements());
                    break;
                case 28:
                    return;
                default:
                    view.printMessage(View.WRONG_MENU_ITEM);
                    break;
            }
        }
    }

    // The Utility methods
    private int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(View.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA + View.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    private int[] readArray(Scanner sc) {
        String line = inputArray(sc);
        String[] strArray = line.split(" ");
        int[] result = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            result[i] = Integer.parseInt(strArray[i]);
        }
        return result;
    }

    private String inputArray(Scanner sc) {
        view.printMessage(View.INPUT_ARRAY);
        String line;
        while (true) {
            line = sc.nextLine();
            if (line.matches(ARRAY_PATTERN))
                return line;
            else {
                view.printMessage(View.INPUT_ERROR);
            }
        }
    }
}
