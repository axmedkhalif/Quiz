public class assign {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {2, 3, 4};

        String common = commonElements(arr1 , arr2);
        System.out.println("Common elements: " + common);
    }

    public static String commonElements(int[] arr1, int[] arr2) {
        String result = ""; // Declare result outside the loop

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result += arr1[i] + ",";
                }
            }
        }
            return result;
        }
    }



