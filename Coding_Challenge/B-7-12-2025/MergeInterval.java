import java.util.*;

public class MergeInterval {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];

        // Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> list = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // Overlapping intervals
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                list.add(current);
                current = intervals[i];
            }
        }
        list.add(current);

        return list.toArray(new int[list.size()][]);
    }

    // Driver code for testing
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
