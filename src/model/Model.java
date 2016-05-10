package model;

/**
 * Model class
 *
 * @author Serhii Kisilchuk
 */
public class Model {
    private int[] array;

    public int sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int maxIndex() {
        int maxId = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxId])
                maxId = i;
        }
        return maxId;
    }

    public int maxValueIndex() {
        return array[maxIndex()];
    }

    public int maxValue() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public int minIndex() {
        int minId = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minId])
                minId = i;
        }
        return minId;
    }

    public int minValueIndex() {
        return array[minIndex()];
    }

    public int minValue() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return 1.0 * sum / array.length;
    }

    public int countElement(int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                count++;
        }
        return count;
    }

    public int countZero() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                count++;
        }
        return count;
    }

    public int countMoreZero() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count++;
        }
        return count;
    }

    public int[] multiply(int number) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * number;
        }
        return array;
    }

    public int[] addIndex() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] + i;
        }
        return array;
    }

    public int[] evenZero() {
        for (int i = 0; i < array.length; i += 2) {
            array[i] = 0;
        }
        return array;
    }

    public int[] oddZero() {
        if (array.length < 2)
            return array;
        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }
        return array;
    }

    public int firstPositive() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                return array[i];
        }
        return 0;
    }

    public int lastNegative() {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 0)
                return array[i];
        }
        return 0;
    }

    public int[] findEntryIndexes(int number) {
        int indexes[] = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                int[] newArray = new int[indexes.length + 1];
                for (int j = 0; j < indexes.length; j++)
                    newArray[j] = indexes[j];
                indexes = newArray;
                indexes[indexes.length - 1] = i;
            }
        }
        return indexes;
    }

    public boolean checkAsc() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i - 1] > array[i])
                return false;
        }
        return true;
    }

    public boolean checkDesc() {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i - 1] < array[i])
                return false;
        }
        return true;
    }

    public int[] circleShiftRight(int k) {
        if (k == 0)
            return array;
        if (k > array.length)
            k = k % array.length;

        int[] result = new int[array.length];

        for (int i = 0, j = k; i < array.length - k; i++, j++) {
            result[j] = array[i];
        }

        for (int i = array.length - k, j = 0; i < array.length; i++, j++) {
            result[j] = array[i];
        }

        return result;
    }

    public int[] sameElements() {
        int[] result = new int[0];
        circle:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j])
                    continue circle;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    int[] newArray = new int[result.length + 1];
                    for (int k = 0; k < result.length; k++)
                        newArray[k] = result[k];
                    result = newArray;
                    result[result.length - 1] = array[i];
                    break;
                }
            }
        }
        return result;
    }

    public int[] moreAverage() {
        double sum = 0;
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        circle:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j])
                    continue circle;
            }
            if (array[i] > average) {
                int[] newArray = new int[result.length + 1];
                for (int k = 0; k < result.length; k++)
                    newArray[k] = result[k];
                result = newArray;
                result[result.length - 1] = array[i];
            }
        }
        return result;
    }

    public int[] differentElements() {
        int[] result = new int[0];
        circle:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j])
                    continue circle;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    continue circle;
            }
            int[] newArray = new int[result.length + 1];
            for (int k = 0; k < result.length; k++)
                newArray[k] = result[k];
            result = newArray;
            result[result.length - 1] = array[i];
        }
        return result;
    }

    public int[] differentElements(int[] second) {
        int[] result = new int[0];
        circle:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j])
                    continue circle;
            }
            for (int j = 0; j < second.length; j++) {
                if (array[i] == second[j])
                    continue circle;
            }
            int[] newArray = new int[result.length + 1];
            for (int k = 0; k < result.length; k++)
                newArray[k] = result[k];
            result = newArray;
            result[result.length - 1] = array[i];
        }
        return result;
    }


    public int countSameFirst() {
        int first = array[0];
        int count = 0;
        for (int i = 1; i < array.length; i++)
            if (array[i] == first)
                count++;
        return count;
    }

    public int[] sort(int[] first, int[] second) {
        int length = first.length + second.length;
        int[] result = new int[length];

        int i = 0, j = 0, k = 0;

        for (; j < first.length && k < second.length; i++) {
            if (first[j] < second[k])
                result[i] = first[j++];
            else
                result[i] = second[k++];
        }

        for (; j < first.length; i++, j++) {
            result[i] = first[j];
        }

        for (; k < second.length; i++, k++) {
            result[i] = second[k];
        }

        return result;
    }

    public int[] changeElements() {
        int tmp;
        for (int i = 0, j = array.length - 1; i < j; ) {
            while (i < j && array[i] <= 0) {
                i++;
            }
            while (i < j && array[j] >= 0) {
                j--;
            }

            if (i < j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
}
