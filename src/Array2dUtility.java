
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of ints row by row.
    public static void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int b = 0; b < a[i].length; b++) {
                System.out.println(a[i][b]);
            }
            System.out.println(); 
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of ints
    public static int sum(int[][] a) {
        int k =0;
     for(int i = 0; i<a.length;i++)
    {
        for (int b = 0; b < a[i].length; b++) {
           k = k+a[i][b];
        }
    }
     return k;
}
    // 3. average
    // Implement a method called average that returns the average value of a 2D array of ints.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] a){
        int s = 0;
        for (int[] row : a) {
            for (int element : row) {
                s += element;
            }
        }

        int l = a.length*a[0].length;
        return (double) s/ (double) l;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of ints.
public static int minimum(int[][]a){
        int s = a[0][0];
    for(int i = 0; i<a.length;i++)
    {
        for (int b = 0; b < a[i].length; b++) {
            if(a[i][b] < s) {
                s = a[i][b];
            }
        }
    }
    return s;
}
    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of ints.
    public static int maximum(int[][]a){
        int s = a[0][0];
        for(int i = 0; i<a.length;i++)
        {
            for (int b = 0; b < a[i].length; b++) {
                if(a[i][b] > s) {
                    s = a[i][b];
                }
            }
        }
        return s;
    }
    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of ints.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][]a){
        int n = 0;
        for(int i = 0; i<a.length;i++)
        {
            for (int b = 0; b < a[i].length; b++) {
                if(a[i][b]%2 == 0) {
                    n = n+1;
                }
            }
        }
        return n;
    }
    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of ints.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] a) {
        int n = 0;
        for (int[] row : a) {
            for (int element : row) {
                if (element % 2 == 0) {
                    n++;
                }
            }
        }
        return n;
    }
    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of ints are positive.
    public static boolean allPositive(int[][] a) {
        int n = 0;
        for (int[] row : a) {
            for (int element : row) {
                if (element < 0) {
                    return false;
                }
            }
        }
        return true;
    }
    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] a) {
        int[] n = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
            n[i] = sum;
        }
        return n;
    }
    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] a) {
        int numRows = a.length;
        int numCols = a[0].length;

        int[] sums = new int[numCols];

        for (int col = 0; col < numCols; col++) {
            int sum = 0;
            for (int row = 0; row < numRows; row++) {
                sum += a[row][col];
            }
            sums[col] = sum;
        }

        return sums;
    }
}
