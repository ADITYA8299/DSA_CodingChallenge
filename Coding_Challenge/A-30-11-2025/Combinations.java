import java.util.*;

public class Combinations {
    static List<List<Integer>> list = new ArrayList<>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        list.clear();
        backtrack(0, 1, n, k, new ArrayList<>());
        return list;
    }

    static void backtrack(int sum, int i, int n, int k, List<Integer> data) {
        if (k == 0) {
            if (sum == n)
                list.add(new ArrayList<>(data));
            return;
        }

        while (i <= 9) {
            if (sum + i > n)
                break;

            data.add(i);
            backtrack(sum + i, i + 1, n, k - 1, data);
            data.remove(data.size() - 1);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k and n: ");
        int k = sc.nextInt();
        int n = sc.nextInt();

        List<List<Integer>> result = combinationSum3(k, n);
        System.out.println(result);
    }
}
