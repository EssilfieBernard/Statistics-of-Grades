import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] scores = {2, 20, 21, 22, 23, 30, 48, 49, 50, 55, 60, 65, 72, 63, 76, 80, 68, 90, 85, 98};

        // Prints the maximum, minimum and average of scores of students
        System.out.println("Values:");
        System.out.println();
        System.out.println("The maximum grade is " + maximumGrade(scores));
        System.out.println("The minimum grade is " + minimumGrade(scores));
        System.out.println("The average grade is " + averageGrade(scores));
        int[] stats = new int[5];

        stats[0] = counter(scores, 0, 20);
        stats[1] = counter(scores, 21, 40);
        stats[2] = counter(scores, 41, 60);
        stats[3] = counter(scores, 61, 80);
        stats[4] = counter(scores, 81, 100);
        System.out.println();
        System.out.println("Graph");
        System.out.println();
        System.out.println(Arrays.toString(stats));


        // loop for printing graph
        // loops over the stats array from the maximum of the array to 1
        for (int i = maximumGrade(stats); i > 0; i--) {
            System.out.println(i + " >  " + print(stats[0] >= i) + "  " + print(stats[1] >= i) + "  " + print(stats[2] >= i) + "  " + print(stats[3] >= i) + "  " + print(stats[4] >= i));

        }
    }

    // Helper function to determine what will be printed at a certain value
    private static String print(boolean isGreater) {
        if (isGreater)
            return "#######";
        else
            return "       ";
    }

    private static int maximumGrade(int[] input) {
        // Set first element of the array as maximum
        int maximum = input[0];
        // Loop over the array to check for the maximum and set it to the maximum variable
        for (int value : input)
            if (value > maximum)
                maximum = value;

         return maximum;
    }

    // finding the minimum of an input array
    private static int minimumGrade(int[] input) {
        // Set first element of the array as minimum
        int minimum = input[0];
        // Loop over the array to check for the minimum and set it to the minimum value
        for (int value : input)
            if (value < minimum)
                minimum = value;

        return minimum;
    }


    // finding the average of a given array
    private static double averageGrade(int[] input) {
        // Initialize total to zero
        int total = 0;
        // Loop through the array and add each element to total
        for (int value : input)
            total += value;

        return (double) total / input.length;
    }

    // Helper function for counting the number of students who got grades between boundaries(inclusive) provided
    private static int counter(int[] input, int lowerBound, int upperBound) {
        int count = 0;
        for (int value : input)
            if (value >= lowerBound && value <= upperBound)
                count += 1;

        return count;

    }
}
