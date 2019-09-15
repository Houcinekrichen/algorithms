package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Java Program to find pairs on integer array whose sum is equal to k
 */
public class PairOfIntegerInArray {

    public static void main(String args[]) {
        int[] numbers = {2, 4, 3, 5, 7, 8, 9};
        int[] numbersWithDuplicates = {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        firstSolution(numbers, 7);
        firstSolution(numbersWithDuplicates, 7);
        secondSolution(numbers, 7);
        secondSolution(numbersWithDuplicates, 7);
        thirdSolution(numbers, 7);
        thirdSolution(numbersWithDuplicates, 7);
    }

    /**
     * time complexity is very hight in this solution O(n^2)
     *
     * @param numbers inputs
     * @param sum     sum
     */
    public static int firstSolution(int[] numbers, int sum) {
        System.out.printf("numbers, whose sum is equal to value %d : %n", sum);
        int numberOfPair = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (sum == numbers[i] + numbers[j]) {
                    System.out.println(String.format("{%d,%d}", numbers[i], numbers[j]));
                    numberOfPair++;
                }
            }
        }
        return numberOfPair;
    }


    /**
     * using HashSet
     * time complexity of this solution O(n)
     *
     * @param numbers inputs
     * @param sum     sum
     */
    public static int secondSolution(int[] numbers, int sum) {
        if (numbers.length < 2) return 0;
        int numberOfPair = 0;
        System.out.printf("numbers, whose sum is equal to value %d : %n", sum);
        Set<Integer> inputs = new HashSet<>(numbers.length);
        for (int value : numbers) {
            int target = sum - value;
            if (!inputs.contains(target)) {
                inputs.add(value);
            } else {
                System.out.printf("{%d,%d} %n", value, target);
                numberOfPair++;
            }
        }
        return numberOfPair;
    }

    /**
     * time complexity of this solution O(NLongN)
     *
     * @param numbers numbers
     * @param sum     sum
     */
    public static int thirdSolution(int[] numbers, int sum) {
        int numberOfPair = 0;
        Arrays.sort(numbers);
        int firstPointer = 0;
        int lastPointer = numbers.length - 1;
        System.out.printf("numbers, whose sum is equal to value %d : %n", sum);

        while (firstPointer < lastPointer) {
            if (numbers[firstPointer] + numbers[lastPointer] == sum) {
                numberOfPair++;
                System.out.printf("{%d ,%d} %n", numbers[firstPointer], numbers[lastPointer]);
                lastPointer--;
                firstPointer++;
            }
            else if (numbers[firstPointer] + numbers[lastPointer] > sum) lastPointer--;
            else if (numbers[firstPointer] + numbers[lastPointer] < sum) firstPointer++;

        }
        return numberOfPair;
    }
}
