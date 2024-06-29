import java.util.*;

public class remove{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(array);

        System.out.println(Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> resultList = new ArrayList<>();

        for (int item : arr) {
            if (!seen.contains(item)) {
                seen.add(item);
                resultList.add(item);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
